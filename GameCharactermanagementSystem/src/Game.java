import java.util.ArrayList;
public class Game {
    private ArrayList <Character> characters =new ArrayList<>();
    public void addCharacter(Character character){
        characters.add(character);
        System.out.println(character.getName()+"added to the game!");
    }
    public void startBattle(Character attacker,Character target){
        if(attacker.isAlive() && target.isAlive()){
            attacker.attack(target);
        }
        else{ 
            System.out.println("one of the characters ıs defeated!");
        }
    }
    public void showAllCharacters(){
        System.out.println("character status");
        for(Character c: characters){
        String status =c.isAlive() ? "ALIVE" : "DEFEATED" ;
        System.out.println(c.getName()+"| HP:"+c.getHealth()+"|Status"+status);
        }
    }
    
}
