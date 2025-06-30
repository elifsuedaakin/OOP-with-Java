
public class Main {
   public static void main(String [] args){
       Character warrior=new Character("warrior",1,100,20);
       Character mage= new Character("Mage",1,80,25);
       
       Game game= new Game();
       game.addCharacter(warrior);
       game.addCharacter(mage);
       
       game.startBattle(warrior, mage);
       game.startBattle(mage, warrior);
       game.startBattle(warrior, mage);
       
       game.showAllCharacters();
   }
}
