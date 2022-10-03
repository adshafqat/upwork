package zaynsolutions.com.upwork;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.lang.Math;
import java.util.concurrent.*;

@RestController
public class UpworkController {
	@GetMapping("/")
	public String returnResponse() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("This is a dummy project. Date:"+dtf.format(now));		
				
		int max = 5;
        	int min = 1;
        	int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min;
		return "This is a test application. Random number vaule is :"+rand+" DateTime:"+dtf.format(now);
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
		System.out.println("This is a test application and slow response method:"+dtf.format(now));
		
		int max = 10;
        	int min = 1;
        	int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min;
		
		if(rand == 1 || rand == 3 || rand == 5 || rand == 7 || rand == 9){
			System.out.println("Going for sleep for 5 secs");
			try {
			    Thread.sleep(5000);
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
			return "This time I am slow. 5 second delay. Random number vaule is :"+rand+" DateTime:"+dtf.format(now);
		}
		else{
			return "This time I am fast. Random number vaule is :"+rand+" DateTime:"+dtf.format(now);
		}
	}
	
	
	@GetMapping("/failureresponse")
	public String returnFailureResponse() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("This is a test application and failure response method:"+dtf.format(now));
		
		int max = 10;
        	int min = 1;
        	int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min;
		
		if(rand == 1 || rand == 3 || rand == 5 || rand == 7 || rand == 9){
			System.out.println("Going for fail this time");
			try {
			    throw new InterruptedException("sorry device error");   
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
			return "This time I am slow. 5 second delay. Random number vaule is :"+rand+" DateTime:"+dtf.format(now);
		}
		else{
			return "This time I am sucessful, but I might fail next time. Random number vaule is :"+rand+" DateTime:"+dtf.format(now);
		}
	}
}
