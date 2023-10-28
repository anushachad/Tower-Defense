import processing.core.PApplet;

import java.util.ArrayList;


public class Game extends PApplet {
    // TODO: declare game variables

    ArrayList<Tower> towerList;
    ArrayList<Tank> tankList;
    int timer;
    int width;
    int length;

    public void settings() {
        size(displayWidth, displayHeight);   // set the window size
        width = displayWidth;
        length = displayHeight;
    }

    public void setup() {
        // TODO: initialize game variables

        timer = 0;

        towerList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {

            Tower t = new Tower(i*displayWidth/6+displayWidth/36, displayHeight/3-displayHeight/6, 100);
            towerList.add(t);

        }
        for (int i = 0; i < 6; i++) {

            Tower t = new Tower(i*displayWidth/6+displayWidth/36, 2*displayHeight/3, 100);
            towerList.add(t);

        }

        tankList = new ArrayList<>();








    }

    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
        timer--;
        background(	135, 206, 235);
        fill(100);
        rect(0, displayHeight/3, displayWidth, displayHeight/3);


        for (Tower t : towerList){
           t.draw(this, t);

        }

        if (timer <= 0){
            Tank q = new Tank(-displayWidth/8, displayHeight/2-(displayHeight/16), 100);
            tankList.add(q);
            timer=displayWidth/10;
        }

        for (Tank q : tankList){
            q.update();
            q.draw(this, q);

        }


        /**ellipse(mouseX, mouseY, 60, 60);  // draw circle at mouse loc
        ellipse(mouseX - 80, mouseY, 60, 60);  // draw circle at mouse loc
        ellipse(mouseX + 80, mouseY, 60, 60);  // draw circle at mouse loc
         **/
    }

    public static void main(String[] args) {
        PApplet.main("Game");
    }
}
