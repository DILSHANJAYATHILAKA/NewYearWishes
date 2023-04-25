public class අවුරුදු {

    void printData(){
        System.out.println("ලබන්නා වූ සිංහල හින්දු අලුත් අවුරුද්ද ඔබ සැමට කිරියෙන් පැණියෙන් උතුරන");
    }

}

class බෙදා_ගන්න extends අවුරුදු{
    @Override
    void printData() {
        System.out.println("හොඳ දේවල් ÷ ගන්න");
    }
}

class එකතු_කරගන්න extends අවුරුදු{
    @Override
    void printData() {
        System.out.println("හරි දේවල් + කරගන්න");
    }
}

class අඩු_කරගන්න extends අවුරුදු{
    @Override
    void printData() {
        System.out.println("වැරදි ඇතොත් - කරගන්න");
    }
}

class වැඩි_කරගන්න extends අවුරුදු{
    @Override
    void printData() {
        System.out.println("හොඳ ගතිගුණ x කරගන්න");
    }
}

class අලුත්_අවුරුද්දක්_වේවා extends  අවුරුදු{
    @Override
    void printData() {
        System.out.println("පුලුවන් වෙන සුබ අලුත් අවුරුද්දක් වේවා...!");
    }
}

class Test{
    public static void main(String[] args) {

        අවුරුදු n,b,c,r,i,y;
        n = new අවුරුදු();
        b = new බෙදා_ගන්න();
        c = new එකතු_කරගන්න();
        r = new අඩු_කරගන්න();
        i = new වැඩි_කරගන්න();
        y = new අලුත්_අවුරුද්දක්_වේවා();
        n.printData();
        b.printData();
        c.printData();
        r.printData();
        i.printData();
        y.printData();

    }
}
