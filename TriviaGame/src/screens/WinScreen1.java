package screens;

import java.awt.event.KeyEvent;

import core.DrawingSurface;

/**
 * The WinScreen1 class represents the screen displayed when the player
 * completes Level 1 of the game. It provides a congratulatory message and
 * instructs the player to press the escape key to return to the main menu.
 * 
 * This class extends the Screen class and utilizes the DrawingSurface
 * class for rendering the content on the screen.
 * 
 * 
 * @Author: Bharath Jayadev and Akhil Puttar
 */
public class WinScreen1 extends Screen {

    private DrawingSurface surface;

    /**
     * Constructs a WinScreen1 object with the specified DrawingSurface.
     * 
     * @param surface The DrawingSurface object used for rendering the screen content.
     */
    public WinScreen1(DrawingSurface surface) {
        super(800, 600);
        this.surface = surface;
    }

    /**
     * Draws the win screen content, which includes a congratulatory message
     * and an instruction to press the escape key to go back to the main menu.
     * If the escape key is pressed, the screen switches to the main menu screen.
     */
    public void draw() {
        surface.background(255);
        surface.fill(0);         
        surface.textAlign(surface.CENTER, surface.CENTER); 

        surface.textSize(32);   
        surface.text("Topic Learned!\nPress esc to go back", 800 / 2, 600 / 2); 

        
        if (surface.isPressed(KeyEvent.VK_ESCAPE)) {
            surface.switchScreen(ScreenSwitcher.INTRO_SCREEN);
            return;
        }
    }
}