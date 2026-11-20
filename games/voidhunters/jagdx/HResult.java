/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public final class HResult {
    public final static boolean failed(int param0, byte param1) {
        int var2 = 11 / ((-56 - param1) / 55);
        return 0 > param0 ? true : false;
    }

    public final static boolean succeeded(int param0, byte param1) {
        if (param1 <= 10) {
          return true;
        }
        return param0 >= 0 ? true : false;
    }
}
