package com.xiangwen;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class TestPain {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        myWindow myWindow = new myWindow();
        frame.add(myWindow);
        // 设置窗口大小
        frame.setSize(800, 800);
        // 设置窗口标题
        frame.setTitle("雷霆计划");
        // 设置窗口居中显示
        frame.setLocationRelativeTo(null);
        // 设置窗口显示
        frame.setVisible(true);
        // 设置窗口关闭按钮
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口置顶
        frame.setAlwaysOnTop(true);
        myWindow.action();
    }
}

class myWindow extends JPanel {
    int x = 20;
    int y = 20;
    static BufferedImage xin3;
    static BufferedImage bg;

    static {
        try {
            xin3 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("cc/ok.png"));
            bg = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("cc/bg1.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void action() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                y += 1;
                repaint();
            }
        }, 0, 30);
    }

    @Override
    public void paint(Graphics g) {
        //用来清除之前的
        super.paint(g);
        g.setColor(new Color(100, 100, 255));// 纯红色
        g.drawImage(bg, 0, 0, null);
        g.drawImage(xin3, x, y, null);
        g.drawString("好好学习", x, y);
    }
}
