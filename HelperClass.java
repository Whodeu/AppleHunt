import javax.swing.*;
import java.awt.*;

public class HelperClass {
    fryr tr = new fryr();

    Apple a1 = new Apple();

    TeddyBear t1 = new TeddyBear();

    Score s1 = new Score();

    private int u = s1.getScore();
    Player p1 = new Player();
    public void collectApple(){
        if (p1.getX() == a1.getX2() && p1.getY() == a1.getY2()){
            int f = (int) (Math.random()* 500);
            int g = (int) (Math.random()* 490);
            a1.setX2(f);
            a1.setY2(g);
            s1.setScore(u++);
            tr.repaint();
        } else{
            System.out.println("no");
        }
    }
    public void collectTeddyBear(){
        if (p1.getX() == t1.getX() && p1.getY() == t1.getY()){
            int f = (int) (Math.random()* 500);
            int g = (int) (Math.random()* 490);
            t1.setX(f);
            t1.setY(g);
            s1.setScore(u++);
            tr.repaint();
        } else{
            System.out.println("no-2");
        }
    }
}
