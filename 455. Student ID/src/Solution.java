public class Solution {
    class Student {
        public int id;

        public Student(int id) {
            this.id = id;
        }
    }

    public class Class {
        public Student[] students;

        public Class(int n) {
            this.students = new Student[n];
            for (int i = 0; i < n; i++) {
                this.students[i] = new Student(i);
            }
        }
    }
}