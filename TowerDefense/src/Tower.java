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
        g.fill(0, 250, 0);
        g.rect(t.x, t.y, width, length);
    }


    public Bullet Shoot(Tower t){
        Bullet bullet = new Bullet(t.x,t.y,(int)(Math.random()*2),(int)(Math.random()*2),2);
        return bullet;
    }

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
