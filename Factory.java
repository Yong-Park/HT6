public class Factory {
    public GeneralMap FactorySelection(int data){
        if(data == 0){
            return new Hash<String, String>();
        }else if(data == 1){
            return new Tree<String, String>();
        }else if(data == 2){
            return new Linked<String, String>();
        }
        return null;
    }  
}
