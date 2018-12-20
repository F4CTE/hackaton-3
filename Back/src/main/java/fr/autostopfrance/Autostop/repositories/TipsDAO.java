package fr.autostopfrance.Autostop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.autostopfrance.Autostop.models.Tip;

@Repository
public interface TipsDAO extends JpaRepository<Tip, Long> {

}
