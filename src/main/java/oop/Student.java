package oop;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * getter of name.
     *
     * @return student's name
     */
    public String getName() {
        return name;
    }

    /**
     * setter of name.
     *
     * @param name name of the student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter of id.
     *
     * @return student's id
     */
    public String getId() {
        return id;
    }

    /**
     * setter of id.
     *
     * @param id id of the student
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * getter of group.
     *
     * @return student's group
     */
    public String getGroup() {
        return group;
    }

    /**
     * setter of group.
     *
     * @param group group of the student
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * getter of email.
     *
     * @return student's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * setter of email.
     *
     * @param email email of the student
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * combine info.
     *
     * @return full student's info
     */
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    /**
     *default constructor.
     *
     */
    Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * constructor with name, id and email.
     *
     * @param name student's name
     * @param id student's id
     * @param email student's email
     */
    Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        group = "K62CB";
    }

    /**
     * copy student.
     *
     * @param s other student
     */
    Student(Student s) {
        name = s.getName();
        id = s.getId();
        group = s.getGroup();
        email = s.getEmail();
    }
}
