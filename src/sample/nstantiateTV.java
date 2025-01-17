package sample;

public class nstantiateTV {

    public static void main(String[] args) {
        
        TV sonyTV = new TV();
        sonyTV.changeChannel(5);

        TV sharpTV = new TV();
        sharpTV.changeChannel(13);

        sharpTV.channel=14;

        System.out.println(sharpTV.channel);
    }
}
