/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq implements Runnable {
    volatile bp[] field_e;
    sj field_i;
    volatile boolean field_h;
    static String field_b;
    static int field_f;
    static le field_c;
    static dd field_a;
    static String field_g;
    volatile boolean field_d;

    final static void a(vh param0, byte param1) {
        vh var3 = null;
        vh var4 = null;
        try {
            var3 = (vh) (Object) param0.field_T.c((byte) -74);
            vh var2 = var3;
            while (var3 != null) {
                var3.field_Db = 0;
                var3.field_Cb = 0;
                var3.field_eb = 0;
                var3.field_E = 0;
                var4 = (vh) (Object) param0.field_T.f((byte) -5);
                var4 = var4;
            }
            param0.field_Db = 0;
            param0.field_eb = 0;
            param0.field_E = 0;
            param0.field_Cb = 0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "mq.A(" + (param0 != null ? "{...}" : "null") + ',' + 109 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        if (null != kk.field_B) {
            pp.a(kk.field_B, 1259627265);
        }
        if (vl.field_m != null) {
            vl.field_m.a(param1, 12887);
        }
        re.a(-113, param1);
        if (!(fc.field_b == null)) {
            fc.field_b.a((byte) -79, param1);
        }
        t.a(48, param1);
    }

    public final void run() {
        int var1_int = 0;
        bp var2 = null;
        int var4 = Pool.field_O;
        ((mq) this).field_h = true;
        try {
            while (!((mq) this).field_d) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((mq) this).field_e[var1_int];
                    if (var2 != null) {
                        var2.d();
                    }
                }
                cf.a(-105, 10L);
                cb.a((Object) null, ((mq) this).field_i, 120);
            }
        } catch (Exception exception) {
            Object var5 = null;
            tc.a((Throwable) (Object) exception, (String) null, -8555);
        } finally {
            ((mq) this).field_h = false;
        }
    }

    mq() {
        ((mq) this).field_e = new bp[2];
        ((mq) this).field_d = false;
        ((mq) this).field_h = false;
    }

    public static void a(boolean param0) {
        field_g = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Don't mind";
        field_g = "Loading sound effects";
    }
}
