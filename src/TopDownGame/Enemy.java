package TopDownGame;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
 * File:    Enemy.java
 * Author:  Nathan K. Mitson
 * Date:    
 * Purpose: 
 */

public class Enemy extends GameObject
{
    private final int RADIUS;
    private final double GEM;
    private final double HEART;
    public Enemy(double x, double y, double dir, double gemDrop, double heartDrop)
    {
        speed = 3;
        direction = dir;
        position = new Point2D.Double(x, y);
        RADIUS = (SIZE / 2);
        GEM = gemDrop;
        HEART = heartDrop;
        
        try 
        {
            image = ImageIO.read(new FileInputStream("src/images/enemy.png"));
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("enemy image not found");
        }
        catch(IOException e)
        {
            System.out.println("IOException");
        }
    }
    
    public boolean boundryCollision()
    {
        boolean isCollided = false;
        
        if(position.x > (GameArea.xPos(GameArea.PLAY_WIDTH) - SIZE))
        {
            isCollided = true;
            invertXDirection();
            position.x = GameArea.xPos(GameArea.PLAY_WIDTH) - SIZE;
        }
        else if(position.x < (GameArea.xPos(0)))
        {
            isCollided = true;
            invertXDirection();
            position.x = (GameArea.xPos(0));
	}
        if(position.y > (GameArea.yPos(GameArea.PLAY_HEIGHT) - SIZE))
        {
            isCollided = true;
            invertYDirection();
            position.y = GameArea.yPos(GameArea.PLAY_HEIGHT) - SIZE;
        }
	else if(position.y < (GameArea.yPos(0)))
	{
            isCollided = true;
            invertYDirection();
            position.y = (GameArea.yPos(0));
	}
        return isCollided;
    }
    
    public boolean wallColision(Point wallCenter)
    {
        boolean isCollided = false;
//        int leftBoundry = wallCenter.x - (RADIUS);
//        int rightBoundry = wallCenter.x + (RADIUS);
//        int topBoundry = wallCenter.y - (RADIUS);
//        int bottomBoundry = wallCenter.y + (RADIUS);
//        
//        
//        if((getCenter().x > (leftBoundry - RADIUS)) &&
//           (getCenter().x < (rightBoundry + RADIUS)) &&
//           (getCenter().y > (topBoundry - RADIUS)) &&
//           (getCenter().y < (bottomBoundry + RADIUS)))
//        {
//            
//            isCollided = true;
//            
//            if(Math.abs(getCenter().y - wallCenter.y) < Math.abs(getCenter().x - wallCenter.x))
//            {
//                invertXDirection();
//            }
//            else
//            {
//                invertYDirection();
//            }
//        }
        if(Math.abs(getCenter().x - wallCenter.x) < (RADIUS + (GameArea.TILE_SIZE / 2))
           && getCenter().y > (wallCenter.y - (GameArea.TILE_SIZE / 2))
           && getCenter().y < (wallCenter.y + (GameArea.TILE_SIZE / 2)))
        {
            invertXDirection();
        }
        if(Math.abs(getCenter().y - wallCenter.y) < (RADIUS + (GameArea.TILE_SIZE / 2))
           && getCenter().x > (wallCenter.x - (GameArea.TILE_SIZE / 2))
           && getCenter().x < (wallCenter.x + (GameArea.TILE_SIZE / 2)))
        {
            invertYDirection();
        }
        else
        {
            if(getCenter().distance((wallCenter.x - 16),(wallCenter.y - 16)) < RADIUS)
            {
                if(Math.abs(getCenter().y - wallCenter.y) < Math.abs(getCenter().x - wallCenter.x))
                {
                    invertYDirection();
                }
                
                else if(Math.abs(getCenter().y - wallCenter.y) > Math.abs(getCenter().x - wallCenter.x))
                {
                    invertXDirection();
                }
                else
                {
                    invertXDirection();
                    invertYDirection();
                }
            }
            else if(getCenter().distance((wallCenter.x + 16),(wallCenter.y - 16)) < RADIUS)
            {
                if(Math.abs(getCenter().y - wallCenter.y) < Math.abs(getCenter().x - wallCenter.x))
                {
                    invertYDirection();
                }
                
                else if(Math.abs(getCenter().y - wallCenter.y) > Math.abs(getCenter().x - wallCenter.x))
                {
                    invertXDirection();
                }
                else
                {
                    invertXDirection();
                    invertYDirection();
                }
            }
            else if(getCenter().distance((wallCenter.x - 16),(wallCenter.y + 16)) < RADIUS)
            {
                if(Math.abs(getCenter().y - wallCenter.y) < Math.abs(getCenter().x - wallCenter.x))
                {
                    invertYDirection();
                }
                
                else if(Math.abs(getCenter().y - wallCenter.y) > Math.abs(getCenter().x - wallCenter.x))
                {
                    invertXDirection();
                }
                else
                {
                    invertXDirection();
                    invertYDirection();
                }
            }
            else if(getCenter().distance((wallCenter.x + 16),(wallCenter.y + 16)) < RADIUS)
            {
                if(Math.abs(getCenter().y - wallCenter.y) < Math.abs(getCenter().x - wallCenter.x))
                {
                    invertYDirection();
                }
                
                else if(Math.abs(getCenter().y - wallCenter.y) > Math.abs(getCenter().x - wallCenter.x))
                {
                    invertXDirection();
                }
                else
                {
                    invertXDirection();
                    invertYDirection();
                }
            }
        }
        
        return isCollided;
    }
}
