/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends br {
    static th field_k;
    int field_m;
    static String[] field_n;
    static String[] field_g;
    static String field_l;
    static ja[] field_j;
    static String field_i;
    br field_h;
    uj field_f;

    public static void a(byte param0) {
        field_i = null;
        field_g = null;
        field_l = null;
        field_k = null;
        field_n = null;
        field_j = null;
    }

    final static String a(byte param0, String param1, String param2, String param3) {
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        int var4 = param2.indexOf(param1);
        while (-1 != var4) {
            param2 = param2.substring(0, var4) + param3 + param2.substring(param1.length() + var4);
            var4 = param2.indexOf(param1, param3.length() + var4);
        }
        int var5 = -18 / ((-2 - param0) / 54);
        return param2;
    }

    we(uj param0, br param1) {
        try {
            ((we) this).field_f = param0;
            ((we) this).field_m = param0.h();
            ((we) this).field_h = param1;
            ((we) this).field_f.d(((we) this).field_m * db.field_c + 128 >> 8);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "we.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new th();
        field_n = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_i = "Resilient";
        field_l = "Remove <%0> from ignore list";
    }
}
