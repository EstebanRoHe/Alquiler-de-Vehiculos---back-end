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
public class VehiculoAop {
    @Autowired
    private LogController logController;
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.VehiculoController.create(..))")
    public void metodo1(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("create Vehiculo");
        logController.create(lo);
    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.VehiculoController.delete(..))")
    public void metodo2(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("delete Vehiculo");
        logController.create(lo);
    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.VehiculoController.update(..))")
    public void metodo3(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("update Vehiculo");
        logController.create(lo);
    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.VehiculoController.findAll(..))")
    public void metodo4(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("findAll Vehiculo");
        logController.create(lo);
    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.VehiculoController.findById(..))")
    public void metodo5(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("findById Vehiculo");
        logController.create(lo);
    };
}
