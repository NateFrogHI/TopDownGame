package TopDownGame;

import java.awt.geom.Point2D;

/*
 * File:    GameScreen.java
 * Author:  Nathan K. Mitson
 * Date:    
 * Purpose: 
 */

public class GameScreen
{
    public  int enemyQty;
    public int obstacleQty;
    public Point2D.Double[] enemyPos;
    public Point2D.Double[] obstaclePos;
    public double[] enemyDirection;
    public boolean isOutside;
    
    public GameScreen(int area, int xTile, int yTile)
    {
        switch(area)
        {
            case 0:
                isOutside = true;
                switch(xTile)
                {
                    case 0:
                        switch(yTile)
                        {
                            case 0:
                                enemyQty = 2;
                                obstacleQty = 21;
                                enemyPos = new Point2D.Double[enemyQty];
                                obstaclePos = new Point2D.Double[obstacleQty];
                                enemyDirection = new double[enemyQty];
                                enemyPos[0] = new Point2D.Double(GameArea.xPos(3), GameArea.yPos(1));
                                enemyPos[0] = new Point2D.Double(GameArea.xPos(7), GameArea.yPos(6));
                                obstaclePos[0] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(0));
                                obstaclePos[1] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(1));
                                obstaclePos[2] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(2));
                                obstaclePos[3] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(3));
                                obstaclePos[4] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(4));
                                obstaclePos[5] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(5));
                                obstaclePos[6] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(6));
                                obstaclePos[7] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(7));
                                obstaclePos[8] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(8));
                                obstaclePos[9] = new Point2D.Double(GameArea.xPos(1),GameArea.yPos(8));
                                obstaclePos[10] = new Point2D.Double(GameArea.xPos(2),GameArea.yPos(0));
                                obstaclePos[11] = new Point2D.Double(GameArea.xPos(3),GameArea.yPos(0));
                                obstaclePos[12] = new Point2D.Double(GameArea.xPos(4),GameArea.yPos(0));
                                obstaclePos[13] = new Point2D.Double(GameArea.xPos(5),GameArea.yPos(0));
                                obstaclePos[14] = new Point2D.Double(GameArea.xPos(6),GameArea.yPos(0));
                                obstaclePos[15] = new Point2D.Double(GameArea.xPos(7),GameArea.yPos(0));
                                obstaclePos[16] = new Point2D.Double(GameArea.xPos(8),GameArea.yPos(0));
                                obstaclePos[17] = new Point2D.Double(GameArea.xPos(9),GameArea.yPos(0));
                                obstaclePos[18] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(0));
                                obstaclePos[19] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(8));
                                obstaclePos[20] = new Point2D.Double(GameArea.xPos(5), GameArea.yPos(4));
                                enemyDirection[0] = 315;
                                enemyDirection[0] = 45;
                                break;
                            case 1:
                                enemyQty = 1;
                                obstacleQty = 21;
                                enemyPos = new Point2D.Double[enemyQty];
                                obstaclePos = new Point2D.Double[obstacleQty];
                                enemyDirection = new double[enemyQty];
                                enemyPos[0] = new Point2D.Double(GameArea.xPos(3), GameArea.yPos(1));
                                obstaclePos[0] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(0));
                                obstaclePos[1] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(1));
                                obstaclePos[2] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(2));
                                obstaclePos[3] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(3));
                                obstaclePos[4] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(4));
                                obstaclePos[5] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(5));
                                obstaclePos[6] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(6));
                                obstaclePos[7] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(7));
                                obstaclePos[8] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(8));
                                obstaclePos[9] = new Point2D.Double(GameArea.xPos(1),GameArea.yPos(8));
                                obstaclePos[10] = new Point2D.Double(GameArea.xPos(2),GameArea.yPos(8));
                                obstaclePos[11] = new Point2D.Double(GameArea.xPos(3),GameArea.yPos(8));
                                obstaclePos[12] = new Point2D.Double(GameArea.xPos(4),GameArea.yPos(8));
                                obstaclePos[13] = new Point2D.Double(GameArea.xPos(5),GameArea.yPos(8));
                                obstaclePos[14] = new Point2D.Double(GameArea.xPos(6),GameArea.yPos(8));
                                obstaclePos[15] = new Point2D.Double(GameArea.xPos(7),GameArea.yPos(8));
                                obstaclePos[16] = new Point2D.Double(GameArea.xPos(8),GameArea.yPos(8));
                                obstaclePos[17] = new Point2D.Double(GameArea.xPos(9),GameArea.yPos(8));
                                obstaclePos[18] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(8));
                                obstaclePos[19] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(0));
                                obstaclePos[20] = new Point2D.Double(GameArea.xPos(5), GameArea.yPos(4));
                                enemyDirection[0] = 315;
                                break;
                        }
                    break;
                    case 1:
                        switch(yTile)
                        {
                            case 0:
                                enemyQty = 1;
                                obstacleQty = 21;
                                enemyPos = new Point2D.Double[enemyQty];
                                obstaclePos = new Point2D.Double[obstacleQty];
                                enemyDirection = new double[enemyQty];
                                enemyPos[0] = new Point2D.Double(GameArea.xPos(3), GameArea.yPos(1));
                                obstaclePos[1] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(1));
                                obstaclePos[2] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(2));
                                obstaclePos[3] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(3));
                                obstaclePos[4] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(4));
                                obstaclePos[5] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(5));
                                obstaclePos[6] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(6));
                                obstaclePos[7] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(7));
                                obstaclePos[8] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(8));
                                obstaclePos[0] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(0));
                                obstaclePos[9] = new Point2D.Double(GameArea.xPos(1),GameArea.yPos(0));
                                obstaclePos[10] = new Point2D.Double(GameArea.xPos(2),GameArea.yPos(0));
                                obstaclePos[11] = new Point2D.Double(GameArea.xPos(3),GameArea.yPos(0));
                                obstaclePos[12] = new Point2D.Double(GameArea.xPos(4),GameArea.yPos(0));
                                obstaclePos[13] = new Point2D.Double(GameArea.xPos(5),GameArea.yPos(0));
                                obstaclePos[14] = new Point2D.Double(GameArea.xPos(6),GameArea.yPos(0));
                                obstaclePos[15] = new Point2D.Double(GameArea.xPos(7),GameArea.yPos(0));
                                obstaclePos[16] = new Point2D.Double(GameArea.xPos(8),GameArea.yPos(0));
                                obstaclePos[17] = new Point2D.Double(GameArea.xPos(9),GameArea.yPos(0));
                                obstaclePos[18] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(0));
                                obstaclePos[19] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(8));
                                obstaclePos[20] = new Point2D.Double(GameArea.xPos(5), GameArea.yPos(4));
                                enemyDirection[0] = 315;
                                break;
                            case 1:
                                enemyQty = 1;
                                obstacleQty = 21;
                                enemyPos = new Point2D.Double[enemyQty];
                                obstaclePos = new Point2D.Double[obstacleQty];
                                enemyDirection = new double[enemyQty];
                                enemyPos[0] = new Point2D.Double(GameArea.xPos(3), GameArea.yPos(1));
                                obstaclePos[0] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(0));
                                obstaclePos[1] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(1));
                                obstaclePos[2] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(2));
                                obstaclePos[3] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(3));
                                obstaclePos[4] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(4));
                                obstaclePos[5] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(5));
                                obstaclePos[6] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(6));
                                obstaclePos[7] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(7));
                                obstaclePos[8] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(8));
                                obstaclePos[9] = new Point2D.Double(GameArea.xPos(1),GameArea.yPos(8));
                                obstaclePos[10] = new Point2D.Double(GameArea.xPos(2),GameArea.yPos(8));
                                obstaclePos[11] = new Point2D.Double(GameArea.xPos(3),GameArea.yPos(8));
                                obstaclePos[12] = new Point2D.Double(GameArea.xPos(4),GameArea.yPos(8));
                                obstaclePos[13] = new Point2D.Double(GameArea.xPos(5),GameArea.yPos(8));
                                obstaclePos[14] = new Point2D.Double(GameArea.xPos(6),GameArea.yPos(8));
                                obstaclePos[15] = new Point2D.Double(GameArea.xPos(7),GameArea.yPos(8));
                                obstaclePos[16] = new Point2D.Double(GameArea.xPos(8),GameArea.yPos(8));
                                obstaclePos[17] = new Point2D.Double(GameArea.xPos(9),GameArea.yPos(8));
                                obstaclePos[18] = new Point2D.Double(GameArea.xPos(10),GameArea.yPos(8));
                                obstaclePos[19] = new Point2D.Double(GameArea.xPos(0),GameArea.yPos(0));
                                obstaclePos[20] = new Point2D.Double(GameArea.xPos(5), GameArea.yPos(4));
                                enemyDirection[0] = 315;
                                break;
                        }
                    break;
                }
                break;
            case 1:
                isOutside = false;
                switch(yTile)
                {
                    case 0:
                    case 1:
                }
            default:
                isOutside = false;
                enemyQty = 0;
                obstacleQty = 0;
                enemyPos = new Point2D.Double[enemyQty];
                obstaclePos = new Point2D.Double[obstacleQty];
                enemyDirection = new double[enemyQty];
                break;
        }
    }
}
