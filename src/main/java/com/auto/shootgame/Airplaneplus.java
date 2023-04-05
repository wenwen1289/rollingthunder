package com.auto.shootgame;
/**
 * 敌机类属于飞行类的子类
 */
public class Airplaneplus extends FlyingObject implements Enemy,Award{
   //移动的速度
	int speedx;
	int speedy;
	int type;
	int life;
	 public Airplaneplus() {
		image=ShootGame.airplaneplus;
		height=image.getHeight();
		width=image.getWidth();
		//在x轴随机生成敌机
		x=(int)(Math.random()*(ShootGame.WIDTH-this.width));
		y=-height;
		//初始化速度
		speedx=3;
		speedy=3;
		type=0;
		life=5;
	}
	@Override
	public void move() {
		y+=speedy;
		if (x < 0 || x > ShootGame.WIDTH - this.width) {
			speedx = -speedx;
		}
		x+=speedx;
	}
	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return 5;
	}
	@Override
	public boolean outOfBounds() {
		return y>=ShootGame.HEIGHT;
	}
	/*
	 * 敌机plus发射子弹
	 */
	public Bulletplane[] shoot() {
		int xstep = this.width / 4;// 1/4英雄机宽度
		Bulletplane[] bs  = new Bulletplane[1];
			bs[0] = new Bulletplane(2 * xstep + this.x, this.y +40);// 保存中间发射的一枚子弹	
	  return bs;
	}
	@Override
	public int Type() {
		// TODO Auto-generated method stub
		return type;
	}
}
