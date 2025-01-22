/**
 * @author: SkyeGamesYT
 *
 * @date: 1/22/25
 * 
 * @desc: The main method of Tips1.java.
**/ 


import java.lang.Thread; //Needed for wait()


public class Tips1 {

    //Coloring using ANSI Code. 
    //Usage in the Main method.
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35";
    public static final String ANSI_WHITE = "\u001B[37m";

  public static void main(String[] args)
  {
    // Coloring using Print statements.
    System.out.print(ANSI_RED + "This prints red text" + ANSI_RESET);
    System.out.print(ANSI_YELLOW + "This prints yellow text" + ANSI_RESET);
    System.out.print(ANSI_GREEN + "This prints green text" + ANSI_RESET);
    System.out.print(ANSI_BLUE + "This prints blue text" + ANSI_RESET);
    System.out.print(ANSI_PURPLE + "This prints purple text" + ANSI_RESET);
    System.out.print(ANSI_BLACK + "This prints black text" + ANSI_RESET);
    System.out.print(ANSI_WHITE + "This prints white text" + ANSI_RESET);

  }

  //Python print() inside of java utilizing System.out.println().
  public static print(String args)
  {
    System.out.println(args);
  }
  //Python wait() inside of java utilizing Java Thredding.
  //Note: The time is not in seconds. It's in Miliseconds.
  public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch (InterruptedException e)
        {
            return;
        }
    }

  //Python os.System("clear") inside of Java using unicodes + flush.
  //This will clear the console.
  public static void clear() 
    {
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 
        
    }
}



