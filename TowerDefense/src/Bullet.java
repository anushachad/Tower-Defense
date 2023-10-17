import processing.core.PApplet;

public class Bullet extends PApplet {
    private int xSpeed, ySpeed;
    private float x, y;
    private double radius;

    public Bullet(float x, float y, int xSpeed, int ySpeed, double radius){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    public void update(){
        x = x + xSpeed;
        y = y +ySpeed;
    }

    public void draw(Game g, Bullet b){
        g.fill(250, 0, 0);
        g.ellipse(b.x, b.y, 5,5);
    }


    public boolean ifCollide(Tank tank){

        return false;

    }

    public boolean ifCollide(Tower tower){

        return false;

    }



}
