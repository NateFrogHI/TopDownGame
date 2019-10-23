package TopDownGame;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
 * File:    Player.java
 * Author:  Nathan K. Mitson
 * Date:    
 * Purpose: 
 */

public class Player extends GameObject 
{
    private int lives;
    
    public Player(int x, int y)
    {
        speed = 10;
        direction = 0.0;
        position = new Point2D.Double(x, y);
        lives = 3;
        
        
        try 
        {
            image = ImageIO.read(new FileInputStream("src/images/player.png"));
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("player image not found");
        }
        catch(IOException e)
        {
            System.out.println("IOException");
        }
    }
    
    public boolean enemyCollision(Point enemyCenter)
    {
        double distance = getCenter().distance(enemyCenter);
        boolean isCollided = false;
        
        if(distance < SIZE)
        {
            isCollided = true;
        }
        return isCollided;
    }
    public boolean wallCollision(Point wallCenter, double centerCornerDist)
    {
        int leftBoundry = wallCenter.x - (SIZE/2);
        int rightBoundry = wallCenter.x + (SIZE/2);
        int topBoundry = wallCenter.y - (SIZE/2);
        int bottomBoundry = wallCenter.y + (SIZE/2);
        double distance = getCenter().distance(wallCenter);
        
        boolean isCollided = false;
        
        if((position.x > (leftBoundry + SIZE)) &&
           (position.x < rightBoundry) &&
           (position.y > (topBoundry + SIZE)) &&
           (position.y < bottomBoundry))
        {
            if(distance < (centerCornerDist + (SIZE / 2)))
            {
                isCollided = true;
            }
        }
        
        return isCollided;
    }
    
}
