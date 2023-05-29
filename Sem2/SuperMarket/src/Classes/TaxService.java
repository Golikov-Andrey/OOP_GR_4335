package Classes;

import Interfaces.iActorBehaviour;

public class TaxService implements iActorBehaviour  {

    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxService() {
        this.name = "Tax audit";
    }

    public String getName() {        
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       isTakeOrder = pickUpOrder;   
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }
    
}
