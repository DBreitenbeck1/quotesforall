package co.noblecobra.QuotesForAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.noblecobra.QuotesForAll.DAO.QuoteRepository;

@Controller
public class QuotesController {

	String[] mood = {"Joy", "Love", "Horror", "Sorrow", 
			"Anger", "Hate", "Inspiration", "Wonder", "Wisdom", "Humor"};
	List<String> moods = Arrays.asList(mood);
	
	String[] time = {"Spring", "Winter", 
			"Summer", "Fall"};
	List<String> times = Arrays.asList(time);

	
	@Autowired
	QuoteRepository	quoteRepo;
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("/display")
	public ModelAndView display() {
		ModelAndView mav = new ModelAndView("display");
		return mav;
	}
	
	@RequestMapping("/add")
	public ModelAndView add() {
	
		
		ModelAndView mav = new ModelAndView("add");
		mav.addObject("moods", moods);
		mav.addObject("times", times);
		return mav;
	}
	
	@PostMapping("/addQuote")
	public ModelAndView addQuote() {
		ModelAndView mav = new ModelAndView("add");
		return mav;
	}


}
