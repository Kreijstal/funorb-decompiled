/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    static boolean field_b;
    static String field_a;
    static String[] field_e;
    static int field_h;
    static ej field_g;
    static String field_f;
    int field_c;
    static String field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static nf[] a(byte param0) {
        nf[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] var6 = null;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int[] var11 = null;
        byte[] var12 = null;
        int[] var14 = null;
        byte[] var16 = null;
        int[] var18 = null;
        byte[] var20 = null;
        int[] var22 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        var9 = Confined.field_J ? 1 : 0;
        var1 = new nf[wc.field_hc];
        var3 = 76 / ((param0 - -87) / 32);
        var2 = 0;
        L0: while (true) {
          if (var2 >= wc.field_hc) {
            ql.a(false);
            return var1;
          } else {
            var4 = rg.field_I[var2] * sd.field_f[var2];
            var25 = rj.field_f[var2];
            if (!pa.field_e[var2]) {
              var11 = new int[var4];
              var27 = var11;
              var7 = 0;
              L1: while (true) {
                if (var7 >= var4) {
                  var1[var2] = new nf(kb.field_a, em.field_e, jl.field_p[var2], ij.field_r[var2], rg.field_I[var2], sd.field_f[var2], var27);
                  var2++;
                  continue L0;
                } else {
                  var11[var7] = an.field_p[va.a(255, (int) var25[var7])];
                  var7++;
                  continue L1;
                }
              }
            } else {
              var24 = un.field_i[var2];
              var20 = var24;
              var16 = var20;
              var12 = var16;
              var10 = var12;
              var6 = var10;
              var26 = new int[var4];
              var22 = var26;
              var18 = var22;
              var14 = var18;
              var7_ref_int__ = var14;
              var8 = 0;
              L2: while (true) {
                if (var4 <= var8) {
                  var1[var2] = (nf) (Object) new pd(kb.field_a, em.field_e, jl.field_p[var2], ij.field_r[var2], rg.field_I[var2], sd.field_f[var2], var26);
                  var2++;
                  continue L0;
                } else {
                  var7_ref_int__[var8] = nl.a(va.a((int) var24[var8], 255) << -2105943976, an.field_p[va.a((int) var25[var8], 255)]);
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        param0 = param0 & 8191;
        if (param1 > -121) {
            return 80;
        }
        if (4096 > param0) {
            return param0 >= 2048 ? -vj.field_e[param0 - 2048] : vj.field_e[-param0 + 2048];
        }
        return -6145 >= (param0 ^ -1) ? vj.field_e[-6144 + param0] : -vj.field_e[-param0 + 6144];
    }

    public static void a(boolean param0) {
        field_a = null;
        field_g = null;
        if (param0) {
            field_b = false;
        }
        field_e = null;
        field_f = null;
        field_d = null;
    }

    final static void a(java.awt.Frame param0, df param1, boolean param2) {
        bc var3 = null;
        int var4 = 0;
        L0: {
          var4 = Confined.field_J ? 1 : 0;
          if (param2) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: while (true) {
          var3 = param1.a(param0, -89);
          L2: while (true) {
            if (0 != var3.field_g) {
              if (var3.field_g != 1) {
                jd.a(1, 100L);
                continue L1;
              } else {
                param0.setVisible(false);
                param0.dispose();
                return;
              }
            } else {
              jd.a(1, 10L);
              continue L2;
            }
          }
        }
    }

    final static int a(int param0, rd param1) {
        int var2 = 25;
        if (!(!param1.field_vb)) {
            var2 = var2 * 2;
        }
        if (0 != param1.field_Qb) {
            // if_icmpne L71
        }
        if (null == param1.field_Tb) {
            if (null == param1.field_eb) {
                var2 = var2 * 4;
            }
        }
        if (param1.field_Ob) {
            var2 = var2 * 2;
        }
        if (param0 <= 60) {
            nf[] discarded$0 = si.a((byte) 115);
        }
        if (0 != param1.field_wb) {
            var2 = var2 * 2;
        }
        if (!(param1.field_Qb != 3)) {
            var2 = var2 >> 1;
        }
        return var2;
    }

    si(int param0) {
        ((si) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = "Ctrl";
        field_e = new String[]{"bosses/sphere/", "bosses/cube/", "bosses/bird/", "bosses/humanoid/"};
        field_f = "Password is valid";
        field_g = new ej();
        field_d = "Email is valid";
    }
}
