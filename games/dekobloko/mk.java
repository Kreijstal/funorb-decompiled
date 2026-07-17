/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mk {
    static int field_e;
    static int[] field_b;
    static nh field_d;
    static int[] field_c;
    static String field_a;

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    abstract byte[] a(int param0);

    final static void a(int param0, int param1, byte param2, cc param3, int param4, cc param5) {
        try {
            if (param2 >= 0) {
                mk.a((byte) 1);
            }
            le.field_t = param0;
            je.field_c = param1;
            ql.field_b = param5;
            ba.field_d = param4;
            gf.field_b = param3;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "mk.C(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(byte param0) {
        wc var3 = null;
        if (param0 != -5) {
            Object var2 = null;
            mk.a(-94, -9, (byte) -115, (cc) null, -10, (cc) null);
            var3 = (wc) (Object) ci.field_a.d(param0 ^ 113);
            if (!(var3 != null)) {
                throw new IllegalStateException();
            }
            hk.a(var3.field_t, var3.field_w, var3.field_s);
            hk.b(var3.field_p, var3.field_v, var3.field_o, var3.field_u);
            var3.field_t = null;
            sn.field_e.a((bh) (Object) var3, param0 ^ -2782);
            return;
        }
        wc var4 = (wc) (Object) ci.field_a.d(param0 ^ 113);
        if (!(var4 != null)) {
            throw new IllegalStateException();
        }
        hk.a(var4.field_t, var4.field_w, var4.field_s);
        hk.b(var4.field_p, var4.field_v, var4.field_o, var4.field_u);
        var4.field_t = null;
        sn.field_e.a((bh) (Object) var4, param0 ^ -2782);
    }

    abstract void a(byte[] param0, boolean param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Match by...";
        field_c = new int[256];
    }
}
