package proxy;

public class TestProxy {

	public static void main(String[] args) {
		UserService us = new UserServiceImpl();
		UserServiceProxyFactory factory = new UserServiceProxyFactory(us);
		UserService usProxy = factory.getUserServiceProxy();
		usProxy.delete();
	}

}
