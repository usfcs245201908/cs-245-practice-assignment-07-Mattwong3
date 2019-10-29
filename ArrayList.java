public class ArrayList<T> implements List<T> {
    T []a;
    int size;

    public ArrayList(){
        a = (T[]) new Object[10];
         size = 0;

    }

    public void add(T item){
        T[]b;

        if(size==a.length) {

            b = (T[]) new Object[size * 2];
            for (int i = 0; i < b.length;i++){
                b[i] = a[i];
            }
            a=b;
        }


        a[size] = item;
        size++;


    }
    public void add(int pos, T item){
        T[]b;

        if(pos<0 || pos > size)
            System.out.println("Not in bounds");
        if(size == a.length) {

            b = (T[]) new Object[size * 2];
            for (int i = 0; i < b.length; i++) {
                b[i] = a[i];
            }
            a = b;
        }
        for(int i = size;i >pos;i--){
            a[i] = a[i-1];

        }
        a[pos] = item;
        size++;



    }
    public T get(int pos)
    {
        return a[pos];

    }



    public T remove(int pos){

        if(pos < 0 || pos > size) {
            //throw new .....
        }
        T thing = a[pos];

        for(int i = pos+1;i< size;i++){
            a[i-1] = a[i];
        }
        --size;
        return thing;

    }
    public int size(){

        return size;
    }


}
