public class App {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario1 = new Funcionario("João", 2000.00);
        Gerente gerente1 = new Gerente("Maria", 4000.00, 1500.00);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Carlos", 3000.00,10.0,50.0);

        System.out.println(funcionario1.informacoes() + gerente1.informacoes() + desenvolvedor1.informacoes());
    }
}
