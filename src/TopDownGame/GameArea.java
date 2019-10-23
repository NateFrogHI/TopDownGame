package TopDownGame;

import java.awt.Point;

/*
 * File:    GameArea.java
 * Author:  Nathan K. Mitson
 * Date:    
 * Purpose: Store game location constants and return location on playable window
 */

public class GameArea
{
    public static final int TILE_SIZE = 32;
    public static final int TILES_WIDE = 13;
    public static final int TILES_HIGH = 9;
    public static final int LEFT_BOARDER = 2;
    public static final int TOP_BOARDER = 0;
    public static final int PLAY_WIDTH = TILES_WIDE - LEFT_BOARDER;	// 352 Playable size (11 Tiles)
    public static final int PLAY_HEIGHT = TILES_HIGH - TOP_BOARDER;	// 288 Playable size (9 Tiles)
    public static final int WIDTH = TILE_SIZE * TILES_WIDE;    // 416
    public static final int HEIGHT = TILE_SIZE * TILES_HIGH;   // 288
    
    public static Point pos(int xTile, int yTile)
    {
        Point location = new Point(((xTile * TILE_SIZE) + (TILE_SIZE * LEFT_BOARDER)), ((yTile * TILE_SIZE) + (TILE_SIZE * TOP_BOARDER)));
        return location;
    }
    
    public static int xPos(int xTile)
    {
        return ((xTile * TILE_SIZE) + (LEFT_BOARDER * TILE_SIZE));
    }
    public static int yPos(int yTile)
    {
        return ((yTile * TILE_SIZE) + (TOP_BOARDER * TILE_SIZE));
    }
}
