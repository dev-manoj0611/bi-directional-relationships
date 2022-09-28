package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class TestInsertPersonAndPan {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		Person p = new Person();
		p.setName("deepika");
		p.setGender("female");
		Pan pan = new Pan();
		pan.setNumber("AGHPU3013E");
		pan.setType("Personal");
		EntityTransaction et = em.getTransaction();
		pan.setPerson(p);
		p.setPan(pan);
		et.begin();
		em.persist(p);
		em.persist(pan);
		et.commit();
		System.out.println("saved");
	}
}