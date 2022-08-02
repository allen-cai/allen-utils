package net.cailun.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.data.ACL;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @ClassName Zookeeper
 * @Date 2022/8/2 16:46
 * @Author allen
 * @Description TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Zookeeper implements Serializable {

    private static final long serialVersionUID = 960613434877973523L;

    private String id;

    /**
     *  zookeeper的路径
     */
    private String path;

    /**
     *  节点对应的数据
     */
    private Object obj;

    /**
     * OPEN_ACL_UNSAFE  : 完全开放的ACL，任何连接的客户端都可以操作该属性znode
     * CREATOR_ALL_ACL : 只有创建者才有ACL权限
     * READ_ACL_UNSAFE：只能读取ACL
     */
    private String aCLType;

    /**
     *  acl的集合：ACL权限
     */
    private ArrayList<ACL> lists;

    /**
     *  0 PERSISTENT 持久化目录节点, 会话结束存储数据不会丢失
     *  2 PERSISTENT_SEQUENTIAL 顺序自动编号持久化目录节点
     *  1 EPHEMERAL 临时目录节点
     *  3 EPHEMERAL_SEQUENTIAL 临时自动编号节点
     */
    private int createNodeType;

    /**
     *  节点类型：
     *  PERSISTENT 持久化目录节点, 会话结束存储数据不会丢失
     *  PERSISTENT_SEQUENTIAL 顺序自动编号持久化目录节点
     *  EPHEMERAL 临时目录节点
     *  EPHEMERAL_SEQUENTIAL 临时自动编号节点
     */
    private CreateMode createMode;

    public void setaCLType(String aCLType) {
        this.aCLType = aCLType;
        // ArrayList<ACL> 赋值
        if("OPEN_ACL_UNSAFE".equals(aCLType)){
            lists = ZooDefs.Ids.OPEN_ACL_UNSAFE;
        }else if("CREATOR_ALL_ACL".equals(aCLType)){
            lists = ZooDefs.Ids.CREATOR_ALL_ACL;
        }else if("READ_ACL_UNSAFE".equals(aCLType)){
            lists = ZooDefs.Ids.READ_ACL_UNSAFE;
        }
    }


    public void setCreateNodeType(int createNodeType) {
        this.createNodeType = createNodeType;
        if(createNodeType == 0){
            createMode = CreateMode.PERSISTENT;
        }else if(createNodeType == 2){
            createMode = CreateMode.PERSISTENT_SEQUENTIAL;
        }else if(createNodeType == 1){
            createMode = CreateMode.EPHEMERAL;
        }else if(createNodeType == 3){
            createMode = CreateMode.EPHEMERAL_SEQUENTIAL;
        }
    }
}
