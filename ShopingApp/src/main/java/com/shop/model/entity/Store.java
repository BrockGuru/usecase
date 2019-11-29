package com.shop.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="store_table")
public class Store {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private String phone;
	private String email;
	private double review;
	private long no_of_review;
	public Store(String name, String phone, String email, double review, long no_of_review) {
		
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.review = review;
		this.no_of_review = no_of_review;
	}
	@ManyToMany(mappedBy="storelist",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Product>list=new ArrayList<Product>();
	@OneToMany(mappedBy="store",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Review> list1=new ArrayList<Review>();
	
	public void addReview(Review review)
	{
		list1.add(review);
	}
	public void addProductDetail(Product product)
	{
		list.add(product);
		product.addStoredetails(this);
	}
	
	public List<Review> getList1() {
		return list1;
	}
	public void setList1(List<Review> list1) {
		this.list1 = list1;
	}
	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}

	public Store() {
		
	}

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
	public double getReview() {
		return review;
	}
	public void setReview(double review) {
		this.review = review;
	}
	public long getNo_of_review() {
		return no_of_review;
	}
	public void setNo_of_review(long no_of_review) {
		this.no_of_review = no_of_review;
	}
	
	

}
