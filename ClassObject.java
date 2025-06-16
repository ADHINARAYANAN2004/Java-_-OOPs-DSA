public class ClassObject {
    public static void main(String[] args) {
        //store in 5 roll no
        //store in  5 name
        // data of 5 student:(roll no,name, mark)
        int [] rollno = new int[5];
         String [] name = new String[5];
        float []  mark = new float [5];

        student [] students = new student[5];
        // just declearing
      // student arun;
        //arun = new student();
        student arun = new student();
        arun.rollno = 101;
        arun.name ="arun kumar";
        arun. mark = 88.5f;


        System.out.println(arun.rollno);
        System.out.println(arun.name);
        System.out.println(arun.mark);

         student mohan = new student();
         mohan.rollno=102;
         mohan.name = "mohan raj";
         mohan.mark = 55.5f;

        System.out.println(mohan.rollno);
        System.out.println(mohan.name);
        System.out.println(mohan.mark);


    }
    static class student{
        int rollno ;
        String name ;
        float mark=90 ;

    }
}