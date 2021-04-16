package Matrix;

import java.util.Scanner;

public class Vector implements Calc<Vector>{
	private int length;
	private double[] cell;
	private Scanner sc = new Scanner(System.in);
	
	//constructor that confirm the declaration of vector size
	public Vector(int length) {
		super();
		this.length = length;
		cell = new double[length];
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public void setCell() {
		for (int i = 0; i < length; ++i) {
			System.out.print("cell[" + (i+1) +"] = ");
			cell[i] = sc.nextDouble();
		}
	}
	public void printVector() {
		for (double i: cell) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	
	//Method rooted from interface
		public Vector add(Vector b) throws Exception {
			Vector c = new Vector(length);
			if (length != b.getLength())
				throw new Exception("Exception message");
			
			for (int i = 0; i < length; ++i)
				c.cell[i] = cell[i] + b.cell[i];
			return c;
		}
		
		public Vector substract(Vector b) throws Exception {
			Vector c = new Vector(length);
			if (length != b.getLength())
				throw new Exception("Exception message");
			
			for (int i = 0; i < length; ++i)
				c.cell[i] = cell[i] - b.cell[i];
			return c;
		}
		
		public Vector multiply(Vector b) throws Exception{
			if (length != b.getLength())
				throw new Exception("Exception message");
			
			Vector c = new Vector(1);
			c.cell[0] = 0;
			for (int i = 0; i < length; ++i) {
				c.cell[0] += cell[i] * b.cell[i];
			}
			return c;
		}
	
}












