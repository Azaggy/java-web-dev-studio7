package org.launchcode.studio7;

public class BaseDisc {

    protected boolean isBlank;
    protected boolean isWrittable;
    protected int isCapacity;

    public BaseDisc(boolean isBlank, boolean isWrittable, int isCapacity) {
        this.isBlank = isBlank;
        this.isWrittable = isWrittable;
        this.isCapacity = isCapacity;
    }
    public BaseDisc() {
        this.isBlank = false;
        this.isWrittable = false;

            }
            public void printCapacity () {
                System.out.println("This disc has the capacity of" + this.isCapacity + "GB.");
            }
}
