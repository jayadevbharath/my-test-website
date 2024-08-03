package core;

import processing.core.PApplet;

/**
 * The main class of the application responsible for starting the DrawingSurface.
 */
public class Main {

    /**
     * Main method to start the application.
     *
     * @param args Command-line arguments.
     */
    public static void main(String args[]) {
        DrawingSurface drawing = new DrawingSurface();
        PApplet.runSketch(new String[]{""}, drawing);
        drawing.windowResizable(true);
    }
}
