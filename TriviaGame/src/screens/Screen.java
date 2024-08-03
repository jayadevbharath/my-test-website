package screens;

/**
 * Abstract class representing a screen in the application.
 */
public abstract class Screen {

    /**
     * The width of the drawing area.
     */
    public final int DRAWING_WIDTH;

    /**
     * The height of the drawing area.
     */
    public final int DRAWING_HEIGHT;

    /**
     * Constructs a Screen object with the specified dimensions.
     *
     * @param width  The width of the drawing area.
     * @param height The height of the drawing area.
     */
    public Screen(int width, int height) {
        this.DRAWING_WIDTH = width;
        this.DRAWING_HEIGHT = height;
    }

    /**
     * Sets up the screen before drawing.
     */
    public void setup() {

    }

    /**
     * Draws the content of the screen.
     */
    public void draw() {

    }

    /**
     * Handles mouse pressed events.
     */
    public void mousePressed() {

    }

    /**
     * Handles mouse moved events.
     */
    public void mouseMoved() {

    }

    /**
     * Handles mouse dragged events.
     */
    public void mouseDragged() {

    }

    /**
     * Handles mouse released events.
     */
    public void mouseReleased() {

    }
}
