public class Team {
	
	public static void showMenu()
    {

        InputOutput.output("========================");
        InputOutput.output("Welcome to the TEAM Building system.");
        InputOutput.output("========================");
        
        int members = InputOutput.inputInt("Memebers in the team: ");
        Member[] teamMembers = new Member[members];
        
        for (int i = 0; i< members; i++) {
        	teamMembers[i] = addMembers();
        }
        
    }
	
		public static Member addMembers() {
			String Info = InputOutput.input("Name:Surname:Sex:DD/MM/YYYY");
			String[] Info_input = Info.split("[:/]");
			Member NewMember = new Member(Info_input[0],Info_input[1],Info_input[2].toCharArray()[0],Integer.valueOf(Info_input[3]),Integer.valueOf(Info_input[4]).intValue(),Integer.valueOf(Info_input[5]).intValue());
			return  NewMember;
		}

    
	public static void main(String args[]) {
		showMenu();
	
		InputOutput.output("Team Builder Menu:");
		InputOutput.output("=======================");
	    InputOutput.output("1) List the team members");
	    InputOutput.output("2) Find the oldest member");
	    InputOutput.output("3) Find the youngest member");
	
		int selection = InputOutput.inputInt("Which action do you want to perform? ");
        
        switch (selection) {
        case 1 : 
        	listMember();
        break;
        case 2 :
        	findOld();
        break;
        case 3 : 
        	findYoung();
        break;
        default:
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        showMenu();
       
        }
	}
	/* Pretty Straight forward*/
	public static void listMember() {
	
	}	
	public static void findOld() {

	}
	public static void findYoung() {
		
	}
}
	

