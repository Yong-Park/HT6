public class Factory {

    /**
     * Factory que regresa el tipo de mapa elegido
     * @param data El numero de la implementacion a utilizar
     * @return GeneralMap El tipo de mapa elegido
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