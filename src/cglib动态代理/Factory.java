package cglib动态代理;

import net.sf.cglib.proxy.Enhancer;

public class Factory {

    public static Dog getInstance(CglibProxy proxy) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dog.class);
        enhancer.setCallback(proxy);
        Dog dog = (Dog) enhancer.create();

        return dog;
    }
}
