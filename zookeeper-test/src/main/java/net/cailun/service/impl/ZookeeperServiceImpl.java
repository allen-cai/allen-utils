package net.cailun.service.impl;

import lombok.extern.slf4j.Slf4j;
import net.cailun.config.ZookeeperConfig;
import net.cailun.entry.Zookeeper;
import net.cailun.service.ZookeeperService;
import net.cailun.utils.ZookeeperUtil;
import org.apache.zookeeper.AsyncCallback;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Stat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ZookeeperServiceImpl
 * @Date 2022/8/2 16:30
 * @Author allen
 * @Description TODO
 */
@Service
@Slf4j
public class ZookeeperServiceImpl implements ZookeeperService {

    /**
     *  创建zookeeper节点
     * @param zookeeper
     */
    public void create(Zookeeper zookeeper){
        try{
            String path = zookeeper.getPath();
            Object obj = zookeeper.getObj();
            ArrayList<ACL> lists = zookeeper.getLists();
            CreateMode createMode = zookeeper.getCreateMode();
            ZooKeeper zooKeeper = ZookeeperConfig.getZooKeeper();
            ZookeeperUtil zookeeperUtil = new ZookeeperUtil(zooKeeper);
            if(zookeeperUtil.isExistZnode(path) == null){
                zookeeperUtil.createZnode(path, obj, lists, createMode);
                log.info("创建zookeeper节点 成功");
            }else {
                log.info(path + " znode exist！！！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 更新节点
     * @param zookeeper
     */
    public void updateZnode(Zookeeper zookeeper){
        try{
            String path = zookeeper.getPath();
            Object obj = zookeeper.getObj();
            ArrayList<ACL> lists = zookeeper.getLists();
            CreateMode createMode = zookeeper.getCreateMode();
            ZooKeeper zooKeeper = ZookeeperConfig.getZooKeeper();
            ZookeeperUtil zookeeperUtil = new ZookeeperUtil(zooKeeper);
            Stat existZnode = zookeeperUtil.isExistZnode(path);
            if(existZnode != null){
                zookeeperUtil.updateZnode(path, obj, existZnode.getVersion());
                log.info("更新 zookeeper节点 成功");
            }else {
                log.info(path + " 不存在！！！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    /**
     * 删除节点
     * @param zookeeper
     */
    public void deleteZnode(Zookeeper zookeeper){
        try{
            String path = zookeeper.getPath();
            Object obj = zookeeper.getObj();
            ArrayList<ACL> lists = zookeeper.getLists();
            CreateMode createMode = zookeeper.getCreateMode();
            ZooKeeper zooKeeper = ZookeeperConfig.getZooKeeper();
            ZookeeperUtil zookeeperUtil = new ZookeeperUtil(zooKeeper);
            Stat existZnode = zookeeperUtil.isExistZnode(path);
            if(existZnode != null){
                zookeeperUtil.deleteZnode(path, existZnode.getVersion());
                log.info("删除 zookeeper节点 成功");
            }else {
                log.info(path + " 不存在！！！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取根节点下所有子节点
     *
     */
    public void getChildren(){
        try{
            ZooKeeper zooKeeper = ZookeeperConfig.getZooKeeper();
            //获取根节点下所有子节点,遍历获取对应节点的数据
            List<String> znodes = zooKeeper.getChildren("/",true);
            for(String str : znodes){
                log.info(str+">>>"+new String(zooKeeper.getData("/"+str,true,new Stat())));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
