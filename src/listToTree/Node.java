package listToTree;

import java.util.List;

/**
 * @ClassName Node
 * @Date 2021/8/16 13:41
 * @Author allen
 * @Description TODO
 */
public class Node {

    private Long id;

    /**
     * -1 ： 表示的为顶级节点
     */
    private Long parentId;

    private String name;

    private Integer level;

    private List<Node> children;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }
}
