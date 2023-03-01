package ListaEncadeada;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada(){
         this.referenciaEntrada = null;

    }
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;

            return;

        }
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
          return getNo(index).getConteudo();

    }


    private No<T>getNo(int index) {
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;

    }

    //index == 0 informa que estou removendo o nó de indice 0
    // noPivor.getProximoNo(); faz com que eu aponto para o próximo nó, o seja a referência do primeiro nó será o segundo e assim sucessivamente.
    public T remove(int index) {

        No<T> noPivor = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }


    //quando a referenciaAux for null, o looping irá quebrar/parar.
    public int size(){
         int  tamanhoLista = 0;
         No<T> referenciaAux = referenciaEntrada;
         while(true){
             if(referenciaAux != null){
                 tamanhoLista++;
                 if(referenciaAux.getProximoNo() != null) {
                       referenciaAux = referenciaAux.getProximoNo();
                 }else{
                     break;
                 }
             }else{
                   break;


             }
         }
         return tamanhoLista;

    }


        private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index + " desta lista. Esta lista só vai até o index " + ultimoIndice + '.');

        }
    }

    public boolean isEmpty(){
          return referenciaEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size(); i++) {
            strRetorno += "No{conteudo=" + noAuxiliar.getConteudo() + "}----->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";


        return strRetorno;
    }
}
