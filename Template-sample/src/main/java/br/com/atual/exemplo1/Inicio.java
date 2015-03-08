package br.com.atual.exemplo1;

/**
 * Created by Ton on 04/03/2015.
 */
public class Inicio {


    public static void main(String[] args) {
        System.out.println("Teste salvando");

        DaoPessoaJuridica daoPessoaJuridica = new DaoPessoaJuridica();
        PessoaJuridica pessoajuridica = new PessoaJuridica();
        pessoajuridica.setCnpj("058794568977");
        pessoajuridica.setNome("Unicesumar");
        daoPessoaJuridica.salvar(pessoajuridica);
        
        
        DaoPessoaFisica daoPessoaFisica = new DaoPessoaFisica();
        PessoaFisica pf = new PessoaFisica();
        pf.setId(0);
        pf.setNome("Ana");
        pf.setCpf("04251217985");
        daoPessoaFisica.salvar(pf);


        DaoCliente daoCliente = new DaoCliente();
        Cliente cliente = new Cliente();
        cliente.setId(0);
        cliente.setNome("Cliente legal");
        cliente.setNumeroCliente(123);

        daoCliente.salvar(cliente);


    }

}
