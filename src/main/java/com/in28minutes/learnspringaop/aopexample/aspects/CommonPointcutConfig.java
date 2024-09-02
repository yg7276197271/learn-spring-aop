package com.in28minutes.learnspringaop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {
	//execution -> execution of any method
	//first * is any return value 
	//(..) -> any no of parameters
	//com.in28minutes.learnspringaop.aopexample.*.*.* -> any package matches with this name
	//bean -> execution of bean
	//@annotation -> execution of any annotation
	
	@Pointcut("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))")
	public void businessAndDataPackageConfig() {}

	@Pointcut("execution(* com.in28minutes.learnspringaop.aopexample.business.*.*(..))")
	public void businessPackageConfig() {}

	@Pointcut("execution(* com.in28minutes.learnspringaop.aopexample.data.*.*(..))")
	public void dataPackageConfig() {}
	
	@Pointcut("bean(*Service*)")
	public void allPackageConfigUsingBean() {}

	@Pointcut("@annotation(com.in28minutes.learnspringaop.aopexample.annotations.TrackTime)")
	public void trackTimeAnnotation() {}
}
