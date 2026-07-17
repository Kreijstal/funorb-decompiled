/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class id implements Iterator {
    private ll field_a;
    static String field_k;
    static long[] field_b;
    private dh field_d;
    static rj field_l;
    static String field_c;
    static String field_g;
    static md field_e;
    static int[] field_j;
    static String field_f;
    static cn[] field_m;
    static nh field_i;
    private ll field_h;

    public final Object next() {
        ll var1 = ((id) this).field_h;
        if (((id) this).field_d.field_d == var1) {
            var1 = null;
            ((id) this).field_h = null;
        } else {
            ((id) this).field_h = var1.field_n;
        }
        ((id) this).field_a = var1;
        return (Object) (Object) var1;
    }

    public final void remove() {
        if (!(null != ((id) this).field_a)) {
            throw new IllegalStateException();
        }
        ((id) this).field_a.b((byte) -2);
        ((id) this).field_a = null;
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        qh var4_ref_qh = null;
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
        qh var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = DungeonAssault.field_K;
        try {
          L0: {
            sd.field_F = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = ih.field_w.length;
            var24 = new int[var1_int];
            var23 = var24;
            var22 = var23;
            var21 = var22;
            var2 = var21;
            var3 = 0;
            L1: while (true) {
              if (var1_int <= var3) {
                L2: {
                  var3 = sd.field_F[9] >> 8;
                  var4 = sd.field_F[10] >> 8;
                  var5 = sd.field_F[11] >> 8;
                  var6 = nl.field_d << 4;
                  var7 = 0;
                  var8 = oj.a(var6, (byte) 51) >> 8;
                  var9 = jg.a(8191, var6) >> 8;
                  if (param0 == 439027688) {
                    break L2;
                  } else {
                    var20 = null;
                    ab discarded$1 = id.a(-29, (String) null);
                    break L2;
                  }
                }
                L3: {
                  if (-1 == hj.field_S) {
                    break L3;
                  } else {
                    if (eh.field_h == -1) {
                      break L3;
                    } else {
                      var8 = -eh.field_h + 240;
                      var9 = -128;
                      var7 = -320 + hj.field_S;
                      break L3;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var8 * var8 + (var7 * var7 - -(var9 * var9))));
                var7 = (int)((double)var7 * var10);
                var8 = (int)((double)var8 * var10);
                var9 = (int)((double)var9 * var10);
                var12 = var7 + -var3;
                var13 = -var4 + var8;
                var14 = var9 - var5;
                var10 = 256.0 / Math.sqrt((double)(var13 * var13 + var12 * var12 + var14 * var14));
                var14 = (int)((double)var14 * var10);
                var12 = (int)((double)var12 * var10);
                var13 = (int)((double)var13 * var10);
                var15 = 0;
                L4: while (true) {
                  if (ih.field_w.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L5: while (true) {
                      if (var17_int >= ih.field_w.length) {
                        var24[var16] = -2147483648;
                        var17 = ih.field_w[var16];
                        bk.a(7, var16);
                        var18 = 0;
                        L6: while (true) {
                          if (var18 >= 3) {
                            pb.a(true, 0, sd.field_F, false, var17, false, pj.field_e);
                            ad.a(var13, var8, var7, var14, -106, var12, var9, var17);
                            var15++;
                            continue L4;
                          } else {
                            pj.field_e[var18] = pj.field_e[var18] + lk.field_R[var15][var18];
                            var18++;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if (var24[var16] < var24[var17_int]) {
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
                var4_ref_qh = ih.field_w[var3];
                var4_ref_qh.a((byte) -123);
                bk.a(7, var3);
                var5 = var4_ref_qh.field_i + var4_ref_qh.field_H >> 1;
                var6 = var4_ref_qh.field_p + var4_ref_qh.field_M >> 1;
                var7 = var4_ref_qh.field_a + var4_ref_qh.field_b >> 1;
                var8 = sd.field_F[9] >> 2;
                var9 = sd.field_F[10] >> 2;
                var10_int = sd.field_F[11] >> 2;
                var11 = var10_int * pj.field_e[5] + (var8 * pj.field_e[3] - -(pj.field_e[4] * var9)) >> 14;
                var12 = pj.field_e[8] * var10_int + var9 * pj.field_e[7] + pj.field_e[6] * var8 >> 14;
                var13 = var9 * pj.field_e[10] + var8 * pj.field_e[9] + pj.field_e[11] * var10_int >> 14;
                var2[var3] = var13 * var7 + (var5 * var11 - -(var6 * var12)) >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "id.A(" + param0 + 41);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        field_c = null;
        field_b = null;
        if (param0 > -73) {
            field_m = null;
        }
        field_m = null;
        field_i = null;
        field_k = null;
        field_l = null;
        field_f = null;
        field_j = null;
    }

    public final boolean hasNext() {
        return ((id) this).field_h != ((id) this).field_d.field_d;
    }

    final static ab a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ab stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ab stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0 == -49) {
                break L1;
              } else {
                id.a(51);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var2_int <= var3) {
                stackOut_11_0 = np.field_E;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                var4 = param1.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L2;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("id.B(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int[] param5, int param6, int param7, int[] param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var14 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param2 > 86) {
                break L1;
              } else {
                id.a((byte) -84);
                break L1;
              }
            }
            var12 = -param3;
            L2: while (true) {
              if (var12 >= 0) {
                break L0;
              } else {
                var13 = -param7;
                L3: while (true) {
                  if (0 <= var13) {
                    param0 = param0 + param9;
                    param6 = param6 + param4;
                    var12++;
                    continue L2;
                  } else {
                    L4: {
                      L5: {
                        int incrementValue$2 = param6;
                        param6++;
                        param1 = param5[incrementValue$2];
                        if (0 == param1) {
                          break L5;
                        } else {
                          if (param1 == 255) {
                            break L5;
                          } else {
                            var10_int = param8[param0];
                            var11 = 255 & param1;
                            int incrementValue$3 = param0;
                            param0++;
                            param8[incrementValue$3] = mp.a(nb.a(nb.a(65280, var10_int) * var11 >> 8, 65280), mp.a(nb.a(nb.a(16711935, var10_int) * var11 >> 8, 16711935), nb.a(var10_int, -16777216)));
                            break L4;
                          }
                        }
                      }
                      param0++;
                      break L4;
                    }
                    var13++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var10;
            stackOut_14_1 = new StringBuilder().append("id.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param5 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          L7: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param8 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param9 + 41);
        }
    }

    id(dh param0) {
        ((id) this).field_a = null;
        try {
            ((id) this).field_d = param0;
            ((id) this).field_h = ((id) this).field_d.field_d.field_n;
            ((id) this).field_a = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "id.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "MONSTER";
        field_c = "Names cannot contain consecutive spaces";
        field_g = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_b = new long[32];
        field_j = new int[]{};
        field_e = new md();
        field_f = "Waiting for music";
    }
}
