/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    static String field_a;
    static int field_c;
    static String field_b;

    final static void a(int param0, int param1) {
        if (param0 != 0) {
            return;
        }
        int discarded$0 = uo.a((byte) -75);
    }

    final static void a(boolean param0) {
        bq.a(127);
        hr.a(bh.field_m[0].field_o, cr.field_c, tg.field_a, 113, pe.field_K, rc.field_l);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, v param1, int param2, v param3, int param4, int param5) {
        try {
            cs.field_l = param3;
            sm.field_b = param5;
            ar.field_i = param2;
            if (param0 != -4440) {
                field_b = null;
            }
            kr.field_a = param1;
            tr.field_Lb = param4;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "te.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Cancel draw";
        field_b = "Click to hide the Diplomacy window.";
    }
}
