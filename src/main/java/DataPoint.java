/**
 * REVISION HISTORY
 * =============================================================================
 * 1-24-2023 - Created class, default constructor, parameterized constructor,
 * private class members.
 */
public abstract class DataPoint {

    protected String attributes;

    /**
     * Default constructor
     */
    protected DataPoint() {
        this("NONE ASSIGNED");
    }

    /**
     * Parameterized Constructor
     * @param attributes data flags
     */
    protected DataPoint(String attributes) {
        this.attributes = attributes;
    }

    public String toString() {
        return String.format("Flags: %s", attributes);
    }
}
