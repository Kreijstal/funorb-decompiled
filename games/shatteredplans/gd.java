/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static int[] field_b;
    static String field_c;
    static String field_a;

    public static void b(int param0) {
        field_b = null;
        int var1 = 122 / ((param0 - 7) / 63);
        field_c = null;
        field_a = null;
    }

    final static void a() {
        if (!(null != va.field_d)) {
            va.field_d = new bi[]{lg.a(0, qq.field_w[0]), lg.a(0, qq.field_w[1])};
        }
        gf.b();
        int var1 = 240;
        wc.a(-27030, di.field_m << 1, -va.field_d[0].field_z + 640 >> 1, va.field_d[0], var1, 256);
        wc.a(-27030, -128 + (di.field_m << 1), -va.field_d[1].field_z + 640 >> 1, va.field_d[1], var1 - -va.field_d[1].field_w, 256);
        int var2 = hp.field_n.a("intro", (byte) 53);
        int discarded$0 = 100;
        kl.a((byte) 73, 455, 15, 16711680, 10, var2);
    }

    final static void a(int param0, int param1) {
        sl var2 = js.field_f;
        var2.h(param0, 255);
        var2.c(1, (byte) -123);
        var2.c(0, (byte) -78);
    }

    final static void a(lq param0) {
        try {
            rs.field_Bb.a((byte) -113, (oh) (Object) param0);
            wj.a(320, 4, param0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "gd.D(" + (param0 != null ? "{...}" : "null") + 44 + 1500005281 + 44 + 4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[1024];
        field_c = "Name";
        field_a = null;
    }
}
