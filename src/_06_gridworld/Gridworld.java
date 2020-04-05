package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		
		Bug bug = new Bug();
		Location loc = new Location(0, 0);
		
		world.add(loc, bug);
		
		Bug bug2 = new Bug();
		Location loc2 = new Location(new Random().nextInt(10), new Random().nextInt(10));
		
		world.add(loc2, bug2);
		bug2.setColor(new Color(0).BLUE);
		
	}
	
	
}
