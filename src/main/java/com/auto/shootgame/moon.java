package com.auto.shootgame;

import java.util.Random;

/**
 * 月饼类，吃月饼加等级
 * @author Administrator
 *
 */

public class moon extends FlyingObject implements Grade{
	// xy轴上各有一个速度
		int xspeed;
		int yspeed;
	   
		public moon() {
			image = ShootGame.yuebing;
			width = image.getWidth();
			height = image.getHeight();
			x = (int) (Math.random() * (ShootGame.WIDTH - this.width));
			y = -height;
			xspeed = 3;
			yspeed = 3;
			Random r=new Random();
			
		}

		@Override
		public void move() {
			// TODO Auto-generated method stub
			// 判断蜜蜂飞行边界问题，如果飞到边界，反弹回窗口中（x轴速度相反）
			y += yspeed;
			if (x < 0 || x > ShootGame.WIDTH - this.width) {
				xspeed = -xspeed;
			}
			x+=xspeed;
		}

		
	   //小蜜蜂越界
		@Override
		public boolean outOfBounds() {
			// TODO Auto-generated method stub
			return y>=ShootGame.HEIGHT;
		}

		@Override
		public int gradeadd() {
			// TODO Auto-generated method stub
			return 1;
		}
	}
