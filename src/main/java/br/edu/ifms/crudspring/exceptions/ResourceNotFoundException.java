package br.edu.ifms.crudspring.exceptions;

import java.util.UUID;

public class ResourceNotFoundException extends RuntimeException {
    
    public ResourceNotFoundException(String recurso, String campo, UUID valor){
        super(String.format("%s não encontrado con : %s : '%s'", recurso, campo, valor));
    }

}
