import javax.swing.*;
import java.awt.*;

public class Player {
    private String name = null;
    Image PlayerIcon = new ImageIcon("resource/Player.jpg").getImage();
    private static int x = 100;

    private static int y = 100;
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
            y = 502;
        } else{
            y = u;
        }
    }

    public void paint(Graphics g) throws NullPlayerSpriteException{
        if (PlayerIcon == null){
            throw new NullPlayerSpriteException();
        } else{
            g.drawImage(PlayerIcon, x, y, null);

        }


    }
}
