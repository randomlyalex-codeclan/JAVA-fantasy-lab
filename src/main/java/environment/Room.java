package environment;

import characters.nonPlayer.enemies.Enemy;
import characters.player.Player;
import items.Item;

import java.util.ArrayList;
import java.util.Collections;

public class Room {
    private ArrayList<Enemy> enemies;
    private ArrayList<Character> players;
    private ArrayList<Character> playSequence;
    private ArrayList<Item> treasures;
    private boolean completed;

    public Room(){
        this.enemies = new ArrayList<Enemy>();
        this.players = new ArrayList<Character>();
        this.treasures = new ArrayList<Item>();
        this.completed = false;
    }

    public void generatePlaySequence(){
//        ArrayList<Character> unsortedPlaySequence;
//        unsortedPlaySequence = this.players;
//        for (Enemy enemy : this.enemies){
//            unsortedPlaySequence.add((Character) enemy);
//        }
//        create an unSortedListOfAllCharacters
//         each character rolls a dice from the dice class
//         any draws, keep rolling (while draws=true loop?)
//        in that order populate the playSequence ArrayList.
//        Each turn takes the top player and follows rules/advice from there. getNextPlayer

    }

    public ArrayList<Character> getPlaySequence(){
        return this.playSequence;
    }

    public Character getNextPlayer(){
        Character nextPlayer;
        nextPlayer = this.playSequence.remove(0);
        return nextPlayer;
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
