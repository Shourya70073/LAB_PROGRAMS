class RockPaperScissors {
    private String player1_choice;
    private String player2_choice;
    RockPaperScissors(String player1_choice,String player2_choice){
        this.player1_choice=player1_choice;
        this.player2_choice=player2_choice;
        this.result();
    }
    public boolean bool(int a){
        if(a==0){
            return true;
        }
        return false;
    }
    public void result(){
        if(bool(player1_choice.compareToIgnoreCase(player2_choice))){
            System.out.println("TIE!");
        }
        else if(bool(player1_choice.compareToIgnoreCase("rock"))){
            if(bool(player2_choice.compareToIgnoreCase("paper"))){
                System.out.println("Player 2 wins!");
            }
            else if(bool(player2_choice.compareToIgnoreCase("SCISSORS"))){
                System.out.println("Player 1 wins!");
            }
            else{
                System.out.println("Invalid move of "+ player2_choice);
            }
        }
        else if(bool(player1_choice.compareToIgnoreCase("SCISSORS"))){
            if(bool(player2_choice.compareToIgnoreCase("paper"))){
                System.out.println("Player 1 wins!");
            }
            else if(bool(player2_choice.compareToIgnoreCase("rock"))){
                System.out.println("Player 2 wins!");
            }
            else{
                System.out.println("Invalid move of "+ player2_choice);
            }
        }
        else if(bool(player1_choice.compareToIgnoreCase("paper"))){
            if(bool(player2_choice.compareToIgnoreCase("rock"))){
                System.out.println("Player 1 wins!");
            }
            else if(bool(player2_choice.compareToIgnoreCase("scissors"))){
                System.out.println("Player 2 wins!");
            }
            else{
                System.out.println("Invalid move of "+ player2_choice);
            }
        }


        else{
            System.out.print("Invalid move of "+ player1_choice);
            if(!bool(player2_choice.compareToIgnoreCase("rock")) ||!bool(player2_choice.compareToIgnoreCase("paper"))
            ||!bool(player2_choice.compareToIgnoreCase("scissors"))) {
                System.out.print(" and Invalid move of "+ player2_choice);
                System.out.println();
                
            }
            
        }
    }
   

}




public class Q3 {

    public static void main(String a[]) {

      RockPaperScissors ob1=new RockPaperScissors("rock", "Scissors");
      RockPaperScissors ob2=new RockPaperScissors("ROCK", "Paper");

      RockPaperScissors ob3=new RockPaperScissors("SCISSORS", 
      "scissors");

      RockPaperScissors ob4=new RockPaperScissors("ROCK", "pat");
      RockPaperScissors ob5=new RockPaperScissors("ROC", "pat");
   } 
}
