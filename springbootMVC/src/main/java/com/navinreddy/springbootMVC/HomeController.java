package com.navinreddy.springbootMVC;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.navinreddy.springbootMVC.Model.Alien;

@Controller
public class HomeController {

	@Autowired
	AlienRepo repo;
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name", "Aliens1");
	}
	
	
	@RequestMapping("/home")
	public String Home()
	{
		//System.out.println("home page requested");
		return "index";
	}
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j)
	{
//		int i=Integer.parseInt(req.getParameter("num1"));
//		int j=Integer.parseInt(req.getParameter("num2"));
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result");
		int num3=i+j;
		mv.addObject("num3", num3);
		return mv;
		
//		HttpSession session=req.getSession();
//		session.setAttribute("num3", num3);
//		return "result.jsp";
		
	}
	/*@RequestMapping("/addAlien")
	public String addAlien(@RequestParam("aid") int aid,@RequestParam("aname") String aname,Model m)
	{
		Alien a=new Alien();
		a.setAid(aid);
		a.setAname(aname);
		m.addAttribute("alien", a);
		
		return "result";
		
	}*/
	@RequestMapping(value="/addAlien",method=RequestMethod.GET)
	public String addAlien(@ModelAttribute Alien a)
	{
		
		return "result";
	}
	@GetMapping("/getAliens")
	public String getAliens(Model m)
	{
		//List<Alien> aliens=Arrays.asList(new Alien(101,"diti"),new Alien(102,"sukanta"));
		m.addAttribute("result",repo.findAll());
		return "showAliens";
	}
	@GetMapping("/getAlienByName")
	public String getAlienByName(@RequestParam String aname,Model m)
	{
		//List<Alien> aliens=Arrays.asList(new Alien(101,"diti"),new Alien(102,"sukanta"));
		m.addAttribute("result",repo.findByAname(aname));
		return "showAliens";
	}
	
	
	
}
