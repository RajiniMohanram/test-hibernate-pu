package com.srt.proj.app.payment;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {
	@Id
	private String checkNumber;
	private int customerNumber;
	private LocalDate paymentDate;
	private double amount;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(String checkNumber, int customerNumber, LocalDate paymentDate, double amount) {
		super();
		this.checkNumber = checkNumber;
		this.customerNumber = customerNumber;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}
	public String getCheckNumber() {
		return checkNumber;
	}
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [checkNumber=" + checkNumber + ", customerNumber=" + customerNumber + ", paymentDate="
				+ paymentDate + ", amount=" + amount + "]";
	}
	
}
