/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gv {
    static String field_b;
    static wk[][][] field_a;

    final static wk a(int param0) {
        wk discarded$1 = null;
        int var1 = 0;
        byte[] var2 = null;
        int[] var3 = null;
        int var4_int = 0;
        wk var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var1 = c.field_e[0] * qm.field_K[0];
        var6 = vj.field_j[0];
        var2 = var6;
        var3 = new int[var1];
        var4_int = 0;
        if (param0 == 2809) {
          L0: while (true) {
            L1: {
              if (var1 <= var4_int) {
                break L1;
              } else {
                var3[var4_int] = qv.field_j[rn.a(255, (int) var6[var4_int])];
                var4_int++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = new wk(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[0], var3);
            rj.d((byte) 97);
            return var4;
          }
        } else {
          discarded$1 = gv.a(11);
          L2: while (true) {
            L3: {
              if (var1 <= var4_int) {
                break L3;
              } else {
                var3[var4_int] = qv.field_j[rn.a(255, (int) var6[var4_int])];
                var4_int++;
                if (var5 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var4 = new wk(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[0], var3);
            rj.d((byte) 97);
            return var4;
          }
        }
    }

    public static void b(int param0) {
        field_a = (wk[][][]) null;
        field_b = null;
        if (param0 > 82) {
            return;
        }
        wk discarded$0 = gv.a(24);
    }

    static {
        field_b = "Fog of War: ";
    }
}
