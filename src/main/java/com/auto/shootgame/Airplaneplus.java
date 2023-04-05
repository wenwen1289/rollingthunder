package com.auto.shootgame;
/**
 * �л������ڷ����������
 */
public class Airplaneplus extends FlyingObject implements Enemy,Award{
   //�ƶ����ٶ�
	int speedx;
	int speedy;
	int type;
	int life;
	 public Airplaneplus() {
		image=ShootGame.airplaneplus;
		height=image.getHeight();
		width=image.getWidth();
		//��x��������ɵл�
		x=(int)(Math.random()*(ShootGame.WIDTH-this.width));
		y=-height;
		//��ʼ���ٶ�
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
	 * �л�plus�����ӵ�
	 */
	public Bulletplane[] shoot() {
		int xstep = this.width / 4;// 1/4Ӣ�ۻ����
		Bulletplane[] bs  = new Bulletplane[1];
			bs[0] = new Bulletplane(2 * xstep + this.x, this.y +40);// �����м䷢���һö�ӵ�	
	  return bs;
	}
	@Override
	public int Type() {
		// TODO Auto-generated method stub
		return type;
	}
}
