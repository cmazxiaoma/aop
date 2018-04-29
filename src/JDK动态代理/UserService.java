package JDK动态代理;

public class UserService implements IUserService {

    @Override
    public void login() {
        System.out.println("login success");
    }
}
