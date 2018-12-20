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

import fr.autostopfrance.Autostop.models.Members;
import fr.autostopfrance.Autostop.services.MembersService;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping("members")
public class MembersController {

    @Autowired
    MembersService membersService;


    @GetMapping("/all")
    public List<Members> findAllMembers(){
        return membersService.findAllMembers();
    }

    @GetMapping("/{id_members}")
    public Members findMembers(@PathVariable("id_members") Long id_members) {
        return membersService.findById(id_members);
    }

    @PostMapping("/create")
    public Members addMembers(@RequestBody Members id_members) {
        System.out.println("added members");
        Members members1 = membersService.postMembers(id_members);
        return members1;
    }
}