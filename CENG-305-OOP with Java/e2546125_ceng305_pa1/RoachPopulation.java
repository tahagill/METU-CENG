/**
 * Represents a population of roaches that can breed and be affected by insecticide spray.
 * This class keeps track of the roach population size and provides methods for breeding,
 * spraying with insecticide, and getting the current population size.
 */
public class RoachPopulation {

    /** The current population size of roaches. */
    private int population;

    /**
     * Constructs a RoachPopulation object with the given initial population size.
     *
     * @param initialPopulation The initial population size of roaches.
     */
    public RoachPopulation(int initialPopulation) {
        this.population = initialPopulation;
    }

    /**
     * Simulates breeding, doubling the roach population.
     */
    public void breed() {
        this.population *= 2;
    }

    /**
     * Simulates spraying insecticide, reducing the roach population by a given percentage.
     *
     * @param sprayPercentage The percentage of the population to be reduced by insecticide spray.
     */
    public void spray(double sprayPercentage) {
        double reduction = this.population * sprayPercentage / 100;
        this.population -= reduction;
    }

    /**
     * Gets the current population size of roaches.
     *
     * @return The current population size of roaches.
     */
    public int getRoaches() {
        return this.population;
    }
}
