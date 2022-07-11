package pruebas;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OptionRequestData {
    private String subjectHeading;
    private String sMailAddress;
    private String message;

}
