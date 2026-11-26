/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends IntrusiveNode {
    static BufferedSocket field_j;
    static String field_h;
    static AudioOutput field_g;
    static int field_i;

    public static void clearStaticReferences(int param0) {
        field_h = null;
        field_j = null;
        if (param0 != -1962269296) {
          field_h = (String) null;
          field_g = null;
          return;
        }
        field_g = null;
    }

    final static int roundUpPowerOfTwo(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        if (param0 == -85) {
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return param1 + 1;
        }
        return 125;
    }

    private cb() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "Suggested names: ";
    }
}
