/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    private static String field_z;

    final static ts a(int param0, int param1) {
        ts[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ts[] var5 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        int discarded$2 = 96;
        var5 = pb.a();
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var5.length > var3) {
            if (param1 != var5[var3].field_b) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "ij.A(";
    }
}
