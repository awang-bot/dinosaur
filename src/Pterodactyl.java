/* Anne Liu and Atisa Wang
January 7, 2023
Pterodactyl
This class will manage the characteristics of the pterodactyl obstacle. */

import java.lang.Object;
import java.awt.*;

public class Pterodactyl extends Rectangle {
    // variable declaration
    public static final int[] HEIGHT_OFF_GROUND_ARR = {20, 60, 120}; // pterodactyl height off the ground array (list of 3 height options)
    // this height will depend on how big the dinosaur is
    public int heightOffGround;
    public String birdImageURL = "resources/pterodactyl.png"; // imageURL for the bird, it never changes images
    // CHECK THIS IMAGE URL AGAIN -- IT'S NOT CORRECT. WATCHING VIDEO ON ANIMATIONS RN
    public static final int BIRD_HEIGHT = 20, BIRD_WIDTH = 30; //width, height of object itself
    private Animation birdFlap;

    // constructor
    public Pterodactyl(int heightNum, int x, int y) // heightNum will be a number from 0 to 2
    {
        super(x, y);
        birdFlap = new Animation();
        birdFlap.addFrame(Resource.getResourceImage("resource/pterodactyl_down.png"));
        heightOffGround = HEIGHT_OFF_GROUND_ARR[heightNum]; // determine the height of the bird off the ground
    }

    public void move() {
        x -= 5; // move the bird to the left
    }

    // draws the current location of the pterodactyl to the screen
    public void draw(Graphics g) {

        g.setColor(Color.white);
        g.fillRect(x, y, BIRD_HEIGHT, BIRD_WIDTH);
    } // end of draw


}