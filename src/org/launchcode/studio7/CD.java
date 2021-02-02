package org.launchcode.studio7;

public class CD extends BaseDisc{

private static final String spinRate = "200-500";
private String name;
private String content;
//basic instructor

    public CD(boolean isBlank, boolean isWrittable, int isCapacity, String name, String content) {
        super(isBlank, isWrittable, isCapacity);
        this.name = name;
        this.content = content;
    }

    //blank CD constructor
    public CD(boolean isBlank, boolean isRewritable, int capacity) {
        super(isBlank, isRewritable, capacity);
    }

        //Music CD constructor
    public CD(String name, String content) {
    super();
    this.name = name;
    this.content = content;
    }


    //New CD-RW constructor
    public CD CDRW(int capacity){
        return new CD(true,false, capacity);
    }

    public CD CDR(int capacity){
        return new CD(true, false, capacity);
    }



// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
