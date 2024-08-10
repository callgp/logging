package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestCController {
	
	private Logger logger=LoggerFactory.getLogger(MsgRestCController.class);
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		logger.info("execution started");
		String msg="hiii";
		logger.info("execution ended");
		return msg;
		
	}

}
