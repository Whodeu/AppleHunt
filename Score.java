import java.awt.*;
import javax.swing.*;

public class Score {
    private static int score = 0;

    public void Scoreget(){
        score++;
    }

    public void setScore(int t){
        score = t;
    }
    public int getScore(){
        return score;
    }

    public void print(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(14, 4, 150, 30);
        g.setColor(Color.WHITE);
        Font font = new Font("Bitstrean Charter", Font.BOLD, 20);
        g.setFont(font);
        g.drawString("Score: " + getScore(), 24, 24);

    }

}
