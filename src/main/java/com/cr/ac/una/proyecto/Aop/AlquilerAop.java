package com.cr.ac.una.proyecto.Aop;


import com.cr.ac.una.proyecto.Controllers.LogController;
import com.cr.ac.una.proyecto.Models.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class AlquilerAop {
    @Autowired
    private LogController logController;


    @Before("execution(* com.cr.ac.una.proyecto.Controllers.AlquilerController.create(..))")
    public void metodo1(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("create Alquiler");
        logController.create(lo);


    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.AlquilerController.delete(..))")
    public void metodo2(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("delete Alquiler");
        logController.create(lo);
    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.AlquilerController.update(..))")
    public void metodo3(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("update Alquiler");
        logController.create(lo);
    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.AlquilerController.findALL(..))")
    public void metodo4(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("findAll Alquiler");
        logController.create(lo);
    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.AlquilerController.findById(..))")
    public void metodo5(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("findById Alquiler");
        logController.create(lo);
    };
}
