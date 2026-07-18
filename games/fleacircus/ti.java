/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static String field_a;
    static String field_b;

    final static String a(byte param0) {
        int var1 = 0;
        if (cb.field_v == wi.field_f) {
          return oa.field_o;
        } else {
          if (!uc.field_c.a(-117)) {
            return uc.field_c.c(-16955);
          } else {
            var1 = 76 % ((param0 - -86) / 33);
            if (wi.field_f == ui.field_kb) {
              return uc.field_c.c(-16955);
            } else {
              return aa.field_s;
            }
          }
        }
    }

    final static boolean b(int param0) {
        return ma.a(-120, rl.a((byte) -77));
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<shad=808080>";
        field_b = "<%0>Barriers:<%1> Acts like a normal wall, but can be removed by triggering a blue switch.";
    }
}
