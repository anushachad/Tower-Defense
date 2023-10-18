import processing.core.PApplet;

public class Tower extends PApplet{

    private int health;
    private static int width = 40;
    private static int length = 50;
    private float x,y;
    private static float X, Y;
    private static int XSpeed, YSpeed, Radius;


    public Tower(float x, float y, int health){
        this.x = x;
        this.y = y;
        this.health = health;
    }

    public void draw(Game g, Tower t){
        g.fill(139, 79, 57);
        g.rect(t.x, t.y, g.width/10, g.length/6);
    }


   /** public Bullet Shoot(Tower t){
    }
    **/

    /**

    public void ifShot(Bullet bullet){
        bullet.ifCollide(this);
        health -= 5;
        if(health <= 0){
            //destroy tower
        }
    }

**/

}
