package com.telusko.demo.controller;



import org.springframework.stereotype.Controller;


import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;

@Controller
public class AlienController
{
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/aliens")
	@ResponseBody
	public List<Alien> getAliens()
	{
		return repo.findAll();
		
		
	}
	
	
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid")int aid)
	{
		return repo.findById(aid);
		
		
	}
}



/*
@Controller
public class AlienController
{
	@Autowired
	AlienRepo repo;        // this is used to create obj of type AienRepo Interface

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien1(@RequestParam int aid)
	{
		ModelAndView mv=new ModelAndView("showAlien.jsp");
		Alien alien=repo.findById(aid).orElse(new Alien());
		
		//System.out.println(repo.findByTech("Java"));
		//System.out.println(repo.findByAidGreaterThan(101));
		//System.out.println(repo.findByTechSorted("Java"));
		mv.addObject(alien);
		return mv;
	}
	
	@RequestMapping("/aliens")
	@ResponseBody
	public List<Alien> getAliens11()
	{
		return repo.findAll();
		
		
	}
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid")int aid)
	{
		return repo.findById(aid);
		
		
	}
	
	
}

*/