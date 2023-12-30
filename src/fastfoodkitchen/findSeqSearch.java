/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;

import java.util.Scanner;

/**
 *
 * @author krp17
 */
public class findSeqSearch {
        public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

        //int orderID = 4;
        FastFoodKitchenSimulation kitchen = new FastFoodKitchenSimulation();
        
        int orderPosition = kitchen.findOrderSeq(2);
        System.out.println("Using sequential search >> order position is " + orderPosition);
        
        
}
}
