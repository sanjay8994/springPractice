package com.dgft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dgft.model.RegModel;
import com.dgft.repository.RegDAO;


@Controller
public class RegController {

	@Autowired
	RegDAO regdao;
	
	@RequestMapping(value="/")
	public String getStart()
	{
		System.out.println("root controller is invoked.");
		return "index1";	
	}
	
	@RequestMapping(value="/reg")
	public String userRegJsp()
	{
		//ModelAndView mv =new ModelAndView("userLogin");
		return "userReg"; 	
	}
	
	//public ModelAndView userReg(@ModelAttribute("regmod") RegModel regmod )

	@RequestMapping(value="/userRegistr" ,method=RequestMethod.POST)
	public ModelAndView userReg(@RequestParam("uname") String name,@RequestParam("email") String email )
	{
		System.out.println("userRegistr is called");
	        
		RegModel mod=new RegModel();
		mod.setUname(name);
		mod.setEmail(email);
		
		regdao.save(mod);
		
		System.out.println("Username is "+name);
		System.out.println("email is "+email);
		
		ModelAndView mv =new ModelAndView("regSuccessful");				
		return mv; 	
	}
	
	
	@RequestMapping(value="/login")
	public String userLogin()
	{
		//ModelAndView mv =new ModelAndView("userReg");
		return "userLogin"; 	
	}
	
}
