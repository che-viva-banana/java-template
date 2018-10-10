package edu.spbu.matrix;

import java.io.IOException;

/**
 *
 */

public interface Matrix
{
  /**
   * однопоточное умнджение матриц
   * должно поддерживаться для всех 4-х вариантов
   * @param o
   * @return
   */
  Matrix mul(Matrix o) throws IOException;

  /**
   * многопоточное умножение матриц
   * @param o
   * @return
   */
  Matrix dmul(Matrix o);

  boolean equals (Object o);
  Matrix AddMatrix (Matrix o) throws IOException;
  int GetRows ();
  int GetColumns();
  double GetCell (int row, int col);



  void ToSize (int r, int c);

}
