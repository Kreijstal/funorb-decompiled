/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int field_a;
    static String field_b;
    static String field_e;
    static rf field_c;
    static String field_d;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static void a(String param0, float param1, int param2) {
        if (param2 != -21801) {
            return;
        }
        try {
            od.field_i = param0;
            q.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "mc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a() {
        field_b = null;
        field_e = null;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "COMPONENTS";
        field_e = "Respawns - ";
        field_c = new rf();
        field_d = "NO SLOT";
    }
}
