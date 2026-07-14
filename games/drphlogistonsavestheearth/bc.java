/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static nh field_d;
    static String[] field_e;
    static gk field_c;
    static String field_g;
    static sa field_a;
    static int field_f;
    static String[] field_b;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 < 28) {
          field_b = null;
          field_g = null;
          field_a = null;
          return;
        } else {
          field_g = null;
          field_a = null;
          return;
        }
    }

    final static vi a(String param0, int param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        vi var5 = null;
        if (param0 != null) {
          if (0 != param0.length()) {
            var2 = param0.indexOf('@');
            if (param1 == -3303) {
              if ((var2 ^ -1) != 0) {
                var3 = param0.substring(0, var2);
                var4 = param0.substring(var2 - -1);
                var5 = qg.b((byte) 71, var3);
                if (var5 != null) {
                  return var5;
                } else {
                  return pd.a(var4, param1 ^ 3302);
                }
              } else {
                return qj.field_e;
              }
            } else {
              return null;
            }
          } else {
            return dm.field_A;
          }
        } else {
          return dm.field_A;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "No highscores";
        field_a = new sa(14, 0, 4, 1);
    }
}
