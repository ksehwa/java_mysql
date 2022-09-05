public class TermProjectDemo {
    public static void main(String[]args){
        System.out.println("선택");
        
        TermProjectPolls polls = new TermProjectPolls();
        int val = polls.PollFunction();

        TermProjectStatics stts = new TermProjectStatics();
        int val2 = stts.StaticsFunction();
        return;
    } 
    
}
