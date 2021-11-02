import java.util.Scanner;

public class Main{

    /**
            * This is Main. It's where the GUI is called and creates a spider and crawls the web.
            *
            * @param args
     *            - not used
     */
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

//        Console Version, not used in GUI version
//        System.out.println("Website: ");
//        web = s.nextLine();
//        System.out.println("Word: ");
//        searchWord = s.nextLine();


        GUI gui = new GUI();
        try{
            while(gui.webUrl == null || gui.word == null) {
                Thread.sleep(1000);
            }
            System.out.println(gui.webUrl);
            System.out.println(gui.word);
            Spider spider = new Spider();
            spider.search(gui.webUrl, gui.word);
        }
        catch (Exception ignored){
        }

    }
}
