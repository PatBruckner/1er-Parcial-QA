package parcial1.filaB.p5;

public class CambioMoneda {

    private String message;
    public CambioMoneda(){}

    public String saveInNewMoney(int amount, String monedaOriginal, String monedaDestino){
        if (amount> 0){
            message="La cantidad convertida fue : ["+(amount*Util.obtenerTipoDeCambio(monedaOriginal,monedaDestino))+"] "+monedaDestino;
        }else{
            message="Cantidad incorrecta";
        }
        return message;
    }
}
