package fr.autostopfrance.Autostop.utils;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.autostopfrance.Autostop.controllers.TipController;
import fr.autostopfrance.Autostop.models.Tip;
import fr.autostopfrance.Autostop.repositories.TipsDAO;


@Component
public class TipCommandRunner implements CommandLineRunner {
	
	
	private final TipsDAO tipsRepository;
	@Autowired
	public TipController tipController;
	
	public TipCommandRunner(TipsDAO tipsRepository , TipController tipController) {
		this.tipsRepository = tipsRepository;
		this.tipController = tipController;
		
	}
	@Override
	public void run(String... args) throws Exception {
		tipsRepository.save((new Tip(1L , "éteignez votre Télé le soir")));
		tipsRepository.save((new Tip(2L , "mangez une pomme")));
		
	}

}
