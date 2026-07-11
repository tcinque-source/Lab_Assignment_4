class CoffeeFuture extends FutureContract {
    public CoffeeFuture() {
        super("Coffee", 30.0, 20.0, 1.0); //name underlyingPrice, optionPrice, timeToExpiration
    }
    @Override 
    public double computeImpliedVolatility() { //no super for this method
        System.out.println("Computing Coffee...");
        return Math.random();
    }
    
}
