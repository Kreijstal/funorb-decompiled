/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends tc {
    static ru field_t;
    static String[] field_m;
    om[] field_n;
    String field_o;
    int[] field_p;
    int field_s;
    int field_r;
    String field_l;
    sd[] field_q;
    String field_k;

    public static void a(byte param0) {
        field_t = null;
        if (param0 != 9) {
            cf.a((byte) 115);
            field_m = null;
            return;
        }
        field_m = null;
    }

    final boolean c(byte param0) {
        if (param0 != -45) {
            ((cf) this).field_s = 54;
            return ei.a(((cf) this).field_r, 11906);
        }
        return ei.a(((cf) this).field_r, 11906);
    }

    cf(String param0) {
        try {
            ((cf) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "cf.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
