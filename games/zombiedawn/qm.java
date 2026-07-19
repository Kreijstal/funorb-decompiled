/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm {
    static int field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            qm.a(-78);
        }
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = ZombieDawn.field_J;
        try {
            sh.field_e = param1;
            if (param0 == sh.field_e) {
                ne.field_c = new no(-28 + hp.field_A.a(true), 8 + hp.field_A.f(237239984));
                og.field_A = false;
                pl.field_t = new lm[100];
                for (var2_int = 0; -101 < (var2_int ^ -1); var2_int++) {
                    var3 = so.c(8192);
                    var4 = so.c(90);
                    var5 = (var4 * fb.a(1311979239, var3) >> 658316112) + 480;
                    var6 = 490 - -(var4 * rd.a(true, var3) >> -1330995504);
                    pl.field_t[var2_int] = new lm(var5, var6, -15 + so.c(30));
                }
            }
            qd.a(true, param0 + 111);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "qm.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
