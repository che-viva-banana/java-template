package edu.spbu.matrix;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * Плотная матрица
 */


public class DenseMatrix implements Matrix {

  public final int ARRAY_SIZE=1000;
  public double[][] DMatrix;
  public int rows;
  public int columns;

  @Override
  public int GetRows(){

    return rows;
  }

  @Override
  public int GetColumns(){

    return columns;
  }

 @Override
  public double GetCell(int row, int column){
    return DMatrix[row][column];
  }

  @Override
  public void ToSize (int r, int c){

    rows=r;
    columns=c;
    this.DMatrix=new double[rows][columns];

  }


  /**
   * загружает матрицу из файла
   * @param fileName
   */

      public DenseMatrix (String fileName) throws IOException{
        if(fileName.trim().length()==0)
          return;

        int i, j;
        ArrayList <Double> ReadMatrix = new ArrayList<>();
        String[] currentRowArray;
        Scanner matr = new Scanner(new File(fileName));
        String currentRow="1";

        while(matr.hasNextLine() && currentRow.trim().length()!=0) {

            ++rows;
            currentRow = matr.nextLine();
            currentRowArray = currentRow.split(" ");

            for (i=0; i<currentRowArray.length; i++)
            ReadMatrix.add(Double.parseDouble(currentRowArray[i]));

            if (rows == 1) {
                columns = currentRowArray.length;
            }

        }

          matr.close();
        rows=(int)(ReadMatrix.size()/columns);
        DMatrix= new double [rows][columns];

        int k=0;
        for (i=0; i<rows; i++)
          for (j=0; j<columns; j++) {
              DMatrix[i][j] = ReadMatrix.get(k);
              k++;
          }


          /*++rows;
          currentRow = matr.nextLine();

          currentRowArray = currentRow.split(" ");
          if (rows ==1)
          {
            columns=currentRowArray.length;
            DMatrix = new double [ARRAY_SIZE][columns];
          }

          for (i=0; i<columns; ++i)
          {
            DMatrix[rows-1][i]=Double.parseDouble(currentRowArray[i]);
          }*/
        }



      public DenseMatrix (int x, int y) {
        columns=x;
        rows=y;
        DMatrix=new double[x][y];
      }


  /**
   * однопоточное умнджение матриц
   * должно поддерживаться для всех 4-х вариантов
   *
   * @param o
   * @return
   */
  @Override public Matrix mul(Matrix o) throws IOException
  {
    int r=rows;
    int c=columns;
    int r1=o.GetRows();
    int c1=o.GetColumns();


    DenseMatrix MultiResult= new DenseMatrix(" ");
    MultiResult.ToSize(rows, o.GetColumns());

    for (int i=0; i<r; i++)
      for (int j=0; j<c1; j++)
        for (int k=0; k<c; k++)
        {
          MultiResult.DMatrix[i][j]+=DMatrix[i][k]*o.GetCell(k,j);
        }
    return MultiResult;
  }


  @Override public Matrix AddMatrix (Matrix o) throws IOException{
    int r=rows;
    int c1=o.GetColumns();

    DenseMatrix AddResult= new DenseMatrix(" ");
    AddResult.ToSize(rows,  o.GetColumns());
    for (int i=0; i<r; i++)
      for (int j=0; j<c1; j++)
      {
        AddResult.DMatrix[i][j]=DMatrix[i][j]+o.GetCell(i,j);
      }
      return AddResult;
  }

  /**
   * многопоточное умножение матриц
   *
   * @param o
   * @return
   */
  @Override public Matrix dmul(Matrix o)
  {
    return null;
  }

  /**
   * спавнивает с обоими вариантами
   * @param o
   * @return
   */
  @Override
  public boolean equals(Object o) {
    if (o instanceof Matrix) {
      Matrix M=(Matrix)o;
      int i, j;
      for (i = 0; i < rows; i++)
        for (j = 0; j < columns; j++)
          if (DMatrix[i][j] != M.GetCell(i, j))
            return false;
      return true;
    }
    return false;
  }

}
