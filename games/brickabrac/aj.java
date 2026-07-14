/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static jp[][] field_c;
    static String field_b;
    static jp[][] field_a;

    public static void b(int param0) {
        if (param0 != -789103103) {
          int discarded$2 = aj.a(57, -37, 115);
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    final static mf a(int param0, boolean param1) {
        if (!param1) {
          field_b = null;
          return go.a(false, param0, false, 1, true, true);
        } else {
          return go.a(false, param0, false, 1, true, true);
        }
    }

    final static mh a(int param0) {
        if (param0 != 1345) {
            aj.b(94);
            return rl.field_e.field_Rb;
        }
        return rl.field_e.field_Rb;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        var3 = param0;
        var4 = mi.field_d;
        L0: while (true) {
          if (kn.field_E.length > var3) {
            var5 = re.field_q[var3];
            if (0 > var5) {
              var4 = var4 + wh.field_m;
              var3++;
              var3++;
              continue L0;
            } else {
              var6 = pl.a(0, kn.field_E[var3], true);
              var7 = -(var6 >> -789103103) + cc.field_J;
              var4 = var4 + dj.field_g;
              if (bg.a(-ek.field_lb + var7, (wg.field_f << 1214339297) + nq.field_i, (ek.field_lb << 256028001) + var6, (byte) 80, param1, param2, var4)) {
                return var5;
              } else {
                var4 = var4 + (dj.field_g + ((wg.field_f << -1129312959) - -nq.field_i));
                var3++;
                var3++;
                continue L0;
              }
            }
          } else {
            return -1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Asking to join <%0>'s game...";
    }
}
