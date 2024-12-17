package pe.edu.cibertec.dawi_kevin_jesus_rosas_baldeon.response;

import pe.edu.cibertec.dawi_kevin_jesus_rosas_baldeon.dto.CarDetailDto;

public record FindCarResponse(String code, String error, CarDetailDto carDetailDto) {
}
