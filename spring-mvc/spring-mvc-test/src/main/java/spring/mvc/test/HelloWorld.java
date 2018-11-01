package spring.mvc.test;

/**
 * sdfdsdsf
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * 你好，我是周伟
     */
    public void getMessage() {
        System.out.println("Your Message : " + message);
        System.out.println("message = " + message);
        HelloWorld helloWorld = new HelloWorld();

    }

}
