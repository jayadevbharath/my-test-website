package screens;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import core.DrawingSurface;

/**
 * Represents the third screen of the application.
 * This screen extends the Screen class and is designed to display content on a DrawingSurface.
 */
public class GameScreen3 extends Screen {

	private DrawingSurface surface;
	private Rectangle button1;
	private Rectangle button2;
	private Rectangle button3;
	private Rectangle button5;
	private Rectangle button4;
	private boolean b1, b2, b3;
	protected boolean b4;
	private Rectangle button6;

	/**
	 * Constructs a GameScreen3 object with the specified DrawingSurface.
	 *
	 * @param surface The DrawingSurface on which this screen will be displayed.
	 */
	public GameScreen3(DrawingSurface surface) {
		super(800, 600);
		this.surface = surface;

		button1 = new Rectangle(50, 200, 325, 150);
		button2 = new Rectangle(425, 200, 325, 150);
		button3 = new Rectangle(50, 400, 325, 150);
		button4 = new Rectangle(425, 400, 325, 150);
		button5 = new Rectangle(20, 20, 760, 125);
		button6 = new Rectangle(760,380,40,40);
	}

	/**
	 * Draws the screen content.
	 */
	public void draw() {
		surface.background(255, 255, 255);
		
		surface.fill(200);
		surface.rect(button6.x, button6.y, button6.width, button6.height, 10, 10, 10, 10);
		surface.fill(0);
		String str1 = "Next";
		float w1 = surface.textWidth(str1);
		surface.text(str1, button6.x + button6.width / 2 - w1 / 2, button6.y + button6.height / 2);
		
		
		surface.textSize(15);
		surface.fill(200);
		surface.rect(button1.x, button1.y, button1.width, button1.height, 10, 10, 10, 10);
		surface.fill(0);
		String str = "A) Investing in a single stock";
		float w = surface.textWidth(str);
		surface.text(str, button1.x + button1.width / 2 - w / 2, button1.y + button1.height / 2);

		surface.fill(200);
		surface.rect(button2.x, button2.y, button2.width, button2.height, 10, 10, 10, 10);
		surface.fill(0);
		String str2 = "B) Spreading your investments across different assets";
		float w2 = surface.textWidth(str2);
		surface.text(str2, button2.x + button2.width / 2 - w2 / 2, button2.y + button2.height / 2);

		surface.fill(200);
		surface.rect(button3.x, button3.y, button3.width, button3.height, 10, 10, 10, 10);
		surface.fill(0);
		String str3 = "C) Focusing on high-risk investments";
		float w3 = surface.textWidth(str3);
		surface.text(str3, button3.x + button3.width / 2 - w3 / 2, button3.y + button3.height / 2);

		surface.fill(200);
		surface.rect(button4.x, button4.y, button4.width, button4.height, 10, 10, 10, 10);
		surface.fill(0);
		String str5 = "D) Keeping all your money in cash";
		float w5 = surface.textWidth(str5);
		surface.text(str5, button4.x + button4.width / 2 - w5 / 2, button4.y + button4.height / 2);

		surface.fill(120);
		surface.rect(button5.x, button5.y, button5.width, button5.height, 10, 10, 10, 10);
		surface.fill(0);
		String str6 = "What does diversification in investing mean?";
		float w6 = surface.textWidth(str6);
		surface.textSize(20);
		surface.text(str6, button5.x + button5.width / 2 - w6 / 2, button5.y + button5.height / 2);

		if (surface.isPressed(KeyEvent.VK_Z)) {
			surface.switchScreen(ScreenSwitcher.INTRO_SCREEN);
			return;
		}

		if (b1) {
			surface.fill(255, 0, 0);
			surface.rect(button1.x, button1.y, button1.width, button1.height, 10, 10, 10, 10);
		}
		if (b2) {
			surface.fill(0, 255, 0);
			surface.rect(button2.x, button2.y, button2.width, button2.height, 10, 10, 10, 10);
		}
		if (b3) {
			surface.fill(255, 0, 0);
			surface.rect(button3.x, button3.y, button3.width, button3.height, 10, 10, 10, 10);
		}
		if (b4) {
			surface.fill(255, 0, 0);
			surface.rect(button4.x, button4.y, button4.width, button4.height, 10, 10, 10, 10);
		}

		
	}

	/**
	 * Handles mouse pressed events.
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX, surface.mouseY));
		if (button1.contains(p)) {
			b1 = true;
		}
		if (button2.contains(p)) {
			b2 = true;
		}
		if (button3.contains(p)) {
			b3 = true;
		}
		if (button4.contains(p)) {
			b4 = true;
		}
		if (button6.contains(p)) {
			surface.switchScreen(ScreenSwitcher.WIN_SCREEN);
			return;

		}
	}
}
