package fr.autostopfrance.Autostop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import fr.autostopfrance.Autostop.models.Tip;

import fr.autostopfrance.Autostop.repositories.TipsDAO;

@Service
public class TipService {
	
	@Autowired
	TipsDAO tipsDAO;
	
	public List<Tip> findAllTips(){
		return tipsDAO.findAll();
	}
	
	public Tip findById(Long id) {
		return tipsDAO.findById(id).get();
	}
	
	

}
