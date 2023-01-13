import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * <pre>
 * Anne Liu and Atisa Wang
 * January 7, 2023
 *
 * CACTUS
 * This class manages the characteristics and methods of the cactus obstacle. </pre>
 */
public class Cactus extends Rectangle {
    // ================================================================================
    // VARIABLES
    // ================================================================================
    /**
     * Each row represents a different cactus obstacle.
     * The first column is the file name.
     * The second column is the width (px).
     * The third column is the height (px).
     */
    public static final String[][] CACTUS_ARR = {{"cactus/cactus1.png", "34", "89"}, {"cactus/cactus2.png", "68", "89"}, {"cactus/cactus3.png", "102", "89"}, {"cactus/cactus4.png", "50", "103"}, {"cactus/cactus5.png", "100", "103"}, {"cactus/cactus6.png", "150", "103"}};
    public final String fileName;
    public final BufferedImage buffImage;
    private int xVelocity;

    // ================================================================================
    // CONSTRUCTOR
    // ================================================================================
    public Cactus(int index, int x) {
    	// initialize the cactus position and dimensions
        this.x = x;
        xVelocity = 5;
        y = GamePanel.LAND_HEIGHT-2*Integer.parseInt(CACTUS_ARR[index][3]); 
        width = Integer.parseInt(CACTUS_ARR[index][2]);
        height = Integer.parseInt(CACTUS_ARR[index][3]);

        // initialize the cactus image
        fileName = CACTUS_ARR[index][1];
        buffImage = Resource.getResourceImage(fileName);
    	
    }

    // ================================================================================
    // METHODS
    // ================================================================================

    /**
     * move the cactus 5px left
     */
    public void move() {
        x -= xVelocity;
    }
    

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.drawImage(buffImage, x, y, null); // draw cactus
    }

    public void setXVelocity(int speed){
        xVelocity = speed;
    }

}
