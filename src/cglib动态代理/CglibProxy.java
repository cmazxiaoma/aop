package cglib动态代理;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("before");
        proxy.invokeSuper(object, args);
        System.out.println("after");
        return null;
    }
}
