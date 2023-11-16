package com.mycompany.edumatch;

import java.util.List;
import java.sql.Timestamp;

public interface IOperacionesCrudDB<T> {
    void crear(T entidad);
    T leer(String id);
    void actualizar(T entidad);
    void eliminar(String id);
    List<T> listar();
}
