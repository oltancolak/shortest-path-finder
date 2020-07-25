package main;

public class City {
	private int cityID;
	private String cityName;
	private int xCordinate;
	private int yCordinate;
	
	
	public City(int cityID,String cityName, int xCordinate, int yCordinate) {
		setCityID(cityID);
		setCityName(cityName);
		setxCordinate(xCordinate);
		setyCordinate(yCordinate);
	}
	
	//getters & setters
	public int getCityID() {
		return cityID;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public int getxCordinate() {
		return xCordinate;
	}
	
	public int getyCordinate() {
		return yCordinate;
	}
	
	private void setCityID(int cityID) {
		this.cityID = cityID;
	}
	
	private void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	private void setxCordinate(int xCordinate) {
		this.xCordinate = xCordinate;
	}
	
	private void setyCordinate(int yCordinatee) {
		this.yCordinate = yCordinatee;
	}



}
