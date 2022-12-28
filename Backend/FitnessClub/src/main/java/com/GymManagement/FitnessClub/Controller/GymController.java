package com.GymManagement.FitnessClub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GymManagement.FitnessClub.EntityMongoDb.ClubMemberDetails;
import com.GymManagement.FitnessClub.EntityMongoDb.ExpertCoaches;
import com.GymManagement.FitnessClub.Repo.ClubMembersDetailsRepo;
import com.GymManagement.FitnessClub.Repo.ExpertCoachesRepo;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/FitnessClub")
public class GymController {
	
	@Autowired
	private ExpertCoachesRepo coachesRepo;
	
	@Autowired
	private ClubMembersDetailsRepo clubMembersDetailsRepo;
	
	@PostMapping("/addexpertCoaches")
	private ResponseEntity<?> addExpertCoaches(@RequestBody ExpertCoaches coaches){
		String c_mobile=Long.toString(coaches.getC_mobileNumber());
		if(c_mobile.length()==10) {
			ExpertCoaches save=this.coachesRepo.save(coaches);
			return ResponseEntity.ok(save);
		}
		return (ResponseEntity<?>) ResponseEntity.badRequest().body("Please provide the valid 10 digit Mobile number");
	}
	@GetMapping("/expertCoaches")
	private ResponseEntity<?> getExpertCoaches(){
		return ResponseEntity.ok(this.coachesRepo.count());
	}
	
	@PostMapping("/addMember")
	private ResponseEntity<?> addClubMember(@RequestBody ClubMemberDetails clubMemberDetails){
		String c_mobile=Long.toString(clubMemberDetails.getM_mobileNumber());
		if(c_mobile.length()==10 && clubMemberDetails.getM_emailId()!=null && clubMemberDetails.getM_firstName()!=null
				&& clubMemberDetails.getM_lastName()!=null && clubMemberDetails.getM_gender()!=null) {
			ClubMemberDetails save=this.clubMembersDetailsRepo.save(clubMemberDetails);
			return ResponseEntity.ok(save);
		}
		return (ResponseEntity<?>) ResponseEntity.badRequest().body("Please provide the valid 10 digit Mobile number and also required details");
	}
	
	@GetMapping("/membersCount")
	private ResponseEntity<?> getMembersCount(){
		long count= this.clubMembersDetailsRepo.count();
		//long count = 1009;
//		Need to make a list by Club Membership.
		if(count>500) {
			return ResponseEntity.ok("+"+this.clubMembersDetailsRepo.count());
		}
		return ResponseEntity.ok(this.clubMembersDetailsRepo.count());
		
	}
	
	@GetMapping("/fitnessPrograms")
	private String fittnessPrograms() {
		String fittnessPrograms="50";
		return fittnessPrograms;
	}
}
