package Exception;

public class DepositoInvalidoException extends RuntimeException{
    public DepositoInvalidoException(String mensagem) {
        super(mensagem);
    }
}