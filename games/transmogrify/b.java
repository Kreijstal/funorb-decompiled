/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends wf {
    byte[] field_h;
    long field_g;
    static vl field_i;
    static int field_k;
    int field_j;

    public static void d(int param0) {
        field_i = null;
        if (param0 != -22826) {
            field_i = null;
        }
    }

    final static boolean a(String param0, byte param1) {
        if (param1 != 24) {
            return false;
        }
        return null != mk.a(param1 ^ 108, param0) ? true : false;
    }

    b(long param0, int param1, byte[] param2) {
        ((b) this).field_g = param0;
        ((b) this).field_j = param1;
        ((b) this).field_h = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0;
    }
}
