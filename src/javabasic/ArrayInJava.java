package javabasic;

import java.util.Scanner;

public class ArrayInJava {

	public static void main(String[] args) {
		//Khai báo biến mảng trong jvava
		/* Kieu_du_lieu[]Bien_tham_chieu_mang
		 * 		VD : double[] animals;
		 * 
		 * Tạo mảng trong java
		 * Bien_tham_chieu_mang = new Kieu_du_lieu[Kich_co_mang];
		 * 		VD : animails = new double[10];
		 * 
		 * Mảng 1 chiều trong java
		 * khaibao, khởi tạo mảng trong java
		 * 		Cách 1:  	 int[] a={33,3,4,5};
		 * 		Cách 2 :
		 * 					 int[] a;
		 * 					 a = new int[4];
		 * 					 a[0]=33;a[1]=3;a[2]=4;a[3]=5;
		 *     Cách 3 :  
		 *     				 int[] a = new int[4];
		 *     				 a[0]=33;a[1]=3;a[2]=4;a[3]=5;
		 * 
		 * */
		
		int[] a = {10,20,30,40,50};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap size cua mang");
		size = scan.nextInt();
		
		int[] array = new int[size];
		for(int i=0; i< size; i++) {
			System.out.println("Nhap vao phan tu thu " + i);
			array[i] = scan.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			System.out.println("Phan tu thu " + i + ":" + array[i]);
		}

	}

}
