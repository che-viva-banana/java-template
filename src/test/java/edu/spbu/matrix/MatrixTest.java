package edu.spbu.matrix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.io.*;



public class MatrixTest
{




  /**
   * ожидается 4 таких теста
   */
  @Test
  public void mulDD() throws IOException {
    Matrix m1 = new DenseMatrix("densematrix1.txt");
    Matrix m2 = new DenseMatrix("densematrix2.txt");
    Matrix expected = new DenseMatrix("resultddmul.txt");
    assertEquals(expected, m1.mul(m2));
  }

  @Test
  public void AddD() throws IOException {
    Matrix m1 = new DenseMatrix("densematrix1.txt");
    Matrix m2 = new DenseMatrix("densematrix2.txt");
    Matrix expected = new DenseMatrix("resultadd_d.txt");
    assertEquals(expected, m1.AddMatrix(m2));
  }
  /*
  @Test
  public void mulDS() {
    Matrix m1 = new DenseMatrix("m1.txt");
    Matrix m2 = new SparseMatrix("m2.txt");
    Matrix expected = new ???????Matrix("result.txt");
    assertEquals(expected, m1.mul(m2));
  }

  @Test
  public void mulSD() {
    Matrix m1 = new SparseMatrix("m1.txt");
    Matrix m2 = new DenseMatrix("m2.txt");
    Matrix expected = new ?????Matrix("result.txt");
    assertEquals(expected, m1.mul(m2));
  }

  @Test
  public void mulSS() {
    Matrix m1 = new SparseMatrix("m1.txt");
    Matrix m2 = new SparseMatrix("m2.txt");
    Matrix expected = new SparseMatrix("result.txt");
    assertEquals(expected, m1.mul(m2));
  }
  */



  /*


  public void GetCellD(){
    Matrix m1 = new DenseMatrix("");
    int x, y;

    double Cell;
    Scanner input = new Scanner(new File(fileName));
    Cell = input.nextInt();


    input.close();
    assertEquals(Cell, m1.GetCell(x,y) );
  }

*/
}
