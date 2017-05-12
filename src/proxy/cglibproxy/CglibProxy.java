package proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/5/12.
 */
public class CglibProxy implements MethodInterceptor {
    private Object target;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before...");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("after...");
        return result;
    }

    public Object newInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Subject subject = (Subject) proxy.newInstance(new RealSubject());
        subject.oper();
    }
}
