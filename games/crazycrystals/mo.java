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
        String var2 = (String) null;
        da.a(dg.field_a, 114, (String) null);
        if (param0 >= -53) {
            field_l = 108;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        gh.field_w = param3;
        kb.field_h = param1;
        io.field_O = param0;
        sc.field_g = param2;
        if (param4 != -16) {
            field_l = -54;
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_h = null;
        int var1 = -12 % ((param0 - 45) / 52);
        field_i = null;
    }

    mo(long param0, int param1, byte[] param2) {
        try {
            this.field_j = param1;
            this.field_k = param0;
            this.field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "mo.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new int[]{-1, 1, 0, 0};
    }
}
