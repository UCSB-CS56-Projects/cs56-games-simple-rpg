/**
 *
 */

/**
 * A class used in the implementation of the Game class
 *
 * @author Daniel Chojnacki
 *
 */
public class GameMap {
    // instance variable
    Tile[][] ourMap;

    //each map should take one window worth of space
    //with 20x20 tiles and a 800x800 resolution
    //therefore we have 40 horizontal tiles and 30 vertical
	    //there is also an 800x200 grey status bar
    public GameMap() {
	ourMap = new Tile[30][40];
	for (int i = 0; i < 8; i++) {
	    for (int j = 0; j < 30; j++) {
		ourMap[j][i] = new Tile(1);
	    }
	}
	for (int i = 8; i < 32; i++) {
	    for (int j = 0; j < 30; j++) {
		ourMap[j][i] = new Tile();
	    }
	}
	for (int i = 32; i < 40; i++) {
	    for (int j = 0; j < 30; j++) {
		ourMap[j][i] = new Tile(1);
	    }
	}
    }

    // a getter function for our gameMap
    public Tile[][] getGameMap() {
	return ourMap;
    }
    
    // this is to implement various kinds of maps
    public GameMap (int level) {
	ourMap = new Tile[30][40];
	for (int i = 0; i < 40; i++) {
	    for (int j = 0; j < 30; j++) {
		ourMap[j][i] = new Tile();
	    }
	}
	if (level == 2) {
	    ourMap.addRock(15, 10, 1);
	}
	else if (level == 3) {
	    ourMap.addRock(12, 9, 2);
	    ourMap.addRock(24, 18, 1);
	}
    }

    // this function is to add rock tiles to our gameMap variable
    public void addRock(int x, int y, int size) {
	if ((size <= 3) && (size > 0)) {
	    for (int i = 0; i < size; i++) {
		for (int j = 0; j < size; j++) {
		    if ((y+j<this.length) && (x+i<this[j].length)) {
			this[y+j][x+i] = new Tile(2);
		    }
		}
	    }
	}
    }
}
