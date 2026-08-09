/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends ff {
    private String field_o;
    static int[] field_q;
    static String field_m;
    private String field_k;
    static int[][] field_r;
    static String[][] field_p;
    static int field_n;
    static boolean field_l;

    public static void a(boolean param0) {
        field_r = (int[][]) null;
        if (param0) {
            wq var2 = (wq) null;
            eb.a((om) null, (wq) null, -20, false);
        }
        field_m = null;
        field_p = (String[][]) null;
        field_q = null;
    }

    final cd a(int param0) {
        if (param0 != 13) {
            return (cd) null;
        }
        return vh.field_X;
    }

    final static void a(om param0, wq param1, int param2, boolean param3) {
        om stackIn_6_0 = null;
        om stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        om stackIn_9_0 = null;
        om stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        om stackIn_12_0 = null;
        om stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        om stackIn_15_0 = null;
        om stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        om stackIn_19_0 = null;
        om stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        om stackIn_22_0 = null;
        om stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3) {
                param0.field_cc = param1.l(255);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param0.field_jc = param1.l(255);
              param0.field_kc = param1.l(param2 ^ 255);
              var4_int = param1.l(255);
              stackIn_6_0 = (om) (param0);

              if ((var4_int & 128) == 0) {
                stackIn_7_0 = (om) ((Object) stackIn_6_0);
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = (om) ((Object) stackIn_6_0);
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              stackIn_7_0.field_bc = stackIn_7_1 != 0;
              stackIn_9_0 = (om) (param0);

              if ((64 & var4_int) == param2) {
                stackIn_10_0 = (om) ((Object) stackIn_9_0);
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = (om) ((Object) stackIn_9_0);
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              stackIn_10_0.field_Rb = stackIn_10_1 != 0;
              stackIn_12_0 = (om) (param0);

              if (0 == (var4_int & 32)) {
                stackIn_13_0 = (om) ((Object) stackIn_12_0);
                stackIn_13_1 = 0;
                break L4;
              } else {
                stackIn_13_0 = (om) ((Object) stackIn_12_0);
                stackIn_13_1 = 1;
                break L4;
              }
            }
            L5: {
              stackIn_13_0.field_ac = stackIn_13_1 != 0;
              stackIn_15_0 = (om) (param0);

              if ((var4_int & 8) == 0) {
                stackIn_16_0 = (om) ((Object) stackIn_15_0);
                stackIn_16_1 = 0;
                break L5;
              } else {
                stackIn_16_0 = (om) ((Object) stackIn_15_0);
                stackIn_16_1 = 1;
                break L5;
              }
            }
            L6: {
              L7: {
                stackIn_16_0.field_Dc = stackIn_16_1 != 0;
                stackIn_19_0 = (om) (param0);

                if (!param0.field_bc) {
                  break L7;
                } else {
                  stackIn_19_0 = (om) ((Object) stackIn_19_0);

                  if (param0.field_cc >= param0.field_jc) {
                    break L7;
                  } else {
                    stackIn_20_0 = (om) ((Object) stackIn_19_0);
                    stackIn_20_1 = 1;
                    break L6;
                  }
                }
              }
              stackIn_20_0 = (om) ((Object) stackIn_19_0);
              stackIn_20_1 = 0;
              break L6;
            }
            L8: {
              stackIn_20_0.field_uc = stackIn_20_1 != 0;
              stackIn_22_0 = (om) (param0);

              if (0 != (var4_int & 16)) {
                stackIn_23_0 = (om) ((Object) stackIn_22_0);
                stackIn_23_1 = 2;
                break L8;
              } else {
                stackIn_23_0 = (om) ((Object) stackIn_22_0);
                stackIn_23_1 = 1;
                break L8;
              }
            }
            L9: {
              stackIn_23_0.field_wc = stackIn_23_1;
              if (-1 == (4 & var4_int ^ -1)) {
                stackIn_26_0 = 0;
                break L9;
              } else {
                stackIn_26_0 = 1;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_26_0;
              param1.a(0, param0.field_Tb, param2 ^ 125, param0.field_Tb.length);
              if ((var4_int & 2) == 0) {
                stackIn_29_0 = 0;
                break L10;
              } else {
                stackIn_29_0 = 1;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_29_0;
              param0.field_vc = param1.i(65280);
              param0.field_qc = ue.a(false) - (long)param1.e(255);
              if (var5 != 0) {
                param0.field_yc = param1.e(255);
                break L11;
              } else {
                param0.field_yc = -1;
                break L11;
              }
            }
            L12: {
              param0.field_xc = param1.g(-32768);
              var7 = param1.field_l;
              param0.field_Fc = param1.d(param2 ^ -1);
              if (var6 != 0) {
                param0.field_Qb = new String[param0.field_cc];
                param1.field_l = var7;
                var8 = 0;
                L13: while (true) {
                  if (param0.field_cc <= var8) {
                    break L12;
                  } else {
                    param0.field_Qb[var8] = param1.d(-1);
                    var8++;
                    continue L13;
                  }
                }
              } else {
                param0.field_Qb = null;
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var4);

            stackIn_40_1 = new StringBuilder().append("eb.D(");

            if (param0 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L14;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_43_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');

            if (param1 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L15;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L15;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_41_0), stackIn_44_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    eb(String param0, String param1) {
        try {
            this.field_o = param1;
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "eb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, wq param1) {
        try {
            param1.a(param0, this.field_k);
            param1.a(false, this.field_o);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "eb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        double var4 = 0.0;
        int var6 = 0;
        field_q = new int[]{16777215, 56780, 7536682, 3359829, 12232538, 10081269};
        field_m = "Nice!";
        field_r = new int[field_q.length][256];
        for (var0 = 0; var0 < field_q.length; var0++) {
            var1 = 16711935 & field_q[var0];
            var2 = (field_q[var0] & 65280) >> 237668936;
            for (var3 = 0; -257 < (var3 ^ -1); var3++) {
                var4 = Math.exp((-128.0 + (double)var3) / 32.0);
                var4 = 255.0 * var4 / (var4 + 1.0);
                var6 = (int)Math.rint(var4);
                if (var6 > 255) {
                    var6 = 255;
                }
                if (!(var6 >= 0)) {
                    var6 = 0;
                }
                field_r[var0][var3] = ik.a(var6 * var2, 65280) + ik.a(var1 * var6 >> 1399047656, 16711934) + 1;
            }
        }
    }
}
