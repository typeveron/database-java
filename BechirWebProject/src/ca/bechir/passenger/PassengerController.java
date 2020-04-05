package ca.bechir.passenger;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PassengerController {
	
	@Autowired
	private PassengerService service;
	
	@RequestMapping("/")
	public ModelAndView home( ) {
		ModelAndView mav = new ModelAndView("index");
		
		List<Passenger> listPassenger = service.listAll();
		mav.addObject("message", listPassenger);
		return mav;
		
	}
	
	//new passenger
	@RequestMapping("/new")
	public String newPassengerForm(Map<String,Object> model) {
		model.put("passenger", new Passenger());
		return "new_passenger";
	}
	
	//save
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String savePassenger(@ModelAttribute("passenger") Passenger passenger) {
		service.save(passenger);
		return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editPassengerForm(@RequestParam long id) {
		ModelAndView mav = new ModelAndView("edit_passenger");
		Passenger passenger = service.get(id);
		mav.addObject("passenger", passenger);
		return mav;
	}
	
	@RequestMapping("/delete")
	public String deletePassenger(@RequestParam long id) {
		service.delete(id);
		return "redirect:/";
	}
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword) {
		ModelAndView mav = new ModelAndView("search");
		List<Passenger> result = service.search(keyword);
		mav.addObject("result", result);
		return mav;
	}
}
