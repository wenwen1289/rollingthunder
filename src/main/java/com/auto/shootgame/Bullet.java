package com.auto.shootgame;
/**
 * Ó¢ÐÛ»ú·¢Éä×Óµ¯
 * @author Administrator
 *
 */
public class Bullet extends FlyingObject {
    int speed;
    public Bullet() {
    	
	}
    public Bullet(int x,int y){
    	image=ShootGame.herobullet;
    	width=image.getWidth();
    	height=image.getHeight();
    	this.x=x;
    	this.y=y;
    	speed=-5;
    }
	@Override
	public void move() {
		// TODO Auto-generated method stub
		y+=speed;
	}
	@Override
	public boolean outOfBounds() {
		return y<=-height;
	}

}

