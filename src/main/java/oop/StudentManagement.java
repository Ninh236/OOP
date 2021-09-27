package oop;

public class StudentManagement {
    private static Student[] students = new Student[101];
    private static int countStudent = 0;

    /**
     * compare groups of two students.
     *
     * @param s1 first student
     * @param s2 second student
     * @return true or false
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * add a student in student list.
     *
     * @param newStudent student need to be added.
     */
    public static void addStudent(Student newStudent) {
        for (int i = 1; i <= countStudent; i++) {
            if (newStudent.getId().equals(students[i].getId())) {
                return;
            }
        }
        if (countStudent < 100) {
            countStudent++;
            students[countStudent] = newStudent;
        }
    }

    /**
     * divide students by group.
     *
     * @return grouped list
     */
    public static String studentsByGroup() {
        int countGroup = 0;
        String[] groups = new String[101];
        if (countStudent >= 1) {
            groups[++countGroup] = students[1].getGroup();
        }
        for (int i = 2; i <= countStudent; i++) {
            for (int j = 1; j <= countGroup; j++) {
                if (students[i].getGroup().equals(groups[j])) {
                    break;
                }
                if (j == countGroup) {
                    groups[++countGroup] = students[i].getGroup();
                }
            }
        }
        String groupedStudents = "";
        for (int i = 1; i <= countGroup; i++) {
            groupedStudents = groupedStudents.concat(groups[i] + "\n");
            for (int j = 1; j <= countStudent; j++) {
                if (students[j].getGroup().equals(groups[i])) {
                    groupedStudents = groupedStudents.concat(students[j].getInfo() + "\n");
                }
            }
        }

        return groupedStudents;
    }

    /**
     * remove student from list.
     *
     * @param id id of student need to be removed
     */
    public static void removeStudent(String id) {
        int position = 101;
        for (int i = 1; i <= countStudent; i++) {
            if (students[i].getId().equals(id)) {
                position = i;
                countStudent--;
                break;
            }
        }
        for (int i = position; i <= countStudent; i++) {
            students[i] = students[i + 1];
        }
    }
    public static void main(String[] args) {
        Student a = new Student("Doan Duy Tung", "002", "2@vnu.edu.vn");
        a.setGroup("K65CC");
        Student b = new Student("Nguyen Ngoc Ninh", "001", "1@vnu.edu.vn");
        Student c = new Student("Vu Duc Hieu", "003", "3@vnu.edu.vn");
        Student d = new Student("Vu Duc Hieu", "003", "3@vnu.edu.vn");
        addStudent(a);
        addStudent(b);
        addStudent(c);
        addStudent(d);
        removeStudent("004");
        removeStudent("003");
        String test = studentsByGroup();
        System.out.print(test);
    }
}
