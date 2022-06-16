package zaynsolutions.com.upwork;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

@RestController
public class UpworkController {
	@GetMapping("/")
	public String returnResponse() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("This is a dummy project for upwork demo. Date:"+dtf.format(now));
		return "This is a dummy project for upwork demo. DateTime:"+dtf.format(now);
	}
}
