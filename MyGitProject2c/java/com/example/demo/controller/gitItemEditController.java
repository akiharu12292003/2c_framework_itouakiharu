package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class gitItemEditController {
	// 最初のページ
		@RequestMapping(path = "/gititemedit", method = RequestMethod.GET)
	    public String doEditGet() {
	        return "gititemedit";
	    }
		// ボタン押したとき
				@RequestMapping(path = "/gititemedit", method = RequestMethod.POST)
			    public String doEdiPost() {
			        return "gititemedit";
			    }
}
