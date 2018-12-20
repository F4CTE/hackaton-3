package fr.autostopfrance.Autostop.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.autostopfrance.Autostop.controllers.MembersController;
import fr.autostopfrance.Autostop.models.Members;
import fr.autostopfrance.Autostop.repositories.MembersDAO;

@Component
public class MembersCommandRunner implements CommandLineRunner {

    private final MembersDAO membersRepository;
    @Autowired
    public MembersController membersController;

    private Logger log = LoggerFactory.getLogger("Wilder");

     @Autowired
    public MembersCommandRunner(MembersDAO membersRepository) { this.membersRepository = membersRepository; }


    @Override
    public void run(String... strings) throws Exception {
        membersRepository.save((new Members(1, "12", "toctoc@gmail.com")));
        membersRepository.save((new Members(2, "20", "hello@gmail.com")));
    }

}