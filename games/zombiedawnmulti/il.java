/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends br {
    int field_f;
    int field_m;
    int field_i;
    int[] field_o;
    int field_p;
    int field_g;
    static int field_k;
    static ul field_n;
    static String field_j;
    int field_h;
    static String field_l;

    final void a(int param0, int param1, int param2, byte param3, int[] param4, int param5, int param6, int param7) {
        ((il) this).field_i = param6;
        ((il) this).field_g = param1;
        ((il) this).field_f = param7;
        ((il) this).field_o = param4;
        ((il) this).field_h = param0;
        if (param3 != -120) {
            return;
        }
        try {
            ((il) this).field_p = param2;
            ((il) this).field_m = param5;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "il.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a() {
        field_j = null;
        field_n = null;
        field_l = null;
    }

    il() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Change display name";
    }
}
