package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OutBoundPayload {
    private String cityName;
    private String description;
    private String sunRise;
    private String sunSet;
    private String country;
}
