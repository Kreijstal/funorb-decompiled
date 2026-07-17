/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gb extends bw {
    static String field_i;
    int field_g;
    int field_h;
    static String[] field_f;
    static String field_j;

    final static void a(int param0, int param1, int param2, int param3, boolean param4, String param5) {
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              int discarded$2 = 3685;
              k.c();
              var14 = dg.field_e;
              var13 = var14;
              var12 = var13;
              var11 = var12;
              var10 = var11;
              var6 = var10;
              var7 = dg.field_i;
              var8 = dg.field_c;
              if (null == cea.field_i) {
                break L1;
              } else {
                if (null != hl.field_C) {
                  L2: {
                    param1 = param1 - (-hl.field_C.field_B + hl.field_C.field_u);
                    var9 = hl.field_C.a(param5);
                    var9 += 10;
                    cea.field_i.b();
                    if ((var9 & 1) != 1) {
                      break L2;
                    } else {
                      var9++;
                      break L2;
                    }
                  }
                  dg.d();
                  hl.field_C.c(param5, 5, 3 + hl.field_C.field_u, 0, -1);
                  dg.a(var14, var7, var8);
                  fk.d((byte) -121);
                  fw.a(param0, cea.field_i, var9, param2, true, oa.field_Bb, param1);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6_ref;
            stackOut_8_1 = new StringBuilder().append("gb.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(0).append(44).append(1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = (param0 << 8) / 255;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2_int = stackIn_4_0;
              var3 = 137 * var2_int >> 8;
              ada.field_p.d(-var3, 0);
              gs.field_f.a(2, -var3 + 137, false);
              if (au.field_b) {
                L3: {
                  if (bf.field_f) {
                    break L3;
                  } else {
                    var4 = 20;
                    var5 = 20;
                    var6 = var5 / 2;
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= 24) {
                        bf.field_f = true;
                        break L3;
                      } else {
                        var4 = var4 + (var6 + kla.a(var5, laa.field_n, -2147483648));
                        gs.field_c[var7] = var4;
                        vb.field_h[var7] = kla.a(120, laa.field_n, -2147483648) + 70;
                        wda.field_b[var7] = kla.a(120, laa.field_n, -2147483648) + 70;
                        var7++;
                        continue L4;
                      }
                    }
                  }
                }
                var4 = 0;
                L5: while (true) {
                  if (var4 >= gs.field_c.length) {
                    break L2;
                  } else {
                    L6: {
                      stackOut_13_0 = (wda.field_b[var4] * var3 >> 9) + 362 + -var3 + 137;
                      stackOut_13_1 = -(param0 * vb.field_h[var4] * param0 >> 17) + gs.field_c[var4];
                      stackOut_13_2 = 30 + (param0 * wda.field_b[var4] >> 12);
                      stackOut_13_3 = 16777215;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      stackIn_15_3 = stackOut_13_3;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      if (128 > param0) {
                        stackOut_15_0 = stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = stackIn_15_2;
                        stackOut_15_3 = stackIn_15_3;
                        stackOut_15_4 = param0 >> 1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        stackIn_16_3 = stackOut_15_3;
                        stackIn_16_4 = stackOut_15_4;
                        break L6;
                      } else {
                        stackOut_14_0 = stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = stackIn_14_2;
                        stackOut_14_3 = stackIn_14_3;
                        stackOut_14_4 = 256 - param0 >> 1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        stackIn_16_3 = stackOut_14_3;
                        stackIn_16_4 = stackOut_14_4;
                        break L6;
                      }
                    }
                    dg.f(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4);
                    var4++;
                    continue L5;
                  }
                }
              } else {
                break L2;
              }
            }
            var4 = (var2_int * 53 >> 8) + 84;
            var5 = 6144 - -(1400 * param0 >> 8);
            var6 = via.a(4096 - var5 & 8191, (byte) 97);
            var7 = ft.a(8191 & 4096 - var5, (byte) -128);
            lka.field_G = new int[]{-var4, 90, -42, var6, 0, -var7, 0, 65536, 0, var7, 0, var6};
            ni.field_l.a(mu.field_j, lka.field_G);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gb.B(" + param0 + 44 + 16777215 + 41);
        }
    }

    final static void a() {
        int var1 = 0;
        if (b.field_u > 32) {
            var1 = b.field_u % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            di.a(true, b.field_u - var1);
        } else {
            di.a(true, 0);
        }
    }

    private gb() throws Throwable {
        throw new Error();
    }

    public static void b() {
        field_j = null;
        field_f = null;
        field_i = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        L0: {
          if (eo.field_l > param4) {
            qn.a(param4, param1, param3, param2, 69, param5);
            break L0;
          } else {
            if (param1 > pw.field_x) {
              qn.a(param4, param1, param3, param2, 69, param5);
              break L0;
            } else {
              if (param3 < an.field_q) {
                qn.a(param4, param1, param3, param2, 69, param5);
                break L0;
              } else {
                if (param5 > ha.field_n) {
                  qn.a(param4, param1, param3, param2, 69, param5);
                  break L0;
                } else {
                  hka.a(param4, -1, param5, param3, param1, param2);
                  break L0;
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
        field_i = "Raised!";
        field_f = new String[]{"idle", "walk", "jump", "sprint", "attack", "death", "react", "happy", "kick", "range"};
        field_j = "Players";
    }
}
