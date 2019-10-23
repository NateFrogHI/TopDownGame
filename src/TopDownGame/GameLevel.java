package TopDownGame;

import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
 * File:    GameLevel.java
 * Author:  Nathan K. Mitson
 * Date:    
 * Purpose: 
 */

public class GameLevel 
{
    public Enemy[] enemies;
    public Obstacle[] obstacles;
    
    private BufferedImage tile;
    private BufferedImage stats;
    private BufferedImage background;
    private int enemyQty;
    private int obstacleQty;
    
    public GameLevel(GameScreen currentScreen)
    {
        enemyQty = currentScreen.enemyQty;
        obstacleQty = currentScreen.obstacleQty;
        enemies = new Enemy[enemyQty];
        obstacles = new Obstacle[obstacleQty];
        
        for(int enemyCount = 0; enemyCount < enemyQty; enemyCount++)
        {
            enemies[enemyCount] = new Enemy(currentScreen.enemyPos[enemyCount].x, currentScreen.enemyPos[enemyCount].y, currentScreen.enemyDirection[enemyCount], .75, .15);
        }
        for(int obsCount = 0; obsCount < obstacleQty; obsCount++)
        {
            obstacles[obsCount] = new Obstacle(currentScreen.obstaclePos[obsCount].x, currentScreen.obstaclePos[obsCount].y);
        }
        
        try 
        {
            String path;
            stats = ImageIO.read(new FileInputStream("src/images/statusBar.png"));
            if(currentScreen.isOutside)
            {
                path = "src/images/grassTile.png";
            }
            else
            {
                path = "src/images/dungeonTile.png";
            }
            tile = ImageIO.read(new FileInputStream(path));
            background = new BufferedImage(GameArea.WIDTH, GameArea.HEIGHT, BufferedImage.TYPE_INT_RGB);
            background.createGraphics().drawImage(stats, 0, 0, null);
            for(int yCount = 0; yCount < GameArea.TILES_HIGH; yCount++)
            {
                for(int xCount = 0; xCount < GameArea.PLAY_WIDTH; xCount++)
                {
                    background.createGraphics().drawImage(tile, GameArea.xPos(xCount), GameArea.yPos(yCount), null);
                }
            }
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("Background not found");
        }
        catch(IOException e)
        {
            System.out.println("IOException");
        }
    }
    
    public BufferedImage getBackground()
    {
        return background;
    }
    public int getNumberOfEnemies()
    {
        return enemyQty;
    }
    public int getNumberOfWalls()
    {
        return obstacleQty;
    }
}
