package com.devcave.springbootmicroservice1inmueble.service;

import com.devcave.springbootmicroservice1inmueble.model.Inmueble;

import java.util.List;

public interface InmuebleService {


    Inmueble saveInmueble(Inmueble inmueble);

    void deleteInmueble(Long inmuebleId);

    List<Inmueble> findAllInmuebles();
}
