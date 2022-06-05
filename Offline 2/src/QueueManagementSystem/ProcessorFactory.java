package QueueManagementSystem;

public class ProcessorFactory extends AbstractFactory {

    @Override
    Display getDisplay(String type) {
        return null;
    }

    @Override
    Processor getProcessor(String type, int displayCount) {
        if(type==null){
            return null;
        }
        else if(type.equalsIgnoreCase("POOR")){
            return new ATMega32(displayCount);
        }
        else if(type.equalsIgnoreCase("OPTIMAL")){
            return new ArduinoMega(displayCount);
        }
        else if(type.equalsIgnoreCase("DELUXE")){
            return new RaspberryPi(displayCount);
        }

        return null;
    }

    @Override
    CommModule getCommModule(int type) {
        return null;
    }


}
