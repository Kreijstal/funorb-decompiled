/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ec {
    static String field_c;
    static qa field_e;
    static ad field_a;
    static Calendar field_b;
    static int field_d;

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            boolean discarded$28 = wg.field_j.a(v.field_a, rc.field_g, true, true);
            wg.field_j.l(126);
            L1: while (true) {
              int discarded$29 = -1;
              if (!ba.a()) {
                if (-1 != gb.field_f) {
                  var1_int = gb.field_f;
                  qh.a(-1, true);
                  stackOut_6_0 = var1_int;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  if (!ah.field_h) {
                    if (cf.field_b != ed.field_c) {
                      if (!bb.field_a.a(0)) {
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      } else {
                        if (ch.field_d != cf.field_b) {
                          stackOut_22_0 = -1;
                          stackIn_23_0 = stackOut_22_0;
                          break L0;
                        } else {
                          stackOut_20_0 = 2;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      }
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    }
                  } else {
                    stackOut_9_0 = 3;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              } else {
                boolean discarded$30 = wg.field_j.a(oa.field_H, 109, rd.field_p);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "ec.D(" + 1 + 41);
        }
        return stackIn_23_0;
    }

    public static void a() {
        field_e = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void b() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        sj var4_ref_sj = null;
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
        sj var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            ma.field_c = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = ua.field_x.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = ma.field_c[9] >> 8;
                  var4 = ma.field_c[10] >> 8;
                  var5 = ma.field_c[11] >> 8;
                  var6 = uj.field_i << 4;
                  var7 = 0;
                  var8 = sb.a((byte) 79, var6) >> 8;
                  var9 = r.a((byte) 71, var6) >> 8;
                  if (ei.field_a == -1) {
                    break L2;
                  } else {
                    if (p.field_a != -1) {
                      var8 = 240 + -p.field_a;
                      var7 = -320 + ei.field_a;
                      var9 = -128;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var8 * var8 + (var7 * var7 - -(var9 * var9))));
                var8 = (int)((double)var8 * var10);
                var9 = (int)((double)var9 * var10);
                var7 = (int)((double)var7 * var10);
                var12 = -var3 + var7;
                var13 = -var4 + var8;
                var14 = -var5 + var9;
                var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var12 * var12 + var13 * var13));
                var12 = (int)((double)var12 * var10);
                var13 = (int)((double)var13 * var10);
                var14 = (int)((double)var14 * var10);
                var15 = 0;
                L3: while (true) {
                  if (ua.field_x.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L4: while (true) {
                      if (ua.field_x.length <= var17_int) {
                        var23[var16] = -2147483648;
                        var17 = ua.field_x[var16];
                        bg.a(var16, 127);
                        var18 = 0;
                        L5: while (true) {
                          if (var18 >= 3) {
                            int discarded$2 = 1;
                            int discarded$3 = -91;
                            b.a(ik.field_i, false, ma.field_c, false, var17);
                            ja.a(var14, var9, 46, var13, var8, var17, var12, var7);
                            var15++;
                            continue L3;
                          } else {
                            ik.field_i[var18] = ik.field_i[var18] + nl.field_a[var15][var18];
                            var18++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var23[var16] < var23[var17_int]) {
                            var16 = var17_int;
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
                var4_ref_sj = ua.field_x[var3];
                var4_ref_sj.c(74);
                bg.a(var3, 82);
                var5 = var4_ref_sj.field_q + var4_ref_sj.field_G >> 1;
                var6 = var4_ref_sj.field_b + var4_ref_sj.field_j >> 1;
                var7 = var4_ref_sj.field_t + var4_ref_sj.field_x >> 1;
                var8 = ma.field_c[9] >> 2;
                var9 = ma.field_c[10] >> 2;
                var10_int = ma.field_c[11] >> 2;
                var11 = var9 * ik.field_i[4] + (var8 * ik.field_i[3] - -(ik.field_i[5] * var10_int)) >> 14;
                var12 = ik.field_i[6] * var8 + (ik.field_i[7] * var9 - -(var10_int * ik.field_i[8])) >> 14;
                var13 = var10_int * ik.field_i[11] + (ik.field_i[9] * var8 + ik.field_i[10] * var9) >> 14;
                var2[var3] = var7 * var13 + var11 * var5 + var12 * var6 >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "ec.B(" + -128 + 41);
        }
    }

    final static String a(ad param0, String param1, String param2) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0.a(65)) {
              field_b = null;
              stackOut_3_0 = param2 + " - " + param0.b(true) + "%";
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = (String) param1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ec.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 0 + 41);
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Password: ";
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
