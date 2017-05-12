package proxy.dynamicproxy;


import proxy.staticproxy.RealSubject;
import proxy.staticproxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/5/12.
 */
public class DynamicProxy implements InvocationHandler {
    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before...");
        Object result = method.invoke(target, args);
        System.out.println("after...");
        return result;
    }


    public Object newInstance(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy();
        Subject target = (Subject) proxy.newInstance(new RealSubject());
        target.oper();
    }
}
