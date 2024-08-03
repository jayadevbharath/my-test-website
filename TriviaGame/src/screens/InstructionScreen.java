package screens;

import java.awt.event.KeyEvent;

import core.DrawingSurface;
import processing.core.PFont;
/**
 * Represents the screen containing instructions for the controls of the game
 */
public class InstructionScreen extends Screen {

	private DrawingSurface surface;

/**
 * Constructs the window for the instructions screen
 * @param surface the surface text is displayed on
 */
	public InstructionScreen(DrawingSurface surface) {
		super(800, 600);
		this.surface = surface;
		
	}
	

/**
 * Draws the text that contains the instructions for how to play
 */
	public void draw() {



		surface.background(200); 
		
		surface.textSize(25);
		surface.fill(255);
		surface.text("Select a Topic and answer the questions based on it\nThe question will flash red if wrong and green if right\nPress the next key when your ready to move on\n \n\n\n Press Esc to go back", 2, 200);
		

		if (surface.isPressed(KeyEvent.VK_ESCAPE)) {
			surface.switchScreen(ScreenSwitcher.INTRO_SCREEN);
			return;
		}

	}

}
