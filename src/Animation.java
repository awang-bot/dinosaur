/* Anne Liu and Atisa Wang
January 7, 2023
Animation
This program will handle the animations of the pterodactyls and dinosaurs. */

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Animation {

    // ================================================================================
    // VARIABLES
    // ================================================================================

    /**
     * Stores the key frames of the animation.
     */
    private ArrayList<BufferedImage> keyFrames;
    private long deltaTime;
    private int currentFrame = 0;
    private long previousTime;

    // ================================================================================
    // CONSTRUCTOR
    // ================================================================================
    public Animation(int deltaTime) {
        this.deltaTime = deltaTime;
        keyFrames = new ArrayList<>(2); // initialize the ArrayList
        previousTime = 0;
    }

    // ================================================================================
    // METHODS
    // ================================================================================
    

    public void updateFrame() { 
        if (System.currentTimeMillis() - previousTime >= deltaTime) {
            currentFrame++;
            if (currentFrame >= keyFrames.size()) {
                currentFrame = 0;
            }
            previousTime = System.currentTimeMillis();
        }
    }

    public void addFrame(BufferedImage image) {
        keyFrames.add(image);
    }

    public BufferedImage getFrame() {
        return keyFrames.get(currentFrame);
    }

    public Rectangle getBounds() {
        Rectangle rect = new Rectangle();
        rect.x = getFrame().getTileGridXOffset();
        rect.y = getFrame().getTileGridYOffset();
        rect.width = getFrame().getWidth();
        rect.height = getFrame().getHeight();
        return rect;
    }

}
