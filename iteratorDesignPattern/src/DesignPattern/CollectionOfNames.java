package DesignPattern;

public class CollectionOfNames implements Container {
    public String name[] = {"Saurabh Bisht", "Pulkit Prakash", "Rishabh Mehta", "Chetan Singh", "Sailesh Pal"};

    @Override
    public Iterator getIterator() {
        return new CollectionNamesIterate();
    }

    private class CollectionNamesIterate implements Iterator {
        int i;

        @Override
        public boolean hasNext() {
            if (i < name.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return name[i++];
            }
            return null;
        }
    }
}
