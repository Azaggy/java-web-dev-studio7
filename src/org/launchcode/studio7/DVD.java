package org.launchcode.studio7;

public class DVD extends BaseDisc{
    private static final String spinRate = "570- 1600";
    private String name;
    private String content;
//basic instructor
    public DVD(boolean isBlank, boolean isWrittable, int isCapacity, String name, String content) {
        super(isBlank, isWrittable, isCapacity);
        this.name = name;
        this.content = content;
    }
    //blank dvd constructor
    public DVD(boolean isBlank, boolean isRewritable, int capacity) {
        super(isBlank, isRewritable, capacity);
    }
    //Video DVD
    public DVD(String name, String content) {
        super();
        this.name = name;
        this.content = content;
    }
    public DVD DVDRW (int capacity){
        return new DVD(true,false, capacity);
    }

    public DVD DVDR(int capacity){
        return new DVD(true,false, capacity);
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
