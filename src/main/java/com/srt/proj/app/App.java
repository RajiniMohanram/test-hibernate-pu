package com.srt.proj.app;

import java.util.List;

import com.srt.proj.app.payment.Payment;
import com.srt.proj.app.payment.PaymentRepo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PaymentRepo repo = new PaymentRepo();
    	List<Payment> payments = repo.getAllPayments();
    	payments.forEach(System.out::println);
    }
}
