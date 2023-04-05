package com.auto.shootgame;

import java.awt.image.BufferedImage;



public abstract class FlyingObject {
    //��ʲô
	 public BufferedImage image;
	 public int width;
	 public int height;
	 public int x;
	 public int y;
	//��ʲô
	 public abstract void move();
	/*����ӵ��Ƿ�͵���ײ��*/
	 public boolean shootBy(Bullet bullet){
		//ʲô�������ײ��
		 int x1=this.x-bullet.width;//���˵�x������
		 int x2=this.x+this.width;//���˵Ŀ���ϵ��˵�����
		 int y1=this.y;//���˵�y������
		 int y2=this.y+this.height;//���˵ĸ�+���˵�����
		 int x=bullet.x;//�ӵ���x������
		 int y=bullet.y;//�ӵ���y������
		 return x>=x1&&x<=x2&&y>=y1&&y<=y2;
	 }
	 //������Խ��ķ���
	 public abstract boolean outOfBounds();
	public int getType() {
		// TODO Auto-generated method stub
		return 0;
	}
}

