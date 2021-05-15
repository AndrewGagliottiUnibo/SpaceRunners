package model.bullet;

import Utilities.*;
import model.EntityImpl;

public class Bullet extends EntityImpl {

    private int damage;

    public Bullet() {
        
        //set default
        this.setImage(Parameters.bulletImage);
        this.setDirection(Direction.UP);
        this.getNode().setViewOrder(-50);

        this.getNode().setScaleX(1);
        this.getNode().setScaleY(1);


    }

    public Bullet bulletDamage(int damage)
    {
        this.damage = damage;

        return this;
    }

    int getBulletDamage() {
        return this.damage;

    }
}
