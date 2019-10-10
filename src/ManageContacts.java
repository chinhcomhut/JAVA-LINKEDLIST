import java.util.LinkedList;
public class ManageContacts {
    LinkedList<Contact> manageContacts = new LinkedList<>();

    public void displayContacts(){
        for(int i = 0; i < manageContacts.size(); i++){
            getInfoContact(i);
        }
    }

    public void addPhoneNumber(String firtName, String lastName, String phoneNumber){
        Contact newContact = new Contact(firtName, lastName, phoneNumber);
        manageContacts.add(newContact);
    }

    public void editContacs(String firtName, String lastName, String phoneNumber){
        for(int i = 0; i < manageContacts.size(); i++){
            boolean isCheckFirtName = manageContacts.get(i).getFirtName() == firtName;
            boolean isCheckLastName = manageContacts.get(i).getLastName() == lastName;
            boolean isCheckPhoneNumber = manageContacts.get(i).getPhoneNumber()==phoneNumber;
            if(isCheckFirtName&& isCheckLastName){
                manageContacts.get(i).setPhoneNumber(phoneNumber);
            } else if (isCheckFirtName &&isCheckPhoneNumber) {
                manageContacts.get(i).setLastName(lastName);
            }else if(isCheckLastName&&isCheckPhoneNumber){
                manageContacts.get(i).setFirtName(firtName);
            }
        }
    }

//    public void editContacs(Contact newContact){
//        manageContacts.set(newContact);
//    }

    public void removeContact(String phoneNumber){
        for(int i = 0; i < manageContacts.size(); i++){
            boolean isCheckPhoneNumber = manageContacts.get(i).getPhoneNumber() == phoneNumber;
            if(isCheckPhoneNumber){
                manageContacts.remove(i);
            }
        }
    }

    public void searchContactByFirtName(String firtName){
        for(int i = 0; i < manageContacts.size(); i++){
            boolean isCheckFirtName = manageContacts.get(i).getFirtName() == firtName;
            if(isCheckFirtName){
                getInfoContact(i);
            }
        }
    }

    public void searchContactByLastName(String lastName){
        for(int i = 0; i < manageContacts.size(); i++){
            boolean isCheckLastName = manageContacts.get(i).getLastName() == lastName;
            if(isCheckLastName){
                getInfoContact(i);
            }
        }
    }

    public void searchContactByPhoneNumber(String phoneNumber){
        for(int i = 0; i < manageContacts.size(); i++){
            boolean isCheckPhoneNumber = manageContacts.get(i).getPhoneNumber() == phoneNumber;
            if(isCheckPhoneNumber){
                getInfoContact(i);
            }
        }
    }

    private void getInfoContact(int i) {
        System.out.println("Info Contact " + i + " : ");
        System.out.println(manageContacts.get(i).getFirtName()
                + " "
                + manageContacts.get(i).getLastName()
                + " : "
                + manageContacts.get(i).getPhoneNumber());
    }

//    public void editContacs(String firstName, String lastName, String Number) {
//
//    }
}