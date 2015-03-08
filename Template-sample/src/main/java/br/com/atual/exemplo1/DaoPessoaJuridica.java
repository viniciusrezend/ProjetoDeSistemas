package br.com.atual.exemplo1;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class DaoPessoaJuridica extends Dao {

    @Override
    protected Boolean valida(IBean entidade) {
        System.out.println("Executado em pessoa juridica");
        
        PessoaJuridica pessoajuridica = (PessoaJuridica) entidade;

        if (pessoajuridica.getId() != null && pessoajuridica.getCnpj() != null) {
            return true;
        }

        return false;
    }
       
}
