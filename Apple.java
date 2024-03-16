import javax.swing.*;
import java.awt.*;

public class Apple {

    private static int x2 = (int) (Math.random() * 500);
    private static int y2 = (int) (Math.random() * 490);

    public void setX2(int f){
        if (f < 0){
            x2 = 0;
        } else if (f > 500) {
            x2 = 500;
        } else{
            x2 = f;
        }
    }
    public void setY2(int f){
        if (f < 0){
            y2 = 0;
        } else if (f > 490) {
            y2 = 490;
        } else{
            y2 = f;
        }
    }
    public int getY2(){
        return y2;
    }
    public int getX2(){
        return x2;
    }
    Image AppleICON = new ImageIcon("resource/Apple(PLACEHOLDER).png").getImage();

    public void paint(Graphics g){
        g.drawImage(AppleICON, x2, y2, null);
    }
}
