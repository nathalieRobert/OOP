package fe.simplon.oop.tp;


public abstract class AbstractOpenAndClose implements Connection {

    @Override
    public void open() {
	System.out.println("open : " + url());
    }
    
    @Override
    public void close() {
	System.out.println("close : " +url());
    }

    

  
    
    
}
