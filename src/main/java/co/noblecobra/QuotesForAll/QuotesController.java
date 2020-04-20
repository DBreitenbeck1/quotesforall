package co.noblecobra.QuotesForAll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.noblecobra.QuotesForAll.DAO.QuoteRepository;

@Controller
public class QuotesController {
	
	@Autowired
	QuoteRepository	quoteRepo;
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("home");
	}

}
