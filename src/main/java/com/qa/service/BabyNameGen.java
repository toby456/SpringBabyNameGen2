package com.qa.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.qa.constants.BabyNameConstants;

@Service
public class BabyNameGen {


	public String generateBabyName(int length, String toStart) {
		if (length < 12) {
			int n = length - toStart.length();
			int a = BabyNameConstants.Letters.length();
			String name = toStart;
			ArrayList letter = new ArrayList();

			for (int i = 0; i < n; i++) {
				letter.add(BabyNameConstants.Letters
						.charAt((int) Math.round(Math.random() * BabyNameConstants.Letters.length())));
				name += letter.get(i);
			}

			return name.toLowerCase().substring(0, 1).toUpperCase() + name.substring(1);
		} else
			return BabyNameConstants.NAME_TOO_LONG;

	}
}
