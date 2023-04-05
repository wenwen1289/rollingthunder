package com.auto.shootgame;

public class Bulletplane extends FlyingObject{
	  int speed;
	    public Bulletplane() {
	    	
		}
	    public Bulletplane(int x,int y){
	    	image=ShootGame.buttleplane;
	    	width=image.getWidth();
	    	height=image.getHeight();
	    	this.x=x;
	    	this.y=y;
	    	speed=5;
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

