import javax.swing.*;
import java.awt.*;
public class fryr extends JPanel {
    Image img = new ImageIcon("resource/Part1043_spec.png").getImage();//Background image
    Player p1 = new Player();
    Apple i1 = new Apple();
    TeddyBear i2 = new TeddyBear();
    Score s1 = new Score();
    NickName n1 = new NickName();
    Graphics g;




    public void paintComponent(Graphics g){
        g.setColor(Color.darkGray);
        g.fillRect(0, 0, 10000,10000);
        g.drawImage(img, 0, 0, this);//draw graphics
        try{
            p1.setX(p1.getX());
            p1.setY(p1.getY());
            p1.paint(g);
        } catch (NullPlayerSpriteException exception){
            JOptionPane.showMessageDialog(null, "Oh uh! maybe Sprite is not available now!");
        } finally {
            n1.print(g);
        }
        i1.paint(g);
        i2.paint(g);
        s1.print(g);

        Graphics2D gr = (Graphics2D)g;
    }
}
