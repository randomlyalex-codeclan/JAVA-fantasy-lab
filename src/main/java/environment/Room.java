package environment;

import characters.nonPlayer.enemies.Enemy;
import items.Item;

import java.util.ArrayList;

public class Room {
    private ArrayList<Enemy> enemies;
    private ArrayList<Character> players;
    private ArrayList<Item> treasures;
    private boolean completed;

    public Room(){
        this.enemies = new ArrayList<Enemy>();
        this.players = new ArrayList<Character>();
        this.treasures = new ArrayList<Item>();
        this.completed = false;
    }


    public ArrayList<Enemy> getEnemies() {
        return this.enemies;
    }

    public ArrayList<Character> getPlayers() {
        return this.players;
    }

    public ArrayList<Item> getTreasures() {
        return this.treasures;
    }

    public boolean isCompleted() {
        return this.completed;
    }
}
