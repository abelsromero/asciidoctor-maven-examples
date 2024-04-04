package example.other;

/**
 * This is a Javadoc for {project_name}.
 */
public class NonAsciiDoc {

    /**
     * Adds two integer values.
     * Delegates to {@link Integer#sum(int, int)}.
     *
     * @param value1 first value
     * @param value2 second value
     * @return total value
     */
    public int add(int value1, int value2) {
        return Integer.sum(value1, value2);
    }
}
