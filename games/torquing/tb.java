/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends q {
    int field_n;
    int field_p;
    static ce field_o;
    int field_q;
    int field_j;
    tb field_k;
    int field_m;
    static uh field_l;

    public static void a() {
        field_o = null;
        field_l = null;
    }

    final static t[] a(boolean param0) {
        t[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        byte[] var23 = null;
        int[] var24 = null;
        var8 = Torquing.field_u;
        var1 = new t[ti.field_g];
        var2 = 0;
        L0: while (true) {
          if (ti.field_g <= var2) {
            go.b(0);
            return var1;
          } else {
            var3 = ij.field_o[var2] * vo.field_b[var2];
            var21 = pn.field_b[var2];
            if (lp.field_e[var2]) {
              var23 = fq.field_G[var2];
              var24 = new int[var3];
              var20 = var24;
              var16 = var20;
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L1: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (t) (Object) new ep(fm.field_E, rh.field_d, fj.field_o[var2], na.field_G[var2], vo.field_b[var2], ij.field_o[var2], var24);
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = gm.a(ie.a((int) var23[var7], 255) << 24, cq.field_y[ie.a((int) var21[var7], 255)]);
                  var7++;
                  continue L1;
                }
              }
            } else {
              var9 = new int[var3];
              var22 = var9;
              var6_int = 0;
              L2: while (true) {
                if (var6_int >= var3) {
                  var1[var2] = new t(fm.field_E, rh.field_d, fj.field_o[var2], na.field_G[var2], vo.field_b[var2], ij.field_o[var2], var22);
                  var2++;
                  continue L0;
                } else {
                  var9[var6_int] = cq.field_y[ie.a((int) var21[var6_int], 255)];
                  var6_int++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    tb(int param0, int param1, int param2, int param3, int param4) {
        ((tb) this).field_n = param4;
        ((tb) this).field_p = param2;
        ((tb) this).field_m = param1;
        ((tb) this).field_j = param0;
        ((tb) this).field_q = param3;
    }

    final static void a(int param0, int param1) {
        op.field_k = 21845;
        op.field_q = 133;
        op.field_j = 33;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new ce();
    }
}
