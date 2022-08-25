package sectionnine.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class CustomerDepartureInformationV3 {
    // null values are legal
    private static Map<String, String> valuesFromDB = new HashMap<>();
    private static Map<String, String> defaultValues = new HashMap<>();

    public String getByKey(String key) {
        return  Optional.ofNullable( getValueByKey(key)).get().
                orElse(Optional.ofNullable(defaultValues.get(key))
                        .orElse("default"));

    }

    private Optional<String> getValueByKey(String key) {
        if (valuesFromDB.containsKey(key)) {
            return Optional.of(valuesFromDB.get(key));
        } else {
            return Optional.empty();
        }
    }
}