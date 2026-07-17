/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cs {
    static ehb field_c;
    static String field_b;
    static tu field_a;

    final static void b(byte param0) {
        int var1 = ldb.field_o * ldb.field_o;
        int var2 = var1 - tb.field_b * tb.field_b;
        int var3 = (-kga.field_o + uh.field_p) * var2 / var1 + kga.field_o;
        hca.field_o.a(icb.field_o, 118, 640, var3, 120);
        int var4 = 81 / ((31 - param0) / 40);
        hp.a(640, -24 + uh.field_p, qs.field_c, false, hi.field_a, 5, 0);
    }

    cs(int param0) {
    }

    final static boolean a(char param0, int param1) {
        if (param0 < 65) {
          if (97 <= param0) {
            if (param0 <= 122) {
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          if (param0 > 90) {
            if (97 <= param0) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ehb(16);
        field_b = "More armour";
        field_a = new tu();
    }
}
