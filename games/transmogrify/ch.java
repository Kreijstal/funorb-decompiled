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
        kl var2_ref = null;
        kl var2 = null;
        if (!(param0 instanceof kl)) {
            var2 = new kl(param0, param1);
        } else {
            var2_ref = (kl) (Object) param0;
            var2_ref.field_a = var2_ref.field_a + 32 + param1;
        }
        return var2_ref;
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_f = null;
        field_a = null;
        if (param0 != 807) {
            field_d = 119;
        }
    }

    final static void a(int param0, String param1, boolean param2, float param3) {
        if (param0 < 57) {
          return;
        } else {
          L0: {
            if (gh.field_m == null) {
              gh.field_m = new sd(ci.field_f, tg.field_c);
              ci.field_f.b((qg) (Object) gh.field_m, (byte) -71);
              break L0;
            } else {
              break L0;
            }
          }
          gh.field_m.a(param2, param1, (byte) -27, param3);
          sb.c();
          kh.a(-111, true);
          return;
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
