import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    Scanner input = new Scanner(System.in);

    public String inputGender(User user){
        String gender = input.nextLine();
        switch (gender) {
            case "male" -> user.setGender("male");
            case "female" -> user.setGender("female");
            default -> {
                System.err.println("Enter male,female or other!!");
                inputGender(user);
            }
        }
        return gender;
    }

    public String inputName(){
        String name;
        String input =new Scanner(System.in).nextLine();
        String nameRegex = "^\\p{L}+[\\p{L}\\p{Z}\\p{P}]*";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher =pattern.matcher(input);
        if (matcher.find()){
            name =input;
        } else {
            System.err.println("Enter your name again!!");
            name=inputName();
        }
        return name;
    }

    public String inputPhoneNumber(){
        String number;
        String input =new Scanner(System.in).nextLine();
        String numberRegex = "^(09|01[2|6|8|9])+([0-9]{7})$";
        Pattern pattern = Pattern.compile(numberRegex);
        Matcher matcher =pattern.matcher(input);
        if (matcher.find()){
            number =input;
        } else {
            System.err.println("Phone number include ten number!!");
            number=inputPhoneNumber();
        }
        return number;
    }

    public String inputDateOfBirth(){
        String date;
        String input =new Scanner(System.in).nextLine();
        String dateRegex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        Pattern pattern = Pattern.compile(dateRegex);
        Matcher matcher =pattern.matcher(input);
        if (matcher.find()){
            date =input;
        } else {
            System.err.println("You must enter date of birth in dd/mm/yyyy!!");
            date=inputDateOfBirth();
        }
        return date;
    }

    public String inputEmail(){
        String email;
        String input =new Scanner(System.in).nextLine();
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher =pattern.matcher(input);
        if (matcher.find()){
            email =input;
        } else {
            System.err.println("Wrong form for email!!");
            email=inputEmail();
        }
        return email;
    }
}
