package com.natpryce.snodge.mutagens;

import com.google.gson.JsonElement;
import com.natpryce.snodge.DocumentMutation;
import com.natpryce.snodge.JsonPath;
import com.natpryce.snodge.Mutagen;

import static com.google.common.base.Functions.constant;
import static java.util.Collections.singletonList;

public class ReplaceJsonElement implements Mutagen {
    private final JsonElement replacement;

    public ReplaceJsonElement(JsonElement replacement) {
        this.replacement = replacement;
    }

    @Override
    public Iterable<DocumentMutation> potentialMutations(JsonElement document, JsonPath pathToElement, JsonElement elementToMutate) {
        return singletonList(pathToElement.map(constant(replacement)));
    }
}
