class Collisions
{
    public int find(int size, HashTable mytable, String word)
    {
        //fill  this in so as to minimize collisions
        //takes in the HashTable object and the word to be found
        //the only thing you can do with the HashTable object is call "check"
        //this method should return the slot in the hashtable where the word is
        //int max = 7;
        int unique=0,hashindex=0;
        for(int i=0;i<word.length();i++)
        {
            unique =unique + (int)((int)word.charAt(i)*Math.pow(27,i));
        }
        //int jumpsize = max-(unique%max);
        hashindex =Math.abs(unique%size);
        for(int i=hashindex; i<size; i=i++)
        {
            if(mytable.check(i ,word))
            {
                return i;
            }
        }
        return 0;
    }
    
    public String[] fill(int size, String[] array)
    {
        //takes in the size of the hashtable, and the array of Strings to be placed in the hashtable
        //this should add all the words into the hashtable using some system
        //then it should return the hashtable array
        int unique = 0,hashindex=0 ;
        String[] hashtable = new String[size];
        for(int i=0;i<array.length;i++)
        {
            for(int j =0; j<array[i].length();j++)
            {
                unique = unique + (int)((int)array[i].charAt(j)*Math.pow(27,i));
            }
            hashindex = Math.abs(unique%size);
            hashtable[hashindex] = array[i];
        }
        return hashtable;
        
    }
}