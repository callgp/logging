package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestCController2 {
	
	private Logger logger=LoggerFactory.getLogger(UserRestCController2.class);
	@GetMapping("/contact")
	
	public String getInfo() {
		logger.trace("execution trce started");
		logger.debug("execution debug started");
		logger.info("execution info started");
		String msg="info...12333";
		logger.warn("execution warn ended");
		logger.error("execution err ended");
		return msg;
		
	}

}
