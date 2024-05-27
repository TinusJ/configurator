/*
 * *
 *  * -----------------------------------------------------------------------------
 *  * <p>© ${YEAR} TinusJ. All rights reserved.</p>
 *  * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  * use this file except in compliance with the License. You may obtain a copy
 *  * of the License at</p>
 *  * <p>http://www.apache.org/licenses/LICENSE-2.0</p>
 *  * <p>Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  * License for the specific language governing permissions and limitations
 *  * under the License.</p>
 *  * -----------------------------------------------------------------------------
 *
 *
 */

package com.tinusj.configurator.entity;

import com.tinusj.configurator.enums.PropertyType;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyField {

    private Long id;
    private String name;
    private String valueAsString;
    private Object value;

//    @Enumerated(EnumType.STRING)
    private PropertyType type;

    @Override
    public String toString() {
        return "PropertyField{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", valueAsString='" + valueAsString + '\'' +
                ", value=" + value +
                ", type=" + type +
                '}';
    }
}
