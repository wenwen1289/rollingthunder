package com.auto.shootgame;

/**
 * ������Խ�������������߻���
 *
 * @author Administrator
 */
public class capsule extends FlyingObject implements Award {
    // xy���ϸ���һ���ٶ�
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
        // �ж��۷���б߽����⣬����ɵ��߽磬�����ش����У�x���ٶ��෴��
        y += yspeed;
        if (x < 0 || x > ShootGame.WIDTH - this.width) {
            xspeed = -xspeed;
        }
        x += xspeed;
    }


    //С�۷�Խ��
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
