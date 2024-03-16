import javax.swing.*;
import java.awt.*;

public class TeddyBear {
    Image baer = new ImageIcon("resource/TeddyBear.png").getImage();
    private static int x = (int) (Math.random() * 500);
    private static int y = (int) (Math.random() * 490);

    public void setX(int f){
        if (f < 0){
            x = 0;
        } else if (f > 500) {
            x = 500;
        } else{
            x = f;
        }
    }
    public void setY(int f){
        if (f < 0){
            y = 0;
        } else if (f > 490) {
            y = 490;
        } else{
            y = f;
        }
    }
    public int getY(){
        return y;
    }
    public int getX(){
        return x;
    }
    public void paint(Graphics g){
        g.drawImage( baer, x, y ,null);
    }
}
