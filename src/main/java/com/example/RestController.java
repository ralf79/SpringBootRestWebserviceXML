package com.example;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

	@RequestMapping(value = "/getDataXML",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_XML_VALUE)
	public @ResponseBody Data getData(@RequestParam(value="name", defaultValue="hyunwoo") String name){
		return new Data(name, 10, "010-37");
	}
	
}
