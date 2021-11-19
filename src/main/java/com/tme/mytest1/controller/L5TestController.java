package com.tme.mytest1.controller;

import com.qq.l5.L5sys;
import com.tencent.dac.rec.config.L5Config;
import com.tme.mytest1.dto.L5DTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName :   L5Controller
 * @Description: TODO
 * @Author: v_ktlema
 * @CreateDate: 2021/4/23 11:34
 * @Version: 1.0
 */
@RestController
@RequestMapping("/l5Test")
public class L5TestController {

    /**
     * 测试1
     * @return
     */
    @RequestMapping("/test")
    public String test(){
        System.out.println("jjj");
        return "test";
    }

    /**
     * L5测试1(直接使用Tencent自带的镜像源)
     */
    @PostMapping("/test1")
    public void test1(@RequestBody L5DTO l5DTO){
        System.out.println("mmm");
        System.out.println(l5DTO);
        L5Config config = new L5Config(l5DTO.getModId(), l5DTO.getCmdId(), l5DTO.getTimeout());
        //解析L5
        L5sys.QosRequest request = config.getRequest();
        String ip = request.hostIp;
        int port = request.hostPort;
        String host = ip + ":" + port;
        System.out.println("ip is:" + ip);
        System.out.println("port is:" + port);
        System.out.println("host is:" + host);
    }

    /**
     * L5测试2(直接使用Tencent自带的镜像源)
     */
    @RequestMapping("/test2")
    public void test2(Integer modId, Integer cmdId, Float timeout){
        System.out.println("mmm");
        System.out.println(modId);
        System.out.println(cmdId);
        System.out.println(timeout);
        L5Config config = new L5Config(modId, cmdId, timeout);
        //解析L5
        L5sys.QosRequest request = config.getRequest();
        String ip = request.hostIp;
        int port = request.hostPort;
        String host = ip + ":" + port;
        System.out.println("ip is:" + ip);
        System.out.println("port is:" + port);
        System.out.println("host is:" + host);
    }



}
