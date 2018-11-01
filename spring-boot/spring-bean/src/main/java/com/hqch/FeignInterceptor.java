//package com.hqch;
//
//import com.alibaba.fastjson.JSON;
//import com.dazong.common.CommonStatus;
//import com.dazong.common.exceptions.BaseApplicationException;
//import com.dazong.common.exceptions.PlatformException;
//import okhttp3.Interceptor;
//import okhttp3.Request;
//import okhttp3.Response;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.lang.reflect.Field;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//
///**
// * @author huqichao
// * @date 2018-05-30 17:45
// */
//@Component
//public class FeignInterceptor implements Interceptor {
//
//
//    @Override
//    public Response intercept(Chain chain) throws IOException {
//        Request request = chain.request();
//        Response response = chain.proceed(request);
//        if (!response.isSuccessful()) {
//            String body = response.body().string();
//            System.out.println("response body:" + body);
//            Map<String, String> expMap = JSON.parseObject(body, Map.class);
//            String message = expMap.get("message");
//            Integer code = null;
//            if (message != null && message.startsWith("[")){
//                String[] str = expMap.get("message").split("]");
//                code = Integer.valueOf(str[0].substring(1));
//                message = str[1];
//            }
//            String exception = expMap.get("exception");
//            Object obj;
//            Class expClazz;
//            List<Field> fieldList = new ArrayList<>();
//            try {
//                expClazz = Class.forName(exception);
//                Class<?> tempClass = expClazz;
//                while (tempClass != null) {
//                    fieldList.addAll(Arrays.asList(tempClass.getDeclaredFields()));
//                    tempClass = tempClass.getSuperclass();
//                }
//                obj = expClazz.newInstance();
//                for (Field field : fieldList){
//                    if ("code".equals(field.getName()) && code != null){
//                        field.setAccessible(true);
//                        field.set(obj, code);
//                    } else if ("detailMessage".equals(field.getName())) {
//                        field.setAccessible(true);
//                        field.set(obj, message);
//                    } else if ("cause".equals(field.getName())) {
//                        field.setAccessible(true);
//                        field.set(obj, null);
//                    } else if ("stackTrace".equals(field.getName())) {
//                        field.setAccessible(true);
//                        field.set(obj, null);
//                    }
//                }
//            } catch (Exception e) {
//                throw new PlatformException(CommonStatus.ERROR);
//            }
//            if (obj instanceof BaseApplicationException){
//                throw (BaseApplicationException) obj;
//            } else {
//                throw (RuntimeException) obj;
//            }
//        } else {
//            //after
//            return response;
//        }
//    }
//}
