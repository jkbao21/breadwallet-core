/*
 * EthereumToken
 *
 * Created by Ed Gamble <ed@breadwallet.com> on 3/20/18.
 * Copyright (c) 2018 breadwallet LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.electraproject.core.ethereum;


import com.electraproject.core.BRCoreJniReference;

import java.util.HashMap;

public class BREthereumToken extends BRCoreJniReference {

    protected BREthereumToken (long jniReferenceAddress) {
        super (jniReferenceAddress);
    }

    public native String getAddress ();
    public native String getSymbol ();
    public native String getName ();
    public native String getDescription ();
    public native int getDecimals ();

    public long getIdentifier () {
        return jniReferenceAddress;
    }


    protected static native long jniGetTokenBRD ();
    protected static native long[] jniTokenAll ();

    @Override
    public void dispose() {
        // avoid 'super.dispose()' and thus 'native.dispose()'
    }

    @Override
    public int hashCode() {
        return getAddress().toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return "BREthereumToken{" + getSymbol() + "}";
    }
}
