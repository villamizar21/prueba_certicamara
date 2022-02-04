package com.prueba_fabrica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class DatosXkcd implements Serializable {

	@Id
	@Column(name = "month")
	private String month;
	private String num;
	private String link;
	private String year;
	private String news;
	private String safe_title;
	private String transcript;
	private String alt;
	private String img;
	private String title;
	private String day;

	public DatosXkcd(String month, String num, String link, String year, String news, String safe_title, String transcript, String alt, String img, String title, String day) {
		this.month = month;
		this.num = num;
		this.link = link;
		this.year = year;
		this.news = news;
		this.safe_title = safe_title;
		this.transcript = transcript;
		this.alt = alt;
		this.img = img;
		this.title = title;
		this.day = day;
	}

	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getNews() {
		return news;
	}
	public void setNews(String news) {
		this.news = news;
	}
	public String getSafe_title() {
		return safe_title;
	}
	public void setSafe_title(String safe_title) {
		this.safe_title = safe_title;
	}
	public String getTranscript() {
		return transcript;
	}
	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	

}
