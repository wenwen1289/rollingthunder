package com.auto.shootgame;

import java.util.Random;

/**
 * �±��࣬���±��ӵȼ�
 * @author Administrator
 *
 */

public class moon extends FlyingObject implements Grade{
	// xy���ϸ���һ���ٶ�
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
			// �ж��۷���б߽����⣬����ɵ��߽磬�����ش����У�x���ٶ��෴��
			y += yspeed;
			if (x < 0 || x > ShootGame.WIDTH - this.width) {
				xspeed = -xspeed;
			}
			x+=xspeed;
		}

		
	   //С�۷�Խ��
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
