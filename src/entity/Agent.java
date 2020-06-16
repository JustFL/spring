package entity;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Agent {
	public void before(JoinPoint point) {
		//被织入的对象
		System.out.println(point.getTarget());
		//被织入的对象的方法
		System.out.println(point.getSignature().getName());
		System.out.println("start transaction");
	}
	public void after() {
		System.out.println("stop transaction");
	}
	public void throwing() {
		System.out.println("a error happened");
	}
	public void springAfter() {
		System.out.println("at last");
	}
	
	public Object around(ProceedingJoinPoint point) {
		Object obj = null;
		try {
			System.out.println("before");
			obj = point.proceed();
			System.out.println("after-returning");
		} catch (Throwable e) {
			System.out.println("throwing");
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
		return obj;
	}
}
