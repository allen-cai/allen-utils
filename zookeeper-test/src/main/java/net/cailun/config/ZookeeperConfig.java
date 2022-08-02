package net.cailun.config;

import lombok.Data;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

/**
 * @ClassName ZkConfig
 * @Date 2022/8/2 16:24
 * @Author allen
 * @Description TODO
 */
@Data
public class ZookeeperConfig {

    //连接的zk服务
    private static final String CONNECTION_HOSTS = "47.106.176.182:2181";
    //超时连接的时间
    private static final int SESSION_TIMEOUT = 2000;

    private  static ZooKeeper zooKeeper = null;
    static {
        try {
            zooKeeper = new ZooKeeper(CONNECTION_HOSTS, SESSION_TIMEOUT, new Watcher() {
                public void process(WatchedEvent watchedEvent) {
                    System.out.println(watchedEvent.getPath()+";"+watchedEvent.getState());
                    try {
                        //获取对根目录节点数据的监控
                        zooKeeper.getChildren("/",true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ZooKeeper getZooKeeper() {
        return zooKeeper;
    }
}
