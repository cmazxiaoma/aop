package JDK动态代理;

import java.lang.reflect.Proxy;

public class DymaticProxyDemo {

    public static void main(String[] args) {
        IUserService userService = new UserService();
        UserDynamicProxy handler = new UserDynamicProxy(userService);
        IUserService serviceProxy = (IUserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(), handler);

        serviceProxy.login();
    }
}
