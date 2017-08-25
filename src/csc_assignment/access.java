package csc_assignment;

/**
 * Created by oluwalekefakorede on 28/07/2017.
 */
class access{
    static int x ;
    void increment(){
        x++;
    }
}
class static_use{
    int volume ;
    int height;
    int width;
    int length;
    public static void main(String[] args){
        static_use obj = new static_use();
        obj.height = 4;
        obj.width = 5;
        obj.length = 1;
        obj.volume(2,3,1);
        System.out.println(obj.volume);
        int value = 3 << 45;
        System.out.println(value);
    }
    void volume(int height,int length, int width){
        volume = height * length * width;
    }
}