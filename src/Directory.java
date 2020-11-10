import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Directory {
    Regex regex = new Regex();
    ArrayList<User> users = new ArrayList<>();
    private String fileName;

    public void addUser(User user){
        users.add(user);
    }

    public void showList(){
        for (User user: users){
            System.out.println(user.toString());
        }
    }

    public void update(String phoneNumber) {
        for (User user : users) {
            if (user.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Enter group:");
                user.setGroup(regex.inputName());
                System.out.println("Enter name: ");
                user.setName(regex.inputName());
                System.out.println("Enter gender: ");
                user.setGender(regex.inputGender(user));
                System.out.println("Enter address: ");
                user.setAddress(regex.inputName());
                System.out.println("Enter date of birth: ");
                user.setDateOfBirth(regex.inputDateOfBirth());
                System.out.println("Enter email: ");
                user.setEmail(regex.inputEmail());
            }
        }
    }

    public ArrayList<User> delete(String phoneNumber){
        users.removeIf(user -> user.getPhoneNumber().equals(phoneNumber));
        return users;
    }

    public void searchByPhone(String phoneNumber){
        for (User user: users){
            if (user.getPhoneNumber().equals(phoneNumber)){
                user.toString();
            }
        }
    }

    public void searchByName(String name){
        for (User user: users){
            if (user.getName().equals(name)){
                user.toString();
            }
        }
    }

    public void readFile(){

    }

    public void writeFile(){

         final String COMMA_DELIMITER = ",";
         final String NEW_LINE_SEPARATOR = "\n";


         final String FILE_HEADER = "Phone Number,Group,Name,Gender,Address,Date of birth,Email";



            FileWriter fileWriter = null;

            try {
                fileWriter = new FileWriter(fileName);
                fileWriter.append(FILE_HEADER.toString());
                fileWriter.append(NEW_LINE_SEPARATOR);
                for (User user : users) {
                    fileWriter.append(String.valueOf(user.getPhoneNumber()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(user.getGroup());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(user.getName());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(user.getGender());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(user.getAddress()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(user.getDateOfBirth()));
                    fileWriter.append(NEW_LINE_SEPARATOR);
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(user.getEmail()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



}
