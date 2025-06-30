
public class Character {
    private String name ;
    private int level;
    private int health;
    private int attackPower;
    
    public Character(String name,int level,int health,int attackPower){
        this.name=name;
        this.level=level;
        this.health=health;
        this.attackPower=attackPower;
        
    }
    public String getName(){
        return name;
    } 
    public int getHealth(){
        return health;
    }
    public boolean isAlive(){
        return health > 0;
    } 
    public void attack (Character target){
        if(this.isAlive()){
            System.out.println(this.name+"attacks"+target.name+"for"+this.attackPower+"damage");
            target.takeDamage(this.attackPower);
        }
        else{
            System.out.println(this.name+"is dead and cant attack");
        }
    }
    public void takeDamage(int damage){
        health -= damage;
        if(health <=0){
            health=0;
            System.out.println("has been defeated!");
        }
    }
   public void levelUp(){
    level++;
    attackPower +=5;
    health +=10;
    System.out.println(name+"leveled up!now level"+level);
} 
}
