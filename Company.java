
import java.util.HashMap;

public class Company {
     
    String name;
    String contact;
    String role;
    int salary;
    HashMap<String, String> companyMap = new HashMap<>();

    public String GetCompanyName(){
        return this.name;
    }
    public void SetCompany(String name) {
        companyMap.put("Company Name ", name);
    }

    public void setContact(String contact) {
        companyMap.put("Contact Person ", contact);
    }

    public String getContact() {
        return this.contact;
    }

    public void setRole(String role) {
        companyMap.put("Role ", role);
    }

    public String getRole() {
        return this.role;
    }

    public void setSalary(Integer salary){
        this.salary = salary;
    }

    public Integer getSalary(){
        return this.salary;
    }

}
