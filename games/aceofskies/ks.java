/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ks {
    static kp field_d;
    static String field_c;
    static boolean field_b;
    static int field_a;

    public static void a() {
        field_d = null;
        field_c = null;
    }

    final static ej a(int param0, int param1) {
        ej[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ej[] var5 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        int discarded$4 = 112;
        var5 = sf.d();
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var5.length <= var3) {
            if (param1 == -28228) {
              return null;
            } else {
              ej discarded$5 = ks.a(-73, -126);
              return null;
            }
          } else {
            if (var5[var3].field_d == param0) {
              return var5[var3];
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new kp();
        field_c = "Loading fonts";
        field_b = true;
    }
}
