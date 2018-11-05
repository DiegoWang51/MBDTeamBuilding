public class Team {
	
	public void showMenu()
    {

        InputOutput.output("========================");
        InputOutput.output("Welcome to the TEAM Building system.");
        InputOutput.output("========================");
        
        int members = InputOutput.inputInt("Memebers in the team: ");
        Member[] team = new Member[members];
        
        for (int i = 0; i< members; i++) {
        	team[i] = addMembers();
        }
        
    }
	
		public Member addMembers() {
			String Info = InputOutput.input("Name:Surname:Sex:DD/MM/YYYY");
			String[] Info_input = Info.split("[:/]");
			NewMember = Member(Info_input[0],Info_input[1],Info_input[2].toCharArray()[0],(Info_input[3]),int(Info_input[4]),int(Info_input[5]));
			
			return  NewMember;
		}

    
	public void main(String args[]) {
		
		InputOutput.output("How many team members do you have?");
		
		switch()
		
	}
	
>>>>>>> 824592592959f91197688168025c1445de38c0a4
}
	

