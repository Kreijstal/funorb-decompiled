/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static vd[] field_a;
    static int field_d;
    static String field_b;
    static byte[] field_c;

    public static void a(int param0) {
        if (param0 != 480) {
            return;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static al[] a(gk param0, int param1, gk param2, String[] param3, boolean[] param4) {
        al[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = AceOfSkies.field_G ? 1 : 0;
        var5 = new al[param3.length];
        var6 = 0;
        L0: while (true) {
          if (var6 >= var5.length) {
            L1: {
              if (param1 < -72) {
                break L1;
              } else {
                field_a = (vd[]) null;
                break L1;
              }
            }
            return var5;
          } else {
            L2: {
              if (param4 == null) {
                break L2;
              } else {
                if (!param4[var6]) {
                  break L2;
                } else {
                  var5[var6] = t.a(param0, "", param3[var6]).a();
                  var6++;
                  continue L0;
                }
              }
            }
            var5[var6] = bj.a(param2, "", param3[var6]).a();
            var6++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 480;
        field_b = "Type your password again to make sure it's correct";
    }
}
