/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends k {
    private int field_l;
    private int field_m;
    static String field_k;

    final int[][] a(boolean param0, int param1) {
        int[][] var3 = null;
        int[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        L0: {
          var16 = BachelorFridge.field_y;
          if (!param0) {
            break L0;
          } else {
            ((ag) this).field_l = -114;
            break L0;
          }
        }
        L1: {
          var21 = ((ag) this).field_h.a(param1, -858);
          var20 = var21;
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var3 = var17;
          if (((ag) this).field_h.field_b) {
            L2: {
              var5 = hh.field_d / ((ag) this).field_l;
              var6 = bi.field_g / ((ag) this).field_m;
              if ((var6 ^ -1) < -1) {
                var7_int = param1 % var6;
                var4 = ((ag) this).a((byte) -77, 0, var7_int * bi.field_g / var6);
                break L2;
              } else {
                var4 = ((ag) this).a((byte) -78, 0, 0);
                break L2;
              }
            }
            var7 = var4[0];
            var8 = var4[1];
            var9 = var4[2];
            var10 = var21[0];
            var11 = var21[1];
            var12 = var21[2];
            var13 = 0;
            L3: while (true) {
              if (var13 >= hh.field_d) {
                break L1;
              } else {
                L4: {
                  if (-1 <= (var5 ^ -1)) {
                    var14 = 0;
                    break L4;
                  } else {
                    var15 = var13 % var5;
                    var14 = var15 * hh.field_d / var5;
                    break L4;
                  }
                }
                var10[var13] = var7[var14];
                var11[var13] = var8[var14];
                var12[var13] = var9[var14];
                var13++;
                continue L3;
              }
            }
          } else {
            break L1;
          }
        }
        return var17;
    }

    final static long e(int param0) {
        if (param0 != -9109) {
            Object var2 = null;
            ag.a((jfa) null, (byte) 80);
        }
        return -pk.field_c + f.b((byte) 73);
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          if (param1 == 0) {
            break L0;
          } else {
            int[] discarded$2 = ((ag) this).a(122, 93);
            break L0;
          }
        }
        L1: {
          var10 = ((ag) this).field_j.a(param0, param1 + -1);
          var3 = var10;
          if (!((ag) this).field_j.field_m) {
            break L1;
          } else {
            L2: {
              var5 = hh.field_d / ((ag) this).field_l;
              var6 = bi.field_g / ((ag) this).field_m;
              if (-1 > (var6 ^ -1)) {
                var7 = param0 % var6;
                var4 = ((ag) this).a(0, var7 * bi.field_g / var6, (byte) 110);
                break L2;
              } else {
                var4 = ((ag) this).a(0, 0, (byte) 116);
                break L2;
              }
            }
            var11 = 0;
            var7 = var11;
            L3: while (true) {
              if (var11 >= hh.field_d) {
                break L1;
              } else {
                if (0 >= var5) {
                  var10[var11] = var4[0];
                  var11++;
                  continue L3;
                } else {
                  var8 = var11 % var5;
                  var10[var11] = var4[var8 * hh.field_d / var5];
                  var11++;
                  continue L3;
                }
              }
            }
          }
        }
        return var10;
    }

    public ag() {
        super(1, false);
        ((ag) this).field_l = 4;
        ((ag) this).field_m = 4;
    }

    final static void a(jfa param0, byte param1) {
        if (bp.e(param1 ^ 29881)) {
            return;
        }
        sja.field_fb.c(92, (byte) 111);
        sja.field_fb.field_g = sja.field_fb.field_g + 2;
        if (param1 != -104) {
            field_k = null;
        }
        int var2 = sja.field_fb.field_g;
        rha.a(param0.field_g, (lu) (Object) sja.field_fb, (byte) -107);
        sja.field_fb.a((byte) -88, sja.field_fb.field_g + -var2);
    }

    public static void d(int param0) {
        int var1 = -112 / ((39 - param0) / 53);
        field_k = null;
    }

    final static void a(int param0, String param1, int param2, int param3, String param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19) {
        ur.field_e[pe.field_m] = (oha) (Object) new t(param17, param1, param4, param12, param14, param11, param0, param7, param10, param3, param2, param16, param18, param5, param13, param15, param6, param8, param9);
        pe.field_m = pe.field_m + 1;
        if (param19 != -4313) {
            field_k = null;
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (param0 == -71) {
            break L0;
          } else {
            int[][] discarded$2 = ((ag) this).a(true, -64);
            break L0;
          }
        }
        L1: {
          var4 = param2;
          if (-1 != var4) {
            if (-2 != var4) {
              break L1;
            } else {
              ((ag) this).field_m = param1.b(param0 ^ -16711866);
              break L1;
            }
          } else {
            ((ag) this).field_l = param1.b(16711935);
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Please select options in the following rows:  ";
    }
}
