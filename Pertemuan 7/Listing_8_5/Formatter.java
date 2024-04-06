package Listing_8_5;

import java.lang.reflect.*;
import java.util.*;
import java.util.function.*;

public class Formatter {
    private Map<TypeLiteral<?>, Function<?, String>> rules = new HashMap<>();

    public <T> void forType(TypeLiteral<T> type, Function<T, String> formatterForType) {
        rules.put(type, formatterForType);
    }

    public String formatFields(Object obj) throws IllegalArgumentException, IllegalAccessException {
        var result = new StringBuilder();
        for (Field f: obj.getClass().getDeclaredFields()) {
            result.append(f.getName());
            result.append("=");
            f.setAccessible(true);
            Function<?, String> formatterType = rules.get(TypeLiteral.of(f.getGenericType()));
            if (formatterType != null) {
                @SuppressWarnings("unchecked")
                Function<Object, String> objectFormatter = (Function<Object, String>) formatterType;
                result.append(objectFormatter.apply(f.get(obj)));
            } else {
                result.append(f.get(obj).toString());
            }
            result.append("\n");
        }
        return result.toString();
    }
}
