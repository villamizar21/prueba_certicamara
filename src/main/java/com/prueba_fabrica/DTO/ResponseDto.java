package com.prueba_fabrica.DTO;

public class ResponseDto {

	private int numConsulta;
	
	private String month;
	private String num;
	private String year;
	private String news;
	private String img;
	private String title;
	
	public ResponseDto(int numConsulta, String month, String num, String year, String news, String img, String title) {
		super();
		this.numConsulta = numConsulta;
		this.month = month;
		this.num = num;
		this.year = year;
		this.news = news;
		this.img = img;
		this.title = title;
	}

	public ResponseDto() {
		
	}

	public int getnumConsulta() {
		return numConsulta;
	}
	public void setnumConsulta(int numConsulta) {
		this.numConsulta = numConsulta;
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
	
}
