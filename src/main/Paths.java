package main;
import java.util.ArrayList;
import java.util.HashMap;
import main.Neighbour;


public class Paths {
	private HashMap<Integer,ArrayList<Neighbour>> Path;
	
	public Paths() {
		Path=new HashMap<Integer,ArrayList<Neighbour>>();
	}
	
	public void addNeighbour(int cityID,Neighbour neighbour) {
		if(Path.containsKey(cityID)) {
			ArrayList<Neighbour> temp=(ArrayList<Neighbour>)Path.get(cityID);
			temp.add(neighbour);
			Path.replace(cityID, temp);
		}
		else {
			ArrayList<Neighbour> temp=new ArrayList<Neighbour>();
			temp.add(neighbour);
			Path.put(cityID, temp);
		}
	}

	
	

}
