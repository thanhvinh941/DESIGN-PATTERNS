public class SingletonPatternDemo {
    public static void main(String[] args) {

        // create new object thông qua public method getInstance
        SingleObject object = SingleObject.getInstance();
        object.check();
    }
}
