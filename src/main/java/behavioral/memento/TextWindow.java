package behavioral.memento;

public class TextWindow {
    private String nameField;
    private Integer ageField;


    public String getNameField() {
        return nameField;
    }

    public void setNameField(String nameField) {
        this.nameField = nameField;
    }

    public Integer getAgeField() {
        return ageField;
    }

    public void setAgeField(Integer ageField) {
        this.ageField = ageField;
    }

    public TextWindowState save() {
        return new TextWindowState(nameField, ageField);
    }

    public void restore(TextWindowState state) {
        this.nameField = state.getName();
        this.ageField = state.getAge();
    }

    public void printWindow() {
        System.out.println("=========================");
        System.out.println("NAME: "+this.nameField);
        System.out.println("AGE: "+this.ageField);
    }


}
