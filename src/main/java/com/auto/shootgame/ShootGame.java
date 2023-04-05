package com.auto.shootgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShootGame extends JPanel {
	public int score=0;
	Random random = new Random();
	public static int score2;
	public int x, y = 20;
	public static BufferedImage jiguang1;
	public static BufferedImage bg1;
	public static BufferedImage bg2;
	public static BufferedImage bg3;
	public static BufferedImage background1;
	public static BufferedImage background2;
	public static BufferedImage background3;
	public static BufferedImage background4;
	public static BufferedImage background5;
	public static BufferedImage background6;
	public static BufferedImage background7;
	public static BufferedImage background8;
	public static BufferedImage background9;
	public static BufferedImage background10;
	public static BufferedImage background11;
	public static BufferedImage background12;
	public static BufferedImage background13;
	public static BufferedImage background14;
	public static BufferedImage background15;
	public static BufferedImage background16;
	public static BufferedImage background17;
	public static BufferedImage background18;
	public static BufferedImage background19;
	public static BufferedImage background20;
	public static BufferedImage airplane;
	public static BufferedImage airplaneplus;
	public static BufferedImage hero11;
	public static BufferedImage hero12;
	public static BufferedImage hero13;
	public static BufferedImage hero14;
	public static BufferedImage hero21;
	public static BufferedImage hero22;
	public static BufferedImage hero23;
	public static BufferedImage hero24;
	public static BufferedImage hero31;
	public static BufferedImage hero32;
	public static BufferedImage hero33;
	public static BufferedImage hero34;
	public static BufferedImage start;
	public static BufferedImage gameover;
	public static BufferedImage pause;
	public static BufferedImage bullet;
	public static BufferedImage yuebing;
	public static BufferedImage herobullet;
	public static BufferedImage capsule;
	public static BufferedImage xin1;
	public static BufferedImage xin2;
	public static BufferedImage xin3;
	public static BufferedImage xin4;
	public static BufferedImage xin5;
	public static BufferedImage xin6;
	public static BufferedImage xin7;
	public static BufferedImage xin8;
	public static BufferedImage xin9;
	public static BufferedImage xin10;
	public static BufferedImage buttleplane;
	public static int level = 1;
	public static final int EASY = 40;
	public static final int HARD = 20;
	public static int nandu = EASY;
	// ����״̬�ı���
	private static final int START = 0;// ����״̬
	private static final int RUNNING = 1;// ����״̬
	private static final int PAUSE = 2;// ��ͣ״̬
	private static final int GAME_OVER = 3;// ����״̬
	public int state = START;// Ĭ��״̬Ϊ����״̬
	// ���ڵĿ�Ⱥ͸߶�
	public static final int HEIGHT = 660;
	public static final int WIDTH = 460;

	// ��static��̬����������ЩͼƬ
	static {
		// ��ǰ���·����Ѱ�����ͼƬj
		try {
			jiguang1=ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/jiguang1.png"));
			start = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/start.png"));
			pause = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/pause.png"));
			gameover = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/gameover.png"));
			buttleplane = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/bulletplane.png"));
			xin1 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/xin1.png"));
			xin2 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/xin2.png"));
			xin3 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/xin3.png"));
			xin4 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/xin4.png"));
			xin5 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/xin5.png"));
			xin6 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/xin6.png"));
			xin7 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/xin7.png"));
			xin8 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/xin8.png"));
			xin9 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/xin9.png"));
			xin10 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/xin10.png"));
			airplaneplus = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/dijiplus.png"));
			airplane = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/diji.png"));
			herobullet = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/herobullet.png"));
			capsule = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/capsule.png"));
			yuebing = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/yuebing.png"));
			hero11 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/hero11.png"));
			hero12 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/hero12.png"));
			hero13 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/hero13.png"));
			hero14 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/hero14.png"));
			hero21 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/hero21.png"));
			hero22 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/hero22.png"));
			hero23 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/hero23.png"));
			hero24 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/hero24.png"));
			hero31 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/hero31.png"));
			hero32 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/hero32.png"));
			hero33 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/hero33.png"));
			hero34 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/hero34.png"));
			bg1 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/bg1.png"));
			bg2 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/bg2.png"));
			bg3 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/bg3.png"));
			background1 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat1.jpg"));
			background2 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat2.jpg"));
			background3 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat3.jpg"));
			background4 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat4.jpg"));
			background5 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat5.jpg"));
			background6 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat6.jpg"));
			background7 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat7.jpg"));
			background8 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat8.jpg"));
			background9 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat9.jpg"));
			background10 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat10.jpg"));
			background11 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat11.jpg"));
			background12 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat12.jpg"));
			background13 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat13.jpg"));
			background14 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat14.jpg"));
			background15 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat15.jpg"));
			background16 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat16.jpg"));
			background17 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat17.jpg"));
			background18 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat18.jpg"));
			background19 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat19.jpg"));
			background20 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("images/stat20.jpg"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("����ͼƬʧ��");
		}
	}

	// ����һ��FlyingObject���鱣�����еĵл��͵л�plus
	FlyingObject[] flyings = {};

	// ����һ���ӵ����鱣������Ӣ�ۻ����ӵ�
	Bullet[] bullets = {};
	// ����һ���ӵ����鱣�����г����л����ӵ�
	Bulletplane[] bulletplanes = {};
	// ����һ����������洢���Һ��±�
	FlyingObject[] tool = {};
	// newһ����������
	// ����Ӣ�ۻ��Ķ���
	Hero hero = new Hero();
	BG b1 = new BG();

	/*
	 * ��Ӣ�ۻ��ӵ��ķ���
	 */
	public void paintBullet(Graphics g) {
		for (int i = 0; i < bullets.length; i++) {
			// ��ȡÿһ���ӵ�
			Bullet bullet = bullets[i];
			g.drawImage(bullet.image, bullet.x, bullet.y, null);
		}
	}

	/*
	 * ��Ӣ�������ӵ��ķ���
	 */
	public void paintBulletplane(Graphics g) {
		for (int i = 0; i < bulletplanes.length; i++) {
			// ��ȡÿһ�������л����ӵ�
			Bulletplane bullet = bulletplanes[i];
			g.drawImage(bullet.image, bullet.x, bullet.y, null);
		}
	}

	/*
	 * ��Ѫ��
	 */
	public void paintlife(Graphics g) {
		g.drawImage(lifeImage(), 60, 580, null);
	}

	/*
	 * ������������ֵ
	 */
	public void paintOther(Graphics g) {
		// ���������������ɫ
		g.setColor(new Color(0, 255, 255));// ����ɫ
		g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));																									// �ֺ�:24)
		g.drawString("Ӣ�ۻ��ȼ���" + hero.grade, 10, 560);
		g.drawString("level��" + level, 160, 25);
		g.setColor(new Color(100, 100, 255));// ����ɫ
		g.drawString("bossѪ����" , 300, 25);
		g.setColor(new Color(255, 0, 0));// ����ɫ
		g.drawString("������", 10, 600);
		g.setColor(new Color(255, 255, 0));// ����ɫ
		g.drawString("������" + score,10, 25);
	}

	/*
	 * ��������߳���
	 */
	public void paintTool(Graphics g) {
		for (int i = 0; i < tool.length; i++) {
			// ��ȡÿһ�����������
			FlyingObject flying = tool[i];
			g.drawImage(flying.image, flying.x, flying.y, null);
		}
	}

	/*
	 * ���ɻ�
	 */
	public void paintPlane(Graphics g) {
		for (int i = 0; i < flyings.length; i++) {
			// ��ȡÿһ�����������
			FlyingObject fly = flyings[i];
			g.drawImage(fly.image, fly.x, fly.y, null);
		}
	}

	/*
	 * ��״̬
	 */
	public void paintState(Graphics g) {
		switch (state) {
		case START:
			g.drawImage(start, 0, 0, null);
			break;
		case PAUSE:
			g.drawImage(pause, 0, 0, null);
			break;
		case GAME_OVER:
			g.drawImage(gameover, 0, 0, null);
			break;
		}
	}

	// �������е�
	public void paint(Graphics g) {
		super.paint(g);
		// ������
		g.drawImage(b1.image, b1.x, b1.y, null);
		// ��Ӣ�ۻ�
		g.drawImage(hero.image, hero.x, hero.y, null);
		// ���ӵ�
		paintBullet(g);
		// �������л����ӵ�
		paintBulletplane(g);
		// ���������
		paintTool(g);
		// ���ɻ�
		paintPlane(g);
		// ������
		paintlife(g);
		// �� ����
		paintOther(g);
		// ��״̬
		paintState(g);
	}

	// ������
	BufferedImage[] life = { xin1, xin2, xin3, xin4, xin5 ,xin6, xin7, xin8, xin9, xin10};

	public BufferedImage lifeImage() {
		int a = hero.life;
		if (a >= 1 && a <= 10) {
			return life[a - 1];
		} else if (a > 5) {
			return life[9];
		} else {
			return life[0];
		}
	}

	/*
	 * Ӣ�ۻ������ӵ�
	 */
	int shootIndex = 0;// �ӵ��ļ�����
	// Ӣ�ۻ��������ӵ�

	public void shootAction() {
		shootIndex++;
		if (shootIndex % 20 == 0) {
			// ��ȡӢ�ۻ�������ӵ�����
			Bullet[] bs = hero.shoot();
			// ���� �ж��ٸ��ӵ���������ݶ��ٸ�
			bullets = Arrays.copyOf(bullets, bullets.length + bs.length);
			// �ѻ�ȡ���ӵ��������bullets��������
			System.arraycopy(bs, 0, bullets, bullets.length - bs.length, bs.length);// ׷������

		}
	}

	/*
	 * �����ͼ������ӵ�
	 */
	int shootIndex2 = 0;// �ӵ��ļ�����

	public void shootAction2() {
		shootIndex2++;
		if (shootIndex2 % 50 == 0) {
			// ��ȡ�����л����ӵ�����
			for (int i = 0; i < flyings.length; i++) {
				if (flyings[i] instanceof Airplaneplus) {
					Bulletplane[] bs = ((Airplaneplus) flyings[i]).shoot();
					// ���� �ж��ٸ��ӵ���������ݶ��ٸ�
					bulletplanes = Arrays.copyOf(bulletplanes, bulletplanes.length + bs.length);
					// �ѻ�ȡ���ӵ��������bullets��������
					System.arraycopy(bs, 0, bulletplanes, bulletplanes.length - bs.length, bs.length);// ׷������
				}
			}
		}
	}

	/*
	 * �����ӵ���
	 */
	int index = 0;

	public void addNextTool() {
		if (index++ % 1000 == 0) {
			int a = (int) (Math.random() * 2);
			if (a == 0) {
				tool = Arrays.copyOf(tool, tool.length + 1);
				tool[tool.length - 1] = new moon();
			} else {
				tool = Arrays.copyOf(tool, tool.length + 1);
				tool[tool.length - 1] = new capsule();
			}
		}
	}

	/*
	 * ����Ƿ����
	 */
	public void CheckGameOver() {
		if (bang() || bang2() || bang3() || bang5()) {
			state = GAME_OVER;
		}
	}

	/*
	 * ������ɵл��͵л�plus
	 */
	int index1 = 0;

	public void addNextAirplane() {
		int a = random.nextInt(5);
		if (index1++ % nandu == 0) {
			if (a == 0) {
				flyings = Arrays.copyOf(flyings, flyings.length + 1);
				flyings[flyings.length - 1] = new Airplaneplus();
			} else {
				flyings = Arrays.copyOf(flyings, flyings.length + 1);
				flyings[flyings.length - 1] = new Airplane();
			}
		}
	}

	/*
	 * һ���ӵ���һ�ѵ���ײ
	 */
	

	public boolean bang() {

		int index = -1;// ��¼��ײ�����±�
		int index2 = -1;
		for (int i = 0; i < tool.length; i++) {
			for (int j = 0; j < bullets.length; j++) {
				if (tool[i].shootBy(bullets[j])) {
					index = i;
					index2 = j;
					break;
				}
			}
		}
		if (index != -1) {// �б�ײ�ķ�����
			// �Ȼ�ȡ��ײ�ĵ��˶���
			FlyingObject f = tool[index];
			// �жϱ�ײ�ķ���������ʲô����
			if (f instanceof Grade) {// ���ڼӷ�
				Grade enemy = (Grade) f;// ײ���ǵ���
				hero.grade += enemy.gradeadd();
				if (hero.grade > 3) {
					hero.grade = 3;
				}
			}
			if (f instanceof Award) {
				Award award = (Award) f;// ������������˫������
				int type = award.Type();// ��ȡ��������
				switch (type) {
				case Award.SHIELED:
					if (hero.shield == false) {
						hero.shield();
					}
					break;
				case Award.LIFE:
					hero.addLife();
					break;
				}
				//
			}

			// ���� ����¼�����ı�ײ����ɾ����

			tool[index] = tool[tool.length - 1];
			tool = Arrays.copyOf(tool, tool.length - 1);

			bullets[index2] = bullets[bullets.length - 1];
			bullets = Arrays.copyOf(bullets, bullets.length - 1);

		}
		return hero.life <= 0;
	}
	/*
	 * һ���ӵ���һ�ѵл�ײ
	 */
	// ײ���н�������

	public boolean bang2() {
		int index = -1;// ��¼��ײ�����±�
		int index2 = -1;
		for (int i = 0; i < flyings.length; i++) {
			for (int j = 0; j < bullets.length; j++) {
				if (flyings[i].shootBy(bullets[j])) {
					index = i;
					index2 = j;
					break;
				}
			}
		}
		if (index != -1) {// �б�ײ�ķ�����
			// �Ȼ�ȡ��ײ�ĵ��˶���
			FlyingObject f = flyings[index];
			// �жϱ�ײ�ķ���������ʲô����
			if (f instanceof Airplane) {// ���ڼӷ�
				score += ((Airplane) f).getScore();
				if (score > 100 & score < 200) {
					level = 2;
					nandu = EASY;
				} else if (score > 200) {
					level = 3;
					nandu = HARD;
				}
				// ���� ����¼�����ı�ײ����ɾ����

				flyings[index] = flyings[flyings.length - 1];
				flyings = Arrays.copyOf(flyings, flyings.length - 1);
			}
			if (f instanceof Airplaneplus) {
				score += ((Airplaneplus) f).getScore();
				Airplaneplus f1=(Airplaneplus)f;
				if (score > 100 & score < 200) {
					level = 2;
					nandu = HARD;
				} else if (score > 200) {
					level = 3;
					nandu = HARD;
				}
				if (hero.shield == false) {
					hero.shield();
				}
               if(f1.life>1){
            	   f1.life--;
               }else {
            	   flyings[index] = flyings[flyings.length - 1];
   				flyings = Arrays.copyOf(flyings, flyings.length - 1);
			}
			}

			

			bullets[index2] = bullets[bullets.length - 1];
			bullets = Arrays.copyOf(bullets, bullets.length - 1);

		}
		return hero.life <= 0;
	}
	// �жϱ���

	public void BG() {
		if (level == 2) {
			b1.move();
		}
		if (level == 3) {
			b1.move2();
		}

	}

	// Ӣ�ۻ�ײ�л�
	public boolean bang3() {
		int index = -1;// ��¼��ײ�����±�
		for (int i = 0; i < flyings.length; i++) {
			FlyingObject other = flyings[i];
			if (hero.hit(other)) {// ײ����
				index = i;// ��¼��ײ�����±�
				break;// �����ľͲ���Ҫ�Ƚ���
			}
		}
		if (index != -1) {
			hero.deleteLife();// Ӣ�ۻ�����
			hero.cleanFire();// ���û���ֵ
			if (hero.shield == true) {
				hero.shield();
			} else {
				hero.grade--;
				if (hero.grade == 0) {
					hero.grade = 1;
				}
				hero.life--;
			}

			FlyingObject fly = flyings[index];
			flyings[index] = flyings[flyings.length - 1];
			flyings[flyings.length - 1] = fly;
			flyings = Arrays.copyOf(flyings, flyings.length - 1);
		}
		return hero.life <= 0;
	}

	// Ӣ�ۻ��ͳԵ���
	public void bang4() {
		int index = -1;// ��¼��ײ�����±�
		for (int i = 0; i < tool.length; i++) {
			FlyingObject other = tool[i];
			if (hero.hit(other)) {// ײ����
				index = i;// ��¼��ײ�����±�
				break;// �����ľͲ���Ҫ�Ƚ���
			}
		}
		if (index != -1) {
			tool[index] = tool[tool.length - 1];
			tool = Arrays.copyOf(tool, tool.length - 1);
		}

	}

	// Ӣ�ۻ�ײ�ӵ�
	public boolean bang5() {
		int index = -1;// ��¼��ײ�����±�
		for (int i = 0; i < bulletplanes.length; i++) {
			Bulletplane other = bulletplanes[i];
			if (hero.hit(other)) {// ײ����
				index = i;// ��¼��ײ�����±�
				break;// �����ľͲ���Ҫ�Ƚ���
			}
		}
		if (index != -1) {
			if (hero.shield == true) {
				hero.shield();
			} else {
				hero.grade--;
				if (hero.grade == 0) {
					hero.grade = 1;
				}
				hero.life--;
			}

			bulletplanes[index] = bulletplanes[bulletplanes.length - 1];
			bulletplanes = Arrays.copyOf(bulletplanes, bulletplanes.length - 1);
		}
		return hero.life <= 0;
	}
	/*
	 * �����еķ����ﶯ����
	 */

	public void stepAction() {
		for (int i = 0; i < flyings.length; i++) {
			// ��ȡÿһ��������
			FlyingObject fling = flyings[i];
			fling.move();
		}
		for (int i = 0; i < bullets.length; i++) {
			// ��ȡÿһ��������
			Bullet bullet = bullets[i];
			bullet.move();
		}
		for (int i = 0; i < bulletplanes.length; i++) {
			// ��ȡÿһ���ӵ�
			Bulletplane bullet = bulletplanes[i];
			bullet.move();
		}
		for (int i = 0; i < tool.length; i++) {
			// ��ȡÿһ��������
			FlyingObject fling = tool[i];
			fling.move();
		}

		// ��Ӣ�ۻ�������
		hero.move();

	}

	/*
	 * �ж��Ƿ�Խ��
	 */
	public void OutOfBoundsAction() {
		// ��¼�л��Ƿ�Խ��
		int index = 0;// ��¼��Խ��ķ������±꣬��¼��Խ��ķ���������
		FlyingObject[] flyingLives = new FlyingObject[flyings.length];// ��ʾ��Խ��ķ�������
		// �������еĵ���
		for (int i = 0; i < flyings.length; i++) {
			FlyingObject f = flyings[i];
			if (!f.outOfBounds()) {// �жϲ�Խ�����
				flyingLives[index] = f; // ����Խ��Ķ�����ӵ����ŵ�������ȥ
				index++;
			}
		}
		// �����ŵķ��������鸴�Ƶ���������������
		flyings = Arrays.copyOf(flyingLives, index);
		// ��¼Ӣ���ӵ��Ƿ�Խ��
		index = 0;// ��¼��Խ����ӵ��±꣬��¼��Խ����ӵ�����
		Bullet[] bulletsLives = new Bullet[bullets.length];
		for (int i = 0; i < bullets.length; i++) {
			Bullet b = bullets[i];
			if (!b.outOfBounds()) {// �жϲ�Խ�����
				bulletsLives[index] = b; // ����Խ��Ķ�����ӵ����ŵ�������ȥ
				index++;
			}
		}
		// �����ŵķ��������鸴�Ƶ���������������
		bullets = Arrays.copyOf(bulletsLives, index);
		// ��¼���������ӵ��Ƿ�Խ��
		index = 0;// ��¼��Խ����ӵ��±꣬��¼��Խ����ӵ�����
		Bulletplane[] bulletplantsLives = new Bulletplane[bulletplanes.length];
		for (int i = 0; i < bulletplanes.length; i++) {
			Bulletplane b = bulletplanes[i];
			if (!b.outOfBounds()) {// �жϲ�Խ�����
				bulletplantsLives[index] = b; // ����Խ��Ķ�����ӵ����ŵ�������ȥ
				index++;
			}
		}
		// �����ŵķ��������鸴�Ƶ���������������
		bulletplanes = Arrays.copyOf(bulletplantsLives, index);
	}

	Timer time = new Timer();

	public void action() {
		// �����������
		MouseAdapter l = new MouseAdapter() {
			// Ӣ�ۻ���������ƶ�
			public void mouseMoved(MouseEvent e) {
				if (state == RUNNING) {
					hero.step(e.getX(), e.getY());
				}
			}

			// �����
			public void mouseClicked(MouseEvent e) {
				if (state == START) {
					state = RUNNING;
				}
				if (state == GAME_OVER) {
					state = START;
					// �峡�����������ûָ�����ʼֵ
					score = 0;
					hero.life = 3;
					level = 1;
		            nandu=EASY;
					flyings = new FlyingObject[0];
					bullets = new Bullet[0];
					bulletplanes = new Bulletplane[0];
					hero.grade = 1;// ����ֵ��0
				}
			}

			// ����Ƴ�
			public void mouseExited(MouseEvent e) {
				if (state == RUNNING) {
					state = PAUSE;
				}
			}

			public void mouseEntered(MouseEvent e) {
				if (state == PAUSE) {
					state = RUNNING;
				}
			}
		};
		this.addMouseListener(l);
		this.addMouseMotionListener(l);
		time.schedule(new TimerTask() {
			// ͨ�������ڲ��ඨʱִ���������
			@Override
			public void run() {
				if (state == RUNNING) {
					BG();
					// Ӣ�ۻ���
					stepAction();
					// ���Ӣ�ۻ��ӵ�
					shootAction();
					// ��ӳ��������ӵ�
					shootAction2();
					// ��ӵл��򳬼��л�
					addNextAirplane();
					// ��ӵ���
					addNextTool();
					// �����Ϸ�Ƿ����
					CheckGameOver();
					// �ӵ�ײ������
					// bang2();
					// // �ɻ�ײ�л�
					// bang3();
					// �Ե���
					bang4();
					// // �������ӵ�ײӢ�ۻ�
					// bang5();
					// �ж��Ƿ�Խ��
					OutOfBoundsAction();
				}
				// ���ý���
				repaint();

			}
		}, 0, 30);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		ShootGame game = new ShootGame();
		frame.add(game);
		// ���ô��ڴ�С
		frame.setSize(WIDTH, HEIGHT);
		// ���ô��ڱ���
		frame.setTitle("�����ƻ�");
		// ���ô��ھ�����ʾ
		frame.setLocationRelativeTo(null);
		// ���ô�����ʾ
		frame.setVisible(true);
		// ���ô��ڹرհ�ť
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô����ö�
		frame.setAlwaysOnTop(true);
		game.action();
	}
}
