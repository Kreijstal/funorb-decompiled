/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static int[] field_d;
    static bm field_c;
    static String field_a;
    static boolean field_b;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        if (param0 < 109) {
            wl.a(58);
        }
    }

    final static int b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (-7 >= (var2 ^ -1)) {
            if (param0 != 25685) {
              na discarded$2 = wl.c(-10);
              return var1;
            } else {
              return var1;
            }
          } else {
            var1 = var1 + al.field_U[var2];
            var2++;
            continue L0;
          }
        }
    }

    final static na c(int param0) {
        if (param0 != 11) {
          return null;
        } else {
          L0: {
            if (q.field_j == null) {
              q.field_j = new na();
              q.field_j.a(jd.field_s, (byte) 99);
              q.field_j.field_a = 2763306;
              q.field_j.field_f = 7697781;
              q.field_j.field_i = jn.field_G;
              q.field_j.field_l = 4;
              q.field_j.field_g = 5;
              q.field_j.field_o = 14;
              q.field_j.field_p = 6;
              q.field_j.field_r = 0;
              break L0;
            } else {
              break L0;
            }
          }
          return q.field_j;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[]{0, 3, 33, 2, 14, 11};
        field_a = "Selects your primary weapon, or left-click on the weapon in your HUD.";
        field_c = new bm();
    }
}
