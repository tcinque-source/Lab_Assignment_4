abstract class FutureContract {
    String name;
    double underlyingPrice;
    double optionPrice;
    double timeToExpiration; //time is in years
     //parameterized constructor
    public FutureContract(String name, double underlyingPrice, double optionPrice, double timeToExpiration) {
        this.name = name;
        this.underlyingPrice = underlyingPrice;
        this.optionPrice = optionPrice;
        this.timeToExpiration = timeToExpiration;  //time is in years
    }
    //copy constructor
    public FutureContract(FutureContract copy) {
        this.name = copy.name;
        this.underlyingPrice = copy.underlyingPrice;
        this.optionPrice = copy.optionPrice;
        this.timeToExpiration = copy.timeToExpiration;  //time is in years
    }
    
    public abstract double computeImpliedVolatility();
    
    public void displayContract() {
        System.out.println(name);
        System.out.println("Underlying Price: $" + underlyingPrice); //format for currency
        System.out.println("Option Price: $" + optionPrice); //format for currency
        System.out.println("Time to Expiratation: " + timeToExpiration + " years");
    }
}
