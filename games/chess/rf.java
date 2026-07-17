/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static int field_b;
    static ta field_d;
    static String field_a;
    static String field_c;

    final static String a(byte param0) {
        return tk.field_h.d(0);
    }

    final static void b(int param0, int param1) {
        bc.field_b = param1;
        fk.field_q.a(64 * param1 / param0, (byte) -100);
    }

    final static km[] b(byte param0) {
        km[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var11 = null;
        int[] var13 = null;
        byte[] var15 = null;
        int[] var17 = null;
        byte[] var19 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var8 = Chess.field_G;
        var1 = new km[h.field_n];
        var2 = 0;
        L0: while (true) {
          if (var2 >= h.field_n) {
            ch.k(4210752);
            return var1;
          } else {
            var3 = b.field_c[var2] * wm.field_b[var2];
            var24 = vk.field_d[var2];
            if (!in.field_c[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L1: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new km(cd.field_p, ek.field_a, be.field_a[var2], a.field_c[var2], wm.field_b[var2], b.field_c[var2], var26);
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = uh.field_r[ce.a((int) var24[var6], 255)];
                  var6++;
                  continue L1;
                }
              }
            } else {
              var23 = gg.field_y[var2];
              var19 = var23;
              var15 = var19;
              var11 = var15;
              var9 = var11;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (km) (Object) new wi(cd.field_p, ek.field_a, be.field_a[var2], a.field_c[var2], wm.field_b[var2], b.field_c[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = s.a(ce.a((int) var23[var7], 255) << 24, uh.field_r[ce.a((int) var24[var7], 255)]);
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static void b(int param0) {
        int var2 = Chess.field_G;
        ec.field_d.field_C = true;
        if ((1 << oc.field_p.field_a & oc.field_p.field_B.field_m) != 0) {
            fm.field_R[9] = wc.field_A;
        } else {
            if (oc.field_p.field_B.field_m == 0) {
                ec.field_d.field_C = false;
                fm.field_R[9] = gl.field_a;
            } else {
                fm.field_R[9] = mf.field_x;
            }
        }
        if (param0 > -74) {
            return;
        }
        ec.field_d.field_q = fm.field_R[9];
        df.a(ec.field_d, 0);
    }

    final static int a(int param0, int param1) {
        if (param1 != 255) {
            rf.b(-79);
        }
        param0 = param0 & 8191;
        if (4096 > param0) {
            return param0 >= 2048 ? -hj.field_b[-2048 + param0] : hj.field_b[-param0 + 2048];
        }
        return param0 < 6144 ? -hj.field_b[-param0 + 6144] : hj.field_b[param0 + -6144];
    }

    final static void a(byte param0, boolean param1) {
        if (param0 >= -56) {
            return;
        }
        if (null != cd.field_x) {
            if (cd.field_x.a(-23647, param1)) {
                cd.field_x = null;
            }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Accept";
        field_c = "To report a player, right-click on their name and select the option to report abuse.";
        field_b = 0;
    }
}
