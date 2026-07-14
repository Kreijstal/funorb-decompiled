/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static er field_a;
    boolean field_f;
    int field_c;
    static int[] field_d;
    static String field_e;
    int field_g;
    static int field_b;

    public static void a(byte param0) {
        int var1 = 5 / ((13 - param0) / 51);
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final boolean a(bk param0, byte param1) {
        int var3 = -74 % ((param1 - -86) / 33);
        return true;
    }

    final boolean a(nj param0, byte param1) {
        if (param1 != 95) {
            return false;
        }
        return ((nj) this).field_c == param0.field_c ? true : false;
    }

    public final String toString() {
        return super.toString();
    }

    nj(int param0, int param1) {
        ((nj) this).field_f = true;
        ((nj) this).field_g = param1;
        ((nj) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new er(1);
        field_e = "End Game";
        field_d = new int[13];
    }
}
