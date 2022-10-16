package homeworks.generics;

import java.util.Arrays;

public class MyList<T> {

    private int capacity = 10;
    private T[] arrayList;
    private T[] tempArrayList;

    public MyList() {
        this.arrayList = (T[]) new Object[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.arrayList = (T[]) new Object[capacity];
    }

    public T[] getArrayList() {
        return arrayList;
    }

    public void setArrayList(T[] arrayList) {
        this.arrayList = arrayList;
    }



    public T[] getTempArrayList() {
        return tempArrayList;
    }

    public void setTempArrayList(T[] tempArrayList) {
        this.tempArrayList = tempArrayList;
    }

    public int arraySize(){
        int size=0;
        for (int i = 0; i<getCapacity();i++){
            if (arrayList[i]!=null){
                size++;
            }
        }
        return size;
    }

    public void add(T data){
        if (arraySize()>getCapacity()){
            this.tempArrayList=this.arrayList;
            setCapacity(getCapacity()*2);
            this.arrayList = (T[]) new Object[getCapacity()];
            this.arrayList = Arrays.copyOf(tempArrayList, getCapacity());
        }
        this.arrayList[arraySize()]=data;
    }

    public T getIndex(int index) {
        if (index > arraySize()) {
            return null;
        }
        return this.arrayList[index];
    }

    public T remove(int index) {
        if (arraySize() < index) {
            return null;
        }
        T[] temp = this.arrayList;
        this.arrayList[index] = null;
        for (int i = index; i < arraySize(); i++) {
            if (arraySize() - i == 1)
                this.arrayList[i] = null;
            else
                this.arrayList[i] = temp[i + 1];
        }
        return this.arrayList[index];
    }
    public T set(int index, T data) {
        if (arraySize() < index) {
            return null;
        }
        this.arrayList[index] = data;
        return this.arrayList[index];
    }

    @Override
    public String toString() {
        return "My list : " + Arrays.toString(arrayList);
    }

    public int indexOf(T data) {
        for (int i = 0; i < arraySize(); i++) {
            if (this.arrayList[i] == data) {
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T data) {
        for (int i = arraySize(); i >= 0; i--) {
            if (this.arrayList[i] == data) {
                return i;
            }
        }
        return -2;
    }

    public boolean isEmpty() {
        return arraySize() == 0;
    }

    public T[] toArray() {
        return this.arrayList;
    }

    public MyList<T> subList(int first, int last) {
        MyList<T> list = new MyList<>(last - first + 1);
        for (int i = first; i <= last; i++) {
            list.add(this.arrayList[i]);
        }
        return list;
    }
    public boolean isContains(T data) {
        for (int i = 0; i < arraySize(); i++) {
            if (this.arrayList[i] == data)
                return true;
        }
        return false;
    }

}
