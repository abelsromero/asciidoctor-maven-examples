package example;

/**
 * Class comment for "{project_description}".
 */
public class StringUtils {

    /**
     * This is a method comment ({my-attribute}).
     * Delegates to {@link Integer#sum(int, int)}.
     *
     * @param haystack the haystack
     * @param needle   it stings
     * @return true if lucky
     */
    public boolean contains(String haystack, String needle) {
        return haystack.contains(needle);
    }

    /**
     * Join strings.
     *
     * @param first  left part
     * @param second right part
     * @return true if lucky
     */
    public String concat(String first, String second) {
        return first + second;
    }
}
