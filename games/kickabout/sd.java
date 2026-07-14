/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static String field_e;
    static hd field_a;
    static int field_b;
    static r field_d;
    static String field_c;

    public static void a(int param0) {
        if (param0 != -1) {
          field_e = null;
          field_e = null;
          field_d = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(ut param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Kickabout.field_G;
        var2 = 0;
        L0: while (true) {
          if (param0.field_y.length <= var2) {
            param0.field_y[0] = 0;
            if (param1 != -51) {
              return;
            } else {
              param0.field_y[-1 + param0.field_o] = 0;
              param0.field_y[(-1 + param0.field_v) * param0.field_o] = 0;
              param0.field_y[-1 + param0.field_y.length] = 0;
              return;
            }
          } else {
            if (param0.field_y[var2] != 0) {
              var2++;
              var2++;
              continue L0;
            } else {
              param0.field_y[var2] = 65793;
              var2++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "buyout can't go below starting price";
        field_c = "Only show lobby chat from my friends";
        field_b = 370;
        field_d = new r();
    }
}
