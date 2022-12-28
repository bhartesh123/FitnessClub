package com.GymManagement.Gym.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/FitnessClub")
public class GymController {
	
	@GetMapping("/expertCoaches")
	private String expertCoaches() {
		String temp="+140";
		System.out.println("Home Launched");
		return temp;
	}
	
	@GetMapping("/members")
	private String members() {
		int temp=1100;
		String members;
		if(temp>1000) {
			members="+"+"1000";
			return members;
		}
		else {
			members=Integer.toString(temp);
			return members;
		}
	}
	
	@GetMapping("/fitnessPrograms")
	private String fittnessPrograms() {
		String fittnessPrograms="50";
		return fittnessPrograms;
	}
}
