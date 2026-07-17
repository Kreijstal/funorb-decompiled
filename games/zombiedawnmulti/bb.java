/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends br {
    long field_j;
    static String field_h;
    static cj field_k;
    static String field_o;
    static ja field_n;
    int field_l;
    static String field_m;
    static ug field_g;
    static String field_i;
    byte[] field_f;

    public static void a() {
        field_h = null;
        field_g = null;
        field_n = null;
        field_m = null;
        field_o = null;
        field_i = null;
        field_k = null;
    }

    final static String c() {
        if (dj.field_k == id.field_B) {
            return am.field_a;
        }
        return s.field_a;
    }

    bb(long param0, int param1, byte[] param2) {
        try {
            ((bb) this).field_j = param0;
            ((bb) this).field_f = param2;
            ((bb) this).field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "bb.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Come ready for battle.";
        field_h = "Deadly skills!";
        field_o = "Waiting for patches";
        field_i = "Foil their plans.";
    }
}
