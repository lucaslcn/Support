public class MySetUnique extends MySet
{
    public void add(String s) {
        if (! this.array.contains(s)) {
            this.array.add(s);
        }
    }   
}

