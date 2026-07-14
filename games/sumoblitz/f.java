/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends us {
    int field_u;
    static hr[] field_r;
    float field_v;
    static ts field_t;
    static java.awt.Font field_s;
    float field_q;
    int field_p;
    static boolean field_w;

    public static void d(boolean param0) {
        field_s = null;
        field_r = null;
        if (param0) {
            boolean discarded$0 = f.d((byte) 31);
            field_t = null;
            return;
        }
        field_t = null;
    }

    f(fr param0, int param1, int param2, int param3, boolean param4, int[] param5, int param6, int param7) {
        super(param0, param1, 6408, param2, param3, param4, param5, param6, param7, true);
        ((f) this).field_p = param3;
        ((f) this).field_u = param2;
        if (((f) this).field_c == 34037) {
            ((f) this).field_q = (float)param2;
            ((f) this).field_v = (float)param3;
        } else {
            ((f) this).field_q = 1.0f;
            ((f) this).field_v = 1.0f;
        }
    }

    f(fr param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int param7) {
        super(param0, 3553, param1, param4, param5);
        ((f) this).field_u = param2;
        ((f) this).field_p = param3;
        ((f) this).a(0, param6, param7, 0, param2, 0, 0, true, (byte) -124, param3);
        ((f) this).field_q = (float)param2 / (float)param4;
        ((f) this).field_v = (float)param3 / (float)param5;
        ((f) this).a(false, false, -27365);
    }

    final static boolean d(byte param0) {
        if (param0 != 63) {
            String discarded$0 = f.e(false);
            return wt.field_i.b((byte) 126);
        }
        return wt.field_i.b((byte) 126);
    }

    f(fr param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7) {
        super(param0, param1, param2, param3, param4, param5, param6, param7, true);
        ((f) this).field_u = param3;
        ((f) this).field_p = param4;
        if (34037 != ((f) this).field_c) {
            ((f) this).field_v = 1.0f;
            ((f) this).field_q = 1.0f;
        } else {
            ((f) this).field_v = (float)param4;
            ((f) this).field_q = (float)param3;
        }
    }

    final static String e(boolean param0) {
        if (param0) {
            field_s = null;
            return rb.field_c;
        }
        return rb.field_c;
    }

    f(fr param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, 3553, 6408, param3, param4);
        ((f) this).field_p = param2;
        ((f) this).field_u = param1;
        ((f) this).a(param2, param1, 0, param5, 0, 0, 0, true, true);
        ((f) this).field_v = (float)param2 / (float)param4;
        ((f) this).field_q = (float)param1 / (float)param3;
        ((f) this).a(false, false, -27365);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = false;
        field_t = new ts(7, 0, 1, 1);
    }
}
