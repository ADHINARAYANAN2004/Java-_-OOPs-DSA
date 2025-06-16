public class Method {
  static int boxvolume(int length , int breath , int height){//method definition
        int vol;
        vol = length * breath * height ;
        return vol;
    }


     public static void main(String[] args){

        System.out.println("Hello");//method call
         int volume = boxvolume(12,15,15);
         System.out.println(volume);


     }
}
