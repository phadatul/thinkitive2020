package com.thinkitive;

import java.util.Set;

public class Book {
	private int id;
	private String name;
	private Set<String> authors;
	private int price;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, Set<String> authors, int price) {
		super();
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<String> authors) {
		this.authors = authors;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", authors=" + authors + ", price=" + price + "]";
	}
	
	

}
