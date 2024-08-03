package screens;

/**
 * Interface for switching between screens in the application.
 */
public interface ScreenSwitcher {
    /**
     * Constant representing the intro screen.
     */
    public static final int INTRO_SCREEN = 0;

    /**
     * Constant representing the instruction screen.
     */
    public static final int INSTRUCTION_SCREEN = 1;

    /**
     * Constant representing the first game screen.
     */
    public static final int GAME_SCREEN1 = 2;

    /**
     * Constant representing the second game screen.
     */
    public static final int GAME_SCREEN2 = 3;

    /**
     * Constant representing the third game screen.
     */
    public static final int GAME_SCREEN3 = 4;
    
    /**
     * Constant representing the fourth game screen.
     */
    public static final int GAME_SCREEN4 = 5;
    
    /**
     * Constant representing the fifth game screen.
     */
    public static final int GAME_SCREEN5 = 6;
    
    /**
     * Constant representing the sixth game screen.
     */
    public static final int GAME_SCREEN6 = 7;
    
    /**
     * Constant representing the seventh game screen.
     */
    public static final int GAME_SCREEN7 = 8;
    
    /**
     * Constant representing the eighth game screen.
     */
    public static final int GAME_SCREEN8 = 9;
    
    /**
     * Constant representing the ninth game screen.
     */
    public static final int GAME_SCREEN9 = 10;
    
    public static final int WIN_SCREEN = 11; 

    /**
     * Switches to the specified screen.
     *
     * @param i The index of the screen to switch to.
     */
    public void switchScreen(int i);
}
