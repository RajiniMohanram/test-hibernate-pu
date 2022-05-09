package com.srt.proj.app.payment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PaymentRepo {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("eshop");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    public void addPayment(Payment p) {
    	entityManager.getTransaction().begin();
    	entityManager.persist(p);
    	entityManager.getTransaction().commit();
    }
    
    public Payment findPayment(String checkNumber) {
    	return entityManager.find(Payment.class, checkNumber);
    }
    
    public List<Payment> getAllPayments(){
    	return entityManager.createQuery("select p from Payment p", Payment.class).getResultList();
    }
}
