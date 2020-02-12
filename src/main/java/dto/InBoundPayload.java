package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties
public class InBoundPayload {
    private String id;
    private String name;
    private Long cod;
    private Sys sys;
    private Main main;
    private List<Weather> weather;
}
