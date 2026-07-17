/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo {
    static hl field_b;
    static String field_a;
    static byte[] field_e;
    static hl field_c;
    static String field_d;

    final static int a(int param0, byte param1, int param2, int param3) {
        if (ra.field_f >= param2 + param0) {
          return param2;
        } else {
          if (0 <= -param0 + (param3 + param2)) {
            return -param0 + (param3 + param2);
          } else {
            if (param1 <= 88) {
              eo.a((byte) -127);
              return ra.field_f - param0;
            } else {
              return ra.field_f - param0;
            }
          }
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_c = null;
        if (param0 >= -100) {
          var2 = null;
          eo.a(89, 53, 44, (String) null, 60, (String) null);
          field_d = null;
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    final static void a(int param0) {
        ka.field_h = ta.a(ti.field_g, new double[3], new double[3]);
        bd.field_b = ta.a(ka.field_h);
        if (param0 >= -14) {
            field_a = null;
        }
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, String param5) {
        bc var8 = null;
        int var7 = 0;
        try {
            var8 = nd.field_Lb;
            bc var6 = var8;
            var8.f(param2, (byte) -92);
            var8.field_t = var8.field_t + 1;
            var7 = var8.field_t;
            var8.a(param4, false);
            if (!(param0 != ~param4)) {
                var8.a(param3, 0);
            }
            if (param5 == null) {
                var8.b(param1, false);
            } else {
                int discarded$0 = hn.a(false, param5, (bh) (Object) var8);
            }
            var8.b(var8.field_t + -var7, -2);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "eo.A(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "To play a multiplayer game, please log in or create a free account.";
        field_d = "<%0> cannot join; the game is full.";
    }
}
