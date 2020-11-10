public class Information {
    Regex regex = new Regex();

    public User addInfo(User user){
        System.out.println("Enter phone number: ");
        user.setPhoneNumber(regex.inputPhoneNumber());
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
        return user;
    }
}
