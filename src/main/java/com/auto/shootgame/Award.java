package com.auto.shootgame;
/**
 * 奖励接口
 * @author Administrator
 *
 */
public interface Award {
	//奖励类型  0代表护盾 1代表生命
	public static final int SHIELED=0;
	public static final int LIFE=1;
	//获取奖励类型
	int Type();
}
