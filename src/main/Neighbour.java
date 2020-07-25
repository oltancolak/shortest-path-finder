package main;

public class Neighbour {
	
	int neighbourID;
	float distance;
	
	public Neighbour(int neighbourID, float distance) {
		setDistance(distance);
		setNeighbourID(neighbourID);
	}
	
	public int getNeighbourID() {
		return neighbourID;
	}
	private void setNeighbourID(int neighbourID) {
		this.neighbourID = neighbourID;
	}
	public float getDistance() {
		return distance;
	}
	private void setDistance(float distance) {
		this.distance = distance;
	}
	
	

}
