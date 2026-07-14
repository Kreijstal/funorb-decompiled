/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static String[] field_b;
    el field_f;
    static ud field_g;
    static String field_d;
    static hj field_a;
    el field_h;
    static String[] field_e;
    static volatile boolean field_c;

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        field_a = null;
        if (param0 != 1491624464) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    final static boolean a(byte param0, gn param1) {
        if (param0 > -52) {
            td.a(7);
        }
        return param1.a((byte) 105);
    }

    final static vj a(int param0, float param1, vj param2) {
        gj var3 = null;
        if (param0 != 150) {
            field_e = null;
        }
        if (!(param2 instanceof lb)) {
            var3 = (gj) (Object) param2;
            return (vj) (Object) new gj(var3.field_t, var3.field_u, var3.field_r, var3.field_r + (var3.field_w - var3.field_r) * param1, param2.field_k, param2.field_p, param2.field_q);
        }
        lb var3_ref = (lb) (Object) param2;
        return (vj) (Object) new lb(var3_ref.field_r, var3_ref.a(false, param1), param2.field_k, param2.field_p, param2.field_q);
    }

    td(String param0) {
        ((td) this).field_f = jh.field_a.a(-32660, param0 + "_left");
        ((td) this).field_h = jh.field_a.a(-32660, param0 + "_right");
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        if (!param3) {
            return;
        }
        lj.a((byte) -107);
        tc.e(param1, param4, param0, param2);
    }

    final static void a(int param0, int param1) {
        bg.field_f = 400 * param0 / 150;
        bg.field_g = 100 * param0 / 150;
        if (param1 != 14195) {
            field_g = null;
        }
        bg.field_c = (param0 << 1130100464) / 150;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        qk var4_ref_qk = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        double var11 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        qk var18 = null;
        int var19 = 0;
        int var20 = 0;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        var20 = HoldTheLine.field_D;
        HoldTheLine.field_E = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = ej.field_c.length;
        var24 = new int[var1];
        var23 = var24;
        var22 = var23;
        var21 = var22;
        var2 = var21;
        var3 = 0;
        L0: while (true) {
          if (var1 <= var3) {
            L1: {
              var3 = HoldTheLine.field_E[9] >> 132209992;
              var4 = HoldTheLine.field_E[10] >> 906378696;
              var5 = HoldTheLine.field_E[11] >> 1524383880;
              var6 = cf.field_q << 1862726116;
              var7 = 0;
              var8 = tn.a(var6, 5255) >> -2001164536;
              var9 = hc.a(0, var6) >> 7738568;
              var10 = 68 / ((param0 - 5) / 52);
              if (-1 == nc.field_g) {
                break L1;
              } else {
                if (0 == (rf.field_X ^ -1)) {
                  break L1;
                } else {
                  var7 = -320 + nc.field_g;
                  var9 = -128;
                  var8 = -rf.field_X + 240;
                  break L1;
                }
              }
            }
            var11 = 256.0 / Math.sqrt((double)(var9 * var9 + var8 * var8 + var7 * var7));
            var8 = (int)((double)var8 * var11);
            var7 = (int)((double)var7 * var11);
            var9 = (int)((double)var9 * var11);
            var13 = var7 + -var3;
            var14 = var8 - var4;
            var15 = var9 - var5;
            var11 = 256.0 / Math.sqrt((double)(var13 * var13 + var14 * var14 - -(var15 * var15)));
            var14 = (int)((double)var14 * var11);
            var15 = (int)((double)var15 * var11);
            var13 = (int)((double)var13 * var11);
            var16 = 0;
            L2: while (true) {
              if (var16 >= ej.field_c.length) {
                return;
              } else {
                var17 = 0;
                var18_int = 1;
                L3: while (true) {
                  if (var18_int >= ej.field_c.length) {
                    var2[var17] = -2147483648;
                    var18 = ej.field_c[var17];
                    dj.b(var17, 28433);
                    var19 = 0;
                    L4: while (true) {
                      if (3 <= var19) {
                        ch.a(HoldTheLine.field_E, false, fe.field_b, (byte) 96, var18, true, false);
                        ai.a(-4006, var8, var9, var14, var18, var13, var7, var15);
                        var16++;
                        continue L2;
                      } else {
                        fe.field_b[var19] = fe.field_b[var19] + gd.field_e[var16][var19];
                        var19++;
                        continue L4;
                      }
                    }
                  } else {
                    if (var24[var18_int] > var24[var17]) {
                      var17 = var18_int;
                      var18_int++;
                      continue L3;
                    } else {
                      var18_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref_qk = ej.field_c[var3];
            var4_ref_qk.c(0);
            dj.b(var3, 28433);
            var5 = var4_ref_qk.field_F + var4_ref_qk.field_L >> 212031489;
            var6 = var4_ref_qk.field_d + var4_ref_qk.field_H >> 2067748993;
            var7 = var4_ref_qk.field_p + var4_ref_qk.field_n >> -204986911;
            var8 = HoldTheLine.field_E[9] >> 1479668706;
            var9 = HoldTheLine.field_E[10] >> -1147541310;
            var10 = HoldTheLine.field_E[11] >> 460457602;
            var11_int = var9 * fe.field_b[4] + fe.field_b[3] * var8 - -(var10 * fe.field_b[5]) >> -2108046866;
            var12 = var10 * fe.field_b[8] + (fe.field_b[7] * var9 + var8 * fe.field_b[6]) >> 455835950;
            var13 = var10 * fe.field_b[11] + (fe.field_b[9] * var8 - -(fe.field_b[10] * var9)) >> -2140513554;
            var2[var3] = var5 * var11_int + var6 * var12 + var13 * var7 >> 1491624464;
            var3++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_e = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_d = "Instructions";
        field_c = true;
    }
}
