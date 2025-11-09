package org.xploretown;

public class Dev {
    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    private Computer comp;

    public  void build(){
        System.out.println("Building project as a Dev");
        comp.compile();
    }
}
