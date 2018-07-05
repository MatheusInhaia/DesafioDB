package Utilitarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;



public class TirarFoto {


	public static String capture(WebDriver driver) {
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = "./Relatorio/Fotos/" + source.getName();
       
	    return saveImageFile(source, path);
	}
	
	private static String saveImageFile(File source, String path) {
		try {
	        FileUtils.copyFile(source, new File(path));
	      
	    } catch(IOException ex) {
	    	ObterRelatorio.log(Status.WARNING, "Capture error: " + ex.getMessage());
	    
	    }
	
	    return path.replace("./Relatorio/", "");
	}
}
