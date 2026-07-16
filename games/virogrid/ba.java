/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ba {
    static il field_c;
    static int field_a;
    static String field_b;

    final static String a(String param0, int param1, byte param2) {
        if (!(-4 != (param1 ^ -1))) {
            return nm.field_c;
        }
        if (param2 != 83) {
            return null;
        }
        if ((param1 ^ -1) == -7) {
            return na.field_Eb;
        }
        if (!(-8 != (param1 ^ -1))) {
            return hg.field_o;
        }
        if ((param1 ^ -1) == -9) {
            return ti.field_c;
        }
        if (!(param1 != 9)) {
            return wc.field_e;
        }
        if (!((param1 ^ -1) != -11)) {
            return se.field_a;
        }
        if (11 == param1) {
            return qd.field_g;
        }
        if (param1 != 14) {
            return null;
        }
        return oi.a(new String[1], oe.field_d, param2 ^ 81);
    }

    abstract int a(int param0, int param1);

    final static void b(int param0) {
        if (param0 != 14) {
            ba.a(-71);
        }
    }

    abstract sj a(byte param0);

    abstract byte[] b(int param0, int param1);

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 14) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
