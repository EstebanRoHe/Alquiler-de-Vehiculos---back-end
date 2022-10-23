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
public class Tipo_VehiculoAop {
    @Autowired
    private LogController logController;
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.Tipo_VehiculoController.create(..))")
    public void metodo1(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("create");
        logController.create(lo);
    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.Tipo_VehiculoController.delete(..))")
    public void metodo2(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("delete Tipo Vehiculo");
        logController.create(lo);
    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.Tipo_VehiculoController.update(..))")
    public void metodo3(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("update Tipo Vehiculo");
        logController.create(lo);
    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.Tipo_VehiculoController.findAll(..))")
    public void metodo4(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("findAll Tipo Vehiculo");
        logController.create(lo);
    };
    @Before("execution(* com.cr.ac.una.proyecto.Controllers.Tipo_VehiculoController.findById(..))")
    public void metodo5(JoinPoint joinPoint){
        Log lo = new Log();
        lo.setFecha(new Date());
        lo.setMetodo("findById Tipo Vehiculo");
        logController.create(lo);
    };
}
