/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brickbreaker;

/**
 *
 * @author User
 */
public class MapGenerator {
    public int map[][];
    public int brickWidth, brickHeight;
    
    public MapGenerator(int row, int col){
        for (int[] mapl : map) {
            for (int i = 0; i < map[0].length; i++) {
                mapl[i] = 1;
            }
        }  
        brickWidth =540/col;
        brickHeight = 540/row;
        
    }
    
    public
}
