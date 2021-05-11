package GameController;

import GameField.GameField;
import GameObjects.*;
import Utilities.Direction;
import Utilities.Vector2DImpl;
import FrameManager.FrameManager;

public class GameContollerImpl implements GameController {

    private GameField gamefield;
    // private Set<Entity> enemies;

    private Entity player;
    private FrameManager frame;

    public GameContollerImpl(GameField gamefield) {

        this.gamefield = gamefield;
        this.frame = new FrameManager(this.gamefield);
        this.player = new EntityImpl();

        /* setup player info */
            this.player.setDimension(new Vector2DImpl<Number>(100, 100));
            this.player.setImage("src/Images/spaceship2.png");
            this.player.setSpeed(1);
            this.player.setDirection(Direction.RIGHT);
            this.player.setPosition(0, 10);

        this.gamefield.addEntity(this.player);

    }

    public void update() {

        // this.player.setDirection(Direction.LEFT);
        this.frame.update();

    }

}
