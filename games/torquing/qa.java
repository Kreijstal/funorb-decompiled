/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends q {
    static String[] field_k;
    static String field_j;
    static String[] field_m;
    static int field_l;

    public static void a(int param0) {
        field_m = null;
        field_j = null;
        field_k = null;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Torquing.field_u;
        aq.field_c = false;
        bi.field_u = null;
        if (ff.field_a) {
          gn.field_m.n(-20041);
          if (param0 > -43) {
            field_k = null;
            return;
          } else {
            return;
          }
        } else {
          var1 = pa.field_c;
          if (var1 <= 0) {
            gn.field_m.b(true);
            gp.j((byte) -34);
            if (param0 > -43) {
              field_k = null;
              return;
            } else {
              return;
            }
          } else {
            if (var1 != 1) {
              bi.field_u = ff.a(new String[1], 0, up.field_h);
              bi.field_u = ac.a(-115, new CharSequence[3]);
              gn.field_m.b(true);
              gp.j((byte) -34);
              if (param0 <= -43) {
                return;
              } else {
                field_k = null;
                return;
              }
            } else {
              bi.field_u = nk.field_q;
              bi.field_u = ac.a(-115, new CharSequence[3]);
              gn.field_m.b(true);
              gp.j((byte) -34);
              if (param0 <= -43) {
                return;
              } else {
                field_k = null;
                return;
              }
            }
          }
        }
    }

    final static double[] a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8, double[] param9, int param10) {
        double[] var11 = null;
        RuntimeException var11_ref = null;
        double[] var12 = null;
        double var13 = 0.0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24 = null;
        double[] var25 = null;
        double[] var26 = null;
        double[] var27 = null;
        double[] var28 = null;
        double[] var29 = null;
        double[] var30 = null;
        double[] var31 = null;
        double[] var32 = null;
        double[] var33 = null;
        double[] var34 = null;
        double[] var35 = null;
        double[] var36 = null;
        double[] var37 = null;
        double[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var36 = new double[12];
              var33 = var36;
              var30 = var33;
              var27 = var30;
              var25 = var27;
              var37 = var25;
              var34 = var37;
              var31 = var34;
              var28 = var31;
              var11 = var28;
              var35 = new double[9];
              var32 = var35;
              var29 = var32;
              var26 = var29;
              var12 = var26;
              var12[0] = (double)(param0 - param10);
              var12[3] = (double)(-param10 + param5);
              var12[4] = (double)(-param1 + param7);
              var12[5] = (double)(-param3 + param4);
              var12[1] = (double)(param8 - param1);
              var12[2] = (double)(-param3 + param2);
              ap.a(var35, 0, var35, 3, var36, 9);
              ap.a(var36, 9);
              var12[2] = (double)(-param3) + param9[2];
              var12[1] = (double)(-param1) + param9[1];
              var12[0] = (double)(-param10) + param9[0];
              var13 = ap.a(var35, 0, var36, 9);
              var12[3] = -(var13 * var36[9]) + param9[0];
              var12[4] = -(var13 * var36[10]) + param9[1];
              var12[5] = param9[2] - var13 * var36[11];
              var15 = -param10 + param0;
              var16 = -param1 + param8;
              var17 = param2 - param3;
              var18 = param5 - param10;
              var19 = -param1 + param7;
              if (param6 < -24) {
                break L1;
              } else {
                var24 = null;
                double[] discarded$1 = qa.a(71, -82, 59, 85, 8, 90, (byte) -64, -61, -48, (double[]) null, 62);
                break L1;
              }
            }
            L2: {
              var20 = param4 - param3;
              var21 = -(var20 * var16) + var19 * var17;
              var22 = var15 * var20 + -(var18 * var17);
              var23 = -(var15 * var19) + var18 * var16;
              if (ap.a(param0, param8, param2, param10, param1, param3, param5, param7, param4, var21, var22, var23, var35[3], var35[4], var35[5])) {
                var11[2] = var35[5];
                var11[1] = var35[4];
                var11[0] = var35[3];
                var11[3] = Math.abs(var13);
                var11[8] = var37[11];
                var11[7] = var37[10];
                var11[6] = var37[9];
                break L2;
              } else {
                ap.a(param9[0], param9[1], param9[2], (double)param0, (double)param8, (double)param2, (double)param10, (double)param1, (double)param3, (double)param5, (double)param7, (double)param4, var36);
                var25[8] = -var36[2] + param9[2];
                var25[6] = param9[0] - var36[0];
                var25[7] = param9[1] - var36[1];
                ap.a(var36, 6);
                break L2;
              }
            }
            stackOut_5_0 = (double[]) var11;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var11_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var11_ref;
            stackOut_7_1 = new StringBuilder().append("qa.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param9 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param10 + 41);
        }
        return stackIn_6_0;
    }

    private qa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new String[]{"", "In order to keep your level progress:", "In order to keep your score:", "In order to keep your score and level progress:", "In order to keep your achievements:", "In order to keep your achievements and level progress:", "In order to keep your score and achievements:", "In order to keep your score, achievements, and level progress:"};
        field_m = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_j = "New twists";
    }
}
