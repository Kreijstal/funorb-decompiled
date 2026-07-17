/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cj extends he {
    static String field_k;
    static String field_m;
    static int[] field_l;

    cj() {
    }

    public static void b(byte param0) {
        field_k = null;
        field_l = null;
        if (param0 != 110) {
            return;
        }
        field_m = null;
    }

    final static void a(qk param0, boolean param1, qk param2, qk param3, int param4) {
        try {
            wh.field_a = nk.a(false, "");
            wh.field_a.a(16511, false);
            ca.a(param2, param3, param0, -25188);
            we.a(0);
            jc.field_P = tj.field_F;
            ei.field_d = tj.field_F;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "cj.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + 126 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Cancel";
    }
}
