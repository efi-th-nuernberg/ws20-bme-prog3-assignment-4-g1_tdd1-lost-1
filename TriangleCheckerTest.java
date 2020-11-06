import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
  // Normales Dreieck
  @Test
  public void testValidTriangle() {

    // Arrange
    float a = 2;
    float b = 3;
    float c = 4;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.NORMAL, type);
  }

  // Gleichschenkliges Dreieck
  @Test
  public void testIsoscelesTriangle() {

    // Arrange
    float a = 3;
    float b = 3;
    float c = 4;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
  }

  // Gleichseitiges Dreieck
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

  // Kein Dreieck wegen -1
  @Test
  public void testNoneTriangle() {

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
  public void testNone2Triangle() {

    // Arrange
    float a = 1;
    float b = 1;
    float c = 3;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.NONE, type);
  }
}
