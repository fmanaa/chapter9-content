package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
	private String products;
	private String payment;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
	
	public String getProducts() {
        return products;
    }
	
	public void setProducts(String products) {
        this.products = products;
    }

    public void setPaymentMethod(String payment) {
        this.payment = payment;
    }
	
	public String getPayment() {
        return payment;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) &&
                Objects.equals(address, customer.address) &&
					Objects.equals(products, customer.products) &&
						Objects.equals(payment, customer.payment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, products, payment);
    }
}