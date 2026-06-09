/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package io.debezium.connector.sqlite;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ModuleTest {

    @Test
    void shouldReturnVersion() {
        assertThat(Module.version()).isNotNull();
        assertThat(Module.version()).isNotEmpty();
    }
}
