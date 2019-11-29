package com.shop.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product_table")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private double price;
	public Product(String name, double price) {
		
		this.name = name;
		this.price = price;
	}
	@ManyToMany
	private List<Store>storelist=new ArrayList<Store>();
	public void addStoredetails(Store store)
	{
		storelist.add(store);
	
	}
	
	

	public List<Store> getStorelist() {
		return storelist;
	}



	public void setStorelist(List<Store> storelist) {
		this.storelist = storelist;
	}



	public Product() {
	
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
