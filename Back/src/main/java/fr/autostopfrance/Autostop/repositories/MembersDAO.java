package fr.autostopfrance.Autostop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.autostopfrance.Autostop.models.Members;

@Repository
public interface MembersDAO extends JpaRepository <Members, Long> {
}