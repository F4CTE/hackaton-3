package fr.autostopfrance.Autostop.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.autostopfrance.Autostop.controllers.ActivityController;
import fr.autostopfrance.Autostop.models.Activity;
import fr.autostopfrance.Autostop.repositories.ActivitiesDAO;

@Component
public class ActivityCommandRunner implements CommandLineRunner {

	private final ActivitiesDAO activitiesRepository;
	@Autowired
	public ActivityController activityController;
	public ActivityCommandRunner(ActivitiesDAO activitiesRepository, ActivityController activityController) {
		
		this.activitiesRepository = activitiesRepository;
	}
	
    private Logger log = LoggerFactory.getLogger("Wilder");

	
	@Override
	public void run(String... strings) throws Exception {
		activitiesRepository.save((new Activity(1L,"https://imgur.com/gallery/TH1CBeg", "Faire du ping pong")));
		activitiesRepository.save((new Activity(2L,"https://imgur.com/gallery/B2r6JJH", "Faire du ping pong")));
	}
	
}
