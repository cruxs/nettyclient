package com.huatec.edu.client.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.imageio.spi.RegisterableService;

public class NettyClientProxy {

    //根据结构创建代理对象
    public static Object create(Class target) {
		return Proxy.newProxyInstance(target.getClassLoader(), target.getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				
				return null;
			}
			
		});
        
    }
}


