/*
 *  Licensed to GraphHopper GmbH under one or more contributor
 *  license agreements. See the NOTICE file distributed with this work for
 *  additional information regarding copyright ownership.
 *
 *  GraphHopper GmbH licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except in
 *  compliance with the License. You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.graphhopper.util.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Date;

/**
 * @author Peter Karich
 */
public class GHPoint3DTest {
    @Test
    public void testEquals() {
        GHPoint3D point1 = new GHPoint3D(1, 2, Double.NaN);
        GHPoint3D point2 = new GHPoint3D(1, 2, Double.NaN);
        assertEquals(point1, point2);

        point1 = new GHPoint3D(1, 2, 3, Double.NaN, 1, new Date());
        point2 = new GHPoint3D(1, 2, 3, Double.NaN, 2, new Date());
        assertEquals(point1, point2);

        point1 = new GHPoint3D(1, 2, 0, 0, 1, new Date());
        point2 = new GHPoint3D(1, 2, 1, 0, 2, new Date());
        assertNotEquals(point1, point2);

        point1 = new GHPoint3D(1, 2, 0, 0, 1, new Date());
        point2 = new GHPoint3D(1, 2, 0, 1, 2, new Date());
        assertNotEquals(point1, point2);

        point1 = new GHPoint3D(1, 2, 0, 0,1,new Date());
        point2 = new GHPoint3D(1, 2.1, 0, 0,2,new Date());
        assertNotEquals(point1, point2);

        point1 = new GHPoint3D(1, 2.1, 0, 0,1,new Date());
        point2 = new GHPoint3D(1, 2.1, 0, 0,2, new Date());
        assertEquals(point1, point2);
    }
}
