package Matrix;

import java.util.Scanner;

public class Matrix implements Calc<Matrix>{
	private int numcol;
	private int numrow;
	private double[][] cell;
	private Scanner sc = new Scanner(System.in);
	
	//constructor that confirm the declaration of matrix size
	public Matrix(int numrow, int numcol) {
		super();
		this.numcol = numcol;
		this.numrow = numrow;
		this.cell = new double[numrow][numcol];
	}
	
	//getter and setter
	public int getNumcol() {
		return numcol;
	}
	public void setNumcol(int numcol) {
		this.numcol = numcol;
	}
	public int getNumrow() {
		return numrow;
	}
	public void setNumrow(int numrow) {
		this.numrow = numrow;
	}
	
	public double getCell(int m, int n) {
		return cell[m][n];
	}
	public void setCell() {
		for (int i = 0; i < numrow; ++i)
			for (int j = 0; j < numcol; ++j) {
				System.out.print("cell[" + (i+1) + "]["+ (j+1) +"] = ");
				cell[i][j] = sc.nextDouble();
			}
	}
	
	public void printMatrix() {
		for (double[] row: cell) {
			for (double cell: row)
				System.out.print(cell + "\t");
			System.out.println();
		}
	}
	
	//Method rooted from interface
	public Matrix add(Matrix b) throws Exception {
		Matrix cMatrix = new Matrix(numrow, numcol);
		if (numrow != b.getNumrow() || numcol != b.getNumcol())
			throw new Exception("Exception message");
		
		for (int i = 0; i < numrow; ++i)
			for (int j = 0; j < numcol; ++j) {
				cMatrix.cell[i][j] = this.cell[i][j] + b.cell[i][j];
			}
		return cMatrix;
	}
	
	public Matrix substract(Matrix b) throws Exception {
		Matrix cMatrix = new Matrix(numrow, numcol);
		if (numrow != b.getNumrow() || numcol != b.getNumcol())
			throw new Exception("Exception message");
		
		for (int i = 0; i < numrow; ++i)
			for (int j = 0; j < numcol; ++j) {
				cMatrix.cell[i][j] = this.cell[i][j] - b.cell[i][j];
			}
		return cMatrix;
	}
	public Matrix multiply(Matrix b) throws Exception{
		if (numcol != b.getNumrow())
			throw new Exception("Exception message");
		
		Matrix cMatrix = new Matrix(numrow, b.getNumcol());
		for (int i = 0; i < numrow; ++i) {
			for (int j = 0; j < b.getNumcol(); ++j) {
				cMatrix.cell[i][j] = 0;
				for (int k = 0; k < numcol; ++k)
					cMatrix.cell[i][j] += cell[i][k] * b.cell[k][j];
			}
		}
		return cMatrix;
	}
}






















