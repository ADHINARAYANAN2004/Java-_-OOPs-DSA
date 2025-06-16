 class Box {
    int length;
    int breath;
    int height;
}
public class BoxStructure {
   public static void main(String[] args) {
    Box blackBox = new Box();
    blackBox.length = 12;
    blackBox.breath = 10;
    blackBox.height = 15;
    System.out.println(blackBox.length);
    System.out.println(blackBox.breath);
    System.out.println(blackBox.height);

    Box woodenBox = new Box();
    woodenBox.length = 12;
    woodenBox.breath = 10;
    woodenBox.height = 18;
    System.out.println(woodenBox.length);
    System.out.println(woodenBox.breath);
    System.out.println(woodenBox.height);


    Box cardBoardBox = new Box();
    cardBoardBox.length = 15;
    cardBoardBox.breath = 12;
    cardBoardBox.height = 14;
       System.out.println(cardBoardBox.length);
       System.out.println(cardBoardBox.breath);
       System.out.println(cardBoardBox.height);


       Box greenBox = new Box();
    greenBox.length = 12;
    greenBox.breath = 12;
    greenBox.height = 12;
       System.out.println(greenBox.length);
       System.out.println(greenBox.breath);
       System.out.println(greenBox.height);



   }
}
