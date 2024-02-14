package org.springframework.learnmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author starry
 * @version 1.0
 * @date 2024/1/30 17:09
 * @Description
 */
@Controller
public class TestController {


    @GetMapping("test")
    @ResponseBody
    public String test1(String id) {
        return id + "111";
    }

	@GetMapping("view")
	public String view() {
		return "index";
	}

    @PostMapping("test")
    @ResponseBody
    public String test2() {
        return "222";
    }
}
