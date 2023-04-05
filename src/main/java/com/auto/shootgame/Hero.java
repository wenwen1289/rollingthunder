package com.auto.shootgame;

import java.awt.image.BufferedImage;
import java.nio.Buffer;

/**
 * Ӣ�ۻ���Ҳ���ڷ�������
 * 
 * @author Administrator
 *
 */
public class Hero extends FlyingObject {
	// Ĭ������ֵ
	int life;
	// ˫������
	int doubleFire;
	//����ֵ�ñ�ʾ
	int biao;
	int grade;

	boolean shield;
	BufferedImage[] images11;
	BufferedImage[] images12;
	BufferedImage[] images21;
	BufferedImage[] images22;
	BufferedImage[] images31;
	BufferedImage[] images32;

	
	public Hero() {
		image = ShootGame.hero11;
		images11 = new BufferedImage[] { ShootGame.hero11, ShootGame.hero12 };
		images12 = new BufferedImage[] { ShootGame.hero13, ShootGame.hero14 };
		images21 = new BufferedImage[] { ShootGame.hero21, ShootGame.hero22};
		images22 = new BufferedImage[] { ShootGame.hero23, ShootGame.hero24 };
		images31 = new BufferedImage[] { ShootGame.hero31, ShootGame.hero32 };
		images32 = new BufferedImage[] { ShootGame.hero33, ShootGame.hero34 };
		width = image.getWidth();
		height = image.getHeight();
		x = ShootGame.WIDTH / 2 - this.width / 2;
		y = ShootGame.HEIGHT - this.height * 2;
		life = 3;//Ĭ��������
		doubleFire = 1;// Ĭ�ϻ���ֵΪ��������
		grade=1;//Ĭ��һ��
		biao=20;
		shield=false;

	}

	int index = 0;
	int indexStep = 0;
	
	@Override
	public void move() {
		if (index++ % 8 == 0) {
			if(shield==true){
				if(grade==1){
					image = images12[indexStep++ % images12.length];
				}
				if(grade==2){
					image = images22[indexStep++ % images22.length];
				}
				if(grade==3){
					image = images32[indexStep++ % images32.length];
				}
			}else {
				if(grade==1){
					image = images11[indexStep++ % images11.length];
				}
				if(grade==2){
					image = images21[indexStep++ % images21.length];
				}
				if(grade==3){
					image = images31[indexStep++ % images31.length];
				}
			}
		}
	}

	// Ӣ�ۻ��ƶ��ķ���
	public void step(int x, int y) {
		this.x = x - this.width / 2;
		this.y = y - this.height / 2;
	}
	/*
	 * Ӣ�ۻ����伤��
	 */
	public Light shootLight(){
		int xstep = this.width / 4;// 1/4Ӣ�ۻ����
		Light bs = new Light(2 * xstep + this.x, this.y - 20);// �����м䷢���һö�ӵ�
		return bs;
	}
	/*
	 * Ӣ�ۻ������ӵ�
	 */
	public Bullet[] shoot() {
		int xstep = this.width / 4;// 1/4Ӣ�ۻ����
		Bullet[] bs = null;
		if(grade==1) {// ��������
			 bs = new Bullet[1];
			bs[0] = new Bullet(2 * xstep + this.x, this.y - 20);// �����м䷢���һö�ӵ�
			
		}
		if (grade == 2) {// ˫������
			 bs = new Bullet[2];
			bs[0] = new Bullet(1 * xstep + this.x, this.y - 8);// ������߷����һö�ӵ�
			bs[1] = new Bullet(3 * xstep + this.x, this.y - 8);// �����ұ߷����һö�ӵ�
			doubleFire -= 2;// ÿ����һ��˫������ֵ-2
		
		} 
		
		if(grade==3){
			bs = new Bullet[3];
			bs[0] = new Bullet(1 * xstep + this.x, this.y - 8);// ������߷����һö�ӵ�
			
			bs[1] = new Bullet(3 * xstep + this.x, this.y - 8);// �����ұ߷����һö�ӵ�
			bs[2] = new Bullet(2 * xstep + this.x, this.y - 20);// �����м䷢���һö��
			
		}
	  return bs;
	}
    /*
     * ��ȡ����ֵ
     */
	public int getLife(){
		return life;
	}
	/*
	 * ����
	 */
	public void addLife(){
		life++;
	}
	/*
	 * ����
	 */
	
	public void deleteLife(){
		life--;
	}
	/*
	 * ���ӻ���
	 */
	public void addFire(){
		doubleFire+=40;
	}
	/*
	 * �ӻ��ܻ��߼�����
	 */
	public void shield(){
		shield=!shield;
	}
	/*
	 *����ֵ��0 
	 */
	public void cleanFire(){
		doubleFire=0;
	}
	/*
	 * Ӣ�ۻ�ײ���л��� this��ʾ Ӣ�ۻ�   other��ʾ�л�
	 */
	public boolean hit(FlyingObject other){
		int x1=other.x-this.width/2;
		int x2=other.x+this.width/2+other.width;
		int y1=other.y-this.height/2;
		int y2=other.y+other.height+this.height/2;
		int x=this.x+this.width/2;
		int y=this.y+this.height/2;
		return x>=x1&&x<=x2&&y>=y1&&y<=y2;
	}
   /*
    * (non-Javadoc)
    * @see com.auto.shootgame.FlyingObject#outOfBounds()
    * Ӣ�ۻ�����Խ��
    */
	@Override
	public boolean outOfBounds() {
		// TODO Auto-generated method stub
		return false;
	}
}
