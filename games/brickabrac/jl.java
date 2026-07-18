/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class jl {
    static long field_c;
    static int field_b;
    static pi field_e;
    static jp field_d;
    static int field_a;

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        fr var4_ref_fr = null;
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
        fr var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            kk.field_e = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = gg.field_i.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = kk.field_e[9] >> 8;
                  var4 = kk.field_e[10] >> 8;
                  var5 = kk.field_e[11] >> 8;
                  var6 = ld.field_t << 4;
                  var7 = 0;
                  var8 = sa.a(var6, -4097) >> 8;
                  var9 = BrickABrac.c(2048, var6) >> 8;
                  if (-1 == pq.field_k) {
                    break L2;
                  } else {
                    if (-1 == po.field_a) {
                      break L2;
                    } else {
                      var8 = -po.field_a + 240;
                      var9 = -128;
                      var7 = pq.field_k + -320;
                      break L2;
                    }
                  }
                }
                L3: {
                  var10 = 256.0 / Math.sqrt((double)(var9 * var9 + var8 * var8 + var7 * var7));
                  var9 = (int)((double)var9 * var10);
                  var8 = (int)((double)var8 * var10);
                  var7 = (int)((double)var7 * var10);
                  var12 = var7 - var3;
                  var13 = var8 - var4;
                  var14 = -var5 + var9;
                  var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var12 * var12 - -(var13 * var13)));
                  if (param0 < -114) {
                    break L3;
                  } else {
                    field_a = -44;
                    break L3;
                  }
                }
                var12 = (int)((double)var12 * var10);
                var13 = (int)((double)var13 * var10);
                var14 = (int)((double)var14 * var10);
                var15 = 0;
                L4: while (true) {
                  if (gg.field_i.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L5: while (true) {
                      if (var17_int >= gg.field_i.length) {
                        var23[var16] = -2147483648;
                        var17 = gg.field_i[var16];
                        fk.a(var16, (byte) 77);
                        var18 = 0;
                        L6: while (true) {
                          if (var18 >= 3) {
                            int discarded$1 = 0;
                            ka.a(kk.field_e, -16283, ld.field_w, false, true, var17);
                            mp.a(var14, var7, var12, var9, var17, (byte) -105, var13, var8);
                            var15++;
                            continue L4;
                          } else {
                            ld.field_w[var18] = ld.field_w[var18] + rn.field_e[var15][var18];
                            var18++;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if (var23[var16] < var23[var17_int]) {
                            var16 = var17_int;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var17_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var4_ref_fr = gg.field_i[var3];
                var4_ref_fr.c(23);
                fk.a(var3, (byte) 77);
                var5 = var4_ref_fr.field_f - -var4_ref_fr.field_N >> 1;
                var6 = var4_ref_fr.field_d + var4_ref_fr.field_y >> 1;
                var7 = var4_ref_fr.field_x + var4_ref_fr.field_q >> 1;
                var8 = kk.field_e[9] >> 2;
                var9 = kk.field_e[10] >> 2;
                var10_int = kk.field_e[11] >> 2;
                var11 = var10_int * ld.field_w[5] + (ld.field_w[4] * var9 + ld.field_w[3] * var8) >> 14;
                var12 = var8 * ld.field_w[6] + (var9 * ld.field_w[7] - -(var10_int * ld.field_w[8])) >> 14;
                var13 = var9 * ld.field_w[10] + (var8 * ld.field_w[9] - -(ld.field_w[11] * var10_int)) >> 14;
                var2[var3] = var7 * var13 + var12 * var6 + var5 * var11 >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "jl.D(" + param0 + ')');
        }
    }

    final static boolean a() {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = (Object) (Object) gp.field_c;
        synchronized (var1_ref) {
          L0: {
            if (si.field_m != fm.field_d) {
              dc.field_b = ef.field_d[si.field_m];
              go.field_b = vp.field_r[si.field_m];
              si.field_m = si.field_m - -1 & 127;
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        pi var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        String stackOut_10_0 = null;
        String stackOut_17_0 = null;
        Object stackOut_27_0 = null;
        String stackOut_23_0 = null;
        String stackOut_20_0 = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param1;
            int discarded$1 = 0;
            if (!tk.a(var6)) {
              stackOut_2_0 = om.field_Xb;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (wk.field_m != 2) {
                stackOut_6_0 = kd.field_b;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (ci.a(param1, -19)) {
                  stackOut_10_0 = rj.field_a;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  if (!nc.a(0, param1)) {
                    L1: {
                      if (ol.field_w < 100) {
                        break L1;
                      } else {
                        if (go.field_c > 0) {
                          break L1;
                        } else {
                          stackOut_17_0 = er.field_e;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        }
                      }
                    }
                    if (200 > ol.field_w) {
                      if (!af.a(121, param1)) {
                        L2: {
                          if (param0 == 24943) {
                            break L2;
                          } else {
                            field_c = -99L;
                            break L2;
                          }
                        }
                        var5 = k.field_h;
                        var5.e(-13413, param2);
                        var5.field_l = var5.field_l + 1;
                        var4 = var5.field_l;
                        var5.a(-107, 0);
                        var5.a(param1, param0 + -24944);
                        var5.d((byte) 122, -var4 + var5.field_l);
                        stackOut_27_0 = null;
                        stackIn_28_0 = stackOut_27_0;
                        break L0;
                      } else {
                        stackOut_23_0 = rd.a(sn.field_u, new String[1], (byte) 103);
                        stackIn_24_0 = stackOut_23_0;
                        return stackIn_24_0;
                      }
                    } else {
                      stackOut_20_0 = er.field_e;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    }
                  } else {
                    stackOut_13_0 = rd.a(gh.field_d, new String[1], (byte) 103);
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("jl.B(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L3;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_28_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 64;
    }
}
