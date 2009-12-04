/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.jni.cts;

import junit.framework.TestCase;

/**
 * Basic static method tests. The "nonce" class being tested by this
 * class is a class defined in this package that declares the bulk of
 * its methods as native.
 */
public class JniStaticTest extends TestCase {
    /**
     * Test a simple no-op and void-returning method call.
     */
    public void test_nop() {
        StaticNonce.nop();
    }

    /**
     * Test a simple value-returning (but otherwise no-op) method call.
     */
    public void test_returnInt() {
        assertEquals(12345678, StaticNonce.returnInt());
    }

    /**
     * Test a simple value-returning (but otherwise no-op) method call.
     */
    public void test_returnDouble() {
        assertEquals(12345678.9, StaticNonce.returnDouble());
    }

    // TODO: Add more tests here. E.g:
    //    call to method that instantiates its class (based on received jclass)
    //    call to method returning constant byte
    //    call to method returning constant char
    //    call to method returning constant short
    //    call to method returning constant long
    //    call to method returning constant float
    //    call to method returning constant Object (null)
    //    call to method returning constant String (non-null)
    //    call to method taking byte, returning a "got expected" flag
    //    call to method taking char, returning a "got expected" flag
    //    call to method taking short, returning a "got expected" flag
    //    call to method taking int, returning a "got expected" flag
    //    call to method taking long, returning a "got expected" flag
    //    call to method taking float, returning a "got expected" flag
    //    call to method taking double, returning a "got expected" flag
    //    call to method taking String, returning a "got expected" flag
    //    call to method taking (int, long), returning a "got expected" flag
    //    call to method taking (long, int), returning a "got expected" flag
}