
public abstract class iItemGenerator {

    public void openRerward()
    {
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract iGameItem createItem();    
}
