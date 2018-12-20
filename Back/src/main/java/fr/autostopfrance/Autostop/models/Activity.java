package fr.autostopfrance.Autostop.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activities")
public class Activity {

	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column
	private String sentence;
	public Activity(Long id, String sentence) {
		this.id = id;
		this.sentence = sentence;
	}
	public Activity() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
}
