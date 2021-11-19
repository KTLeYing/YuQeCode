//package com.tme.mytest1.controller;
//
///**
// * @ClassName :   L5aPP
// * @Description: TODO
// * @Author: v_ktlema
// * @CreateDate: 2021/4/22 17:11
// * @Version: 1.0
// */
//public class L5DemoController {
//
//    private static final int MOD_ID = 64296001;
//    private static final int CMD_ID = 65536;
//
//    public static void main(String[] args) {
//        System.out.println("library path:" + System.getProperty("java.library.path"));
//        L5Config l5Config = new L5Config(MOD_ID, CMD_ID);
//        L5sys.QosRequest req = new L5sys.QosRequest(l5Config);
//
//        float timeoutInMillis = new Float(0.2);
//        L5sys l5sys = new L5sys();
//        //先调用L5获取需要调用服务器的IP和端口
//        L5EndPoint endPoint = null;
//        try {
//            endPoint = l5sys.fetchRoute(req, timeoutInMillis);
//        } catch (L5Exception e) {
//            System.out.println(e.getErrorCode());
//            //获取ip和端口出错
//        }
//        System.out.println("hostIp:" + endPoint.getHostIp());
//        System.out.println("HostPort:" + endPoint.getHostPort());
//        long startTime = System.currentTimeMillis();
//        System.out.println("call server.....");
//        long costTime = System.currentTimeMillis() - startTime;
//
//        //调用完后上传服务质量
//        l5sys.updateRouteResult(req, L5sys.Status.SUCCESS, costTime);
//    }
//
//}
