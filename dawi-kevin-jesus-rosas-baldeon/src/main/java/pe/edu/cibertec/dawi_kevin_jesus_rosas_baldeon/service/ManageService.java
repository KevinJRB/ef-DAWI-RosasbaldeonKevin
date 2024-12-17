package pe.edu.cibertec.dawi_kevin_jesus_rosas_baldeon.service;

import pe.edu.cibertec.dawi_kevin_jesus_rosas_baldeon.dto.CarAddDto;
import pe.edu.cibertec.dawi_kevin_jesus_rosas_baldeon.dto.CarDetailDto;
import pe.edu.cibertec.dawi_kevin_jesus_rosas_baldeon.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {

    List<CarDto> getAll() throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarAddDto carAddDto) throws Exception;
}
