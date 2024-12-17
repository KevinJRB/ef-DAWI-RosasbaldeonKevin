package pe.edu.cibertec.dawi_kevin_jesus_rosas_baldeon.response;

import pe.edu.cibertec.dawi_kevin_jesus_rosas_baldeon.dto.CarDto;

import java.util.List;

public record FindCarsResponse(String code, String error, List<CarDto> cars) {
}
