package com.thinkitive.util;

import java.util.Collections;
import java.util.List;

import com.thinkitive.CompareBookByName;
import com.thinkitive.CompareBookByPrice;

public class SortUtil {

	public static void sortByName(List list) {

		Collections.sort(list, new CompareBookByName());
	}

	public static void sortByPrice(List list) {

		Collections.sort(list, new CompareBookByPrice());
	}

}
