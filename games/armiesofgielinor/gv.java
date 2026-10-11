/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gv {
    static String field_b;
    static wk[][][] field_a;

    final static wk a(int param0) {
        wk var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var1 = c.field_e[0] * qm.field_K[0];
        byte[] var6 = vj.field_j[0];
        byte[] var2 = var6;
        int[] var3 = new int[var1];
        int var4_int = 0;
        wk var4Lifetime1;
        if (param0 != 2809) {
          gv.a(11);
          while (var1 > var4_int) {
            var3[var4_int] = qv.field_j[rn.a(255, (int) var6[var4_int])];
            var4_int++;
          }
          var4 = new wk(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[0], var3);
          rj.d((byte) 97);
          return var4;
        }
        while (var1 > var4_int) {
          var3[var4_int] = qv.field_j[rn.a(255, (int) var6[var4_int])];
          var4_int++;
        }
        var4Lifetime1 = new wk(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[0], var3);
        rj.d((byte) 97);
        return var4Lifetime1;
    }

    public static void b(int param0) {
        field_a = (wk[][][]) null;
        field_b = null;
        if (param0 > 82) {
          return;
        }
        gv.a(24);
    }

    static {
        field_b = "Fog of War: ";
    }
}
