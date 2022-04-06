import javax.swing.JOptionPane;

// @author Max Walsh
public class Login
    {

    //-----------------------------------------//
    //main method
    public static void main(String[] args)
        {

    //Using JOptionPane to get user's username
    String username;
    username = JOptionPane.showInputDialog(null, "Please enter your username: ", "Create an account", JOptionPane.DEFAULT_OPTION);
    
    //Passing username through checkUserName method, returning true or false and prompting user accordingly
    if(checkUserName(username)==true)
    {
    System.out.println("Username successfully captured");
    }
    else
    {
    System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
    }

    //Using JOptionPane to get user's password
    String password;
    password = JOptionPane.showInputDialog(null, "Please enter your password: ", "Create an account", JOptionPane.DEFAULT_OPTION);
    
    //Passing password through checkPasswordComplexity method, returning true or false and prompting user accordingly
    if(checkPasswordComplexity(password)==true)
    {
    System.out.println("Password successfully captured");
    }
    else
    {
    System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
    }


    }

    //-----------------------------------------//
    //check username method
    public static boolean checkUserName(String username)
        {
            Boolean.parseBoolean(username);
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

    //-----------------------------------------//
    //check password method
    public static boolean checkPasswordComplexity(String password)
        {
            Boolean.parseBoolean(password);
            if(password.length() >= 8 && checkUpperCase(password) && checkPasswordNumeric(password) )
            {
                return true;
            }
            else
            {
                return false;
            }
        }

    //------------------------------------------//
    //register user method
    public static String registerUser()
        {



        }

    //------------------------------------------//
    //login user method
    public static boolean loginUser()
        {



        }

    //------------------------------------------//
    //return login status method
    public static String returnLoginStatus()
        {



        }

    //------------------------------------------//
    //check for uppercase method
    public static boolean checkUpperCase(String password)
        {
            Boolean.parseBoolean(password);
            for(int i = 0; i < password.length(); i++)
            {
                if(Character.isUpperCase(i))
                {
                    return true;
                }
                else
                {
                return false;
                }
            }
        }

    //------------------------------------------//
    //check for number in password method
    public static boolean checkPasswordNumeric(String password)
        {
            Boolean.parseBoolean(password);
         
        }
    }
