// tag::all[]
// tag::allButValidation[]
package sia.tacocloud;

import java.util.List;
import lombok.Data;

@Data
public class Taco {

    private String name;
    private List<String> ingredients;

}
