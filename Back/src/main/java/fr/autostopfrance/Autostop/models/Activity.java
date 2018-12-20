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
	@Column(name="id")
	private Long id;
	@Column(name="url")
	private String url;
	@Column(name="sentence")
	private String sentence;
	public Activity(Long id, String url, String sentence) {
		this.id = id;
		this.url = url;
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
	public String getUrl() { return url;}
	public void setUrl() {this.url = url;}
	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
}
