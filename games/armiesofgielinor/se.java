/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static String field_b;
    static int field_e;
    static um field_h;
    static boolean field_f;
    static fo field_g;
    static int field_d;
    static int field_a;
    static boolean field_c;

    final static String a(String param0, int param1, int param2) {
        if (param2 > -29) {
            se.a(93);
        }
        CharSequence var6 = (CharSequence) (Object) param0;
        if (!(hg.a((byte) -90, var6))) {
            return bc.field_d;
        }
        if (gt.a(param0, (byte) -114)) {
            return am.field_F;
        }
        if (2 != th.field_a) {
            return ct.field_m;
        }
        if (si.a(param0, -3404)) {
            return fo.a(4800, ts.field_k, new String[1]);
        }
        if (-101 >= (vg.field_p ^ -1)) {
            return wh.field_d;
        }
        if (jj.a(89, param0)) {
            return fo.a(4800, ql.field_p, new String[1]);
        }
        bv var5 = vl.field_n;
        var5.h(32161, param1);
        var5.field_q = var5.field_q + 1;
        int var4 = var5.field_q;
        var5.b(1, 2);
        var5.b(param0, 13851);
        var5.e(var5.field_q + -var4, 5930);
        return null;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_f = false;
        }
        field_b = null;
        field_g = null;
        field_h = null;
    }

    final static wk[] a(byte param0) {
        wk[] var1 = null;
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
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var1 = new wk[iw.field_n];
        var2 = 0;
        L0: while (true) {
          if (iw.field_n <= var2) {
            if (param0 == 32) {
              rj.d((byte) 101);
              return var1;
            } else {
              return null;
            }
          } else {
            var3 = c.field_e[var2] * qm.field_K[var2];
            var21 = vj.field_j[var2];
            if (ne.field_e[var2]) {
              var23 = cq.field_z[var2];
              var24 = new int[var3];
              var20 = var24;
              var16 = var20;
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L1: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (wk) (Object) new nj(lg.field_d, wr.field_J, j.field_e[var2], iq.field_g[var2], qm.field_K[var2], c.field_e[var2], var24);
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = oe.c(qv.field_j[rn.a((int) var21[var7], 255)], rn.a((int) var23[var7], 255) << -1607052648);
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
                  var1[var2] = new wk(lg.field_d, wr.field_J, j.field_e[var2], iq.field_g[var2], qm.field_K[var2], c.field_e[var2], var22);
                  var2++;
                  continue L0;
                } else {
                  var9[var6_int] = qv.field_j[rn.a(255, (int) var21[var6_int])];
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
        field_b = "Enter name of friend to delete from list";
        field_a = 480;
        field_c = false;
        field_f = false;
    }
}
