package ec.edu.espam.api.caja.service;

import ec.edu.espam.api.caja.domain.Cuenta;

import java.util.List;

public interface CuentaServicio {
    List<Cuenta> obtenerTodos();

    Cuenta guardar(Cuenta cuenta);


    Cuenta editar(long id, Cuenta cuenta);

// ... (otros métodos)

    Cuenta obtenerPorId(Long id);
}
