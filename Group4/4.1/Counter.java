class Counter
{
    //Declaration of a long instance variable to hold
    // the value of the counter
    
    private long counter = 0;
    /**
     * Return the current value of the counter
     * @return The value of the counter
     */
    
    public long getValue()
    {
        return counter;//Fill in code for the method
    }

    /**
     * Reset the counter to zero
     */
    public void reset()
    {
        counter = 0;//Fill in code for the method
    }

    /**
     * Add 1 to the counter
     */
    public void inc()
    {
        //Fill in code for the method
        counter++;
    }

    /**
     * Subtract 1 from the counter
     */
    public void dec()
    {
        //Fill in code for the method
        counter--;
    }

    /**
     * Add 5 to the counter
     */
    public void add5()
    {
        //Fill in code for the method
        counter = counter +5;
    }

    /**
     * Add 10 to the counter
     */
    public void add10()
    {
        //Fill in code for the method
        for (int i=0;i<=1;i++){
            add5();
        }
    }
}

