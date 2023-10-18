import processing.core.PApplet;

public class Tank extends PApplet {
        private int health;
        private float x,y;
        private final int width;
        private final int length;
        private int xSpeed, ySpeed;
        private float BulletX, BulletY;
        private int BulletXSpeed, BulletYSpeed, BulletRadius;



        public Tank(float x, float y, int health){
            this.x = x;
            this.y = y;
            this.health = health;
            width = displayWidth/2;
            length = displayHeight/2;
            xSpeed = 2;
        }

        public void update(){
            x = x + xSpeed;
        }

        public void draw(Game g, Tank t){
            g.fill(109, 112, 79);
            g.rect(t.x, t.y, (float) g.width /8, (float) g.length /8);

        }


        /**public Bullet Shoot(){

            for (int i = 0; i < towerList.Size(); i++) {

                //save closest tower

            }

            //calculate xSpeed and ySpeed based on closest tower
            Bullet bullet = new Bullet(BulletX,BulletY,BulletXSpeed,BulletYSpeed,BulletRadius);
            return bullet;
        }

        public void ifShot(Bullet bullet){
            bullet.ifCollide(this);
            health -= 5;
            if(health <= 0){
                //destroy tower
            }
        }


**/
    }
