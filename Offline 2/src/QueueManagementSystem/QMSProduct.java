package QueueManagementSystem;

import java.util.ArrayList;

class QMSProduct {
    private ArrayList<Part> parts;


    public QMSProduct() {
        this.parts = new ArrayList<>();
        this.parts.add(new Application());
    }

    public void addDisplays(Display d, int displayCount){
        for (int i = 0; i < displayCount; i++) {
            this.parts.add(d);
        }
    }

    public void addProcessor(Processor p){
        this.parts.add(p);
    }

    public void addCommModule(CommModule c){
        this.parts.add(c);
    }

    public void show(int year){
        double totalCommunicationCost=0;
        double totalSystemCost=0;
        for (int i = 0; i < parts.size(); i++) {
            System.out.println(parts.get(i));
            totalSystemCost+=parts.get(i).getPrice();
            if(parts.get(i) instanceof CommModule){
                totalCommunicationCost+=year*((CommModule) parts.get(i)).getYearlyCost();
            }
        }
        System.out.println("Cost of the total queue management system: Tk. "+(totalSystemCost));
        System.out.println("Cost of the total system (with "+year+" year(s) worth of communication cost): Tk. "+(totalSystemCost+totalCommunicationCost));
    }
}
