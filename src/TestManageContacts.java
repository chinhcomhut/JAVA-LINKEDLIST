public class TestManageContacts {
    public static void main(String[] args) {
        ManageContacts manageContacts = new ManageContacts();
        manageContacts.addPhoneNumber("Chính","Đồng","0343304666");
        manageContacts.addPhoneNumber("Thanh","Phạm","1234567890");
        manageContacts.addPhoneNumber("Linh","Nguyễn","000000000");
        manageContacts.addPhoneNumber("Hiệu","Huy","0983154555");
        manageContacts.addPhoneNumber("Thanh","Hay","555555555");
        System.out.println(">>>>>>>>> Danh sách sau khi add <<<<<<<<<<<<<");
        manageContacts.displayContacts();
     manageContacts.editContacs("Chính","Đồng","000");
     manageContacts.editContacs("Thanh","GAY SIDA","1234567890");
        System.out.println(">>>>>>>>> Danh sách sau khi sửa <<<<<<<<<<<<<");
     manageContacts.displayContacts();
     manageContacts.removeContact("1234567890");
        System.out.println(">>>>>>>>>>>>Danh sách sau khi xóa <<<<<<<<<<<<");
        manageContacts.displayContacts();
        System.out.println(">>>>>>>>>>>>>> Sau khi tìm với FirtName: Chính<<<<<<<<<<");
        manageContacts.searchContactByLastName("Đồng");
        System.out.println(">>>>>>>>>>>>>>>>>Tìm với LastName: Huy  <<<<<<<<<<");
        manageContacts.searchContactByLastName("Huy");
        System.out.println(">>>>>>>>>>>>> Tìm với số điện thoại: 000 <<<<<<<<<<<<");
        manageContacts.searchContactByPhoneNumber("000");


//        manageContacts.searchContactByPhoneNumber("000");
    }
}
