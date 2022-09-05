/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.consensys.eventeum.dto.event.filter.correlationId;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * An abstract CorrelationIdStrategy that considers the correlation id of a specific contract event
 * to be the value of a parameter at a specified index.
 *
 * @author Craig Williams <craig.williams@consensys.net>
 */
@Data
@NoArgsConstructor
public abstract class ParameterCorrelationIdStrategy implements CorrelationIdStrategy {
    private int parameterIndex;

    private String type;

    protected ParameterCorrelationIdStrategy(String type, int parameterIndex) {
        this.type = type;
        this.parameterIndex = parameterIndex;
    }
}
