import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Demo {

    public static void main(String[] args){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\phantomjs\\bin\\phantomjs.exe");

        WebDriver driver = new PhantomJSDriver(caps);
        driver.get("http://en.wikipedia.org");
        System.out.println("Page title" + driver.getTitle());

    }
}
