package com.shop.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="Customer_table")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String address;
private String phone;
private String email;
public Customer(String name, String address, String phone, String email) {
	
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.email = email;
}
@OneToMany(mappedBy="customer",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
private List<MyOrder>order=new ArrayList<MyOrder>();
public void addOrders(MyOrder myorder)
{
	order.add(myorder);
	myorder.setCustomer(this);
}

public List<MyOrder> getOrder() {
	return order;
}

public void setOrder(List<MyOrder> order) {
	this.order = order;
}

public Customer() {
	
}
public Long getId() {
	return id;
}
public void setId(Long id) {
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
