import javax.swing.*;
import java.awt.*;

public class NickName {
    private static int x = 100;

    private static int y = 95;
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int u){
        if (u < 0){
            x = 0;
        } else if (u > 525) {
            x = 525;
        } else{
            x = u;
        }

    }
    public void setY(int u){
        if (u < 0){
            y = 0;
        } else if (u > 502) {
            y = 497;
        } else{
            y = u;
        }
    }
    private static String name = null;
    public String getName(){
        return name;
    }
    public void setName(){
        name = JOptionPane.showInputDialog("Please, Enter ur name");
    }
    public void print(Graphics g){
        g.setColor(Color.WHITE);
        g.drawString(getName(),x, y);
    }
}
