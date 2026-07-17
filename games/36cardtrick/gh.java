/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends qb {
    static pb field_h;
    static boolean field_g;
    int field_m;
    static volatile boolean field_j;
    static kc[] field_n;
    static qj field_k;
    static String field_i;
    int field_l;

    final static void a(byte param0, boolean param1) {
        nf.a(param1, (byte) -2, false);
        if (param0 != 59) {
            field_g = true;
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_i = null;
        field_k = null;
        field_h = null;
        if (param0 != 256) {
            field_i = null;
        }
    }

    private gh() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1) {
        ml.field_a = param0;
    }

    final static void a(li param0, byte param1) {
        try {
            if (param1 > -59) {
                gh.a(-108);
            }
            aj.field_s.a((qb) (Object) new gi(param0, (qb) (Object) param0), 27362);
            bg.field_tb.b((je) (Object) param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "gh.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = true;
        field_g = false;
        field_i = "Close";
        field_h = new pb(256);
    }
}
