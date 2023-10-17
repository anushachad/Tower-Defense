import processing.core.PApplet;

public class Tank extends PApplet {
        private int health;
        private float x,y;
        private static int width = 30;
        private static int length = 40;
        private int xSpeed, ySpeed;
        private float BulletX, BulletY;
        private int BulletXSpeed, BulletYSpeed, BulletRadius;


        public Tank(float x, float y, int health){
            this.x = x;
            this.y = y;
            this.health = health;
            xSpeed = 1;
        }

        public void update(){
            x = x + xSpeed;
        }

        public void draw(Game g, Tank t){
            g.fill(0, 0, 250);
            g.rect(t.x, t.y, width, length);


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
