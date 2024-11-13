package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* zxcadd*(..))")
    public void allAddMethods(){}
}
