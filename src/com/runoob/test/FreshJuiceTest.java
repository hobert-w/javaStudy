package com.runoob.test;

class FreshJuice {
	enum FreshJuiceSize{ SAMLL, MEDIUM, LARGE}
	FreshJuiceSize size;
}

public class FreshJuiceTest {
	public static void main(String[] args) {
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println(juice.size);
	}
}

