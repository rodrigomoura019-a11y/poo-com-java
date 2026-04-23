## Aula 2
-Final = modificador de acesso utilizado para tornar um elemento imutável ou não extensível (não pode ser alterado, sobrescrito ou herdada)
-LocalDate (classe da API java.time) + .replaceAll (método da classe String) + .substring (método da classe String)

    import java.time.LocalDate;
    this.matricula = LocalDate.now().getYear() + cpf.replaceAll("\\D", "").substring(0, 5);

-Enum = classe especial que restringe a criação de objetos a um conjunto fixo de instâncias pré-definidas

    /*  --É assim que o Java lê o seu Enum nos bastidores:
    *   public final class FormatoLivro {
    *       public static final FormatoLivro PDF = new FormatoLivro();
    *       public static final FormatoLivro EPUB = new FormatoLivro();
    *        
    *       --Construtor bloqueado (private) para ninguém fazer um 'new FormatoLivro()'
    *       private FormatoLivro() {} 
    *   }
    */
    public enum Formato {
        EPUB(aqui é a chamada do construtor),
        PDF(o que for colocado aqui é o mesmo que colocar no momento de instanciamento de uma classe),
        MOBI(mas precisa de um atributo criado para cada elemento adicionado no parenteses),
        Folio(e um construtor definido),
    }

## Aula 4
-BigDecimal = Usado para operações com precisão matemática como foco

    import java.math.BigDecimal;
    BigDecimal saldo = new BigDecimal(2034.320);

## Pesquisa Extra
-Record = Objetos se comportam como transportadores de dados *DTOs*. Com dados que não mudam.

    //transforma os atributos em *private final* + cria construtor + cria métodos de leitura com o nome do atributo
    public record Pessoa(String nome, int idade) { 
        // posso criar variáveis compartilhadas
        // posso criar um construtor personalizado
        // posso criar métodos 
    }