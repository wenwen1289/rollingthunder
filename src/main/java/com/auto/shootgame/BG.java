package com.auto.shootgame;

import java.awt.image.BufferedImage;

public class BG extends FlyingObject{
int speed;
public BufferedImage image;
public BufferedImage [] images;
public BufferedImage [] images2;
public static int temp;
public BG(){
	

	image=ShootGame.bg1;
	width=image.getWidth();
	height=image.getHeight();
	x=0;
	y=0;
	y=temp;
	images2=new BufferedImage []{ShootGame.bg1,ShootGame.bg2,ShootGame.bg3};
//	images=new BufferedImage[]{ShootGame.background1,ShootGame.background2,ShootGame.background3,
//			ShootGame.background4,ShootGame.background5,ShootGame.background6,ShootGame.background7
//			,ShootGame.background8,ShootGame.background9,ShootGame.background10,ShootGame.background11
//			,ShootGame.background12,ShootGame.background13,ShootGame.background14,ShootGame.background15
//			,ShootGame.background16,ShootGame.background17,ShootGame.background18,ShootGame.background19
//			,ShootGame.background20};
}
//int index = 0;
//int indexStep = 0;

boolean flag=false;

public void move() {
image=images2[1];
		
	

//	if (index++ % 2== 0) {
//		 if(!flag){
//			 if(indexStep==-1){
//				 indexStep=0;
//			 }
//			image = images[indexStep++];
//			if(indexStep==images.length){
//				flag=true;
//			}
//		}else{
//			if(indexStep==20){
//				indexStep=19;
//			}
//			image=images[indexStep--];
//			if(indexStep<0){
//				flag=false;
//			}
//		}
//	}
}
public void move2(){
	image=images2[2];
}
@Override
public boolean outOfBounds() {
	// TODO Auto-generated method stub
	return false;
}
}
