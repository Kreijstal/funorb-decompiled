/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_f;
    static int[] field_j;
    static String field_d;
    static int field_c;
    static String field_i;
    static String field_a;
    static long field_e;
    static aj field_b;
    static String field_g;
    static io field_h;

    public static void b(int param0) {
        field_a = null;
        field_h = null;
        field_i = null;
        field_j = null;
        field_b = null;
        if (param0 != 28) {
            field_a = null;
        }
        field_d = null;
        field_g = null;
        field_f = null;
    }

    final static qb[] a(int param0) {
        qb[] var1 = null;
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
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        var1 = new qb[h.field_J];
        var2 = param0;
        L0: while (true) {
          if (var2 >= h.field_J) {
            dk.a(-18229);
            return var1;
          } else {
            var3 = ho.field_i[var2] * jg.field_p[var2];
            var21 = ln.field_I[var2];
            if (dn.field_Ib[var2]) {
              var23 = vi.field_O[var2];
              var24 = new int[var3];
              var20 = var24;
              var16 = var20;
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L1: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (qb) (Object) new od(pb.field_g, gn.field_a, hl.field_l[var2], be.field_d[var2], jg.field_p[var2], ho.field_i[var2], var24);
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = fj.b(ph.field_c[dg.a(255, (int) var21[var7])], dg.a(-16777216, var23[var7] << -86934024));
                  var7++;
                  continue L1;
                }
              }
            } else {
              var9 = new int[var3];
              var22 = var9;
              var6_int = 0;
              L2: while (true) {
                if (var3 <= var6_int) {
                  var1[var2] = new qb(pb.field_g, gn.field_a, hl.field_l[var2], be.field_d[var2], jg.field_p[var2], ho.field_i[var2], var22);
                  var2++;
                  continue L0;
                } else {
                  var9[var6_int] = ph.field_c[dg.a(255, (int) var21[var6_int])];
                  var6_int++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[]{27, 28, 29};
        field_d = "Scamming";
        field_a = "Kick <%0> from this game";
        field_c = 256;
        field_i = "Who can join";
        field_f = "Primary";
        field_b = new aj(11, 0, 1, 2);
        field_g = "Become a member to buy this spell";
    }
}
