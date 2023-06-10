package utilities;

public class UtilTest {
    public static void main(String[] args) {
        Driver.getDriver().get("https://amazon.com");
        System.out.println(Driver.getDriver().getTitle());
        ApplicationFlow.pause(500);
        ApplicationFlow.scroll(800);
        ApplicationFlow.pause(500);
        ApplicationFlow.scroll(800);
        ApplicationFlow.pause(500);
        ApplicationFlow.scroll(800);
        Driver.getDriver().quit();
    }
}