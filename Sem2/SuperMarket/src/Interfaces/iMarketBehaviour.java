package Interfaces;

import java.util.List;
import Classes.Actor;

public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviour actor);
    void releaseFromMarket(List<Actor> actors);
    void update();    
}
