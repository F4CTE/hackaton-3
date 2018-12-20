package fr.autostopfrance.Autostop.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Tip")
public class Tip {
	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column 
	private String sentence;
	
	public Tip(Long id , String sentence) {
		this.id = id;
		this.sentence = sentence;
	}
	
	public Tip() {}
	
	public String getSentence() {
		return sentence;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
}
