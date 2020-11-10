import java.util.Scanner;

public class Menu {
    public void menu(){
        Regex regex = new Regex();
        Information information = new Information();
        Directory method = new Directory();
        Scanner input = new Scanner(System.in);
        boolean check = true;

        do {
            System.out.println("1. Show phone directory.");
            System.out.println("2. Add a new phone number.");
            System.out.println("3. Update a phone number.");
            System.out.println("4. Delete a phone number.");
            System.out.println("5. Search.");
            System.out.println("6. Read form file.");
            System.out.println("7. Write to file.");
            System.out.println("8. Exit.");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    method.showList();
                    break;
                case 2:
                    User user = new User();
                    information.addInfo(user);
                    method.addUser(user);
                    System.out.println("Add Complete." + "\n");
                    break;
                case 3:
                    System.out.println("Enter phone number: ");
                    String phoneNumber = regex.inputPhoneNumber();
                    method.update(phoneNumber);
                    System.out.println("Update Complete." + "\n");
                    break;
                case 4:
                    System.out.println("Enter phone number want delete: ");
                    String phoneNumberDel = regex.inputPhoneNumber();
                    System.out.println("Do you want to delete" + "\n" + "y: yes" + "\t" + "n: no");
                    String YN = input.nextLine();
                    if (YN.equals("y")){
                        method.delete(phoneNumberDel);
                        System.out.println("Delete Complete." + "\n");
                    } if (YN.equals("n")){
                        menu();
                }
                    break;
                case 5:
                        System.out.println("1. Search by phone number.");
                        System.out.println("2. Search by name.");
                        int select = Integer.parseInt(input.nextLine());
                        switch (select){
                            case 1:
                                System.out.println("Enter phone number to search: ");
                                String searchPhone = input.nextLine();
                                method.searchByPhone(searchPhone);
                                break;
                            case 2:
                                System.out.println("Enter name to search: ");
                                String searchName = input.nextLine();
                                method.searchByName(searchName);
                                break;
                        }
                        break;
                case 6:
                    break;
                case 7:
                    method.writeFile();
                    break;
                case 8:
                    check= false;

            }
        }while (check);
    }



}
