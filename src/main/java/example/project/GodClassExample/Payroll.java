package example.project.GodClassExample;

import java.util.Map;

public class Payroll {

    Map<String, PaySchedule> staffCategoryPaySchedule;

    public Payroll(Map<String, PaySchedule> staffCategoryPaySchedule) {
        this.staffCategoryPaySchedule = staffCategoryPaySchedule;
    }

    public PaySchedule getStaffCategoryPaySchedule(String staffCategory) {
        return staffCategoryPaySchedule.get(staffCategory);
    }

    public void changePayDay(String staffCategory, String date) {
        PaySchedule paySchedule = staffCategoryPaySchedule.get(staffCategory);
        paySchedule.setPayDay(date);
    }

    public String getPayDay(String staffCategory) {
        PaySchedule paySchedule = staffCategoryPaySchedule.get(staffCategory);
        return paySchedule.getPayDay();
    }

}