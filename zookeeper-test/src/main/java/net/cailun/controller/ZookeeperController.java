package net.cailun.controller;

import net.cailun.entry.Zookeeper;
import net.cailun.service.ZookeeperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ZookeeperController
 * @Date 2022/8/2 16:50
 * @Author allen
 * @Description TODO
 */
@RestController
@RequestMapping("/zookeeperController")
public class ZookeeperController {

    @Autowired
    private ZookeeperService zookeeperService;

    /**
     *  创建zookeeper节点
     * @param zookeeper
     */
    @RequestMapping("/create")
    public void create(@RequestBody Zookeeper zookeeper){
        zookeeperService.create(zookeeper);
    }

    /**
     * 更新节点
     * @param zookeeper
     */
    @RequestMapping("/updateZnode")
    public void updateZnode(@RequestBody Zookeeper zookeeper){
        zookeeperService.updateZnode(zookeeper);
    }

    /**
     * 删除节点
     * @param zookeeper
     */
    @RequestMapping("/deleteZnode")
    public void deleteZnode(@RequestBody Zookeeper zookeeper){
        zookeeperService.deleteZnode(zookeeper);
    }

    /**
     * 获取根节点下所有子节点
     */
    @RequestMapping("/getChildren")
    public void getChildren(){
        zookeeperService.getChildren();
    }
}
