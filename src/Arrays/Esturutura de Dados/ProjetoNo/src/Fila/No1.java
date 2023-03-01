package Fila;

public class No1<T> {

    private T object;
    private No1<T> refNo;

    public No1(T object){
        this.refNo = null;
        this.object = object;
    }


    public Object getObject() {
        return object;
    }

    public void setObject(T object) {

        this.object = object;
    }

    public No1 getRefNo() {
        return refNo;
    }

    public void setRefNo(No1 refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No1{" +
                "object=" + object +
                '}';
    }
}
