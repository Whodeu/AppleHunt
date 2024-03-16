import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    JFrame frame;
    Player srp = new Player();
    NickName sp = new NickName();
    fryr ron;

    private final static int WIDTH = 570;
    private final static int HEIGHT = 570;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main ma = new Main();
        NickName sp = new NickName();
        sp.setName();
        System.out.println(sp.getName());
        ma.start();

    }

    public void start(){
        frame = new JFrame("AppleHunt v1.3.2  NICKNAME UPDATE!"); //Create window...
        frame.setSize(WIDTH, HEIGHT); // Set Size...
        ron = new fryr(); //Create images
        frame.addKeyListener(new mov());
        frame.getContentPane().add(ron); //Add images in window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set close operation
        frame.setVisible(true);// view window...
        System.out.println("hash code: " + ron.hashCode());

    }

    public class mov implements KeyListener{
        private int y1 = srp.getY();
        private int x1 = srp.getX();
        private int y2 = sp.getY();
        private int x2 = sp.getX();
        HelperClass hlp = new HelperClass();

        private int speed = 1;
        public void setSpeed(int t){
            if (speed > 3){
                speed = 3;
            } else if (speed < 1) {
                speed = 1;
            } else {
                speed = t;
            }
        }
        public int getSpeed(){
            return speed;
        }

        public void keyTyped(KeyEvent e) {

        }

        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_UP){
                srp.setY(y1-speed);
                sp.setY(y2 - speed);
                y2 = sp.getY();
                y1 = srp.getY();
                ron.repaint();
                hlp.collectApple();
                hlp.collectTeddyBear();
                setSpeed(getSpeed());
                System.out.println("Y = " +srp.getY());
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN){
                srp.setY(y1 + speed);
                sp.setY(y2 + speed);
                y2 = sp.getY();
                y1 = srp.getY();
                ron.repaint();
                hlp.collectApple();
                hlp.collectTeddyBear();
                setSpeed(getSpeed());
                System.out.println("Y = " + srp.getY());
            }
            if (e.getKeyCode() == KeyEvent.VK_LEFT){
                srp.setX(x1- speed);
                sp.setX(x2 - speed);
                x1 = srp.getX();
                x2 = sp.getX();
                ron.repaint();
                hlp.collectApple();
                hlp.collectTeddyBear();
                setSpeed(getSpeed());
                System.out.println("X = " + srp.getX());
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                srp.setX(x1+ speed);
                sp.setX(x2 + speed);
                x1 = srp.getX();
                x2 = sp.getX();
                ron.repaint();
                hlp.collectApple();
                hlp.collectTeddyBear();
                setSpeed(getSpeed());
                System.out.println("X = " + srp.getX());
            }
            if (e.getKeyCode() == KeyEvent.VK_SHIFT){
                int r = getSpeed();
                int j = r + 2;
                setSpeed(j);
            }
        }

        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_SHIFT){
                int n = getSpeed();
                int j = n - 2;
                setSpeed(j);
            }
        }
    }

}
