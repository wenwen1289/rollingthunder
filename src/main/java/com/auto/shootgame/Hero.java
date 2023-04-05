package com.auto.shootgame;

import java.awt.image.BufferedImage;
import java.nio.Buffer;

/**
 * 英雄机类也属于飞行物类
 * 
 * @author Administrator
 *
 */
public class Hero extends FlyingObject {
	// 默认生命值
	int life;
	// 双倍火力
	int doubleFire;
	//生命值得表示
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
		life = 3;//默认三条命
		doubleFire = 1;// 默认火力值为单倍火力
		grade=1;//默认一级
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

	// 英雄机移动的方法
	public void step(int x, int y) {
		this.x = x - this.width / 2;
		this.y = y - this.height / 2;
	}
	/*
	 * 英雄机发射激光
	 */
	public Light shootLight(){
		int xstep = this.width / 4;// 1/4英雄机宽度
		Light bs = new Light(2 * xstep + this.x, this.y - 20);// 保存中间发射的一枚子弹
		return bs;
	}
	/*
	 * 英雄机发射子弹
	 */
	public Bullet[] shoot() {
		int xstep = this.width / 4;// 1/4英雄机宽度
		Bullet[] bs = null;
		if(grade==1) {// 单倍火力
			 bs = new Bullet[1];
			bs[0] = new Bullet(2 * xstep + this.x, this.y - 20);// 保存中间发射的一枚子弹
			
		}
		if (grade == 2) {// 双倍火力
			 bs = new Bullet[2];
			bs[0] = new Bullet(1 * xstep + this.x, this.y - 8);// 保存左边发射的一枚子弹
			bs[1] = new Bullet(3 * xstep + this.x, this.y - 8);// 保存右边发射的一枚子弹
			doubleFire -= 2;// 每发射一次双倍火力值-2
		
		} 
		
		if(grade==3){
			bs = new Bullet[3];
			bs[0] = new Bullet(1 * xstep + this.x, this.y - 8);// 保存左边发射的一枚子弹
			
			bs[1] = new Bullet(3 * xstep + this.x, this.y - 8);// 保存右边发射的一枚子弹
			bs[2] = new Bullet(2 * xstep + this.x, this.y - 20);// 保存中间发射的一枚子
			
		}
	  return bs;
	}
    /*
     * 获取生命值
     */
	public int getLife(){
		return life;
	}
	/*
	 * 增命
	 */
	public void addLife(){
		life++;
	}
	/*
	 * 减命
	 */
	
	public void deleteLife(){
		life--;
	}
	/*
	 * 增加火力
	 */
	public void addFire(){
		doubleFire+=40;
	}
	/*
	 * 加护盾或者减护盾
	 */
	public void shield(){
		shield=!shield;
	}
	/*
	 *火力值清0 
	 */
	public void cleanFire(){
		doubleFire=0;
	}
	/*
	 * 英雄机撞击敌机： this表示 英雄机   other表示敌机
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
    * 英雄机永不越界
    */
	@Override
	public boolean outOfBounds() {
		// TODO Auto-generated method stub
		return false;
	}
}
