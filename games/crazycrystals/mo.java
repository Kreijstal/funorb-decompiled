/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo extends jb {
    byte[] field_g;
    long field_k;
    static vc field_m;
    static int[] field_h;
    static int field_f;
    static ko field_i;
    static int field_l;
    int field_j;

    final static void a(byte param0) {
        Object var2 = null;
        da.a(dg.field_a, 114, (String) null);
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        gh.field_w = param3;
        kb.field_h = param1;
        io.field_O = param0;
        sc.field_g = param2;
    }

    public static void a(int param0) {
        field_m = null;
        field_h = null;
        int var1 = 0;
        field_i = null;
    }

    mo(long param0, int param1, byte[] param2) {
        try {
            ((mo) this).field_j = param1;
            ((mo) this).field_k = param0;
            ((mo) this).field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "mo.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{-1, 1, 0, 0};
    }
}
