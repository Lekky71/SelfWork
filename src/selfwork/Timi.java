package selfwork;

public class Timi{
    int Number;
    int age;
    String Surname;
    public Timi(String sname, int age){
	Surname = sname;
	this.age = age;
    }
    public void setSurname(String Surname){
	this.Surname = Surname;
    }
    public String getSurname(){
    	return Surname;
    }
}

