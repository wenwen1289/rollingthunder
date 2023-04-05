package com.auto.shootgame;

import java.awt.image.BufferedImage;



public abstract class FlyingObject {
    //有什么
	 public BufferedImage image;
	 public int width;
	 public int height;
	 public int x;
	 public int y;
	//会什么
	 public abstract void move();
	/*检查子弹是否和敌人撞上*/
	 public boolean shootBy(Bullet bullet){
		//什么情况下能撞上
		 int x1=this.x-bullet.width;//敌人的x轴坐标
		 int x2=this.x+this.width;//敌人的宽加上敌人的坐标
		 int y1=this.y;//敌人的y轴坐标
		 int y2=this.y+this.height;//敌人的高+敌人的坐标
		 int x=bullet.x;//子弹的x轴坐标
		 int y=bullet.y;//子弹的y轴坐标
		 return x>=x1&&x<=x2&&y>=y1&&y<=y2;
	 }
	 //飞行物越界的方法
	 public abstract boolean outOfBounds();
	public int getType() {
		// TODO Auto-generated method stub
		return 0;
	}
}

