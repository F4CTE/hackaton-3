package fr.autostopfrance.Autostop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.autostopfrance.Autostop.models.Activity;
import fr.autostopfrance.Autostop.services.ActivityService;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping("activities")
public class ActivityController {
	
	@Autowired
	ActivityService activityService;
	
	
	@GetMapping("/all")
	public List<Activity> findAllActivities(){
		return activityService.findAllActivities();
	}
	
	@GetMapping("/{id}")
	public Activity findActivity(@PathVariable("id") Long id) {
		return activityService.findById(id);
	}
	
	@PostMapping("/create")
	public Activity addActivity(@RequestBody Activity activity) {
		System.out.println("added activity");
		Activity activity1 = activityService.postActivity(activity);
		return activity1;
	}
}
