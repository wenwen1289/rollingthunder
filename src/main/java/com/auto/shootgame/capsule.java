package com.auto.shootgame;

/**
 * 胶囊类吃胶囊随机加命或者护盾
 *
 * @author Administrator
 */
public class capsule extends FlyingObject implements Award {
    // xy轴上各有一个速度
    int xspeed;
    int yspeed;
    int type;

    public capsule() {
        image = ShootGame.capsule;
        width = image.getWidth();
        height = image.getHeight();
        x = (int) (Math.random() * (ShootGame.WIDTH - this.width));
        y = -height;
        xspeed = -3;
        yspeed = 3;

        type = 1;
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        // 判断蜜蜂飞行边界问题，如果飞到边界，反弹回窗口中（x轴速度相反）
        y += yspeed;
        if (x < 0 || x > ShootGame.WIDTH - this.width) {
            xspeed = -xspeed;
        }
        x += xspeed;
    }


    //小蜜蜂越界
    @Override
    public boolean outOfBounds() {
        // TODO Auto-generated method stub
        return y >= ShootGame.HEIGHT;
    }

    @Override
    public int Type() {
        // TODO Auto-generated method stub
        return type;
    }


}
