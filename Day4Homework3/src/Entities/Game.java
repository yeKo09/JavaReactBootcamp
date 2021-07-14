package Entities;

public class Game {

	private int id;
	private String gameName;
	private String genre;
	private double unitPrice;
	
	public Game(int id, String gameName, String genre, double unitPrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.genre = genre;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
