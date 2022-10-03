package zaynsolutions.com.upwork;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.lang.Math;

@RestController
public class UpworkController {
	@GetMapping("/")
	public String returnResponse() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("This is a dummy project for upwork demo. Date:"+dtf.format(now));
		return "This is a dummy project for upwork demo. DateTime:"+dtf.format(now);
	}

	@GetMapping("/alwaysup")
	public String returnUpResponse() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("This is a dummy project for upwork demo. Date:"+dtf.format(now));
		return "I am returning a sucess response. DateTime:"+dtf.format(now);
	}
	
	
	@GetMapping("/slowresponse")
	public String returnSlowResponse() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("This is a test application:"+dtf.format(now));
		
		int max = 5;
        	int min = 1;
        	int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min;
		return "This is a test application. Random number vaule is :"+rand+" DateTime:"+dtf.format(now);
		
	}
}
