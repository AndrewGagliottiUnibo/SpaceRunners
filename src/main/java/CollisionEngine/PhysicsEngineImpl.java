package CollisionEngine;

import GameField.GameField;
import GameObjects.Entity;
import javafx.util.Pair;

import java.util.Set;

public class PhysicsEngineImpl implements PhysicsEngine {

    private GameField gamefield;

    public PhysicsEngineImpl(GameField gamefield) {
        this.gamefield = gamefield;

        // funzioni che puoi usare
        /*
         * this.gamefield.getPlayer();
         * this.gamefield.getActiveEnemyShips();
         * this.gamefield.getBonusObjects();
         * 
         * this.gamefield.getWidth();
         * this.gamefield.getHeight()
         * 
         */

    }

    @Override
    public Set<Pair<Entity, Number>> damagedEnemies() {

        return null;
    }

    @Override
    public boolean isPlayeratMargin() {

        return false;
    }

    @Override
    public boolean isPlayerHitted() {
        // TODO Auto-generated method stub
        return false;
    }

}
