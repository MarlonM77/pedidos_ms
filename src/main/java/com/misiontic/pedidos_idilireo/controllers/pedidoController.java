package com.misiontic.pedidos_idilireo.controllers;

import com.misiontic.pedidos_idilireo.exceptions.pedidoNotFoundException;
import com.misiontic.pedidos_idilireo.models.pedido;
import com.misiontic.pedidos_idilireo.repositories.pedidoRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class pedidoController {

    private final pedidoRepository pedidoRepository;

    public pedidoController(pedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }

    @GetMapping("/pedidos/{username}")
    pedido getPedido(@PathVariable String username) {
        return pedidoRepository.findById(username)
                .orElseThrow(() -> new pedidoNotFoundException("No se Encuentran pedidos vigentes " +
                        "para el usuarior: " + username));
    }

    @PostMapping("/pedidos")
    pedido newPedido(@RequestBody pedido pedido){
        return pedidoRepository.save(pedido);
    }
}
