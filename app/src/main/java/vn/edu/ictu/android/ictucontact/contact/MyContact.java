package vn.edu.ictu.android.ictucontact.contact;

public class MyContact {
    private String name;
    private String phone;
    private int avatar;

    public MyContact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public MyContact setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public MyContact setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public int getAvatar() {
        return avatar;
    }

    public MyContact setAvatar(int avatar) {
        this.avatar = avatar;
        return this;
    }
}
