package org.springframework.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author starry
 * @version 1.0
 * @date 2024/1/25 21:04
 * @Description
 */
@Aspect
public class AspectJTest {

	@Pointcut("execution(* org.springframework.circledepends..*.*(..))")
	//@Pointcut("execution(* org.springframework.aop..*.*(..))")
	public void test() {
	}

	@Before("test()")
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@Before("test()")
	public void afterTest() {
		System.out.println("afterTest");
	}

	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("aroundTest");
		return proceedingJoinPoint.proceed();
	}
}
