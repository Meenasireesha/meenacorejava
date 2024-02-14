package project1_meena;

public class project2_checktheagegroup {

	public static void main(String[] args) {
		//check the age group
		//int age = 82;

	    //age under  0 to 2 years, you have to print "Infant" into Console
		//age under  2 to 12 years, you have to print "Child" into Console
		//age under  12 to 25 years, you have to print "Youth" into Console
		//age under  25 to 59 years, you have to print "Adult" into Console
		//age under  59 to 100 years, you have to print "Sr.Citizen" into Console
  int age=72;
  if(age>=0&&age<=2) {
	  System.out.println("if block is executed,...result is INFANT");
  }
  else if(age>=2&&age<=12) {
	  System.out.println("else if block is executed,...result is CHILD");
  }
  else if(age>=12&&age<=25) {
	  System.out.println("else if block is executed,.....result is YOUTH");
  }
  else if(age>=25&&age<=59) {
	  System.out.println("else if block is executed,....result is ADULT");
  }
  else if(age>=100) {
	  System.out.println("else if  block is executed,...result is SR.CITIZEN");
  } 
	else{
	  System.out.println("else block is executed,....result is sr.citizen");
  
}
	}
}

