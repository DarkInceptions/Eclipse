package level.one;

public class block {
	
	public int doStuff;
    
    public block() {
        doStuff = 6;
    }
    
    public static void main(String[] args) {
        block blockObj = new block();
        blockObj.raiseDoStuff(35446);
        blockObj.printStuff();
    }
    
    public void printStuff() {
        System.out.println("Stuff!");
        System.out.println(doStuff);
    }
    
    public void raiseDoStuff(int howMuch){
        doStuff += howMuch;
    }
    
    public static void printMoreStuff() {
    	System.out.println("More Stuff");
    }
}