package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserServiceProxyFactory implements InvocationHandler  {

	private UserService us;

	public UserServiceProxyFactory(UserService us) {
		
		this.us = us;
	}

	public UserService getUserServiceProxy() {
		UserService us = (UserService) Proxy.newProxyInstance(UserServiceProxyFactory.class.getClassLoader(), 
				UserServiceImpl.class.getInterfaces(),
				this);
		return us;
		
		
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("daili");
		Object invoke = method.invoke(us, args);
		return invoke;
	}

	
	
	
}
