package com.mokykla.mm.projektukas2;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Projektukas2Application {

	public static void main(String[] args) throws BeansException {

		SpringApplication.run(Projektukas2Application.class, args);

        ApplicationContext ac = new ClassPathXmlApplicationContext("SB.xml");
        Radiacija rad = ac.getBean("spinduliuoti", AlfaRadiacija.class);
	}


}
