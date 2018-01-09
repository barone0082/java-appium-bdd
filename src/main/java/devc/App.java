package devc;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

/**
 * Hello world!
 *
 */
public class App 
{
    public  WebDriver conex() 
    {
    	File diretorioAplicacao = new File("C:\\apk");
    	File arquivoAplicacao = new File(diretorioAplicacao, "centauro.apk");
    
    	DesiredCapabilities capacidade = new DesiredCapabilities();
    	capacidade.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
    	capacidade.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
    	capacidade.setCapability(MobileCapabilityType.APP, arquivoAplicacao.getAbsolutePath());
    	capacidade.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,3600);
    	
    	
    	AndroidDriver driver = null;
		try {
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capacidade);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	return driver;
    	
    
    }
    
    
    public WebDriverWait esperar(WebDriver driver){
    	
    	WebDriverWait wait = new WebDriverWait(driver,30);
    	
    	
    	
    	
    	
		return wait;
    	
    	
    	
    }
    
    
    
    
    
}
