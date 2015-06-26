/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Sina Mp
 */
public class Box {

    private int x;
    private int y;
    private int insideObject;
    private boolean isDamaged;
    int mapMatrix[][];

    public Box(int x, int y, int inObject) {
        isDamaged = false;
        this.x = x;
        this.y = y;
        mapMatrix =  new int[13][19];
        this.insideObject = inObject;
    }
    
    public int[][] damage(int mapMx[][]) {
        this.mapMatrix = mapMx;
        isDamaged = true;
        mapMatrix[x][y] = 10 + insideObject;
        return mapMatrix;
    }
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getInsideObject() {
        return insideObject;
    }
}
