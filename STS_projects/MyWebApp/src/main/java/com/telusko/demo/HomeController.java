package com.telusko.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	@RequestMapping("home")
	public ModelAndView home(Alien alien)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		return mv;
	}
	
	
	
	/*@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String myName)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",myName);
		mv.setViewName("home");
		return mv;
	}
	*/
	
	
	
	/*@RequestMapping("home")
	public String home(String name, HttpSession session)
	{
		session.setAttribute("name", name);
		return "home";
	}
	*/
	

	
	
	/*@RequestMapping("home")
	public String home(HttpServletRequest req,HttpServletResponse res)
	{
		String name = req.getParameter("name");
		HttpSession session = req.getSession();
		session.setAttribute("name", name);		
		System.out.println("hi");
		return "home";
	}
	*/
}