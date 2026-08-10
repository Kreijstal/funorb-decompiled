/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends ca {
    static int field_j;
    int[] field_n;
    int field_k;
    int[] field_l;
    eb[] field_h;
    static int field_f;
    eb[] field_i;
    static String field_p;
    byte[][][] field_g;
    int field_o;
    int[] field_m;

    public static void c(boolean param0) {
        if (!param0) {
            field_p = (String) null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    final static void a(int param0, hj[] param1, boolean param2, int param3, int param4, int param5, kc param6, int param7, byte param8, int param9, int param10, hj[] param11) {
        try {
            hf.a(param6, param7, param5, param3, param10, param2, param4, param11, param6, param0, 127, param9, param7, param1, param3);
            if (param8 != 5) {
                ud.c(true);
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ud.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + (param11 != null ? "{...}" : "null") + ')');
        }
    }

    ud() {
    }

    static {
        field_f = 0;
        field_j = 0;
        field_p = "to over <%0> great games";
    }
}
