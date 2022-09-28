package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class TestFindPersonByPan {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		Person p = em.find(Person.class, 1);
		System.out.println("------Person info----------");
		System.out.println("ID is : " + p.getId());
		System.out.println("Name is : " + p.getName());
		System.out.println("Gender is : " + p.getGender());
		Pan pan = p.getPan();
		if (pan != null) {
			System.out.println("-------Pan info---------");
			System.out.println("Pan Id is : " + pan.getId());
			System.out.println("Pan num is : " + pan.getNumber());
			System.out.println("Pan type is : " + pan.getType());
		}
	}
}
//this is finding pan by person not person by pan