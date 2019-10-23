package TopDownGame;

import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

/*
 * File:    Game.java
 * Author:  Nathan K. Mitson
 * Date:    
 * Purpose: 
 */

public class Game 
{
    
    public final int LEVELS;
    private Instant gameTime;
    long startTime;
    long currentTime;
    GameWindow window;
    BufferedImage image;
    Graphics graphics;
    GameLevel[] gameLevel;
    Point2D.Double tempPoint;
    
    public Game()
    {
        LEVELS = 3;
        image = new BufferedImage(GameArea.WIDTH, GameArea.HEIGHT, BufferedImage.TYPE_INT_RGB);
        window = new GameWindow(image, GameArea.WIDTH, GameArea.HEIGHT);
        gameLevel = new GameLevel[LEVELS];
        gameTime = Instant.now();
        startTime = 0;
        currentTime = 0;
        tempPoint = new Point2D.Double();
    }
    
    public void setUpArea(int area)
    {
        GameScreen[][] screen = new GameScreen[2][2];
        screen[0][1] = new GameScreen(area,0,1);
        gameLevel[0] = new GameLevel(screen[0][1]);
    }
    
    /*
     * Update object pos and check for collisions every .015 sec
     */
    public void update()  // Find a way to update using direction
    {
        /*
         * Change this to save walls within range, and sort by distance before checking collision
         */
		 
        for(int enemyCount = 0; enemyCount < gameLevel[0].getNumberOfEnemies(); enemyCount++)
        {
            tempPoint = gameLevel[0].enemies[enemyCount].getPosition();
            gameLevel[0].enemies[enemyCount].movePosition();
            if(gameLevel[0].enemies[enemyCount].boundryCollision())
            {
                gameLevel[0].enemies[enemyCount].setPos(tempPoint);
                // Play sound
            }
            for(int obstacleCount = 0; obstacleCount < gameLevel[0].getNumberOfWalls(); obstacleCount++)
            {
                if(gameLevel[0].obstacles[obstacleCount].getCenter().distance(gameLevel[0].enemies[enemyCount].getCenter()) < 48)
                {
                    if(gameLevel[0].enemies[enemyCount].wallColision(gameLevel[0].obstacles[obstacleCount].getCenter()))
                    {
                        gameLevel[0].enemies[enemyCount].setPos(tempPoint);
                        // Play sound
                    }
                }
            }
        }
    }
    
    public void render()
    {
        image.createGraphics().drawImage(gameLevel[0].getBackground(), 0, 0, null);
        for(int wallCount = 0; wallCount < gameLevel[0].getNumberOfWalls(); wallCount++)
        {
            image.createGraphics().drawImage(gameLevel[0].obstacles[wallCount].getImage(), gameLevel[0].obstacles[wallCount].getXPos(), gameLevel[0].obstacles[wallCount].getYPos(), null);
        }
        image.createGraphics().drawImage(gameLevel[0].enemies[0].getImage(), gameLevel[0].enemies[0].getXPos(), gameLevel[0].enemies[0].getYPos(), null);
        window.setImage(image);
        window.render();
    }
    
    /*
     * Splash screen
     */
    
    
    /*
     * Title menu
     */
    
    
    /*
     * Credits
     */
    
    public void gameLoop()
    {
        //Player player = new Player(((window.WIDTH / 2) - 16), ((window.HEIGHT / 2) - 16));
        setUpArea(0);
        long elapsedTime;
        final double UPDATE_RATE = 1000/60;
        boolean isPaused = false;
        
        while(true)
        {
            currentTime = gameTime.until(Instant.now(), ChronoUnit.MILLIS);
            elapsedTime = currentTime - startTime;
            if(elapsedTime > UPDATE_RATE)
            {
                startTime = gameTime.until(Instant.now(), ChronoUnit.MILLIS);
                if(isPaused)
                {
                    // Pause menu controls
                    // Go into an inner loop to prevent update?
                }
                else
                {
                    update();
                }
            }
            render();
        }
    }
    
    public static void main(String[] args)
    {
        Game game = new Game();
        // Splash screen
        // Menu
        game.gameLoop();  // From menu
    }
}
