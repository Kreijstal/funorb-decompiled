/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fp extends gn {
    static int field_f;
    boolean field_q;
    static hd field_o;
    long field_k;
    static ko field_l;
    boolean field_r;
    static int field_g;
    int field_t;
    int field_s;
    int field_v;
    int field_i;
    up field_m;
    static String[] field_u;
    boolean field_h;
    static String field_n;
    static volatile int field_w;
    static hd field_p;
    static int field_e;
    boolean field_j;

    final static boolean a(int param0, Class param1) {
        RuntimeException var2 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 83) {
                break L1;
              } else {
                field_e = 107;
                break L1;
              }
            }
            L2: {
              L3: {
                if (Integer.TYPE == param1) {
                  break L3;
                } else {
                  if (Short.TYPE == param1) {
                    break L3;
                  } else {
                    if (Long.TYPE == param1) {
                      break L3;
                    } else {
                      if (Byte.TYPE == param1) {
                        break L3;
                      } else {
                        if (Float.TYPE == param1) {
                          break L3;
                        } else {
                          if (Double.TYPE != param1) {
                            stackOut_10_0 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("fp.K(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static vn a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, boolean param8, boolean param9) {
        int var10 = ev.field_B[param1];
        int var11 = ev.field_B[param6];
        boolean[][][] var12 = je.field_g[param0].field_l;
        return hs.a(param9, param5, param3, var10, var12[0], param4, var12[1], (byte) -92, param2, param8, var11);
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        kk var4_ref_kk = null;
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
        int var17 = 0;
        int var18_int = 0;
        kk var18 = null;
        int var19 = 0;
        int var20 = 0;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException decompiledCaughtException = null;
        var20 = Kickabout.field_G;
        try {
          L0: {
            dh.field_i = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = ba.field_n.length;
            var24 = new int[var1_int];
            var23 = var24;
            var22 = var23;
            var21 = var22;
            var2 = var21;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = dh.field_i[9] >> 8;
                  var4 = dh.field_i[10] >> 8;
                  var5 = dh.field_i[11] >> 8;
                  var6 = up.field_p << 4;
                  var7 = 0;
                  var8 = ei.a(var6, (byte) -23) >> 8;
                  var9 = we.a(var6, false) >> 8;
                  var12 = -33 / ((-50 - param0) / 49);
                  if (el.field_A == -1) {
                    break L2;
                  } else {
                    if (-1 != n.field_m) {
                      var9 = -128;
                      var7 = -320 + el.field_A;
                      var8 = -n.field_m + 240;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var9 * var9 + var8 * var8 + var7 * var7));
                var9 = (int)((double)var9 * var10);
                var8 = (int)((double)var8 * var10);
                var7 = (int)((double)var7 * var10);
                var13 = -var3 + var7;
                var14 = var8 + -var4;
                var15 = var9 + -var5;
                var10 = 256.0 / Math.sqrt((double)(var13 * var13 - (-(var14 * var14) - var15 * var15)));
                var14 = (int)((double)var14 * var10);
                var15 = (int)((double)var15 * var10);
                var13 = (int)((double)var13 * var10);
                var16 = 0;
                L3: while (true) {
                  if (ba.field_n.length <= var16) {
                    break L0;
                  } else {
                    var17 = 0;
                    var18_int = 1;
                    L4: while (true) {
                      if (var18_int >= ba.field_n.length) {
                        var24[var17] = -2147483648;
                        var18 = ba.field_n[var17];
                        rg.a(var17, 1);
                        var19 = 0;
                        L5: while (true) {
                          if (var19 >= 3) {
                            os.a(var18, false, hh.field_g, dh.field_i, (byte) -96, false, true);
                            ei.a(var8, var7, var13, var9, var14, (byte) -125, var18, var15);
                            var16++;
                            continue L3;
                          } else {
                            hh.field_g[var19] = hh.field_g[var19] + sm.field_l[var16][var19];
                            var19++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var24[var17] < var24[var18_int]) {
                            var17 = var18_int;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var18_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var4_ref_kk = ba.field_n[var3];
                var4_ref_kk.a(false);
                rg.a(var3, 1);
                var5 = var4_ref_kk.field_y - -var4_ref_kk.field_h >> 1;
                var6 = var4_ref_kk.field_s + var4_ref_kk.field_x >> 1;
                var7 = var4_ref_kk.field_w + var4_ref_kk.field_t >> 1;
                var8 = dh.field_i[9] >> 2;
                var9 = dh.field_i[10] >> 2;
                var10_int = dh.field_i[11] >> 2;
                var11 = hh.field_g[3] * var8 - -(var9 * hh.field_g[4]) + var10_int * hh.field_g[5] >> 14;
                var12 = var10_int * hh.field_g[8] + var9 * hh.field_g[7] + var8 * hh.field_g[6] >> 14;
                var13 = var8 * hh.field_g[9] - -(hh.field_g[10] * var9) - -(hh.field_g[11] * var10_int) >> 14;
                var2[var3] = var13 * var7 + var11 * var5 + var6 * var12 >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "fp.L(" + param0 + ')');
        }
    }

    public final String toString() {
        String var1 = ((fp) this).field_a + ": " + ((fp) this).field_m.d(100) + ", " + ((fp) this).field_i;
        return var1;
    }

    public static void a(int param0) {
        field_l = null;
        field_p = null;
        field_n = null;
        field_o = null;
        field_u = null;
    }

    fp() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0;
        field_n = "Exploiting a bug";
        field_e = -1;
    }
}
