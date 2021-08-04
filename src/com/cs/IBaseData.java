package com.cs;

import java.awt.Font;

public interface IBaseData {
	Font topicFont=new Font("微软雅黑",Font.BOLD,50);
	Font scoreFont=new Font("微软雅黑",Font.BOLD,28);
	Font font1=new Font("宋体",Font.BOLD,46);
	Font font2=new Font("宋体",Font.BOLD,40);
	Font font3=new Font("宋体",Font.BOLD,34);
	Font font4=new Font("宋体",Font.BOLD,28);
	Font font5=new Font("宋体",Font.BOLD,22);
	int normalFontdata=20;
	int topicFontdata=36;
	void init();
	void showView();
	
}
