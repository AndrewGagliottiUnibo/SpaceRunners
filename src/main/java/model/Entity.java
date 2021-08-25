package model;

import Utilities.Direction;
import Utilities.Vector2D;
import javafx.scene.Node;
import javafx.scene.image.Image;

public interface Entity {
  Node getNode();

  void setImage(Image image);

  Vector2D<Number> getPosition();

  void setPosition(Number x, Number y);

  Vector2D<Number> getDimension();

  void setDimension(Vector2D<Number> dimension);

  Direction getDirection();

  void setDirection(Direction direction);

  Number getSpeed();

  void setSpeed(Number speed);

  void setHorrizontalSpeed(Number speed);

  Number getHorrizontalSpeed();

  void invertDirection();
}
