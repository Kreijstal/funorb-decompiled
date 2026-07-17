/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static int field_b;
    static String field_a;
    static qj field_e;
    static ti field_c;
    static Boolean field_f;
    static int field_d;

    final static kl a(Throwable param0, String param1) {
        kl var2 = null;
        if (!(param0 instanceof kl)) {
            var2 = new kl(param0, param1);
        } else {
            var2 = (kl) (Object) param0;
            var2.field_a = var2.field_a + 32 + param1;
        }
        return var2;
    }

    public static void a() {
        field_e = null;
        field_c = null;
        field_f = null;
        field_a = null;
    }

    final static void a(int param0, String param1, boolean param2, float param3) {
        try {
            if (!(gh.field_m != null)) {
                gh.field_m = new sd(ci.field_f, tg.field_c);
                ci.field_f.b((qg) (Object) gh.field_m, (byte) -71);
            }
            gh.field_m.a(param2, param1, (byte) -27, param3);
            sb.c();
            kh.a(-111, true);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ch.C(" + 58 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Play free version";
        field_e = new qj();
    }
}
