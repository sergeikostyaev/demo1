package com.example.demo.course.aop.aspects;


import com.example.demo.course.aop.Book;
import com.example.demo.course.aop.UniLibrary;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(1)
public class LoggingAspect {


    @Before("com.example.demo.course.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {


        var methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("Signature = " + methodSignature);
        System.out.println("Method = " + methodSignature.getMethod());
        System.out.println("Return type = " + methodSignature.getMethod().getReturnType());
        System.out.println("Name = " + methodSignature.getMethod().getName());


        if(methodSignature.getName().equals("addBook")){
            Object[]args = joinPoint.getArgs();
            for(Object o:args){
                if(o instanceof Book){
                    Book myBook = (Book)o;
                    System.out.println(myBook.getName() + " " + myBook.getAuthor());
                }else{
                    System.out.println("added by " + o);

                }
            }

        }


        System.out.println("beforeGetLoggingAdvice: logging");
    }
}






























//    @Pointcut("execution( * com.example.demo.course.aop.UniLibrary.*(..))") private void allMethods(){}
//
//    @Pointcut("execution( * com.example.demo.course.aop.UniLibrary.returnMagazine())") private void returnMagazine(){}
//
//    @Pointcut("allMethods() && !returnMagazine()") private void noMagazine(){}
//
//    @Pointcut("execution( * com.example.demo.course.aop.UniLibrary.*(..)) && !execution( * com.example.demo.course.aop.UniLibrary.returnMagazine())") private void noMagazine2(){}
//
//    @Before("noMagazine2()")
//    public void allMethodsAdvice(){
//        System.out.println("#1");
//    }
//    @Pointcut("execution(* get*())") private void allGettersFromUni(){};
//
//    @Pointcut("execution(* return*())") private void allReturnsFromUni(){};
//
//    @Pointcut("allGettersFromUni() || allReturnsFromUni()") private void combinationFromUni(){};
//
//    @Before("allGettersFromUni()")
//    public void allBeforeLoggingAdvice(){
//        System.out.println("allBeforeLoggingAdvice: log #1");
//    }
//
//    @Before("allReturnsFromUni()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: log #2");
//    }
//
//    @Before("combinationFromUni()")
//    public void beforeCombinationAdvice(){
//        System.out.println("beforeCombinationAdvice: log #3");
//    }
//    @Pointcut("execution(* get*())") private void allGetMethods(){}
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: trying get book or magazine");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: Proverka Prav");
//    }






