public class Factory {
    
    /** 
     * @param data
     * @return GeneralMap
     */
    public GeneralMap FactorySelection(int data){
        if(data == 1){
            return new Hash<String, String>();
        }else if(data == 2){
            return new Tree<String, String>();
        }else if(data == 3){
            return new LinkedMap<String, String>();
        }
        return null;
    }  
}
