public class Pizza {
    //todo: add instance variables u made
    //todo: make a constructor that gives the instance variables default values no parameters
    //todo: make a printInfo method
    //todo: in the printInfo, print the instance variables in a readable way

    public String size;
    public boolean pepporoni;
    public int quantity;


    public Pizza (String pSize, boolean pPepporoni, int pQuantity){
        size = pSize;
        pepporoni = pPepporoni;
        quantity = pQuantity;
    }//end constructor
    //todo: make a method called printinfo

    public void printInfo(){
        //todo: use souts to print the instance variables
        System.out.println("large " + size);
        System.out.println("its " + pepporoni + " pizza");
        System.out.println(quantity + " of 4");
    }


}
