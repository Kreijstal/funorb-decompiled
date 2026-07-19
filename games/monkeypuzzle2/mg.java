/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mg extends a {
    static volatile int field_s;
    static boolean field_t;
    static int field_q;
    static String field_r;
    static gg field_u;
    static String field_v;

    mg(ta param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_C, -1, 2147483647, false);
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        try {
            if (param0) {
                eb.b(param3 + param1.field_r, 0, param1.field_p, param1.field_l, param2 - -param1.field_e);
            }
            if (param4 < 19) {
                mg.c(88);
            }
            super.a(param0, param1, param2, param3, 49);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "mg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    mg(int param0) {
        this(t.field_z, param0);
    }

    public static void c(int param0) {
        field_u = null;
        field_r = null;
        if (param0 != -1) {
            return;
        }
        field_v = null;
    }

    static {
        field_t = false;
        field_q = 0;
        field_r = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_s = 0;
        field_v = "Age:";
    }
}
