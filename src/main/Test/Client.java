import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface LoginService {
    void login();
}
class LoginServiceImpl implements LoginService {
    @Override
    public void login() {
        System.out.println("login");
    }
}
class ProxyInvocationHandler implements InvocationHandler {
    private LoginService loginService;
    public ProxyInvocationHandler(LoginService loginService) {
        this.loginService = loginService;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeLogin();
        Object invokeResult = method.invoke(loginService, args);
        afterLogin();
        return invokeResult;
    }
    private void beforeLogin() {
        System.out.println("before login");
    }
    private void afterLogin() {
        System.out.println("after login");
    }
}
public class Client {
    @Test
    public void test() {
        LoginService loginService = new LoginServiceImpl();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler(loginService);
        LoginService loginServiceProxy = (LoginService) Proxy.newProxyInstance(loginService.getClass().getClassLoader(), loginService.getClass().getInterfaces(), proxyInvocationHandler);
        loginServiceProxy.login();
        createProxyClassFile();
    }
    public static void createProxyClassFile() {
        String name = "LoginServiceProxy";
        byte[] data = ProxyGenerator.generateProxyClass(name, new Class[]{LoginService.class});
        try {
            FileOutputStream out = new FileOutputStream(name + ".java");
            out.write(data);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}