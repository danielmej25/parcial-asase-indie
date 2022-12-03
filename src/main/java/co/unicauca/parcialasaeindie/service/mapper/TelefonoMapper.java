package co.unicauca.parcialasaeindie.service.mapper;

import co.unicauca.parcialasaeindie.model.Telefono;
import co.unicauca.parcialasaeindie.model.dto.TelefonoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)

public interface TelefonoMapper {
    List<Telefono> telefonosDTOsToTelefonos(List<TelefonoDTO> list);
}
