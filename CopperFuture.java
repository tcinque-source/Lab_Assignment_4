class CopperFuture extends FutureContract {
    public CopperFuture() {
        super("Copper", 50.0, 35.0, 2.0); //name underlyingPrice, optionPrice, timeToExpiration
    }
    @Override 
    public double computeImpliedVolatility() { //no super for this method
        System.out.println("Computing Copper...");
        return Math.random();
    }
    
}
