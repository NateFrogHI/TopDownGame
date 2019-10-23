package TopDownGame;

import java.awt.geom.Point2D;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;

/* File:    Obstacle.java
 * Author:  Nathan K. Mitson
 * Date:    
 * Purpose: 
 */
public class Obstacle extends GameObject
{
    public Obstacle(double x, double y)
    {
        speed = 0.0;
        direction = 0.0;
        position = new Point2D.Double(x, y);
        
        try 
        {
            image = ImageIO.read(new FileInputStream("src/images/wall.png"));
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("Wall image not found");
        }
        catch(IOException e)
        {
            System.out.println("IOException");
        }
    }
}
