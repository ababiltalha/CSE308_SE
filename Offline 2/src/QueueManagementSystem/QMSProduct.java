package QueueManagementSystem;

import java.util.ArrayList;

class QMSProduct {
    private ArrayList<Display> displays;
    private Processor processor;
    private CommModule commModule;
    private Application app;


    public QMSProduct() {
        this.displays = new ArrayList<>();
        processor= null;
        commModule= null;
        app= new Application();
    }

    public void addDisplays(Display d, int displayCount){
        for (int i = 0; i < displayCount; i++) {
            this.displays.add(d);
        }
    }

    public void addProcessor(Processor p){
        this.processor=p;
    }

    public void addCommModule(CommModule c){
        this.commModule=c;
    }

    public void show(int year){
        double totalSystemCost= processor.getPrice() + commModule.getPrice() + app.getPrice() + year*commModule.getYearlyCost();//
        System.out.println("Display Unit:\nProcessor:\n"+processor+
                "\nDisplays:");
        System.out.println(displays.get(0)+" x "+displays.size());
        for (int i = 0; i < displays.size(); i++) {
            totalSystemCost+=displays.get(i).getPrice();
        }

        System.out.println("Communication channel:\n"+commModule);
        System.out.println("Application:\n"+app);
        System.out.println("Cost of the total system (with "+year+" year(s) worth of communication cost): Tk. "+totalSystemCost+'\n');
    }
}
