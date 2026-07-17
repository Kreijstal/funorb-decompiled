/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static ta field_a;
    static int[] field_b;
    static int[] field_c;
    static volatile boolean field_d;

    final static ea[] a(int param0) {
        ea[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var12 = null;
        int[] var13 = null;
        byte[] var16 = null;
        int[] var17 = null;
        byte[] var20 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        L0: {
          var8 = MinerDisturbance.field_ab;
          var1 = new ea[sc.field_d];
          if (param0 >= 83) {
            break L0;
          } else {
            ea[] discarded$1 = kk.a(45);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (sc.field_d <= var2) {
            ec.a((byte) -120);
            return var1;
          } else {
            var3 = qk.field_b[var2] * ng.field_e[var2];
            var23 = db.field_b[var2];
            if (!jk.field_gb[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var3) {
                  var1[var2] = new ea(pf.field_c, wd.field_a, bg.field_d[var2], oc.field_e[var2], qk.field_b[var2], ng.field_e[var2], var26);
                  var2++;
                  continue L1;
                } else {
                  var10[var6] = af.field_p[c.a(255, (int) var23[var6])];
                  var6++;
                  continue L2;
                }
              }
            } else {
              var24 = ci.field_a[var2];
              var20 = var24;
              var16 = var20;
              var12 = var16;
              var9 = var12;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L3: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (ea) (Object) new og(pf.field_c, wd.field_a, bg.field_d[var2], oc.field_e[var2], qk.field_b[var2], ng.field_e[var2], var25);
                  var2++;
                  continue L1;
                } else {
                  var6_ref_int__[var7] = hi.a(af.field_p[c.a(255, (int) var23[var7])], c.a(-16777216, var24[var7] << 24));
                  var7++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    public static void a() {
        field_a = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_c = new int[8192];
        field_a = new ta();
        field_d = false;
    }
}
