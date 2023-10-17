import processing.core.PApplet;

import java.util.ArrayList;

public class Game extends PApplet {
    // TODO: declare game variables

    ArrayList<Tower> towerList;
    ArrayList<Tank> tankList;

    public void settings() {
        size(600, 600);   // set the window size

    }

    public void setup() {
        // TODO: initialize game variables

        towerList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {

            Tower t = new Tower(i*100+30, 150, 100);
            towerList.add(t);

        }
        for (int i = 0; i < 6; i++) {

            Tower t = new Tower(i*100+30, 350, 100);
            towerList.add(t);

        }

        tankList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {

            Tank q = new Tank(-(i*100), 250, 100);
            tankList.add(q);

        }




    }

    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
        background(255);
        fill(150);
        rect(0, 200, 600, 150);


        for (Tower t : towerList){
           t.draw(this, t);
           Bullet b = t.Shoot(t);
           b.draw(this, b);

        }

        for (Tank q : tankList){
            q.draw(this, q);
            q.update();
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
