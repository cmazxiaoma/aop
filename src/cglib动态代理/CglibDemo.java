package cglib动态代理;

public class CglibDemo {

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Dog rayDog = Factory.getInstance(proxy);
        rayDog.call();
    }
}
