package com.auto.shootgame;
/**
 * �л������ڷ����������
 */
public class Airplane extends FlyingObject implements Enemy{
   //�ƶ����ٶ�
	int speed;
	 public Airplane() {
		image=ShootGame.airplane;
		height=image.getHeight();
		width=image.getWidth();
		//��x��������ɵл�
		x=(int)(Math.random()*(ShootGame.WIDTH-this.width));
		y=-height;
		//��ʼ���ٶ�
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
