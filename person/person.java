//defines person class

package person;

public class person{
    private String firstName;
    private String lastName; 
    private String telephoneNumber; 
    private String gender;
    
    //Default constructor
    public person(){
        firstName = "Ola";
        lastName = "Nordmann";
        telephoneNumber = "123 45 678";
        gender = "Male";
    }

    public person(String new_firstName) {
        this(new_firstName, "Nordmann", "123 45 678", "Male");
    }

    public person(String new_firstName, String new_lastName) {
        this(new_firstName, new_lastName, "123 45 678", "Male");
    }

    public person(String new_firstName, String new_lastName, String new_telephoneNumber) {
        this(new_firstName, new_lastName, new_telephoneNumber, "Male");
    }

    public person(String new_firstName, String new_lastName, String new_telephoneNumber, String new_gender) {
        this.firstName = new_firstName;
        this.lastName = new_lastName;
        this.telephoneNumber = new_telephoneNumber; 
        this.gender = new_gender;
    }

    //Printing methode 
    public void printing(){
        System.out.println("----------------------------");
        System.out.print( "Name: "  +  this.firstName);
        System.out.println( " " + this.lastName );
        System.out.println( "Telephone number: " + this.telephoneNumber );
        System.out.println( "Gender: " + this.gender );
        System.out.println( "" );
    }

    //Get methods to access private variables
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getTelephoneNumber(){
        return this.telephoneNumber;
    }
    public String getGender(){
        return this.gender;
    }

    //Methode to change private varaible names
    public void setFirstName(String new_name) {
        this.firstName = new_name;
    }
}


