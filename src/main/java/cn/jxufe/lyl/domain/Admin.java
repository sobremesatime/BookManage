package cn.jxufe.lyl.domain;

public class Admin {
    int admin_id;
    String adminname;
    String password;

    public Admin() {
    }

    public Admin(int admin_id, String adminname, String password) {
        this.admin_id = admin_id;
        this.adminname = adminname;
        this.password = password;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin_id=" + admin_id +
                ", adminname='" + adminname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
