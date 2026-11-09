/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public final class HResult {
    public final static boolean failed(int result, int guard) {
        if (guard != -1) {
          return true;
        }
        return result < 0 ? true : false;
    }

    public final static boolean succeeded(int result, int guard) {
        if (guard > -39) {
          return false;
        }
        return result >= 0 ? true : false;
    }
}
