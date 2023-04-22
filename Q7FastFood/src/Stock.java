/*
 * Operating Systems - Universite de Fribourg
 * 
 * Practical #3: an introduction to threads and synchronization in Java
 * 
 * Do not forget to indicate with comments inside the code the 
 * modifications you have made and what problems they fix or 
 * prevent, with references to the questions of the subject (Q1, Q2, etc.)
 */

/**
 * Objects of class Stock represent a set of food. Food is not effectively stored,
 * only a counter is used to represent how much food is available.
 * 
 * It could be possible to use a more realistic queue (FIFO) for the Stock representation.
 * This is left as an exercise for home work. *
 */
class Stock {
	/**
	 * Amount of food
	 */
    private int nbFood;
    /**
     * Maximum amount of food
     */
    private int maxNbFood;
    /**
     * Name of the stock
     */
    private String name;

    /**
     * Creates a new Stock object (initial stock)
     * @param name its name
     * @param nbFood initial number of food
     */
    public Stock(String name, int nbFood) {
        this.nbFood = nbFood;
        this.maxNbFood = nbFood;
        this.name = name;
    }

    /**
     * Creates a new Stock object (intermediary and final stock)
     * @param name its name
     * @param nbFood initial number of food
     * @param maxNbFood maximal amount of food allowed
     */
    public Stock(String name, int nbFood, int maxNbFood) {
        this.nbFood = nbFood;
        this.maxNbFood = maxNbFood;
        this.name = name;
    }

    // Q3 method to get stock name
    public String getName() {
        return name;
    }

    // Q3 method to get stock # of food
    public int getNbFood() {
        return nbFood;
    }

    public boolean isAtCapacity() {
        if (maxNbFood <= nbFood) {
            return true;
        } return false;
    }

    public boolean isEmpty() {
        if (nbFood > 0) {
            return false;
        } return true;
    }
    /**
     * Adds food
     */
    public synchronized void put() {
        nbFood++;
    }

    /**
     * Removes (takes) food
     */
    public synchronized void get() {
        nbFood--;
    }

    /**
     * Display the stock status
     */
    public void display() {
        System.out.println("The stock " + name + " contains " + nbFood + " food.");
    }

    /** 
     * "Unit test" for class Stock
     * @param args not used
     */
    static public void main(String[] args) {
        Stock stock = new Stock("test", 5);
        stock.put();
        stock.display();
        stock.get();
        stock.display();
    }
}
