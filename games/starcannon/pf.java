/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static String field_b;
    static ue field_a;
    static String field_c;
    static int field_d;
    static int field_e;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            pf.a(false);
        }
        field_c = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(CharSequence param0, boolean param1, boolean param2) {
        int var3 = 0;
        int var4 = StarCannon.field_A;
        if (!(tj.a((byte) -79, param1, param0))) {
            return false;
        }
        if (param2) {
            field_a = null;
        }
        for (var3 = 0; param0.length() > var3; var3++) {
            if (!(sa.a((byte) -121, param0.charAt(var3)))) {
                return false;
            }
        }
        return true;
    }

    final static hl[] a(int param0) {
        hl[] var1 = null;
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
        L0: {
          var8 = StarCannon.field_A;
          if (param0 == 255) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var1 = new hl[bj.field_b];
        var2 = 0;
        L1: while (true) {
          if (bj.field_b <= var2) {
            rc.b((byte) -104);
            return var1;
          } else {
            var3 = gg.field_d[var2] * gh.field_C[var2];
            var21 = og.field_c[var2];
            if (hc.field_a[var2]) {
              var23 = ac.field_d[var2];
              var24 = new int[var3];
              var20 = var24;
              var16 = var20;
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (hl) (Object) new pj(td.field_m, gb.field_w, fc.field_d[var2], qd.field_H[var2], gg.field_d[var2], gh.field_C[var2], var24);
                  var2++;
                  continue L1;
                } else {
                  var6[var7] = cl.a(w.a(255, (int) var23[var7]) << 1482998904, of.field_g[w.a(255, (int) var21[var7])]);
                  var7++;
                  continue L2;
                }
              }
            } else {
              var9 = new int[var3];
              var22 = var9;
              var6_int = 0;
              L3: while (true) {
                if (var6_int >= var3) {
                  var1[var2] = new hl(td.field_m, gb.field_w, fc.field_d[var2], qd.field_H[var2], gg.field_d[var2], gh.field_C[var2], var22);
                  var2++;
                  continue L1;
                } else {
                  var9[var6_int] = of.field_g[w.a((int) var21[var6_int], 255)];
                  var6_int++;
                  continue L3;
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
        field_b = "Login: ";
    }
}
