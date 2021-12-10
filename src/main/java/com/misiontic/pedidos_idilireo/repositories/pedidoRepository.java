package com.misiontic.pedidos_idilireo.repositories;

import com.misiontic.pedidos_idilireo.models.pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface pedidoRepository extends MongoRepository <pedido, String>{ }
