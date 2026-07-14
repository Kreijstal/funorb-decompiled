/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends ni {
    static qj field_q;
    static sj field_s;
    static int field_t;
    static int[] field_p;
    static String[] field_r;

    final String c(qg param0, int param1) {
        if (param1 <= 53) {
            return null;
        }
        return hk.a(0, param0.field_k.length(), '*');
    }

    nc(int param0) {
        this(vd.field_h, param0);
    }

    public static void c(int param0) {
        field_s = null;
        field_p = null;
        field_q = null;
        if (param0 <= 93) {
            field_s = null;
            field_r = null;
            return;
        }
        field_r = null;
    }

    private nc(kg param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = null;
        field_t = -754974565;
        field_p = new int[4];
        field_r = new String[16];
    }
}
