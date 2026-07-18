/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class af {
    static String field_a;
    static String field_b;

    final static void a() {
        t var1 = null;
        t var2 = null;
        int var3 = 0;
        int var4 = Torquing.field_u;
        try {
            var1 = new t(540, 140);
            tm.a((byte) -121, var1);
            be.a();
            ph.b();
            jh.field_z = 0;
            so.b(119);
            var2 = var1.c();
            for (var3 = 0; var3 < 15; var3++) {
                var2.b(-2, -2, 16777215);
                ph.d(4, 4, 0, 0, 540, 140);
            }
            ff.field_c.e();
            var1.c(0, 0);
            r.a(126);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "af.C(" + true + ')');
        }
    }

    abstract void b(int param0);

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 23394) {
            af.a(-25);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Connection lost - attempting to reconnect";
        field_b = "?";
    }
}
