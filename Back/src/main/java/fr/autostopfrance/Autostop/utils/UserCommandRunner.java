package fr.autostopfrance.Autostop.utils;

import fr.autostopfrance.Autostop.controllers.UserController;
import fr.autostopfrance.Autostop.models.User;
import fr.autostopfrance.Autostop.repositories.UserDAO;
import fr.autostopfrance.Autostop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

@Component
public class UserCommandRunner implements CommandLineRunner {
    private final UserDAO repository;
    @Autowired
    public UserController userController;

    private Logger log = LoggerFactory.getLogger("Wilder");

    @Autowired
    public UserCommandRunner(UserDAO repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
    	repository.save(new User("pierre","motdepasse"));
    	repository.save(new User("rolande","password"));
    	repository.save(new User("jean-humain-jambe","wordpasse"));
    }

}
