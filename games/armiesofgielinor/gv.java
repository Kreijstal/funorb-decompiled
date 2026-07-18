/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gv {
    static String field_b;
    static wk[][][] field_a;

    final static wk a(int param0) {
        int var1 = 0;
        byte[] var2 = null;
        int[] var3 = null;
        int var4_int = 0;
        wk var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        int[] var7 = null;
        byte[] var8 = null;
        int[] var9 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var1 = c.field_e[0] * qm.field_K[0];
        var8 = vj.field_j[0];
        var6 = var8;
        var2 = var6;
        var9 = new int[var1];
        var7 = var9;
        var3 = var7;
        var4_int = 0;
        if (param0 == 2809) {
          L0: while (true) {
            if (var1 <= var4_int) {
              var4 = new wk(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[0], var9);
              rj.d((byte) 97);
              return var4;
            } else {
              var3[var4_int] = qv.field_j[rn.a(255, (int) var8[var4_int])];
              var4_int++;
              continue L0;
            }
          }
        } else {
          wk discarded$1 = gv.a(11);
          L1: while (true) {
            if (var1 <= var4_int) {
              var4 = new wk(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[0], var9);
              rj.d((byte) 97);
              return var4;
            } else {
              var3[var4_int] = qv.field_j[rn.a(255, (int) var8[var4_int])];
              var4_int++;
              continue L1;
            }
          }
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Fog of War: ";
    }
}
