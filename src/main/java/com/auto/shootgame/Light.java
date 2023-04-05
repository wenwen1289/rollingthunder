package com.auto.shootgame;

public class Light extends FlyingObject {
	
	public Light() {

	}

	public Light(int x,int y){
		this.x=x;
		this.y=y;
		image=ShootGame.jiguang1;
		width=image.getWidth();
		height=image.getHeight();
	}
	public boolean pen(FlyingObject fly){
		if(this.x==fly.x){
			return true;
		}else {
			return false;
		}
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean outOfBounds() {
		// TODO Auto-generated method stub
		return false;
	}

}
