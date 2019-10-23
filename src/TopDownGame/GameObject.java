package TopDownGame;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/*
 * File:    GameObject.java
 * Author:  Nathan K. Mitson
 * Date:    
 * Purpose: 
 */

public abstract class GameObject 
{
    public final int SIZE;
    protected double speed;
    protected double direction;
    protected Point2D.Double position;
    
    protected BufferedImage image;
    
    public GameObject()
    {
        SIZE = 32;
        speed = 10.0;  // Per mil sec
        direction = 0.0;
        position = new Point2D.Double(0.0, 0.0);
        
        try 
        {
            image = ImageIO.read(new FileInputStream("src/images/default.png"));
        } 
        catch (FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Image not found!", "Error!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(1);
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Input Exception", "Error!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(1);
        }
    }
    
    public void setSpeed(int newSpeed)
    {
        speed = newSpeed;
    }
    public void setPos(Point2D.Double newPosition)
    {
        position = newPosition;
    }
    public void setXPos(double newX)
    {
        position.x = newX;
    }
    public void setYPos(double newY)
    {
        position.y = newY;
    }
    public void setDirection(double dir)
    {
        direction = dir;
    }
    
    public double getSpeed()
    {
        return speed;
    }
    public int getXPos()
    {
        int xPos = (int)(position.x + .5);
        return xPos;
    }
    public int getYPos()
    {
        int yPos = (int)(position.y + .5);
        return yPos;
    }
    public Point2D.Double getPosition()
    {
        return position;
    }
    public BufferedImage getImage()
    {
        return image;
    }
    public double getDirection()
    {
        return direction;
    }
    public Point getCenter()
    {
        Point centerPoint = new Point();
        centerPoint.x = getXPos() + (SIZE / 2);
        centerPoint.y = getYPos() + (SIZE / 2);
        return centerPoint;
    }
    public void movePosition()
    {
        double x;
        double y;
        switch((int)direction)
        {
            case 0:
                x = speed;
                y = 0;
                break;
            case 90:
                x = 0;
                y = speed * (-1);
                break;
            case 180:
                x = speed * (-1);
                y = 0;
                break;
            case 270:
                x = 0;
                y = speed;
                break;
            default:
                x = speed * Math.cos(direction * (0.0174532925));   //Degrees must be in radians
                y = speed * Math.sin(direction * (0.0174532925));
        }
        
        y *= (-1);  // Adjust for inverted Y axis
        position.x = position.x + x;
        position.y = position.y + y;
    }
    
    public void invertXDirection()
    {
        if (direction <= 90)
        {
            direction = 90 + (90 - direction);
        }
        else if (direction <= 180)
        {
            direction = 180 - direction;
        }
        else if (direction <= 270)
        {
            direction = 360 - (direction - 180);
        }
        else if (direction <= 360)
        {
            direction = 180 + (360 - direction);
        }
    }
    public void invertYDirection()
    {
        direction = 360 - direction;
    }
}