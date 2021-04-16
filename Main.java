package Matrix;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int numrow;
		int numcol;
		int length;
		Scanner sc = new Scanner(System.in);
		
		//Matrix
		System.out.println("Matrix A: ");
		System.out.print("Number of rows: ");
		numrow = sc.nextInt();
		System.out.print("Number of columns: ");
		numcol = sc.nextInt();
		Matrix A = new Matrix(numrow, numcol);
		A.setCell();
		
		
		System.out.println("Matrix B: ");
		System.out.print("Number of rows: ");
		numrow = sc.nextInt();
		System.out.print("Number of columns: ");
		numcol = sc.nextInt();
		Matrix B = new Matrix(numrow, numcol);
		B.setCell();
		
		
		try {
			Matrix addMatrix;
			addMatrix = A.add(B);
			System.out.println("Addtion: ");
			addMatrix.printMatrix();
			System.out.println();
		} catch (Exception e) {
			System.err.println("Addition won't work:\n"
					+ "Number of rows and column of 2 matrices must be the same simultaneously!");
		}
		
		try {
			Matrix subMatrix;
			subMatrix = A.substract(B);
			System.out.println("Substraction: ");
			subMatrix.printMatrix();
			System.out.println();
		} catch (Exception e) {
			System.err.println("Substraction won't work:\n"
					+ "Number of rows and column of 2 matrices must be the same simultaneously!");
		}
		
		try {
			Matrix multiplyMatrix;
			multiplyMatrix = A.multiply(B);
			System.out.println("Multiplication: ");
			multiplyMatrix.printMatrix();
			System.out.println();
		} catch (Exception e) {
			System.err.println(e.toString());
			System.err.println("Multiplication won't work:\n"
					+ "Number of columns of the first must be equal to number of rows of the second!");
		}
		//-----------------------------------------------------------------------------------------------
		
		
		//Vector
		System.out.println("Vector C: ");
		System.out.print("Length: ");
		length = sc.nextInt();
		Vector C = new Vector(length);
		C.setCell();
		
		
		System.out.println("Vector D: ");
		System.out.print("Length: ");
		length = sc.nextInt();
		Vector D = new Vector(length);
		D.setCell();
		
		
		try {
			Vector addVector;
			addVector = C.add(D);
			System.out.println("Addtion: ");
			addVector.printVector();
			System.out.println();
		} catch (Exception e) {
			System.err.println("Addition won't work:\n"
					+ "Length of 2 matrices must be the same simultaneously!");
		}
		
		try {
			Vector subVector;
			subVector = C.substract(D);
			System.out.println("Substraction: ");
			subVector.printVector();
			System.out.println();
		} catch (Exception e) {
			System.err.println("Substraction won't work:\n"
					+ "Length of 2 matrices must be the same simultaneously!");
		}
		
		try {
			Vector multiplyVector;
			multiplyVector = C.multiply(D);
			System.out.println("Multiplication: ");
			multiplyVector.printVector();
			System.out.println();
		} catch (Exception e) {
			System.err.println(e.toString());
			System.err.println("Multiplication won't work:\n"
					+ "Length of 2 matrices must be the same simultaneously!");
		}
		//-----------------------------------------------------------------------------------------------
		
		sc.close();
	}
}







