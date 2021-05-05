package com.courierCompany.com.project.courierCompany;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Date : 2021-05-04
 * 
 * @author AysegulBulur
 * @version 1.0
 */
@Controller
public class MessageController {
	
	/*
	 * Data is received with @Controller.
	 * @GetMapping is used to map HTTP GET requests. --->  welcome page
	 * The welcome method provides the communication of data between the web page and the backend.
	 * @return welcome presents the data (model) in the view welcome.jsp.
	 * Logger is used for logging. Outputs are given according to the logs created.
	 * */
	
	Logger logger = LoggerFactory.getLogger(MessageController.class);

	/**
	 * @param model : Uses the model class
	 * @return Return the Operations.jsp page
	 */
	@GetMapping("/Operations") // .../Operations When a request is sent to the url, the welcome function will run.
	public String welcome(Model model){
		model.addAttribute("message", "Welcome");
        
		return "Operations";	//Returns Operations view
	}

}
