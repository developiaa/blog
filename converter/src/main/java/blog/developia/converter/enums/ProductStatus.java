package blog.developia.converter.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum ProductStatus {
    WAITING("waiting"),
    APPROVE("approve"),
    REJECT("reject");

    private static final Map<String, ProductStatus> map = new HashMap<>();

    static {
        for (ProductStatus value : values()) {
            map.put(value.name(), value);
        }
    }
    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    ProductStatus(String value) {
        this.value = value;
    }


    @JsonCreator
    public static ProductStatus from(String value) {
        for (ProductStatus status : ProductStatus.values()) {
            if (status.getValue().equals(value)) {
                return status;
            }
        }
        return null;
    }

}
