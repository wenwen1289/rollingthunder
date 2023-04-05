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
	// 定义状态的变量
	private static final int START = 0;// 启动状态
	private static final int RUNNING = 1;// 启动状态
	private static final int PAUSE = 2;// 暂停状态
	private static final int GAME_OVER = 3;// 结束状态
	public int state = START;// 默认状态为启动状态
	// 窗口的宽度和高度
	public static final int HEIGHT = 660;
	public static final int WIDTH = 460;

	// 用static静态代码块加载这些图片
	static {
		// 当前类的路径下寻找相关图片j
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
			System.out.println("加载图片失败");
		}
	}

	// 定义一个FlyingObject数组保存所有的敌机和敌机plus
	FlyingObject[] flyings = {};

	// 定义一个子弹数组保存所有英雄机的子弹
	Bullet[] bullets = {};
	// 定义一个子弹数组保存所有超级敌机的子弹
	Bulletplane[] bulletplanes = {};
	// 定义一个道具数组存储胶囊和月饼
	FlyingObject[] tool = {};
	// new一个背景对象
	// 生成英雄机的对象
	Hero hero = new Hero();
	BG b1 = new BG();

	/*
	 * 画英雄机子弹的方法
	 */
	public void paintBullet(Graphics g) {
		for (int i = 0; i < bullets.length; i++) {
			// 获取每一个子弹
			Bullet bullet = bullets[i];
			g.drawImage(bullet.image, bullet.x, bullet.y, null);
		}
	}

	/*
	 * 画英超级机子弹的方法
	 */
	public void paintBulletplane(Graphics g) {
		for (int i = 0; i < bulletplanes.length; i++) {
			// 获取每一个超级敌机的子弹
			Bulletplane bullet = bulletplanes[i];
			g.drawImage(bullet.image, bullet.x, bullet.y, null);
		}
	}

	/*
	 * 画血条
	 */
	public void paintlife(Graphics g) {
		g.drawImage(lifeImage(), 60, 580, null);
	}

	/*
	 * 画分数和生命值
	 */
	public void paintOther(Graphics g) {
		// 更改字体和字体颜色
		g.setColor(new Color(0, 255, 255));// 纯红色
		g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));																									// 字号:24)
		g.drawString("英雄机等级：" + hero.grade, 10, 560);
		g.drawString("level：" + level, 160, 25);
		g.setColor(new Color(100, 100, 255));// 纯红色
		g.drawString("boss血量：" , 300, 25);
		g.setColor(new Color(255, 0, 0));// 纯红色
		g.drawString("生命：", 10, 600);
		g.setColor(new Color(255, 255, 0));// 纯红色
		g.drawString("分数：" + score,10, 25);
	}

	/*
	 * 画随机道具出现
	 */
	public void paintTool(Graphics g) {
		for (int i = 0; i < tool.length; i++) {
			// 获取每一个飞行物对象
			FlyingObject flying = tool[i];
			g.drawImage(flying.image, flying.x, flying.y, null);
		}
	}

	/*
	 * 画飞机
	 */
	public void paintPlane(Graphics g) {
		for (int i = 0; i < flyings.length; i++) {
			// 获取每一个飞行物对象
			FlyingObject fly = flyings[i];
			g.drawImage(fly.image, fly.x, fly.y, null);
		}
	}

	/*
	 * 画状态
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

	// 画出所有的
	public void paint(Graphics g) {
		super.paint(g);
		// 画背景
		g.drawImage(b1.image, b1.x, b1.y, null);
		// 画英雄机
		g.drawImage(hero.image, hero.x, hero.y, null);
		// 画子弹
		paintBullet(g);
		// 花超级敌机的子弹
		paintBulletplane(g);
		// 画随机道具
		paintTool(g);
		// 画飞机
		paintPlane(g);
		// 化生命
		paintlife(g);
		// 画 分数
		paintOther(g);
		// 画状态
		paintState(g);
	}

	// 画生命
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
	 * 英雄机发射子弹
	 */
	int shootIndex = 0;// 子弹的计数器
	// 英雄机发射自子弹

	public void shootAction() {
		shootIndex++;
		if (shootIndex % 20 == 0) {
			// 获取英雄机发射的子弹对象
			Bullet[] bs = hero.shoot();
			// 扩容 有多少个子弹对象就扩容多少个
			bullets = Arrays.copyOf(bullets, bullets.length + bs.length);
			// 把获取的子弹对象添加bullets数组里面
			System.arraycopy(bs, 0, bullets, bullets.length - bs.length, bs.length);// 追加数组

		}
	}

	/*
	 * 超级低级发射子弹
	 */
	int shootIndex2 = 0;// 子弹的计数器

	public void shootAction2() {
		shootIndex2++;
		if (shootIndex2 % 50 == 0) {
			// 获取超级敌机的子弹对象
			for (int i = 0; i < flyings.length; i++) {
				if (flyings[i] instanceof Airplaneplus) {
					Bulletplane[] bs = ((Airplaneplus) flyings[i]).shoot();
					// 扩容 有多少个子弹对象就扩容多少个
					bulletplanes = Arrays.copyOf(bulletplanes, bulletplanes.length + bs.length);
					// 把获取的子弹对象添加bullets数组里面
					System.arraycopy(bs, 0, bulletplanes, bulletplanes.length - bs.length, bs.length);// 追加数组
				}
			}
		}
	}

	/*
	 * 随机添加道具
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
	 * 检查是否结束
	 */
	public void CheckGameOver() {
		if (bang() || bang2() || bang3() || bang5()) {
			state = GAME_OVER;
		}
	}

	/*
	 * 随机生成敌机和敌机plus
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
	 * 一堆子弹和一堆道具撞
	 */
	

	public boolean bang() {

		int index = -1;// 记录被撞数组下标
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
		if (index != -1) {// 有被撞的飞行物
			// 先获取被撞的敌人对象
			FlyingObject f = tool[index];
			// 判断被撞的飞行物属于什么类型
			if (f instanceof Grade) {// 属于加分
				Grade enemy = (Grade) f;// 撞的是敌人
				hero.grade += enemy.gradeadd();
				if (hero.grade > 3) {
					hero.grade = 3;
				}
			}
			if (f instanceof Award) {
				Award award = (Award) f;// 奖励加命或者双倍火力
				int type = award.Type();// 获取奖励类型
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

			// 缩容 将记录下来的被撞对象删除掉

			tool[index] = tool[tool.length - 1];
			tool = Arrays.copyOf(tool, tool.length - 1);

			bullets[index2] = bullets[bullets.length - 1];
			bullets = Arrays.copyOf(bullets, bullets.length - 1);

		}
		return hero.life <= 0;
	}
	/*
	 * 一堆子弹和一堆敌机撞
	 */
	// 撞上有奖励分数

	public boolean bang2() {
		int index = -1;// 记录被撞数组下标
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
		if (index != -1) {// 有被撞的飞行物
			// 先获取被撞的敌人对象
			FlyingObject f = flyings[index];
			// 判断被撞的飞行物属于什么类型
			if (f instanceof Airplane) {// 属于加分
				score += ((Airplane) f).getScore();
				if (score > 100 & score < 200) {
					level = 2;
					nandu = EASY;
				} else if (score > 200) {
					level = 3;
					nandu = HARD;
				}
				// 缩容 将记录下来的被撞对象删除掉

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
	// 判断背景

	public void BG() {
		if (level == 2) {
			b1.move();
		}
		if (level == 3) {
			b1.move2();
		}

	}

	// 英雄机撞敌机
	public boolean bang3() {
		int index = -1;// 记录被撞数组下标
		for (int i = 0; i < flyings.length; i++) {
			FlyingObject other = flyings[i];
			if (hero.hit(other)) {// 撞上了
				index = i;// 记录被撞数组下标
				break;// 其它的就不需要比较了
			}
		}
		if (index != -1) {
			hero.deleteLife();// 英雄机减命
			hero.cleanFire();// 重置火力值
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

	// 英雄机和吃道具
	public void bang4() {
		int index = -1;// 记录被撞数组下标
		for (int i = 0; i < tool.length; i++) {
			FlyingObject other = tool[i];
			if (hero.hit(other)) {// 撞上了
				index = i;// 记录被撞数组下标
				break;// 其它的就不需要比较了
			}
		}
		if (index != -1) {
			tool[index] = tool[tool.length - 1];
			tool = Arrays.copyOf(tool, tool.length - 1);
		}

	}

	// 英雄机撞子弹
	public boolean bang5() {
		int index = -1;// 记录被撞数组下标
		for (int i = 0; i < bulletplanes.length; i++) {
			Bulletplane other = bulletplanes[i];
			if (hero.hit(other)) {// 撞上了
				index = i;// 记录被撞数组下标
				break;// 其它的就不需要比较了
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
	 * 让所有的飞行物动起来
	 */

	public void stepAction() {
		for (int i = 0; i < flyings.length; i++) {
			// 获取每一个飞行物
			FlyingObject fling = flyings[i];
			fling.move();
		}
		for (int i = 0; i < bullets.length; i++) {
			// 获取每一个飞行物
			Bullet bullet = bullets[i];
			bullet.move();
		}
		for (int i = 0; i < bulletplanes.length; i++) {
			// 获取每一个子弹
			Bulletplane bullet = bulletplanes[i];
			bullet.move();
		}
		for (int i = 0; i < tool.length; i++) {
			// 获取每一个飞行物
			FlyingObject fling = tool[i];
			fling.move();
		}

		// 让英雄机动起来
		hero.move();

	}

	/*
	 * 判断是否越界
	 */
	public void OutOfBoundsAction() {
		// 记录敌机是否越界
		int index = 0;// 记录不越界的飞行物下标，记录不越界的飞行物数量
		FlyingObject[] flyingLives = new FlyingObject[flyings.length];// 表示不越界的飞行数组
		// 遍历所有的敌人
		for (int i = 0; i < flyings.length; i++) {
			FlyingObject f = flyings[i];
			if (!f.outOfBounds()) {// 判断不越界对象
				flyingLives[index] = f; // 将不越界的对象添加到活着的数组里去
				index++;
			}
		}
		// 将活着的飞行物数组复制到飞行物数组里面
		flyings = Arrays.copyOf(flyingLives, index);
		// 记录英雄子弹是否越界
		index = 0;// 记录不越界的子弹下标，记录不越界的子弹数量
		Bullet[] bulletsLives = new Bullet[bullets.length];
		for (int i = 0; i < bullets.length; i++) {
			Bullet b = bullets[i];
			if (!b.outOfBounds()) {// 判断不越界对象
				bulletsLives[index] = b; // 将不越界的对象添加到活着的数组里去
				index++;
			}
		}
		// 将活着的飞行物数组复制到飞行物数组里面
		bullets = Arrays.copyOf(bulletsLives, index);
		// 记录超级兵的子弹是否越界
		index = 0;// 记录不越界的子弹下标，记录不越界的子弹数量
		Bulletplane[] bulletplantsLives = new Bulletplane[bulletplanes.length];
		for (int i = 0; i < bulletplanes.length; i++) {
			Bulletplane b = bulletplanes[i];
			if (!b.outOfBounds()) {// 判断不越界对象
				bulletplantsLives[index] = b; // 将不越界的对象添加到活着的数组里去
				index++;
			}
		}
		// 将活着的飞行物数组复制到飞行物数组里面
		bulletplanes = Arrays.copyOf(bulletplantsLives, index);
	}

	Timer time = new Timer();

	public void action() {
		// 添加鼠标监听器
		MouseAdapter l = new MouseAdapter() {
			// 英雄机随着鼠标移动
			public void mouseMoved(MouseEvent e) {
				if (state == RUNNING) {
					hero.step(e.getX(), e.getY());
				}
			}

			// 鼠标点击
			public void mouseClicked(MouseEvent e) {
				if (state == START) {
					state = RUNNING;
				}
				if (state == GAME_OVER) {
					state = START;
					// 清场，将所有配置恢复到初始值
					score = 0;
					hero.life = 3;
					level = 1;
		            nandu=EASY;
					flyings = new FlyingObject[0];
					bullets = new Bullet[0];
					bulletplanes = new Bulletplane[0];
					hero.grade = 1;// 火力值清0
				}
			}

			// 鼠标移出
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
			// 通过匿名内部类定时执行下面程序
			@Override
			public void run() {
				if (state == RUNNING) {
					BG();
					// 英雄机动
					stepAction();
					// 添加英雄机子弹
					shootAction();
					// 添加超级机的子弹
					shootAction2();
					// 添加敌机或超级敌机
					addNextAirplane();
					// 添加道具
					addNextTool();
					// 检查游戏是否结束
					CheckGameOver();
					// 子弹撞击道具
					// bang2();
					// // 飞机撞敌机
					// bang3();
					// 吃道具
					bang4();
					// // 超级机子弹撞英雄机
					// bang5();
					// 判断是否越界
					OutOfBoundsAction();
				}
				// 重置界面
				repaint();

			}
		}, 0, 30);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		ShootGame game = new ShootGame();
		frame.add(game);
		// 设置窗口大小
		frame.setSize(WIDTH, HEIGHT);
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
		game.action();
	}
}
