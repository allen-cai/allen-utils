package net.cailun.service;

import net.cailun.entry.Zookeeper;
import org.apache.zookeeper.AsyncCallback;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Stat;

import java.util.List;

/**
 * @ClassName ZookeeperServicer
 * @Date 2022/8/2 16:29
 * @Author allen
 * @Description TODO
 */
public interface ZookeeperService {
    /**
     *  创建zookeeper节点
     * @param zookeeper
     */
    public void create(Zookeeper zookeeper);

    /**
     * 更新节点
     * @param zookeeper
     */
    public void updateZnode(Zookeeper zookeeper);

    /**
     * 删除节点
     * @param zookeeper
     */
    public void deleteZnode(Zookeeper zookeeper);

    /**
     * 获取根节点下所有子节点
     *
     */
    public void getChildren();
}
