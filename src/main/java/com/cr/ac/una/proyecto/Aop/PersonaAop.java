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
public class PersonaAop {
@Autowired
    private LogController logController;

    @Before("execution(* com.cr.ac.una.proyecto.Controllers.PersonaController.create(..))")
    public void metodo1(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("create Persona");
        logController.create(lo);
    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.PersonaController.delete(..))")
    public void metodo2(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("delete Persona");
        logController.create(lo);
    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.PersonaController.update(..))")
    public void metodo3(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("update Persona");
        logController.create(lo);
    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.PersonaController.findAll(..))")
    public void metodo4(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("findAll Persona");
        logController.create(lo);
    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.PersonaController.findById(..))")
    public void metodo5(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("findById Persona");
        logController.create(lo);
    };
}
