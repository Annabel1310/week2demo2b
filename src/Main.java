
public class Main {
    public static void main(String[] args) {

        //what we have
        String fullName = "Annabel Nakimuli";
//ANNA
        //what we want
//        String[] nameList = {"Annabel", "Nakimuli"};

        //how? split!
        String[] nameList = fullName.split(", " ); //(space is the delimeter

        for(String n : nameList){
            System.out.println(n);
        }

        String[] fruit = {"Apple", "Banana", "Cherry"};
        String text = String.join(" ", fruit); //glue together
        System.out.println(text);

       }
    }
