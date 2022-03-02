public class Bag {
    private int weight;

    public Bag(int weight) throws Exception {
        if (weight <= 0) {
            throw new Exception("bag must have a weight");
        }
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    // // use exception to validate weight of bag, see try()/catch()
    // try {
    //     Bag bag = new Bag(16);
    //     // no error if we made it this far
    // }catch(Exception e) {
    //     // handle error
    // }
}
