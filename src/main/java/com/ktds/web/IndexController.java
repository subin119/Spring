package com.ktds.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ktds.service.IndexService;

//Annotation
@Controller
public class IndexController {
	
	private IndexService IndexService;
	
	public void setIndexService(IndexService indexService) {
		IndexService = indexService;
	}

	//http://localhost:8080/HelloMVC/로 접속하면 실행된다.
	@RequestMapping("/")
	public String viewIndexPage() {
		
		// /WEB-INF/view/index.jsp
		return "index";
	}
	
	@RequestMapping("/sub")
	public ModelAndView viewSubPage() {
		//page를 지정하는 두번째 방법
		ModelAndView view = new ModelAndView("sub");
		
		//page를 지정하는 첫번째 방법
		view.setViewName("sub");
		
		//Servlet의 request.setAttribute(k,v); 와 같다.
		view.addObject("key1","value1");
		view.addObject("key2","value2");
		view.addObject("key3","value3");
		view.addObject("key4","value4");
		
		return view;
	}

	@RequestMapping("/param")
	public ModelAndView viewParamPage(@RequestParam(required=false, defaultValue="") String param) {
		
		System.out.println(param);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("param");
		view.addObject("param1",param);
		return view;
	}
}
