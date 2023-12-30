/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;

import java.util.ArrayList;


/**
 *
 * @author krp17
 */
public class FastFoodKitchenSimulation {
    private ArrayList<Order> orderList = new ArrayList<>();    
    
    private static int nextOrderNum = 1;

  


   
    
   /**
    * returns nextOrderNum
    * @return
    */
    public int getnextOrderNum(){
        return this.nextOrderNum;
    }
    
    /**
     * increases nextOrderNum by one
     */
    public static void incrementNextOrderNum(){
        nextOrderNum += 1;
    }

    
    
    /**
     * the constructor  
     * @param orderList 
     */
    public FastFoodKitchenSimulation(){
        Order order1 = new Order(3, 5, 4, 10, true, 1);
        Order order2 = new Order(0, 0, 3, 3, false, 2);
        Order order3 = new Order(1, 1, 0, 2, false, 3);
        Order order4 = new Order(8, 1, 7, 2, false, 4);

        orderList.add(order1);
        incrementNextOrderNum();
        
        orderList.add(order2);
        incrementNextOrderNum();
        
        orderList.add(order3);
        incrementNextOrderNum();
        
        orderList.add(order4);
        incrementNextOrderNum();
    }
    
    /**
     * method to add order
     * @param ham
     * @param cheese
     * @param veggie
     * @param soda
     * @param orderGo
     * @return 
     */
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean orderGo){
        Order newOrder = new Order(ham, cheese, veggie, soda, orderGo, getnextOrderNum());
        orderList.add(newOrder);
        incrementNextOrderNum();
        return newOrder.getorderNum();
       
    }
    
    /**
     * method to cancel order
     * @return 
     */
    public boolean cancelLastOrder(){
        for(Order order: orderList){
            orderList.remove(orderList.size()-1);
            nextOrderNum--;
            return true;
        }
        return false;
    }
    
    /**
     * returns how many more orders to go with 
     * @return 
     */
   public int getNumOrdersPending(){
       return orderList.size();
   }
   
   public boolean isOrderDone(int orderID){
       for(Order order: orderList){
           if(order.getorderNum() == orderID){
               return true;
           }
           
       }
       return false;
   }
   
   public boolean cancelOrder(int orderID){
           for(Order order: orderList){
           if(orderID == order.getorderNum()){
               orderList.remove(orderID);
               return false;
           }
           
       }
           return true;
   }
   
   public int findOrderSeq(int orderID){
            for(Order order: orderList){
            
                if (order.getorderNum() == orderID){
                    return orderList.indexOf(order);
                }
            }
            return -1;
   
   }
   
   /*Order order1 = new Order(3, 5, 4, 10, true, 1);
        Order order2 = new Order(0, 0, 3, 3, false, 2);
        Order order3 = new Order(1, 1, 0, 2, false, 3);
        Order order4 = new Order(8, 1, 7, 2, false, 4);
   */
   

   
   
   public void selectionSort(){
      
       for(int i = 0; i < orderList.size()-1; i++){
           int minIndex = i;
           for(int j = i + 1; j < orderList.size(); j++){
               if(orderList.get(j).getTotalBurgers() < orderList.get(minIndex).getTotalBurgers()){
                   minIndex = j;
               }
               
           }
           Order small = orderList.get(minIndex);
           orderList.set(minIndex, orderList.get(i));
           orderList.set(i, small);
           
       }
   }
   public void insertionSort(){
       
   for (int j = 1; j < orderList.size(); j++)
      {
         Order x = orderList.get(j);
         int possibleIndex = j;
         while((possibleIndex>0) && x.getTotalBurgers() < orderList.get(possibleIndex-1).getTotalBurgers()) {
         {
             orderList.set(possibleIndex,orderList.get(possibleIndex - 1));
            possibleIndex--;
            
        }
         orderList.set(possibleIndex,x);
        
    }
        
      }
  }
   
   public int findOrderBin(int orderID){
       int leftHalf = 0;
       int rightHalf = orderList.size();
       while(leftHalf <= rightHalf){
           int mid = (leftHalf + rightHalf)/2;
           if(orderList.get(mid).getorderNum() == orderID){
               return mid;
           }
           if(orderList.get(mid).getorderNum() < orderID){
               leftHalf = mid +1;
               
           }
           else{
               rightHalf = mid -1;
           }
       }
                  return -1;

       
   }
  /* for (i = 1; i < Array.size(); i++) {
        key.value = Array.get(i).value;
        key.suit = Array.get(i).suit;
        key.faceValue = Array.get(i).faceValue;
        j = i;
        while((j > 0) && (Array.get(j - 1).value > key.value)) {
            Array.set(j,Array.get(j - 1));
            j--;
        }
        Array.set(j,key); */
    

       
       //PART B
   public ArrayList<Order> getOrderList(){
       return orderList;
   }

   
   
/*    public static void doSelectionSort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            // find position of smallest num between (i + 1)th element and last element
            int pos = i;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(pos))
                    pos = j;
            }
            // Swap min (smallest num) to current position on array
            int min = arr.get(pos);
            arr.set(pos, arr.get(i));
            arr.set(i, min);
            printOut(i + 1, arr);
        }
    }
a nested for loop with the outer loop starting at 0 and ending when the index reaches length - 1 (see line 7 below)

the index of the smallest value should start at the outer loop index (see line 9 below)

the inner loop should start at the outer loop index + 1 and loop through the whole array (see line 10 below)

if the value in the array at the index of the inner loop is less than the value at the smallest index then set the smallest index to the index of the inner loop (see lines 12 - 15)

swap the value at the outer loop index and the smallest value (the one at the smallest value index) (see lines 17-19)
   */
   
   
   

}
