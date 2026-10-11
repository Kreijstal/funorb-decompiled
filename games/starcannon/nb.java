/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static java.awt.Color field_d;
    static qe field_c;
    static float field_a;
    static qe field_b;
    static df field_f;
    static int field_g;
    static ka field_e;

    final static void a(ue param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        lb var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ia var8 = null;
        int var9 = 0;
        ia var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = StarCannon.field_A;
        try {
          var8 = new ia(param0.a("logo.fo3d", (byte) -119, ""));
          var10 = var8;
          var3 = var10.j(7909);
          var10.c(true);
          uc.field_d = sb.a(var10, (byte) 107);
          ci.field_g = new lb[var3];
          ck.field_h = new int[var3][];
          for (var4 = 0; var3 > var4; var4++) {
            ci.field_g[var4] = vh.a(var8, 102);
          }
          var10.l(118);
          if (param1 <= 87) {
            nb.a(-75);
          }
          var9 = 0;
          var4Lifetime1 = var9;
          while (var3 > var9) {
            var5 = ci.field_g[var9];
            var5.a(1, 6, 6, 6, (byte) -72);
            var5.c((byte) -3);
            var6 = new int[]{var5.field_p + var5.field_M >> 1, var5.field_w + var5.field_F >> 1, var5.field_k + var5.field_v >> 1};
            ck.field_h[var9] = var6;
            var5.a(-var6[0], -var6[2], (byte) -30, -var6[1]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("nb.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$7 = 0;
        int incrementValue$6 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_43_2 = 0;
        int[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_46_2 = 0;
        int[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_49_2 = 0;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int var14Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var24Lifetime2;
        int var21Lifetime3;
        int var21Lifetime1Lifetime1;
        int var21Lifetime1Lifetime2;
        int var21Lifetime2Lifetime1;
        int var22Lifetime1Lifetime1;
        var25 = StarCannon.field_A;
        try {
          if (w.field_r == null ||
            !(param9 <= w.field_r.length)) {
            ui.field_r = new int[param9];
            w.field_r = new int[param9];
            mc.field_j = new int[param9];
          }
          var31 = w.field_r;
          var27 = var31;
          var26 = var27;
          var34 = var26;
          var30 = var34;
          var10 = var30;
          var32 = ui.field_r;
          var28 = var32;
          var11 = var28;
          var33 = mc.field_j;
          var29 = var33;
          var12 = var29;
          ug.a(var31, 0, param9);
          ug.a(var32, 0, param9);
          ug.a(var33, 0, param9);
          var13 = param5 / (1 + param7 * 2);
          var14 = param0 - param7;
          if (var14 < 0) {
            var14 = 0;
          }
          var15 = var14 * ki.field_j + param2;
          var16 = param7 + param0;
          var17 = 0;
          if (ki.field_f <= var16) {
            var17 = var16 + (-ki.field_f + 1);
            var16 = -1 + ki.field_f;
          }
          var18 = 1 + (-var14 + var16);
          while (var14 <= var16) {
            for (var19 = 0; param9 > var19; var19++) {
              param4 = param3[var15++];
              var10[var19] = var10[var19] + (w.a(param4, 16764195) >> 16);
              var11[var19] = var11[var19] + (w.a(65308, param4) >> 8);
              var12[var19] = var12[var19] + w.a(param4, 255);
            }
            var15 = var15 + param1;
            var14++;
          }
          var15 = var15 + var17 * ki.field_j;
          for (var19Lifetime1 = 0; param9 > var19Lifetime1; var19Lifetime1++) {
            incrementValue$7 = param6;
            param6++;
            param3[incrementValue$7] = var33[var19Lifetime1] / var18 + ((var34[var19Lifetime1] / var18 << 16) + (var32[var19Lifetime1] / var18 << 8));
          }
          var14Lifetime1 = -param8 + 1;
          param6 = param6 + param1;
          var19Lifetime2 = 1 - (-param7 + param8 + param0);
          if (var19Lifetime2 > 0) {
            var19Lifetime2 = 0;
          }
          var20 = param2 + (param0 - param7) * ki.field_j;
          if (var19Lifetime2 > var14Lifetime1) {
            var20 = var20 + (var19Lifetime2 - var14Lifetime1) * ki.field_j;
          }
          while (var14Lifetime1 < var19Lifetime2) {
            if (param0 + (var14Lifetime1 + param8) + param7 < ki.field_i) {
              for (var21 = 0; param9 > var21; var21++) {
                param4 = param3[var15++];
                var10[var21] = var10[var21] + (w.a(16763401, param4) >> 16);
                var11[var21] = var11[var21] + (w.a(param4, 65395) >> 8);
                var12[var21] = var12[var21] + w.a(255, param4);
              }
              var15 = var15 + param1;
              var18++;
            } else {
              var15 = var15 + ki.field_j;
            }
            for (var21Lifetime3 = 0; var21Lifetime3 < param9; var21Lifetime3++) {
              var22 = var34[var21Lifetime3] / var18;
              var23 = var32[var21Lifetime3] / var18;
              var24 = var33[var21Lifetime3] / var18;
              incrementValue$6 = param6;
              param6++;
              param3[incrementValue$6] = (var23 << 8) + ((var22 << 16) + var24);
            }
            param6 = param6 + param1;
            var14Lifetime1++;
          }
          var19Lifetime3 = -param7 + ki.field_f - (param0 + param8);
          if (var19Lifetime3 > 0) {
            var19Lifetime3 = 0;
          }
          while (var14Lifetime1 < var19Lifetime3) {
            for (var21Lifetime1 = 0; var21Lifetime1 < param9; var21Lifetime1++) {
              param4 = param3[var20++];
              var22Lifetime1 = -(255 & param4 >> 16) + var34[var21Lifetime1];
              stackIn_42_0 = var10;
              stackIn_42_1 = var21Lifetime1;
              if (0 <= var22Lifetime1) {
                stackIn_43_2 = var22Lifetime1;
              } else {
                stackIn_43_2 = 0;
              }
              stackIn_42_0[stackIn_42_1] = stackIn_43_2;
              var22Lifetime1 = var32[var21Lifetime1] - ((65344 & param4) >> 8);
              stackIn_45_0 = var11;
              stackIn_45_1 = var21Lifetime1;
              if (var22Lifetime1 < 0) {
                stackIn_46_2 = 0;
              } else {
                stackIn_46_2 = var22Lifetime1;
              }
              stackIn_45_0[stackIn_45_1] = stackIn_46_2;
              var22Lifetime1 = var33[var21Lifetime1] - (param4 & 255);
              stackIn_48_0 = var12;
              stackIn_48_1 = var21Lifetime1;
              if (var22Lifetime1 < 0) {
                stackIn_49_2 = 0;
              } else {
                stackIn_49_2 = var22Lifetime1;
              }
              stackIn_48_0[stackIn_48_1] = stackIn_49_2;
            }
            var20 = var20 + param1;
            for (var21Lifetime1Lifetime1 = 0; var21Lifetime1Lifetime1 < param9; var21Lifetime1Lifetime1++) {
              param4 = param3[var15++];
              var10[var21Lifetime1Lifetime1] = var10[var21Lifetime1Lifetime1] + w.a(255, param4 >> 16);
              var11[var21Lifetime1Lifetime1] = var11[var21Lifetime1Lifetime1] + (w.a(65511, param4) >> 8);
              var12[var21Lifetime1Lifetime1] = var12[var21Lifetime1Lifetime1] + w.a(param4, 255);
            }
            var15 = var15 + param1;
            for (var21Lifetime1Lifetime2 = 0; param9 > var21Lifetime1Lifetime2; var21Lifetime1Lifetime2++) {
              var22Lifetime1Lifetime1 = var13 * var34[var21Lifetime1Lifetime2] >> 14;
              var23Lifetime1 = var32[var21Lifetime1Lifetime2] * var13 >> 14;
              var24Lifetime1 = var13 * var33[var21Lifetime1Lifetime2] >> 14;
              if (255 < var23Lifetime1) {
                var23Lifetime1 = 255;
              }
              if (var22Lifetime1Lifetime1 > 255) {
                var22Lifetime1Lifetime1 = 255;
              }
              if (var24Lifetime1 > 255) {
                var24Lifetime1 = 255;
              }
              incrementValue$2 = param6;
              param6++;
              param3[incrementValue$2] = var24Lifetime1 + ((var23Lifetime1 << 8) + (var22Lifetime1Lifetime1 << 16));
            }
            param6 = param6 + param1;
            var14Lifetime1++;
          }
          while (0 > var14Lifetime1) {
            for (var21Lifetime2 = 0; param9 > var21Lifetime2; var21Lifetime2++) {
              param4 = param3[var20++];
              var10[var21Lifetime2] = var10[var21Lifetime2] - (w.a(param4, 16753086) >> 16);
              var11[var21Lifetime2] = var11[var21Lifetime2] - (w.a(65505, param4) >> 8);
              var12[var21Lifetime2] = var12[var21Lifetime2] - w.a(255, param4);
            }
            var18--;
            var20 = var20 + param1;
            for (var21Lifetime2Lifetime1 = 0; param9 > var21Lifetime2Lifetime1; var21Lifetime2Lifetime1++) {
              var22Lifetime2 = var34[var21Lifetime2Lifetime1] / var18;
              var23Lifetime2 = var32[var21Lifetime2Lifetime1] / var18;
              if (0 > var23Lifetime2) {
                var23Lifetime2 = 0;
              } else {
                if (255 < var23Lifetime2) {
                  var23Lifetime2 = 255;
                }
              }
              var24Lifetime2 = var33[var21Lifetime2Lifetime1] / var18;
              if (var22Lifetime2 >= 0) {
                if (255 < var22Lifetime2) {
                  var22Lifetime2 = 255;
                }
              } else {
                var22Lifetime2 = 0;
              }
              if (var24Lifetime2 >= 0) {
                if (var24Lifetime2 > 255) {
                  var24Lifetime2 = 255;
                }
              } else {
                var24Lifetime2 = 0;
              }
              incrementValue$0 = param6;
              param6++;
              param3[incrementValue$0] = (var22Lifetime2 << 16) + (var23Lifetime2 << 8) + var24Lifetime2;
            }
            param6 = param6 + param1;
            var14Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_89_0 = var10_ref;
          stackIn_89_1 = new StringBuilder().append("nb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_89_0), ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_d = null;
        if (param0 != 572996488) {
          return;
        }
        field_c = null;
        field_e = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        hl[] var18;
        var17 = StarCannon.field_A;
        if (param4 >= param11) {
          if (param4 < param5) {
            ak.a(param11, param3, param5, param13, param4, (byte) -44, ki.field_a, param15, param2, param6, param8, param1, param10, param9, param7, param14, param12);
          } else {
            if (param11 < param5) {
              ak.a(param11, param3, param4, param15, param5, (byte) 93, ki.field_a, param13, param2, param6, param7, param12, param9, param10, param8, param14, param1);
            } else {
              ak.a(param5, param10, param4, param15, param11, (byte) -116, ki.field_a, param2, param13, param7, param6, param14, param9, param3, param8, param12, param1);
            }
          }
        } else {
          if (param11 < param5) {
            ak.a(param4, param9, param5, param13, param11, (byte) -73, ki.field_a, param2, param15, param8, param6, param14, param10, param3, param7, param1, param12);
          } else {
            if (param4 < param5) {
              ak.a(param4, param9, param11, param2, param5, (byte) -120, ki.field_a, param13, param15, param8, param7, param12, param3, param10, param6, param1, param14);
            } else {
              ak.a(param5, param10, param11, param2, param4, (byte) 108, ki.field_a, param15, param13, param7, param8, param1, param3, param9, param6, param12, param14);
            }
          }
        }
        if (param0 <= 5) {
          var18 = (hl[]) null;
          nb.a(91, (byte) 22, 82, (hl[]) null, 63, -26, -49);
        }
    }

    final static void a(int param0, byte param1, int param2, hl[] param3, int param4, int param5, int param6) {
        int var22 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        var23 = StarCannon.field_A;
        try {
          if (param3 == null) {
            return;
          }
          if (0 < param2 &&
            0 < param6 &&
            param5 != 0) {
            if (param3[3] == null) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = param3[3].field_x;
            }
            var7_int = stackIn_11_0;
            if (null != param3[5]) {
              stackIn_14_0 = param3[5].field_x;
            } else {
              stackIn_14_0 = 0;
            }
            var8 = stackIn_14_0;
            if (param3[1] == null) {
              stackIn_17_0 = 0;
            } else {
              stackIn_17_0 = param3[1].field_q;
            }
            var9 = stackIn_17_0;
            if (null != param3[7]) {
              stackIn_20_0 = param3[7].field_q;
            } else {
              stackIn_20_0 = 0;
            }
            var10 = stackIn_20_0;
            var11 = param2 + param4;
            if (param1 != 122) {
              field_a = -0.9116721153259277f;
            }
            var12 = param0 + param6;
            var13 = var7_int + param4;
            var14 = -var8 + var11;
            var15 = var9 + param0;
            var16 = var12 - var10;
            var17 = var13;
            var18 = var14;
            if (var18 < var17) {
              var18 = param4 + var7_int * param2 / (var8 + var7_int);
              var17 = param4 + var7_int * param2 / (var8 + var7_int);
            }
            var19 = var15;
            var20 = var16;
            if (var20 < var19) {
              var20 = param0 + var9 * param6 / (var10 + var9);
              var19 = param0 + var9 * param6 / (var10 + var9);
            }
            ki.a(pk.field_d);
            if (null != param3[0]) {
              ki.c(param4, param0, var17, var19);
              param3[0].e(param4, param0, param5);
              ki.b(pk.field_d);
            }
            if (null != param3[2]) {
              ki.c(var18, param0, var11, var19);
              param3[2].e(var14, param0, param5);
              ki.b(pk.field_d);
            }
            if (null != param3[6]) {
              ki.c(param4, var20, var17, var12);
              param3[6].e(param4, var16, param5);
              ki.b(pk.field_d);
            }
            if (param3[8] != null) {
              ki.c(var18, var20, var11, var12);
              param3[8].e(var14, var16, param5);
              ki.b(pk.field_d);
            }
            if (null != param3[1] &&
              param3[1].field_x != 0) {
              ki.c(var17, param0, var18, var19);
              for (var21 = var13; var14 > var21; var21 = var21 + param3[1].field_x) {
                param3[1].e(var21, param0, param5);
              }
              ki.b(pk.field_d);
            }
            if (param3[7] != null &&
              param3[7].field_x != 0) {
              ki.c(var17, var20, var18, var12);
              for (var21Lifetime1 = var13; var14 > var21Lifetime1; var21Lifetime1 = var21Lifetime1 + param3[7].field_x) {
                param3[7].e(var21Lifetime1, var16, param5);
              }
              ki.b(pk.field_d);
            }
            if (null != param3[3] &&
              param3[3].field_q != 0) {
              ki.c(param4, var19, var17, var20);
              for (var21Lifetime2 = var15; var21Lifetime2 < var16; var21Lifetime2 = var21Lifetime2 + param3[3].field_q) {
                param3[3].e(param4, var21Lifetime2, param5);
              }
              ki.b(pk.field_d);
            }
            if (param3[5] != null &&
              param3[5].field_q != 0) {
              ki.c(var18, var19, var11, var20);
              for (var21Lifetime3 = var15; var21Lifetime3 < var16; var21Lifetime3 = var21Lifetime3 + param3[5].field_q) {
                param3[5].e(var14, var21Lifetime3, param5);
              }
              ki.b(pk.field_d);
            }
            if (null != param3[4] &&
              param3[4].field_x != 0 &&
              param3[4].field_q != 0) {
              ki.c(var17, var19, var18, var20);
              for (var21Lifetime4 = var15; var16 > var21Lifetime4; var21Lifetime4 = var21Lifetime4 + param3[4].field_q) {
                for (var22 = var13; var22 < var14; var22 = var22 + param3[4].field_x) {
                  param3[4].e(var22, var21Lifetime4, param5);
                }
              }
              ki.b(pk.field_d);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_74_0 = var7;
          stackIn_74_1 = new StringBuilder().append("nb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_d = new java.awt.Color(10040319);
    }
}
