package com.lambazon.domain;

public class Product {
	
	private Integer id;
	private String name, description, details;
	private int quantity;
	private double price;

	public Product(int id, int quantity, double price, String name, String description) {
		setId(id);
		setQuantity(quantity);
		setPrice(price);
		setName(name);
		setDescription(description);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		//change value of quantity
		if (quantity = 0) {
	  		this.quantity = 0.0; 
			      }
			
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		//Change Value of price
		if(price >= 0 && price <= 1000) 
			this.price = price; 
			else if (price > 1000)
			this.price = 1000;
			else 
			this.price = 0;  
			

	}

	public double getInventoryPrice() {
		
		//total value of the stock in the details field
		return quantity*price;

	}
}
