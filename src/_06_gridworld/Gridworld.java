package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	@SuppressWarnings({ "static-access", "unchecked" })
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		World world = new World();
		world.show();
		
		int row = world.getGrid().getNumRows();
		int col = world.getGrid().getNumCols();
		System.out.println(row + " " + col);
		
		Bug bug = new Bug();
		Location loc = new Location(0, 0);
		
		world.add(loc, bug);
		
		Bug bug2 = new Bug();
		Location loc2 = new Location(new Random().nextInt(row), new Random().nextInt(col));
		
		Color newColor = new Color(col);
		world.add(loc2, bug2);
		bug2.setColor(newColor.BLUE);
		bug2.turn();
		bug2.turn();
		
		Flower flower1 = new Flower();
		// to the left of the bug facing right
		Location loc3 = new Location(loc2.getRow(), loc2.getCol() - 1);
		// to the right of the bug facing right
		Location loc4 = new Location(loc2.getRow(), loc2.getCol() + 1);
		
		world.add(loc3, flower1);
		world.add(loc4, flower1);
		
		// white and red flowers
		for (int i = 0; i < row; i++) {
			Flower flower2 = new Flower();
			if (i % 2 == 0) {flower2.setColor(newColor.RED);}
			else {flower2.setColor(newColor.WHITE);}
			
			for (int j = 0; j < col; j++) {
				System.out.println(i + " "+ j);
				
				world.add(new Location(i,j), flower2);
			}
		}
	}
	
	
}
