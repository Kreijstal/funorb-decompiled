/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static ed field_a;
    static byte[][] field_b;

    final static void c(int param0) {
        ed var1 = null;
        ed var2 = null;
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        try {
            var1 = new ed(540, 140);
            eo.a(var1, (byte) -7);
            bi.b();
            em.d();
            kb.field_d = 0;
            fi.a(-124);
            var2 = var1.b();
            for (var3 = 0; var3 < 15; var3++) {
                var2.e(-2, -2, 16777215);
                em.d(4, 4, 0, 0, 540, 140);
            }
            ea.field_d.g();
            var1.g(0, 0);
            dl.a((byte) 116);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "id.D(" + 120 + ')');
        }
    }

    final static void a(int param0, int param1) {
        jn.field_c = 33;
        jn.field_a = 21845;
        jn.field_e = 133;
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
    }

    final static int a(int param0) {
        ak var1 = rc.field_a;
        if (aj.b(-126)) {
            return var1.a(1, 0);
        }
        return var1.a(1, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new byte[50][];
    }
}
