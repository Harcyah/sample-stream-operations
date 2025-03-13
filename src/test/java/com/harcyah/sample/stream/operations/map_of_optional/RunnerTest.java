package com.harcyah.sample.stream.operations.map_of_optional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RunnerTest {

    private static final List<Input> INPUTS = List.of(
        new Input("abc"),
        new Input("1"),
        new Input("3"),
        new Input("foo")
    );

    private final Runner sut = new Runner();

    @Test
    void run() {
        List<Output> outputs = sut.run(INPUTS);
        assertThat(outputs).containsExactly(
            new Output(1),
            new Output(3)
        );
    }

}
