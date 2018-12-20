package fr.autostopfrance.Autostop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.autostopfrance.Autostop.models.Activity;
import fr.autostopfrance.Autostop.repositories.ActivitiesDAO;

@Service
public class ActivityService {

	@Autowired
	ActivitiesDAO activitiesDAO;
	
	public List<Activity> findAllActivities(){
		return activitiesDAO.findAll();
	}
	
	public Activity findById(Long id) {
		return activitiesDAO.findById(id).get();
	}

	public Activity postActivity(Activity activity) {
		Activity _activity = activitiesDAO.save(new Activity(
				activity.getId(),
				activity.getSentence()
				));
		return _activity;
	}
	
	
}
