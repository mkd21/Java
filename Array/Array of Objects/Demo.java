
class Student
{
    int rollNo;
    String name;
    int age;
}


public class Demo 
{
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Mayank";
        s1.age = 27;
        s1.rollNo = 10221;

        Student s2 = new Student();
        s2.name = "Komal";
        s2.age = 26;
        s2.rollNo = 223232;

        Student s3 = new Student();
        s3.name = "Vishal";
        s3.age = 32;
        s3.rollNo = 83232;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // it will look somethin like 

        // [ s1 , s2 , s3 ]

        // we cannot do System.out.println(s1); and will get all the values because its an object

        for(int i = 0; i < students.length; i++)
        {
            System.out.println(students[i].name + " " + students[i].age + " " + students[i].rollNo);
        }
    }
}