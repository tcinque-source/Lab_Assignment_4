public class FuturesTest {
    public static void main (String[] args) {

        GoldFuture goldContract = new GoldFuture();
        goldContract.displayContract();
        double goldVolality = goldContract.computeImpliedVolatility();
        System.out.println(goldVolality);
        System.out.println();
        
        //Copper
        CopperFuture copperContract = new CopperFuture();
        copperContract.displayContract();
        double copperVolality = copperContract.computeImpliedVolatility();
        System.out.println(copperVolality);
        System.out.println();
        
        //Coffee
        CoffeeFuture coffeeContract = new CoffeeFuture();
        coffeeContract.displayContract();
        double coffeeVolatility = coffeeContract.computeImpliedVolatility();
        System.out.println(coffeeVolatility);
        System.out.println();
        
        //GoldFuture goldCopy = new GoldFuture(copy);
        //No idea why that doesn't work
}
}
