package TopDownGame;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/*
 * File:    GameWindow.java
 * Author:  Nathan K. Mitson
 * Date:    
 * Purpose: 
 */

public class GameWindow extends Canvas
{
    public final int WIDTH;
    public final int HEIGHT;
    public final String TITLE;
    
    private int scale;
    private JFrame frame;
    private Dimension size;
    private BufferedImage image;
    
    public GameWindow(BufferedImage startingImage, int Width, int Height)
    {
        WIDTH = Width;
        HEIGHT = Height;
        TITLE = "Top Down Game";
        scale = 3;
        size = new Dimension(WIDTH * scale, HEIGHT * scale);
        setPreferredSize(size);
        frame = new JFrame();
        
        frame.setResizable(false);
        frame.setTitle(TITLE);
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        image = startingImage;
    }
    
    public void setImage(BufferedImage newImage)
    {
        image = newImage;
    }
    
    public void render()
    {
        BufferStrategy bufferStrat = getBufferStrategy();
        if(bufferStrat == null)
        {
            createBufferStrategy(3);
            return;
        }
        
        Graphics g = bufferStrat.getDrawGraphics();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        g.dispose();
        bufferStrat.show();
    }
}
