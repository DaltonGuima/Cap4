package com.fatec.sig1.services;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.fatec.sig1.model.Cliente;
import com.fatec.sig1.model.MantemClienteRepository;
import com.google.gwt.user.client.rpc.core.java.util.Arrays;

@Configuration
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Autowired
    MantemClienteRepository clienteRepository;

    @Bean
    CommandLineRunner initDatabase(MantemClienteRepository repository) {
        return args -> {
            repository.deleteAll();
            Cliente cliente1 = new Cliente("Jose da Silva", "01/03/1964", "M", "59672555598", "03694000", "2983");
            cliente1.setEndereco("Aguia de Haia");
            log.info("Preloading " + repository.save(cliente1));
            Cliente cliente2 = new Cliente("Nestor José", "19/08/1970", "M", "16467548671", "04280130", "59");
            cliente2.setEndereco("Rua Frei Joao");
            log.info("Preloading " + repository.save(cliente2));
            Cliente cliente3 = new Cliente("Nestordfsadwfgyuwgfuwbfkewafewdijhgerw José", "12/08/1970", "M", "51325339814", "04280130", "59");
            cliente3.setEndereco("Rua Frei Joao");
            log.info("Preloading " + repository.save(cliente3));


            /* ItemBuild teste = new ItemBuild();
            ItemBuild teste1 = new ItemBuild();
            ArrayList<ItemBuild> a  = new ArrayList<ItemBuild>();
            a.add(teste1);
            a.add(teste);
            Build build1 = new Build(1.2f,"a",a);
            log.info("a", + repository.save(build1)) */
        };
    }
}