package edu.spbu.matrix;

import java.io.IOException;

/**
 * Разряженная матрица
 */
public class SparseMatrix implements Matrix
{
  @Override
  public Matrix AddMatrix (Matrix o) throws IOException {
  return null;
  }

  @Override
  public int GetRows (){
  return 0;
  }

  @Override
  public int GetColumns(){
  return 0;
  }

  @Override
  public double GetCell (int row, int col){
 return 0;
  }


@Override
  public void ToSize (int r, int c){

};

  /**
   * загружает матрицу из файла
   * @param fileName
   */


  public SparseMatrix(String fileName) {

  }
  /**
   * однопоточное умнджение матриц
   * должно поддерживаться для всех 4-х вариантов
   *
   * @param o
   * @return
   */
  @Override public Matrix mul(Matrix o)
  {
    return null;
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
    return false;
  }


}
