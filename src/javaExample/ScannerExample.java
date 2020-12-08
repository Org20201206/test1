package javaExample;

import java.util.Scanner;

public class ScannerExample {

	private static int triEdges[] = new int[3];
	private static String triEdgesStr[] = new String[3];
	
	public static void setEdges() {
		System.out.print("請輸入三個數字");
		for(int i = 0; i < 3; i++) {
			Scanner scan = new Scanner(System.in);
			triEdges[i] = scan.nextInt();
		}
	}
	
	public static void setEdgesStr() {
		System.out.print("請輸入三個數字");
		for(int i = 0; i < 3; i++) {
			Scanner scan = new Scanner(System.in);
			triEdgesStr[i] = scan.nextLine();
		}
	}
	
	public static void main(String[] args) {
//		setEdges();
//		for(int edges: triEdges) {
//			System.out.println(edges + " ");
//			System.out.println("-- The end -- ");
//		}
		
		setEdgesStr();
		for(String edgesStr: triEdgesStr) {
			System.out.println(edgesStr + " ");
			System.out.println("-- The end -- ");
		}
	}
	
}
