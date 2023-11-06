package com.harcyah.sample.stream.operations.map_of_optional;

import java.util.List;
import java.util.Optional;

public class Runner {

    public List<Output> run(List<Input> inputs) {
        return inputs.stream()
            .map(it -> {
                try {
                    return Optional.of(Integer.parseInt(it.value()));
                } catch (Exception e) {
                    return Optional.<Integer> empty();
                }
            })
            .flatMap(Optional::stream)
            .map(Output::new)
            .toList();
    }

}
