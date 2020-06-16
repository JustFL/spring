package entity;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TagAgent {

	@Pointcut(("execution(* entity.*.*(..))"))
	public void newCut() {}

	
	@Before("newCut()")
	public void before(JoinPoint point) {
		System.out.println(point.getTarget());
		System.out.println(point.getSignature().getName());
		System.out.println("this is before method");		
	}
	
	@Around("newCut()")
	public Object Around(ProceedingJoinPoint point) {
		Object obj = null;
		try {
			obj = point.proceed();
			System.out.println("this is after method");
		} catch (Throwable e) {
			System.out.println("this is exception method");
			e.printStackTrace();
		}finally {
			System.out.println("this is finally method");
		}
		return obj;
	}
}
