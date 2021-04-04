package app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import app.Rectangle;

import java.util.*;

public class RectangleTest{
  private Rectangle testRectangle1 = new Rectangle(1,2,4,4);
  private Rectangle testRectangle2 = new Rectangle(2,3,4,4);

  private Rectangle testRectangle3 = new Rectangle(5,6,4,4);
  private Rectangle testRectangle4 = new Rectangle(5,2,4,4);

  private Rectangle testRectangle5 = new Rectangle(2,3,1,1);

  /*
  Rectangle test1 = new Rectangle(1,2,4,4); //points (1,2), (5,2), (1,6), (5,6)

  Rectangle test2 = new Rectangle(2,3,4,4); //points (2,3), (6,3), (2,7), (6,7)
  Rectangle test3 = new Rectangle(5,6,4,4); // points (5,6), (9,6), (5,10), (9,10)

  Rectangle test4 = new Rectangle(5,2,4,4);

  Rectangle test5 = new Rectangle(2,3,1,1);

  System.out.println(test1.intersects(test2));
  System.out.println(test1.contains(test2));
  System.out.println(test1.shareAnEdge(test2));

  System.out.println(test1.shareAnEdge(test3));
  System.out.println(test1.shareAnEdge(test4));
  System.out.println(test1.contains(test5));

  System.out.println(test1.isSquare());
  */
  @Test
  public void testSquare(){
    assertEquals(true, testRectangle1.isSquare());
  }

  @Test
  public void testPoint(){
    assertEquals(true, new Rectangle(1,2,0,0).isPoint());
  }

  @Test
  public void testIntersectionTrue(){
    assertEquals(true, testRectangle1.intersects(testRectangle2));
  }

  @Test
  public void testIntersectionFalse(){
    assertEquals(false, testRectangle1.intersects(testRectangle3));
  }

  @Test
  public void testContainmentTrue(){
    assertEquals(true, testRectangle1.contains(testRectangle5));
  }

  @Test
  public void testContainmentFalse(){
    assertEquals(false, testRectangle1.contains(testRectangle2));
  }

  @Test
  public void testAdjacencyTrue(){
    assertEquals(true, testRectangle1.isAdjacent(testRectangle4));
  }

  @Test
  public void testAdjacencyFalse(){
    assertEquals(false, testRectangle1.isAdjacent(testRectangle2));
  }


}
