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
        field_d = null;
        field_b = null;
    }

    final static boolean a(byte param0, gn param1) {
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = param1.a((byte) 105);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("td.B(").append(-83).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static vj a(int param0, float param1, vj param2) {
        gj var3 = null;
        lb var3_ref = null;
        RuntimeException var3_ref2 = null;
        gj stackIn_2_0 = null;
        lb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        lb stackOut_3_0 = null;
        gj stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param2 instanceof lb) {
              var3_ref = (lb) (Object) param2;
              stackOut_3_0 = new lb(var3_ref.field_r, var3_ref.a(false, param1), param2.field_k, param2.field_p, param2.field_q);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              var3 = (gj) (Object) param2;
              stackOut_1_0 = new gj(var3.field_t, var3.field_u, var3.field_r, var3.field_r + (var3.field_w - var3.field_r) * param1, param2.field_k, param2.field_p, param2.field_q);
              stackIn_2_0 = stackOut_1_0;
              return (vj) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref2;
            stackOut_5_1 = new StringBuilder().append("td.E(").append(150).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return (vj) (Object) stackIn_4_0;
    }

    td(String param0) {
        try {
            ((td) this).field_f = jh.field_a.a(-32660, param0 + "_left");
            ((td) this).field_h = jh.field_a.a(-32660, param0 + "_right");
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "td.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        lj.a((byte) -107);
        tc.e(param1, param4, param0, param2);
    }

    final static void a(int param0, int param1) {
        bg.field_f = 133;
        bg.field_g = 33;
        bg.field_c = 21845;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        qk var4_ref_qk = null;
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
        RuntimeException decompiledCaughtException = null;
        var20 = HoldTheLine.field_D;
        try {
          L0: {
            HoldTheLine.field_E = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = ej.field_c.length;
            var24 = new int[var1_int];
            var23 = var24;
            var22 = var23;
            var21 = var22;
            var2 = var21;
            var3 = 0;
            L1: while (true) {
              if (var1_int <= var3) {
                L2: {
                  var3 = HoldTheLine.field_E[9] >> 8;
                  var4 = HoldTheLine.field_E[10] >> 8;
                  var5 = HoldTheLine.field_E[11] >> 8;
                  var6 = cf.field_q << 4;
                  var7 = 0;
                  var8 = tn.a(var6, 5255) >> 8;
                  var9 = hc.a(0, var6) >> 8;
                  var10 = 68 / ((param0 - 5) / 52);
                  if (-1 == nc.field_g) {
                    break L2;
                  } else {
                    if (rf.field_X == -1) {
                      break L2;
                    } else {
                      var7 = -320 + nc.field_g;
                      var9 = -128;
                      var8 = -rf.field_X + 240;
                      break L2;
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
                L3: while (true) {
                  if (var16 >= ej.field_c.length) {
                    break L0;
                  } else {
                    var17 = 0;
                    var18_int = 1;
                    L4: while (true) {
                      if (var18_int >= ej.field_c.length) {
                        var2[var17] = -2147483648;
                        var18 = ej.field_c[var17];
                        dj.b(var17, 28433);
                        var19 = 0;
                        L5: while (true) {
                          if (3 <= var19) {
                            ch.a(HoldTheLine.field_E, false, fe.field_b, (byte) 96, var18, true, false);
                            ai.a(-4006, var8, var9, var14, var18, var13, var7, var15);
                            var16++;
                            continue L3;
                          } else {
                            fe.field_b[var19] = fe.field_b[var19] + gd.field_e[var16][var19];
                            var19++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var24[var18_int] <= var24[var17]) {
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
                var4_ref_qk = ej.field_c[var3];
                var4_ref_qk.c(0);
                dj.b(var3, 28433);
                var5 = var4_ref_qk.field_F + var4_ref_qk.field_L >> 1;
                var6 = var4_ref_qk.field_d + var4_ref_qk.field_H >> 1;
                var7 = var4_ref_qk.field_p + var4_ref_qk.field_n >> 1;
                var8 = HoldTheLine.field_E[9] >> 2;
                var9 = HoldTheLine.field_E[10] >> 2;
                var10 = HoldTheLine.field_E[11] >> 2;
                var11_int = var9 * fe.field_b[4] + fe.field_b[3] * var8 - -(var10 * fe.field_b[5]) >> 14;
                var12 = var10 * fe.field_b[8] + (fe.field_b[7] * var9 + var8 * fe.field_b[6]) >> 14;
                var13 = var10 * fe.field_b[11] + (fe.field_b[9] * var8 - -(fe.field_b[10] * var9)) >> 14;
                var2[var3] = var5 * var11_int + var6 * var12 + var13 * var7 >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "td.F(" + param0 + ')');
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
