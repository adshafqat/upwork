package zaynsolutions.com.upwork;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.lang.Math;
import java.util.concurrent.*;

@RestController
public class UpworkAPIController {

	@GetMapping("/apialwaysup")
	public String returnApiUpResponse() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("This is a test application and always up response method. Date:"+dtf.format(now));
		return "I am returning a sucess response. DateTime:"+dtf.format(now);
	}
	
	
	@GetMapping("/apislowresponse")
	public String returnApiSlowResponse() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("This is a test application and slow response method:"+dtf.format(now));
		
		int max = 10;
        	int min = 1;
        	int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min;
		
		if(rand == 1 || rand == 3 || rand == 5 || rand == 7 || rand == 9){
			System.out.println("Going to sleep for 5 secs");
			try {
			    Thread.sleep(5000);
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
			return "This time I am slow. 5 second delay. Random number value is :"+rand+" DateTime:"+dtf.format(now);
		}
		else{
			return "This time I am fast. Random number value is :"+rand+" DateTime:"+dtf.format(now);
		}
	}
	
	
	@GetMapping("/apifailureresponse")
	public ResponseEntity<String>  returnApiFailureResponse() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("This is a test application and failure response method:"+dtf.format(now));
		
		int max = 10;
        	int min = 1;
        	int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min;
		
		if(rand == 1 || rand == 3 || rand == 5 || rand == 7 || rand == 9){
			System.out.println("Going to fail this time");

			return new ResponseEntity<>("This time I am returning failure HttpStatus.UNAUTHORIZED Code. Random number value is :"+rand+" DateTime:"+dtf.format(now), HttpStatus.UNAUTHORIZED);
		}
		else{
			return new ResponseEntity<>("This time I am returning Success Response. Random number value is :"+rand+" DateTime:"+dtf.format(now), HttpStatus.OK);
		}
	}
}
