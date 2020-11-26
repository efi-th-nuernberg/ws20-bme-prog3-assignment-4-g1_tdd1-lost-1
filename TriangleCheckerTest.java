import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
  // Normales Dreieck Test 1
  @Test
  public void test1ValidTriangle() {

    // Arrange
    float a = 2;
    float b = 3;
    float c = 4;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.NORMAL, type);
  }

   // Normales Dreieck Test 2
  @Test
  public void test2ValidTriangle() {

    // Arrange
    float a = 100;
    float b = 70;
    float c = 40;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.NORMAL, type);
  }

   // Normales Dreieck Test 3
  @Test
  public void test3ValidTriangle() {

    // Arrange
    float a = 3;
    float b = 4;
    float c = 5;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.NORMAL, type);
  }



  // Gleichschenkliges Dreieck Test 1
  @Test
  public void test1IsoscelesTriangle() {

    // Arrange
    float a = 3;
    float b = 3;
    float c = 4;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
  }

  // Gleichschenkliges Dreieck Test 2
  @Test
  public void test2IsoscelesTriangle() {

    // Arrange
    float a = 3;
    float b = 4;
    float c = 3;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
  }

  // Gleichschenkliges Dreieck Test 3
  @Test
  public void test3IsoscelesTriangle() {

    // Arrange
    float a = 4;
    float b = 3;
    float c = 3;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
  }


  // Gleichseitiges Dreieck Test 1
  @Test
  public void testEquilateralTriangle() {

    // Arrange
    float a = 2;
    float b = 2;
    float c = 2;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type);
  } 

  // Gleichseitiges Dreieck Test 2
  @Test
  public void test2EquilateralTriangle() {

    // Arrange
    float a = 10;
    float b = 10;
    float c = 10;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type);
  } 

  // Gleichseitiges Dreieck Test 3
  @Test
  public void test3EquilateralTriangle() {

    // Arrange
    float a = 100;
    float b = 100;
    float c = 100;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type);
  } 

  // Kein Dreieck wegen negativer Seitenlänge (z.B. -1)
  @Test
  public void test1NoneTriangle() {

    // Arrange
    float a = -1;
    float b = 2;
    float c = 2;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.NONE, type);
  }

  // Kein Dreieck wegen zu kleiner Seitenlänge
  @Test
  public void test2NoneTriangle() {

    // Arrange
    float a = 1;
    float b = 1;
    float c = 3;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.NONE, type);
  }

  // Kein Dreieck da alle Seiten = 0 sind
 @Test
  public void test3NoneTriangle() {

    // Arrange
    float a = 0;
    float b = 0;
    float c = 0;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.NONE, type);
  }
}