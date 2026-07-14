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
        field_r = null;
        if (param0) {
            Object var2 = null;
            eb.a((om) null, (wq) null, -20, false);
        }
        field_m = null;
        field_p = null;
        field_q = null;
    }

    final cd a(int param0) {
        if (param0 != 13) {
            return null;
        }
        return vh.field_X;
    }

    final static void a(om param0, wq param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        om stackIn_4_0 = null;
        om stackIn_5_0 = null;
        om stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        om stackIn_7_0 = null;
        om stackIn_8_0 = null;
        om stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        om stackIn_10_0 = null;
        om stackIn_11_0 = null;
        om stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        om stackIn_13_0 = null;
        om stackIn_14_0 = null;
        om stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        om stackIn_16_0 = null;
        om stackIn_17_0 = null;
        om stackIn_18_0 = null;
        om stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        om stackIn_20_0 = null;
        om stackIn_21_0 = null;
        om stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        om stackOut_3_0;
        om stackOut_5_0;
        int stackOut_5_1;
        om stackOut_4_0;
        int stackOut_4_1;
        om stackOut_6_0;
        om stackOut_8_0;
        int stackOut_8_1;
        om stackOut_7_0;
        int stackOut_7_1;
        om stackOut_9_0;
        om stackOut_11_0;
        int stackOut_11_1;
        om stackOut_10_0;
        int stackOut_10_1;
        om stackOut_12_0;
        om stackOut_14_0;
        int stackOut_14_1;
        om stackOut_13_0;
        int stackOut_13_1;
        om stackOut_15_0;
        om stackOut_16_0;
        om stackOut_17_0;
        int stackOut_17_1;
        om stackOut_18_0;
        int stackOut_18_1;
        om stackOut_19_0;
        om stackOut_21_0;
        int stackOut_21_1;
        om stackOut_20_0;
        int stackOut_20_1;
        int stackOut_24_0;
        int stackOut_23_0;
        int stackOut_27_0;
        int stackOut_26_0;
        L0: {
          var9 = BrickABrac.field_J ? 1 : 0;
          if (param3) {
            param0.field_cc = param1.l(255);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          param0.field_jc = param1.l(255);
          param0.field_kc = param1.l(param2 ^ 255);
          var4 = param1.l(255);
          stackOut_3_0 = (om) param0;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if ((var4 & 128) == 0) {
            stackOut_5_0 = (om) (Object) stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = (om) (Object) stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((om) (Object) stackIn_6_0).field_bc = stackIn_6_1 != 0;
          stackOut_6_0 = (om) param0;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if ((64 & var4) == param2) {
            stackOut_8_0 = (om) (Object) stackIn_8_0;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = (om) (Object) stackIn_7_0;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((om) (Object) stackIn_9_0).field_Rb = stackIn_9_1 != 0;
          stackOut_9_0 = (om) param0;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (0 == (var4 & 32)) {
            stackOut_11_0 = (om) (Object) stackIn_11_0;
            stackOut_11_1 = 0;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L3;
          } else {
            stackOut_10_0 = (om) (Object) stackIn_10_0;
            stackOut_10_1 = 1;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            break L3;
          }
        }
        L4: {
          ((om) (Object) stackIn_12_0).field_ac = stackIn_12_1 != 0;
          stackOut_12_0 = (om) param0;
          stackIn_14_0 = stackOut_12_0;
          stackIn_13_0 = stackOut_12_0;
          if ((var4 & 8) == 0) {
            stackOut_14_0 = (om) (Object) stackIn_14_0;
            stackOut_14_1 = 0;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            break L4;
          } else {
            stackOut_13_0 = (om) (Object) stackIn_13_0;
            stackOut_13_1 = 1;
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            break L4;
          }
        }
        L5: {
          L6: {
            ((om) (Object) stackIn_15_0).field_Dc = stackIn_15_1 != 0;
            stackOut_15_0 = (om) param0;
            stackIn_18_0 = stackOut_15_0;
            stackIn_16_0 = stackOut_15_0;
            if (!param0.field_bc) {
              break L6;
            } else {
              stackOut_16_0 = (om) (Object) stackIn_16_0;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (param0.field_cc >= param0.field_jc) {
                break L6;
              } else {
                stackOut_17_0 = (om) (Object) stackIn_17_0;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L5;
              }
            }
          }
          stackOut_18_0 = (om) (Object) stackIn_18_0;
          stackOut_18_1 = 0;
          stackIn_19_0 = stackOut_18_0;
          stackIn_19_1 = stackOut_18_1;
          break L5;
        }
        L7: {
          ((om) (Object) stackIn_19_0).field_uc = stackIn_19_1 != 0;
          stackOut_19_0 = (om) param0;
          stackIn_21_0 = stackOut_19_0;
          stackIn_20_0 = stackOut_19_0;
          if (0 != (var4 & 16)) {
            stackOut_21_0 = (om) (Object) stackIn_21_0;
            stackOut_21_1 = 2;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            break L7;
          } else {
            stackOut_20_0 = (om) (Object) stackIn_20_0;
            stackOut_20_1 = 1;
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            break L7;
          }
        }
        L8: {
          ((om) (Object) stackIn_22_0).field_wc = stackIn_22_1;
          if (-1 == (4 & var4 ^ -1)) {
            stackOut_24_0 = 0;
            stackIn_25_0 = stackOut_24_0;
            break L8;
          } else {
            stackOut_23_0 = 1;
            stackIn_25_0 = stackOut_23_0;
            break L8;
          }
        }
        L9: {
          var5 = stackIn_25_0;
          param1.a(0, param0.field_Tb, param2 ^ 125, param0.field_Tb.length);
          if ((var4 & 2) == 0) {
            stackOut_27_0 = 0;
            stackIn_28_0 = stackOut_27_0;
            break L9;
          } else {
            stackOut_26_0 = 1;
            stackIn_28_0 = stackOut_26_0;
            break L9;
          }
        }
        L10: {
          var6 = stackIn_28_0;
          param0.field_vc = param1.i(65280);
          param0.field_qc = ue.a(false) - (long)param1.e(255);
          if (var5 != 0) {
            param0.field_yc = param1.e(255);
            break L10;
          } else {
            param0.field_yc = -1;
            break L10;
          }
        }
        L11: {
          param0.field_xc = param1.g(-32768);
          var7 = param1.field_l;
          param0.field_Fc = param1.d(param2 ^ -1);
          if (var6 != 0) {
            param0.field_Qb = new String[param0.field_cc];
            param1.field_l = var7;
            var8 = 0;
            L12: while (true) {
              if (param0.field_cc <= var8) {
                break L11;
              } else {
                param0.field_Qb[var8] = param1.d(-1);
                var8++;
                continue L12;
              }
            }
          } else {
            param0.field_Qb = null;
            break L11;
          }
        }
    }

    eb(String param0, String param1) {
        ((eb) this).field_o = param1;
        ((eb) this).field_k = param0;
    }

    final void a(int param0, wq param1) {
        param1.a(param0, ((eb) this).field_k);
        param1.a(false, ((eb) this).field_o);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
