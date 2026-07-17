/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends ms {
    static dt field_n;
    static String field_k;
    static String field_l;
    byte[] field_m;
    static String field_o;

    public static void a(byte param0) {
        field_k = null;
        field_o = null;
        int var1 = -87;
        field_n = null;
        field_l = null;
    }

    final static wb c(byte param0) {
        int var4_int = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        int var1 = vg.field_k[0] * we.field_B[0];
        byte[] var2 = ag.field_d[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = iv.field_l[eb.a(255, (int) var2[var4_int])];
        }
        wb var4 = new wb(vf.field_d, li.field_u, er.field_h[0], av.field_C[0], vg.field_k[0], we.field_B[0], var3);
        tl.a((byte) -59);
        return var4;
    }

    tj(byte[] param0) {
        try {
            ((tj) this).field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "tj.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "time: ";
        field_k = "Type your password again to make sure it's correct";
        field_o = "Create a free account to start using this feature";
    }
}
