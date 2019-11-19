public class Demo {
    private String message;
    public Demo(String message) {
        this.message = message;
    }

    public String printMessage () {
        System.out.println(this.message);
        return message;
    }
}
