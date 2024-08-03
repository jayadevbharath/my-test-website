package core;


import java.awt.Point;

import java.util.ArrayList;
import processing.core.PApplet;

import screens.*;


/**
 * The DrawingSurface class represents the main drawing surface of the application.
 * It extends the PApplet class and implements the ScreenSwitcher interface.
 */
public class DrawingSurface extends PApplet implements ScreenSwitcher {

    /** The scaling ratio in the x-direction. */
    public float ratioX;

    /** The scaling ratio in the y-direction. */
    public float ratioY;

    /** The list of keys currently pressed. */
    private ArrayList<Integer> keys;

    /** The currently active screen. */
    private Screen activeScreen;
    /** The list of screens in the application. */
    private ArrayList<Screen> screens;

    /**
     * Constructs a new DrawingSurface object.
     * Initializes the list of screens and keys.
     */
    public DrawingSurface() {
        screens = new ArrayList<>();
        keys = new ArrayList<>();
//
        IntroScreen is = new IntroScreen (this);
        screens.add(is);
        
        InstructionScreen insts = new InstructionScreen (this);
        screens.add(insts);
        
        GameScreen1 gs1 = new GameScreen1 (this);
        screens.add(gs1);
        
        GameScreen2 gs2 = new GameScreen2(this);
        screens.add(gs2);

        GameScreen3 gs3 = new GameScreen3(this);
        screens.add(gs3);

        GameScreen4 gs4 = new GameScreen4(this);
        screens.add(gs4);

        GameScreen5 gs5 = new GameScreen5(this);
        screens.add(gs5);

        GameScreen6 gs6 = new GameScreen6(this);
        screens.add(gs6);

        GameScreen7 gs7 = new GameScreen7(this);
        screens.add(gs7);

        GameScreen8 gs8 = new GameScreen8(this);
        screens.add(gs8);

        GameScreen9 gs9 = new GameScreen9(this);
        screens.add(gs9);;

        WinScreen1 ws1 = new WinScreen1(this);
        screens.add(ws1);
        
        
     
        
     
        
        activeScreen = screens.get(0);
    }

    /**
     * Sets the size of the drawing surface.
     */
    public void settings() {
        setSize(800, 600);
    }

    /**
     * Sets up the initial state of the application.
     * Calls the setup method for each screen.
     */
    public void setup() {
        for (Screen s : screens)
            s.setup();
    }

    /**
     * Draws the active screen on the drawing surface.
     * Scales the screen according to the ratioX and ratioY values.
     */
    public void draw() {
        ratioX = (float) width / activeScreen.DRAWING_WIDTH;
        ratioY = (float) height / activeScreen.DRAWING_HEIGHT;
        push();
        scale(ratioX, ratioY);
        activeScreen.draw();
        pop();
    }

    /**
     * Handles key pressed events.
     */
    public void keyPressed() {
        if (!keys.contains(keyCode))
            keys.add(keyCode);
        if (key == ESC)  
            key = 0;
    }

    /**
     * Handles key released events.
     */
    public void keyReleased() {
        while (keys.contains(keyCode))
            keys.remove(Integer.valueOf(keyCode));
    }

    /**
     * Checks if the specified key is currently pressed.
     *
     * @param code The keycode of the key to check.
     * @return True if the key is pressed, otherwise false.
     */
    public boolean isPressed(Integer code) {
        return keys.contains(code);
    }

    /**
     * Handles mouse pressed events.
     */
    public void mousePressed() {
        activeScreen.mousePressed();
    }

    /**
     * Handles mouse moved events.
     */
    public void mouseMoved() {
        activeScreen.mouseMoved();
    }

    /**
     * Handles mouse dragged events.
     */
    public void mouseDragged() {
        activeScreen.mouseDragged();
    }

    /**
     * Handles mouse released events.
     */
    public void mouseReleased() {
        activeScreen.mouseReleased();
    }

    /**
     * Converts assumed coordinates to actual coordinates based on the scaling ratios.
     *
     * @param assumed The assumed coordinates to convert.
     * @return The corresponding actual coordinates.
     */
    public Point assumedCoordinatesToActual(Point assumed) {
        return new Point((int) (assumed.getX() * ratioX), (int) (assumed.getY() * ratioY));
    }

    /**
     * Converts actual coordinates to assumed coordinates based on the scaling ratios.
     *
     * @param actual The actual coordinates to convert.
     * @return The corresponding assumed coordinates.
     */
    public Point actualCoordinatesToAssumed(Point actual) {
        return new Point((int) (actual.getX() / ratioX), (int) (actual.getY() / ratioY));
    }

    /**
     * Switches the active screen to the one at the specified index.
     *
     * @param i The index of the screen to switch to.
     */
    @Override
    public void switchScreen(int i) {
        activeScreen = screens.get(i);
    }
}
