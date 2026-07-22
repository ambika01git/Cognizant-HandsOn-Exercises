//package com.library.aspect;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//
//public class LoggingAspect {
//
//    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        long start = System.currentTimeMillis();
//
//        Object result = joinPoint.proceed();
//
//        long end = System.currentTimeMillis();
//
//        System.out.println(
//            joinPoint.getSignature().getName()
//            + " executed in "
//            + (end - start)
//            + " ms"
//        );
//
//        return result;
//    }
//}


package com.library.aspect;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {


    // Before method execution
    public void beforeMethod(JoinPoint joinPoint) {

        System.out.println(
            "Before executing method: "
            + joinPoint.getSignature().getName()
        );

    }


    // After method execution
    public void afterMethod(JoinPoint joinPoint) {

        System.out.println(
            "After executing method: "
            + joinPoint.getSignature().getName()
        );

    }

}