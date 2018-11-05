public class Team {
	
		public static Member addMembers() {
			String Info = InputOutput.input("Name:Surname:Sex:DD/MM/YYYY");
			String[] Info_input = Info.split("[:/]");
			Member NewMember = new Member(Info_input[0],Info_input[1],Info_input[2].toCharArray()[0],Integer.valueOf(Info_input[3]),Integer.valueOf(Info_input[4]).intValue(),Integer.valueOf(Info_input[5]).intValue());
			return  NewMember;
		}

    
	public static void main(String args[]) {
		InputOutput.output("========================");
        InputOutput.output("Welcome to the TEAM Building system.");
        InputOutput.output("========================");
        
        int members = InputOutput.inputInt("Memebers in the team: ");
        Member[] teamMembers = new Member[members];
        
        for (int i = 0; i< members; i++) {
        	teamMembers[i] = addMembers();
        }
        
        
		InputOutput.output("Team Builder Menu:");
		InputOutput.output("=======================");
	    InputOutput.output("1) List the team members");
	    InputOutput.output("2) Find the oldest member");
	    InputOutput.output("3) Find the youngest member");
	
		int selection = InputOutput.inputInt("Which action do you want to perform? ");
        
        switch (selection) {
        case 1 : 
        	listMember(teamMembers);
        break;
        case 2 :
        	findOld(teamMembers);
        break;
        case 3 : 
        	findYoung(teamMembers);
        break;
        default:
        InputOutput.output("Fause input, try again");
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        main(args);
       
        }
	}
	
	public static void showMenu(Member[] teamMembers) {

		InputOutput.output("Team Builder Menu:");
		InputOutput.output("=======================");
	    InputOutput.output("1) List the team members");
	    InputOutput.output("2) Find the oldest member");
	    InputOutput.output("3) Find the youngest member");
	
		int selection = InputOutput.inputInt("Which action do you want to perform? (Press 0 to exit)");
        
        switch (selection) {
        case 1 : 
        	listMember(teamMembers);
        break;
        case 2 :
        	findOld(teamMembers);
        break;
        case 3 : 
        	findYoung(teamMembers);
        break;
        case 0:
        	break;
        default:
        InputOutput.output("Fause input, try again");
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        showMenu(teamMembers);
        }
	}
	/* Pretty Straight forward*/
	public static void listMember(Member[] teamMembers) {
		for (int i = 0; i < teamMembers.length; i++) {
			InputOutput.output(teamMembers[i].toString());
		}
		System.out.println();
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	    showMenu(teamMembers);
	}	
	public static void findOld(Member[] teamMembers) {
		Member[] temp = BubbleSort.bubbleSortA(teamMembers,true);
		InputOutput.output(temp[0].getName()+" "+temp[0].getSurname()+", "+"age: "+ (2018-temp[0].getYear()));
		System.out.println();
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	    showMenu(teamMembers);
	}
	public static void findYoung(Member[] teamMembers) {
		Member[] temp = BubbleSort.bubbleSortA(teamMembers,false);
		InputOutput.output(temp[0].getName()+" "+temp[0].getSurname()+", "+"age: "+ (2018-temp[0].getYear()));
		System.out.println();
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	    showMenu(teamMembers);
	    
	}
}
	

