package Model;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Entity {

	public static int x;
	public static int y;
	public int speed;
	
	public BufferedImage up1,up2,down1,down2,left1,left2,right1,right2;
	public static String direction;
	
	public int spriteCounter = 0;
	public int spriteNum  = 1;
	
	public Rectangle solidArea;
	//public boolean collision = false;
	public int worldX;
	public int worldY;
	public static boolean collisionOn ;//= false;
	
	
}
