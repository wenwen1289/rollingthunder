package com.auto.shootgame;
/**
 * 敌机类属于飞行类的子类
 */
public class Airplane extends FlyingObject implements Enemy{
   //移动的速度
	int speed;
	 public Airplane() {
		image=ShootGame.airplane;
		height=image.getHeight();
		width=image.getWidth();
		//在x轴随机生成敌机
		x=(int)(Math.random()*(ShootGame.WIDTH-this.width));
		y=-height;
		//初始化速度
		speed=3;
	}
	@Override
	public void move() {
		y+=speed;
	}
	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return 1;
	}
	@Override
	public boolean outOfBounds() {
		return y>=ShootGame.HEIGHT;
	}

}
