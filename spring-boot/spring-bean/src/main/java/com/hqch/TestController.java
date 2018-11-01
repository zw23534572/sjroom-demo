//package com.hqch;
//
//import com.alibaba.fastjson.JSONObject;
//import com.dazong.common.resp.DataResponse;
//import com.dazong.number.NumberApiClient;
//import com.dazong.number.dto.ValidateRuleDto;
//import com.dazong.number.exception.NumberException;
//import com.dazong.number.vo.ValidateRuleVo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author huqichao
// * @date 2018-05-30 17:31
// */
//@RestController
//public class TestController {
//
//    @Autowired
//    private NumberApiClient numberApiClient;
//
//    @RequestMapping("/test")
//    public String test(){
//        test1();
//        System.out.println("=========================");
//        test2();
//        System.out.println("=========================");
//        test3();
//        System.out.println("=========================");
//        test4();
//        System.out.println("=========================");
//        test5();
//        System.out.println("=========================");
//        test6();
//        System.out.println("=========================");
//        test7();
//        System.out.println("=========================");
//        test8();
//        System.out.println("=========================");
//        test9();
//        System.out.println("=========================");
//        test21();
//        System.out.println("=========================");
//        test31();
//        System.out.println("=========================");
//        test41();
//        System.out.println("=========================");
//        test51();
//        return "aaa";
//    }
//
//    private void test1(){
//        int vo = numberApiClient.test1();
//        System.out.println(vo);
//    }
//
//    private void test2(){
//        Integer vo = numberApiClient.test2();
//        System.out.println(vo);
//    }
//
//    private void test3(){
//        ValidateRuleVo vo = numberApiClient.test3();
//        System.out.println(vo);
//    }
//
//    private void test4(){
//        try{
//            ValidateRuleVo vo = numberApiClient.test4();
//            System.out.println(vo);
//        } catch (Exception e) {
//            System.out.println("message:" + e.getMessage());
//        }
//    }
//
//    private void test5(){
//        try{
//            ValidateRuleVo vo = numberApiClient.test5();
//            System.out.println(vo);
//        } catch (NumberException e) {
//            System.out.println("code:" + e.getCode());
//            System.out.println("message:" + e.getMessage());
//        }
//    }
//
//    private void test6(){
//        String vo = numberApiClient.test6();
//        System.out.println(vo);
//    }
//
//    private void test7(){
//        DataResponse<?> vo = numberApiClient.test7();
//        System.out.println(vo);
//    }
//
//    private void test8(){
//        DataResponse<JSONObject> vo = numberApiClient.test8();
//        System.out.println(vo);
//    }
//
//    private void test9(){
//        DataResponse vo = numberApiClient.test9();
//        System.out.println(vo);
//    }
//
//    private void test21(){
//        DataResponse<Integer> vo = numberApiClient.test21();
//        System.out.println(vo);
//        System.out.println(vo.getData());
//    }
//
//    private void test31(){
//        DataResponse<ValidateRuleVo> vo = numberApiClient.test31();
//        System.out.println(vo);
//        System.out.println(vo.getData());
//        System.out.println(vo.getData().getDemoRule());
//    }
//
//    private void test41(){
//        try{
//            DataResponse<ValidateRuleVo> vo = numberApiClient.test41();
//            System.out.println(vo);
//        } catch (Exception e) {
//            System.out.println("message:" + e.getMessage());
//        }
//    }
//
//    private void test51(){
//        try{
//            DataResponse<ValidateRuleVo> vo = numberApiClient.test51();
//            System.out.println(vo);
//        } catch (NumberException e) {
//            System.out.println("code:" + e.getCode());
//            System.out.println("message:" + e.getMessage());
//        }
//    }
//}
