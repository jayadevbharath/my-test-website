package screens;

import java.awt.Point;
import java.awt.Rectangle;

import core.DrawingSurface;

/**
 * Represents the first screen of the application.
 * This screen extends the Screen class and is designed to display content on a DrawingSurface.
 */
public class IntroScreen extends Screen {

	private DrawingSurface surface;
	private Rectangle button1;
	private Rectangle button2;
	private Rectangle button3;
	private Rectangle shopButton;
	private Rectangle button4;

	/**
	 * Constructs a FirstScreen object with the specified DrawingSurface.
	 *
	 * @param surface The DrawingSurface on which this screen will be displayed.
	 */
	public IntroScreen(DrawingSurface surface) {
		super(800, 600);
		this.surface = surface;

		button1 = new Rectangle(800 / 2 - 100, 300 / 2 - 50, 200, 100);
		button2 = new Rectangle(800 / 2 - 100, 550 / 2 - 50, 200, 100);
		button3 = new Rectangle(800 / 2 - 100, 800 / 2 - 50, 200, 100);
		button4 = new Rectangle(800 / 2 - 100, 1050 / 2 - 50, 200, 100);
		shopButton = new Rectangle(0,0, 50, 50);
	}

	/**
	 * Draws the screen content.
	 */
	public void draw() {
		surface.background(255, 255, 255);
		surface.textSize(15 );
		surface.fill(200);
		surface.rect(button1.x, button1.y, button1.width, button1.height, 10, 10, 10, 10);
		surface.fill(0);
		String str = "Instructions";
		float w = surface.textWidth(str);
		surface.text(str, button1.x + button1.width / 2 - w / 2, button1.y + button1.height / 2);

		surface.fill(200);
		surface.rect(button2.x, button2.y, button2.width, button2.height, 10, 10, 10, 10);
		surface.fill(0);
		String str2 = "Investments and Retirement";
		float w2 = surface.textWidth(str2);
		surface.text(str2, button2.x + button2.width / 2 - w2 / 2, button2.y + button2.height / 2);

		surface.fill(200);
		surface.rect(button3.x, button3.y, button3.width, button3.height, 10, 10, 10, 10);
		surface.fill(0);
		String str3 = "Budgeting and Saving";
		float w3 = surface.textWidth(str3);
		surface.text(str3, button3.x + button3.width / 2 - w3 / 2, button3.y + button3.height / 2);

//		surface.fill(200);
//		surface.rect(shopButton.x, shopButton.y, shopButton.width, shopButton.height, 10, 10, 10, 10);
//		surface.fill(0);
//		String shopstr = "Shop";
//		float w4 = surface.textWidth(shopstr);
//		surface.text(shopstr, shopButton.x + shopButton.width / 2 - w4 / 2, shopButton.y + shopButton.height / 2);

		surface.fill(200);
		surface.rect(button4.x, button4.y, button4.width, button4.height, 10, 10, 10, 10);
		surface.fill(0);
		String str5 = "Credit and Loans";
		float w5 = surface.textWidth(str5);
		surface.text(str5, button4.x + button4.width / 2 - w5 / 2, button4.y + button4.height / 2);
	}


	/**
	 * Handles mouse pressed events.
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX, surface.mouseY));
		if (button1.contains(p)) {
			surface.switchScreen(ScreenSwitcher.INSTRUCTION_SCREEN);

		}
		if (button2.contains(p)) {
			surface.switchScreen(ScreenSwitcher.GAME_SCREEN1);

		}
		if (button3.contains(p)) {
			surface.switchScreen(ScreenSwitcher.GAME_SCREEN4);

		}
		if (button4.contains(p)) {
			surface.switchScreen(ScreenSwitcher.GAME_SCREEN7);

		}
	}

}
