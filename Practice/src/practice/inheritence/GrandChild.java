package practice.inheritence;

/**
 *
 * @author Nayeem
 */
public class GrandChild extends Child {

    private int id;
    private final String NAME = "grandChild";
    private final String TEXT = "this is from grand child";

    public GrandChild(int id) {
        super(id);
    }

    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild(3);
        grandChild.callMethod();
    }

//    @Override
//    public void callMethod() {
//
//    }
}
