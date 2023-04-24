package com.runoob.test;

public class PrimitiveTypeTest {
	public static void main(String[] args) {
		// byte
		System.out.println("基本类型：byte 二进制位数：" +Byte.SIZE); // 基本类型：byte 二进制位数：8
		System.out.println("包装类：java.lang.Byte"); // 包装类：java.lang.Byte
		System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE); // 最小值：Byte.MIN_VALUE=-128
		System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE); // 最大值：Byte.MAX_VALUE=127
		System.out.println(); 
		
		// short
		System.out.println("基本类型：short 二进制位数：" + Short.SIZE); // 基本类型：short 二进制位数：16
		System.out.println("包装类：java.lang.Short"); // 包装类：java.lang.Short
		System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE); // 最小值：Short.MIN_VALUE=-32768
		System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE); // 最大值：Short.MAX_VALUE=32767
		System.out.println(); 
		
		// int
		System.out.println("基本类型：int 二进制位数：" + Integer.SIZE); // 基本类型：int 二进制位数：32
		System.out.println("包装类：java.lang.Integer"); // 包装类：java.lang.Integer
		System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE); // 最小值：Integer.MIN_VALUE=-2147483648
		System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE); // 最大值：Integer.MAX_VALUE=2147483647
		System.out.println(); 
	}
}
