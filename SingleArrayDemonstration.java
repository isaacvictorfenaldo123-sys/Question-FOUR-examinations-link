

package qn4.singlearraydemonstration;


public class SingleArrayDemonstration {

    public static void main(String[] args) {
         int[] marks = new int[5];
        marks[0] = 90;
        marks[1] = 86;
        marks[2] = 76;
        marks[3] = 95;
        marks[4] = 87;

        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }
}
