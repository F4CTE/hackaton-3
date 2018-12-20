package fr.autostopfrance.Autostop.services;

import java.util.List;

import fr.autostopfrance.Autostop.models.Members;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.autostopfrance.Autostop.repositories.MembersDAO;

@Service
public class MembersService {

    @Autowired
    MembersDAO membersDAO;

    public List<Members> findAllMembers(){
        return membersDAO.findAll();
    }

    public Members findById(Long id_members) {
        return membersDAO.findById(id_members).get();
    }

    public Members postMembers(Members members) {
        Members _members = membersDAO.save(new Members(
                members.getId(),
                members.getId_members(),
                members.getEmail()
        ));
        return _members;
    }


}