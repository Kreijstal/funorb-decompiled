/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static int field_b;
    static int field_a;
    static ea[] field_c;

    final static void a(byte param0, vf param1, java.awt.Frame param2) {
        ia var3_ref_ia = null;
        int var3 = 0;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        L0: while (true) {
          var3_ref_ia = param1.a(param2, true);
          L1: while (true) {
            if (var3_ref_ia.field_c != 0) {
              if (-2 != (var3_ref_ia.field_c ^ -1)) {
                gf.a(100L, -10309);
                continue L0;
              } else {
                var3 = -23 / ((-22 - param0) / 52);
                param2.setVisible(false);
                param2.dispose();
                return;
              }
            } else {
              gf.a(10L, -10309);
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 24044) {
            field_b = 66;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
