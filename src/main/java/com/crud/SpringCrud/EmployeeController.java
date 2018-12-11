package com.crud.SpringCrud;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@RequestMapping(value="/empsave", method=RequestMethod.POST)
	public ModelAndView addEmployee(HttpServletRequest request, HttpServletResponse response) {
		int id=(Integer.parseInt(request.getParameter("id")));
		String name=request.getParameter("name");
		String city=request.getParameter("city");		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("success.jsp");
		mv.addObject("result",  " your name " + name+" you are from " +city);
		
		return mv;
	}

}
