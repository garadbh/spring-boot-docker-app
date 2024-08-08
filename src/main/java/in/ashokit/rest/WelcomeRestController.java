package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	public WelcomeRestController() {
		logger.info("***** WelcomeRestController :: Constructor *****");
	}

	@GetMapping
	public String welcomeMsg() {
		logger.info("***** welcomeMsg() execution start *****");
		String msg = "Welcome to Ashok IT - Software Training Institute (HYD) ..!!";
		logger.info("***** welcomeMsg() execution end *****");
		String s = "hello";
		logger.info("******************************************************************");
		return msg;
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		logger.info("***** greetMsg() execution start *****");
		String msg = "Good Morning, Welcome to Ashok IT";
		System.out.println("testing git collaboration");
		logger.info("***** greetMsg() execution end *****");
		int i = 10;
		logger.info("***** greetMsg() execution successfull *****");
		boolean status = false;
		logger.info("***** ***************************** *****");
		return msg;
	}
	
	//task 1
	public void m1(){
		String str = "stash command testing";
		//logic
	}
	
	//task 2
	public void m2(){
		String str = "task 2 related changes";
		String errorMsg = "fetch command";
		logger.info("****** Conflict code added here to check fetch command ******");
		boolean change = false;
		if(!change){
			int a = 25;
			int b = 35;
			logger.info("*************************************");
			String str = "garad bhushan";
			logger.info("**** fetch command changes not added****");
		}else{
			String surname  = "Garad";
			logger.info("**** fetch command changes added****");
		}
		//logic
	}
	
}
