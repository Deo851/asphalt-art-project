import org.code.neighborhood.*;

public class TreePainter extends MuralPainter {

  public void paintTree(String trunkColor, String leavesColor) {
    getToStartTrunk();
    paintTrunk(trunkColor);

    resetPosition();

    getToStartLeaves();
    paintLeaves(leavesColor);

    turnAround();
    moveToCorner();
  }

  public void getToStartTrunk() {
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
  }

  public void paintTrunk(String color) {
    paintLine(color, 1);
    turnToWest();
    
    paintLine(color, 3);
    turnToEast();
    
    paintLine(color, 5);
    
  }

  public void getToStartLeaves() {
    move();
    move();
    move();
  }

  public void paintLeaves(String color) {
    paintLine(color, 3);
    turnToWest();
    paintLine(color, 5);
    turnToEast();
    paintLine(color, 7);
    turnToWest();
    paintLine(color, 7);
    turnToEast();
    move();
    paintLine(color, 7);
    turnToWest();
    move();
    paintLine(color, 2);
    move();
    paintLine(color, 2);
  }
}