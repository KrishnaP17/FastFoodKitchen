/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;

/**
 *
 * @author krp17
 */
public class Order {
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    
    
    private boolean orderToGo = false;
    
    private int orderNum = 7;
    
    //constructor
    public Order(int ham, int cheese, int veggie, int soda, boolean orderGo, int orNum){
        this.numHamburgers = ham;
        this.numCheeseburgers = cheese;
        this.numVeggieburgers = veggie;
        this.numSodas = soda;
        this.orderToGo = orderGo;
        this.orderNum = orNum;
    }
    
    
    public int getnumHamburgers(){
        return this.numHamburgers;
    }
    
    public int getnumCheeseburgers(){
        return this.numCheeseburgers;
    }
    
    public int getnumVeggieburgers(){
        return this.numVeggieburgers;
    }
    
    public int getnumSodas(){
        return this.numSodas;
    }
    
    public boolean isOrderToGo(){
        return this.orderToGo;
    }
    
    public int getorderNum(){
        return this.orderNum;
    }
    
    //public void setName(String nam) {
    //this.name = nam; // Set the name of the current Candle object
    
    public void setnumHamburgers(int ham){
        if(ham < 0){
            System.out.println("Error");
            //System.out.println(numHamburgers);
        }
        else{
            this.numHamburgers = ham; 
        } 
    }
    
    public void setnumCheeseburgers(int cheese){
        if(cheese < 0){
            System.out.println("Error");
            //System.out.println(numHamburgers);
        }
        else{
            this.numCheeseburgers = cheese; 
        } 
    }
    
    public void setnumVeggieburgers(int veggie){
        if(veggie < 0){
            System.out.println("Error");
            //System.out.println(numHamburgers);
        }
        else{
            this.numVeggieburgers = veggie; 
        } 
    }
    
    public void setnumSodas(int soda){
        if(soda < 0){
            System.out.println("Error");
            //System.out.println(numHamburgers);
        }
        else{
            this.numSodas = soda; 
        } 
    }
    
    public void setorderToGo(boolean orderGo){
        this.orderToGo = orderGo; 
    }
    
    public void setorderNum(int orNum){
        this.orderNum = orNum;
    }
    
      public int getTotalBurgers(){
            
                //if (burgerList.getorderNum() == orderID){
                    int totalBurgers = this.numHamburgers + this.numCheeseburgers + this.numVeggieburgers;
                    return totalBurgers;
                
       
   }
    
}
