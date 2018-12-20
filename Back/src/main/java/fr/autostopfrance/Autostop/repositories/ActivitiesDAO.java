package fr.autostopfrance.Autostop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.autostopfrance.Autostop.models.Activity;

@Repository
public interface ActivitiesDAO extends JpaRepository<Activity, Long>{

}
