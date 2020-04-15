public class TestClassName {
    private static ClassName className;

    public static String[] validateClass = {"C0318G", "P0234221_1H"};
    public static String[] invalidateClass = {"M0318G", "P0323A", "!dsc1D"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String Class : validateClass) {
            System.out.println(Class +" is validate name : "+className.validate(Class));
        }

        for (String Class : invalidateClass) {
            System.out.println(Class +" is validate name : "+className.validate(Class));
        }
    }
}
