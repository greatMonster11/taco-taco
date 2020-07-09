// tag::all[]
// tag::allButValidation[]
package sia.tacocloud;

import java.util.List;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Taco {

    @NotNull
    @Size(min=5, message="Name must be at least 5 chracters long.")
    private String name;

    @Size(min=1, message="You must at least 1 ingredient.")
    private List<String> ingredients;

}
