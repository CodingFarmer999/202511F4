package com.course.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopAspect {
	
	Logger logger = LoggerFactory.getLogger(AopAspect.class);

	@Pointcut("execution(public * com.course.service.BookService.*(..))")
	public void pointCutMethod() {
	    // 透由 @Pointcut 定義切點，方法內容維持空方法
	}
	
	@Before("pointCutMethod()")
	public void beforeAdvice(JoinPoint joinPoint) {
	    logger.info("切面 AopAspect.beforeAdvice() -> @Before通知，在方法調用前先行調用，被切的方法名稱：" + joinPoint.getSignature().getName());
	}
	
	@After("execution(public * com.course.service.BookService.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
	    logger.info("切面 AopAspect.afterAdvice() -> @After通知，在方法調用之後才調用，被切的方法名稱：" + joinPoint.getSignature().getName());
	}
	
	@Around("pointCutMethod()")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		// 執行方法前，要做的事情
		Long start = System.currentTimeMillis();
		Object obj = joinPoint.proceed();
		
		// 執行方法後，你想做甚麼
		
		Long end = System.currentTimeMillis();
		
		logger.info("方法執行時間: {} ms", end - start);
		return obj;
	}
}
