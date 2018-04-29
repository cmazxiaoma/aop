package JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserDynamicProxy implements InvocationHandler {
    private Object target;

    public UserDynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("login before");
        Object result = method.invoke(target, args);
        System.out.println("login after");
        return result;
    }
}
