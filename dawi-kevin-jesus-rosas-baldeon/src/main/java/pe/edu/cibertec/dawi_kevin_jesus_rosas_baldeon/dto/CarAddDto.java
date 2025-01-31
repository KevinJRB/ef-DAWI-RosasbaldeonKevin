package pe.edu.cibertec.dawi_kevin_jesus_rosas_baldeon.dto;

import java.util.Date;

public record CarAddDto(Integer carId,
                        String make,
                        String model,
                        Integer year,
                        String vin,
                        String licensePlate,
                        String ownerName,
                        String ownerContact,
                        Date purchaseDate,
                        Integer mileage,
                        String engineType,
                        String color,
                        String insuranceCompany,
                        String insurancePolicyNumber,
                        Date registrationExpirationDate,
                        Date serviceDueDate) {
}
