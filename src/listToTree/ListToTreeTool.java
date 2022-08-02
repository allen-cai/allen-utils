package listToTree;

import javafx.scene.Parent;
import tools.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @ClassName ListToTreeTool
 * @Date 2021/8/16 13:42
 * @Author allen
 * @Description TODO
 */
public class ListToTreeTool {


    public List<Node> toTree (List<Node> params) {
        List<Node> result = new ArrayList<>();

        if (!CollectionUtils.isEmpty(params)) {
            Map<Long, Node> nodeMap = params.stream().collect(Collectors.toMap(Node::getId, Function.identity()));

            for (Long key : nodeMap.keySet()) {
                Node node = nodeMap.get(key);
                // if：顶级节点  else：非顶级节点
                if (node.getParentId() == -1) {
                    result.add(node);
                } else {
                    Node parentNode = nodeMap.get(node.getParentId());
                    //将节点插入到父节点
                    if (parentNode != null) {
                        if (!CollectionUtils.isEmpty(parentNode.getChildren())) {
                            parentNode.setChildren(new ArrayList<>());
                        }
                        parentNode.getChildren().add(node);
                    }
                }

                if (!CollectionUtils.isEmpty(node.getChildren())) {
                    node.setChildren(new ArrayList<>());
                }
            }
        }

        return result;
    }


    public List<Node> toTree2 (List<Node> params) {
        List<Node> result = new ArrayList<>();
        //未完成组装节点列表
        Map<Long, List<Node>> parentMap = new HashMap<>();
        //组装完成节点列表
        Map<Long, Node> mapNode = new HashMap<>();

        if (!CollectionUtils.isEmpty(params)) {

            for (Node node : params) {
                Long parentId = node.getParentId();
                if (parentId == -1) {
                    result.add(node);
                }
                Node node1 = mapNode.get(parentId);
                //父节点不再map中
                if (node1 != null) {
                    if (CollectionUtils.isEmpty(node1.getChildren())) {
                        node1.setChildren(new ArrayList<>());
                    }
                    node1.getChildren().add(node);
                } else {
                    if (CollectionUtils.isEmpty(parentMap.get(parentId))) {
                        parentMap.put(parentId, new ArrayList<>());
                    }
                    parentMap.get(parentId).add(node);
                }

                if (!CollectionUtils.isEmpty(parentMap.get(parentId))) {
                    node1.getChildren().addAll(parentMap.get(parentId));
                    parentMap.remove(parentId);
                }
                mapNode.put(node.getId(), node);
            }
        }
        return result;
    }
}
