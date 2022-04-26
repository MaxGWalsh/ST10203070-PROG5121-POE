import javax.swing.JOptionPane;
//POE Part 1
// @author Maximilian Walsh ST10203070
public class Login
    {

    //Declaring variables
    static String password;
    static String username;
    static String firstName;
    static String surname;
    static String passwordLogin;
    static String usernameLogin;
    

    //----------------Begin----------------//
    //Main method
    public static void main(String[] args)
        {
    //Using JOptionPane to get user's username
        username = JOptionPane.showInputDialog(null, "Please enter your username: ", "Create an account", JOptionPane.DEFAULT_OPTION);
    
    //Using JOptionPane to get user's password
        password = JOptionPane.showInputDialog(null, "Please enter your password: ", "Create an account", JOptionPane.DEFAULT_OPTION);
    
    //Creating if statement to ensure that username and password entered is correctly formatted in order for program to continue 
        if(checkUserName(username)==true && checkPasswordComplexity(password)==true)
        {
            System.out.println("Username successfully captured");

            System.out.println("Password successfully captured");

        //Using JOptionPane to get user's first name
                firstName = JOptionPane.showInputDialog(null, "Please enter your first name: ", "Create an account", JOptionPane.DEFAULT_OPTION);

        //Using JOptionPane to get user's surname
                surname = JOptionPane.showInputDialog(null, "Please enter your surname: ", "Create an account", JOptionPane.DEFAULT_OPTION);

        //Calling the registerUser method to return appropriate registration messaging
                System.out.println(registerUser());

        //Using JOptionPane to get user's username
                usernameLogin = JOptionPane.showInputDialog(null, "Please enter your username: ", "Login", JOptionPane.DEFAULT_OPTION);

        //Using JOptionPane to get user's password
                passwordLogin = JOptionPane.showInputDialog(null, "Please enter your password: ", "Login", JOptionPane.DEFAULT_OPTION);

        //Calling returnLoginStatus method to get login status, returnLoginStatus method will call loginUser method
                System.out.println(returnLoginStatus());
            }
            else
            {
        //Checking what credential(username or password) entered is incorrect
                if(checkUserName(username)==false)
                {
                    System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
                }
                if(checkPasswordComplexity(password)==false)
                    {
                        System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
                    }
            }
    }
    //-----------------End-----------------//

    //----------------Begin----------------//
    //Check username method
    public static boolean checkUserName(String username)
        {
        //Passing string into boolean method
            Boolean.parseBoolean(username);

        //Checking username length and for underscore
            if(username.length() < 6)
            {
                if(username.contains("_"))
                {
                    return true;
                }
                else
                {
                return false;
                }
            }
                else 
                {
                return false;
                }
        }
    //-----------------End-----------------//

    //----------------Begin----------------//
    //Check password complexity method
    public static boolean checkPasswordComplexity(String password)
        {
        //Creating temporary varibale to return
        boolean valid = false;

        //Checking password length and for uppercase, number, and special character 
            if(password.length() >= 8 && checkPasswordUpperCase(password) && checkPasswordNumeric(password) && checkPasswordSpecialCharacter(password))
            {
                valid = true;
            }
            return valid;
        }
    //-----------------End-----------------//

    //----------------Begin----------------//
    //Register user method
    public static String registerUser()
        {
        //Creating temporary varibale to return
         String toReturn = "";

        //Passing username and password through checkUserName method and checkPasswordComplexity method respectively and prompting user accordingly
            if(checkUserName(username)==true)
            {
                if(checkPasswordComplexity(password)==true)
                {
                    toReturn = "User successfully registered";
                }
                else
                {
                    toReturn = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
                }
            }
            else
            {
                toReturn = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
            }
        return toReturn;
        }
    //-----------------End-----------------//

    //----------------Begin----------------//
    //Login user method
    public static boolean loginUser()
        {
        //Creating temporary varibale to return
        boolean valid = false;

        //Checking if username and password entered when logging in match credentials used when registering
            if(usernameLogin.equals(username))
            {
                if(passwordLogin.equals(password))
                {
                    valid = true;
                }
            }
            return valid;   
        }
    //-----------------End-----------------//

    //----------------Begin----------------//
    //Return login status method
    public static String returnLoginStatus()
        {
        //Creating temporary varibale to return
         String toReturn = "";

        //Prompting user if login is successful based on entered credentials
            if(loginUser() == true)
            {
                toReturn = "Welcome " + firstName + " " + surname + ", it is great to see you again.";
            }
            else
            {
                toReturn = "Username or password incorrect, please try again";
            }
            return toReturn;
        }
    //-----------------End-----------------//

    //----------------Begin----------------//
    //Check for uppercase method
    public static boolean checkPasswordUpperCase(String password)
        {
        //Creating temporary varibale to return
        boolean valid = false;

        //Convert string to char array
        char[] passwordArray;
               passwordArray = password.toCharArray();

        //Check password for uppercase 
            for(int i = 0; i < password.length(); i++)
            {
                if(passwordArray[i] >= 'A' && passwordArray[i] <= 'Z')
                {
                    valid = true; 
                }
            }
        return valid;
        }
    //-----------------End-----------------//

    //----------------Begin----------------//
    //Check for number in password method
    public static boolean checkPasswordNumeric(String password)
        {
        //Creating temporary varibale to return
        boolean valid = false;          

        //Convert string to char array
        char[] passwordArray;
               passwordArray = password.toCharArray();

        //Check passwordArray for numbers
            for(int i = 0; i < passwordArray.length; i++)
            {    
                if(Character.isDigit(passwordArray[i]))
                {
                    valid = true;
                }
            }
        return valid;
        }
    //-----------------End-----------------//

    //----------------Begin----------------//
    //Check for special character in password method
    public static boolean checkPasswordSpecialCharacter(String password)
        {
        //Creating temporary varibale to return
        boolean valid = false;          

        //Convert string to char array
        char[] passwordArray;
               passwordArray = password.toCharArray();

        //Creating string of special characters
            String specialChar = "~`!@#$%^&*()-_=+{}[]|\"/:;'<>,.?";

        //Check passwordArray for special characters
            for(int i = 0; i < passwordArray.length; i++)
            {    
                if(specialChar.contains(passwordArray[i]+""))
                {
                    valid = true;
                }
            }
        return valid;
        }
    //-----------------End-----------------//
    }
//-----------------END OF PROGRAM-----------------//
