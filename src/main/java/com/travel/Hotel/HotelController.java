package com.travel.Hotel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//import com.travel.Hotel.dao.HotelDao;

@Controller
public class HotelController {

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/results")
	public ModelAndView listHotel() {
		ModelAndView mv = new ModelAndView("list-hotel");
		
		//mv.addObject("hotel", HotelDao.findByAll());
		return mv;
	}
	
}
