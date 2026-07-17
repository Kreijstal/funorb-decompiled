/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends l {
    static il field_k;
    static String field_i;
    static km field_h;
    static String field_g;
    static String field_j;

    public static void c(int param0) {
        field_k = null;
        field_i = null;
        field_g = null;
        field_h = null;
        field_j = null;
        int var1 = -84;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        wm var4_ref_wm = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        wm var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            lh.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = ph.field_n.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = lh.field_a[9] >> 8;
                  var4 = lh.field_a[10] >> 8;
                  var5 = lh.field_a[11] >> 8;
                  var6 = kf.field_e << 4;
                  var7 = 0;
                  var8 = id.a(var6, 32) >> 8;
                  var9 = nf.a(21855, var6) >> 8;
                  if (nl.field_u == -1) {
                    break L2;
                  } else {
                    if (hk.field_Jb != -1) {
                      var8 = 240 + -hk.field_Jb;
                      var9 = -128;
                      var7 = -320 + nl.field_u;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var8 * var8 + (var7 * var7 + var9 * var9)));
                var7 = (int)((double)var7 * var10);
                var8 = (int)((double)var8 * var10);
                var9 = (int)((double)var9 * var10);
                var12 = -var3 + var7;
                var13 = var8 - var4;
                var14 = var9 + -var5;
                var10 = 256.0 / Math.sqrt((double)(var13 * var13 + (var12 * var12 - -(var14 * var14))));
                var14 = (int)((double)var14 * var10);
                var13 = (int)((double)var13 * var10);
                var12 = (int)((double)var12 * var10);
                var15 = 0;
                L3: while (true) {
                  if (var15 >= ph.field_n.length) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L4: while (true) {
                      if (var17_int >= ph.field_n.length) {
                        var23[var16] = -2147483648;
                        var17 = ph.field_n[var16];
                        hh.a((byte) 104, var16);
                        var18 = 0;
                        L5: while (true) {
                          if (var18 >= 3) {
                            fe.a(gl.field_c, true, true, var17, false, lh.field_a, false);
                            gf.a(var13, var7, var14, var12, var17, var9, var8, -22085);
                            var15++;
                            continue L3;
                          } else {
                            gl.field_c[var18] = gl.field_c[var18] + kh.field_f[var15][var18];
                            var18++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var23[var16] >= var23[var17_int]) {
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var17_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var4_ref_wm = ph.field_n[var3];
                var4_ref_wm.b((byte) 127);
                hh.a((byte) 87, var3);
                var5 = var4_ref_wm.field_C + var4_ref_wm.field_U >> 1;
                var6 = var4_ref_wm.field_T + var4_ref_wm.field_g >> 1;
                var7 = var4_ref_wm.field_p + var4_ref_wm.field_L >> 1;
                var8 = lh.field_a[9] >> 2;
                var9 = lh.field_a[10] >> 2;
                var10_int = lh.field_a[11] >> 2;
                var11 = var9 * gl.field_c[4] + (gl.field_c[3] * var8 - -(gl.field_c[5] * var10_int)) >> 14;
                var12 = gl.field_c[8] * var10_int + var9 * gl.field_c[7] + gl.field_c[6] * var8 >> 14;
                var13 = var9 * gl.field_c[10] + (gl.field_c[9] * var8 + var10_int * gl.field_c[11]) >> 14;
                var2[var3] = var7 * var13 + var11 * var5 - -(var6 * var12) >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "cm.D(" + 11 + 41);
        }
    }

    private cm() throws Throwable {
        throw new Error();
    }

    final static void a(java.awt.Canvas param0, byte param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (10 > dj.field_n) {
                L2: {
                  var3_int = 0;
                  if (ce.field_K) {
                    var3_int = 1;
                    ce.field_K = false;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ub.a(hf.field_v, var3_int != 0, wm.a((byte) 98), qe.g(11108), param1 ^ 83);
                break L1;
              } else {
                if (nm.c(param1 ^ -45)) {
                  if (j.field_l == 0) {
                    wb.a(false, (byte) 119, param2);
                    td.a(-30179, param0, 0, 0);
                    break L1;
                  } else {
                    uh.a((byte) 114, param0);
                    break L1;
                  }
                } else {
                  df.c();
                  fh.a(240, 0, 320);
                  td.a(-30179, param0, 0, 0);
                  break L1;
                }
              }
            }
            L3: {
              if (param1 == -47) {
                break L3;
              } else {
                field_h = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("cm.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(byte param0, int param1, int param2) {
        hg var3 = gk.field_g;
        var3.g(param2, 8);
        var3.a(3, param0 ^ 82);
        var3.a(8, -76);
        if (param0 != 20) {
            return;
        }
        var3.a((byte) -107, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Unrated game";
        field_i = "Public";
        field_j = "Hotseat/Singleplayer";
    }
}
