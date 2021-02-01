package com.thinkitive.util;

import java.util.ArrayList;
import java.util.List;

public class StoreUtil<T> {
	List<T> list = new ArrayList<T>();

	public void addRecord(T data) {
		list.add(data);
	}

	public List<T> getRecords() {
		return this.list;
	}

	public int getNumofRecords() {
		return this.list.size();
	}

}
