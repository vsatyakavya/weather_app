package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sys {
    private Long type;
    private Long id;
    private String country;
    private String sunrise;
    private String sunset;
}
