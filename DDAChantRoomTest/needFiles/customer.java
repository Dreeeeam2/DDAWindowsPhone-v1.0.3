package DDAWindowsPhoneMain.DDAChantRoomTest.needFiles;

public class customer {
    private  String id;
    private  String mima;
    private String name;

    public customer(String name,String id,String mima){
        this.name = name;
        this.id = id;
        this.mima = mima;
    }

    public customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

