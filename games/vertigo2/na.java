/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends da {
    static int field_n;
    static String[] field_m;
    static boolean field_p;
    static String field_l;
    static int[] field_o;

    public static void g(int param0) {
        if (param0 != -27799) {
          na.g(15);
          field_o = null;
          field_m = null;
          field_l = null;
          return;
        } else {
          field_o = null;
          field_m = null;
          field_l = null;
          return;
        }
    }

    final ba a(int param0, String param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) (Object) param1;
        if (!qb.a(var4, -51)) {
          return ir.field_a;
        } else {
          var5 = (CharSequence) (Object) param1;
          var3 = cf.a(107, var5);
          if (var3 < param0) {
            if (-131 < var3) {
              return ir.field_a;
            } else {
              return qm.field_G;
            }
          } else {
            return ir.field_a;
          }
        }
    }

    na(kp param0) {
        super(param0);
    }

    final String b(int param0, String param1) {
        if (param0 != 3614) {
            na.g(-83);
            if (!(((na) this).a(-1, param1) != ir.field_a)) {
                return br.field_S;
            }
            return null;
        }
        if (!(((na) this).a(-1, param1) != ir.field_a)) {
            return br.field_S;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 1;
        field_l = "Chat view has been scrolled up. Scroll down to chat.";
        field_o = new int[28];
    }
}
