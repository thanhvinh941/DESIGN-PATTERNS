public class SingleObject {

    private  static SingleObject instance = new SingleObject();
    private SingleObject() {
    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void check(){
        System.out.println("Create object thành công!");
    }
}
