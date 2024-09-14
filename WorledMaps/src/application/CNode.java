package application;

import java.util.LinkedList;

public class CNode {
	private LinkedList adjlist;
	private String city;
	private double lon;
	private double lat;
	private CNode previous;
	private double distance;

	public CNode(String city, double lat, double lon) {
		this.city = city;
		this.lat = lat;
		this.lon = lon;
		this.previous = null;

		this.distance = Double.MAX_VALUE;
		this.adjlist = new LinkedList();
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public void addAdjacentNode(CNode node) {
		this.adjlist.addLast(node);
		node.adjlist.addLast(this);
	}

	public CNode getPrevious() {
		return previous;
	}

	public void setPrevious(CNode previous) {
		this.previous = previous;
	}

	public double getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "CityNode{" + "adjlist=" + adjlist + ", city='" + city + '\'' + ", lon=" + lon + ", lat=" + lat + '}';
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getLongitude() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getLatitude() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public LinkedList getAdjlist() {
		return adjlist;
	}

	public void setAdjlist(LinkedList adjlist) {
		this.adjlist = adjlist;
	}
}
