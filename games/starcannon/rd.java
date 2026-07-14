/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rd extends uh {
    static String field_n;
    static hl[] field_p;
    static String field_o;
    static String[] field_q;

    public static void e(int param0) {
        field_q = null;
        if (param0 != -29826) {
            return;
        }
        field_n = null;
        field_o = null;
        field_p = null;
    }

    final static vi d(int param0) {
        if (param0 >= -8) {
            field_q = null;
            return hh.field_d;
        }
        return hh.field_d;
    }

    rd() {
    }

    final static byte[] a(String param0, int param1) {
        int var2 = 45 / ((12 - param1) / 44);
        return tf.field_a.a("", (byte) -105, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "SCORE:";
        field_n = "Resume Game";
    }
}
