/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static String field_b;
    static java.math.BigInteger field_c;
    static String field_a;

    final static void a(boolean param0, int[] param1, boolean param2, int[] param3, boolean param4, boolean param5, ia param6) {
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_60_0Lifetime1;
        int stackIn_60_1Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        int var24Lifetime1Lifetime1;
        int var25Lifetime1Lifetime1;
        int var26Lifetime1Lifetime1;
        var30 = EscapeVector.field_A;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param3[3] >> 2;
          var22 = param3[4] >> 2;
          var23 = param3[5] >> 2;
          var24 = param3[6] >> 2;
          var25 = param3[7] >> 2;
          var26 = param3[8] >> 2;
          var27 = param3[9] >> 2;
          var28 = param3[10] >> 2;
          var12 = param1[5] * var23 + var21 * param1[3] + param1[4] * var22 >> 14;
          var13 = var25 * param1[4] + (param1[3] * var24 + var26 * param1[5]) >> 14;
          var29 = param3[11] >> 2;
          var18 = var21 * param1[9] + (param1[10] * var22 + var23 * param1[11]) >> 14;
          var19 = var26 * param1[11] + param1[9] * var24 + var25 * param1[10] >> 14;
          var17 = param1[8] * var29 + (var28 * param1[7] + param1[6] * var27) >> 14;
          var16 = var25 * param1[7] + var24 * param1[6] + param1[8] * var26 >> 14;
          var20 = var29 * param1[11] + (param1[9] * var27 + var28 * param1[10]) >> 14;
          var15 = var22 * param1[7] + param1[6] * var21 + param1[8] * var23 >> 14;
          var14 = param1[4] * var28 + param1[3] * var27 + param1[5] * var29 >> 14;
          var21Lifetime1 = param1[0] - param3[0];
          var22Lifetime1 = -param3[1] + param1[1];
          var23Lifetime1 = param1[2] - param3[2];
          var9 = var23Lifetime1 * param3[5] + (var22Lifetime1 * param3[4] + param3[3] * var21Lifetime1) >> -ij.field_i + 16;
          var11 = param3[10] * var22Lifetime1 + (param3[9] * var21Lifetime1 + var23Lifetime1 * param3[11]) >> 16;
          var10 = param3[7] * var22Lifetime1 + (param3[6] * var21Lifetime1 + var23Lifetime1 * param3[8]) >> 16 - ij.field_i;
          var21Lifetime2 = bi.field_b;
          var22Lifetime2 = bi.field_i;
          var23Lifetime2 = 0;
          L1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var23Lifetime2 < param6.field_K) {
              var24Lifetime1 = param6.field_L[var23Lifetime2];
              var25Lifetime1 = param6.field_r[var23Lifetime2];
              var26Lifetime1 = param6.field_J[var23Lifetime2];
              var27Lifetime1 = (var18 * var26Lifetime1 + (var24Lifetime1 * var12 + var15 * var25Lifetime1) >> 16 - ij.field_i) + var9;
              var28Lifetime1 = var10 + (var16 * var25Lifetime1 + var13 * var24Lifetime1 + var19 * var26Lifetime1 >> -ij.field_i + 16);
              var29Lifetime1 = (var24Lifetime1 * var14 - (-(var17 * var25Lifetime1) - var26Lifetime1 * var20) >> 16) + var11;
              stackIn_60_0 = 50;
              stackIn_60_1 = var29Lifetime1;
              if (var30 != 0) {
                if (stackIn_60_0 > stackIn_60_1) {
                  stackIn_69_0 = oi.field_L.length;
                  stackIn_69_1 = var18;
                  break L1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_60_0 <= stackIn_60_1) {
                  on.field_g[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
                  ni.field_D[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  if (var29Lifetime1 < var7_int) {
                    var7_int = var29Lifetime1;
                  }
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                  km.field_j[var23Lifetime2] = var29Lifetime1;
                } else {
                  km.field_j[var23Lifetime2] = -2147483648;
                }
                if (param2) {
                  mg.field_a[var23Lifetime2] = var27Lifetime1 >> ij.field_i;
                  tm.field_bb[var23Lifetime2] = var28Lifetime1 >> ij.field_i;
                  jl.field_p[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledFrameCompleted0 = true;
              if (param6.field_k != null &&
                param6.field_d != null &&
                null != param6.field_E &&
                param6.field_C != null &&
                null != param6.field_P &&
                param6.field_s != null &&
                param6.field_H != null &&
                param6.field_l != null &&
                null != param6.field_t) {
                var23Lifetime2 = 0;
                while (!(param6.field_D <= var23Lifetime2)) {
                  var24Lifetime1Lifetime1 = param6.field_k[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param6.field_d[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param6.field_E[var23Lifetime2];
                  hm.field_w[var23Lifetime2] = var9 + (var18 * var26Lifetime1Lifetime1 + var15 * var25Lifetime1Lifetime1 + var12 * var24Lifetime1Lifetime1 >> 16);
                  hd.field_d[var23Lifetime2] = var10 + (var13 * var24Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var16 + var26Lifetime1Lifetime1 * var19 >> 16);
                  hm.field_h[var23Lifetime2] = (var24Lifetime1Lifetime1 * var14 + var25Lifetime1Lifetime1 * var17 + var26Lifetime1Lifetime1 * var20 >> 16) + var11;
                  var24Lifetime1Lifetime1 = param6.field_C[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param6.field_P[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param6.field_s[var23Lifetime2];
                  li.field_u[var23Lifetime2] = (var12 * var24Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var15 + var26Lifetime1Lifetime1 * var18 >> 16) + var9;
                  nf.field_t[var23Lifetime2] = var10 + (var24Lifetime1Lifetime1 * var13 + (var16 * var25Lifetime1Lifetime1 + var19 * var26Lifetime1Lifetime1) >> 16);
                  rn.field_d[var23Lifetime2] = var11 + (var14 * var24Lifetime1Lifetime1 - (-(var25Lifetime1Lifetime1 * var17) - var26Lifetime1Lifetime1 * var20) >> 16);
                  var24Lifetime1Lifetime1 = param6.field_H[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param6.field_l[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param6.field_t[var23Lifetime2];
                  hi.field_p[var23Lifetime2] = var9 + (var24Lifetime1Lifetime1 * var12 - (-(var15 * var25Lifetime1Lifetime1) - var18 * var26Lifetime1Lifetime1) >> 16);
                  th.field_y[var23Lifetime2] = (var26Lifetime1Lifetime1 * var19 + (var25Lifetime1Lifetime1 * var16 + var13 * var24Lifetime1Lifetime1) >> 16) + var10;
                  gm.field_c[var23Lifetime2] = var11 + (var14 * var24Lifetime1Lifetime1 + var17 * var25Lifetime1Lifetime1 + var20 * var26Lifetime1Lifetime1 >> 16);
                  var23Lifetime2++;
                  if (var30 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (decompiledFrameRemainder0 = (param0))) {
                var9 = param1[3];
                var10 = param1[4];
                var11 = param1[5];
                var12 = param1[6];
                var13 = param1[7];
                var14 = param1[8];
                var15 = param1[9];
                var16 = param1[10];
                var17 = param1[11];
              }
              if (decompiledFrameRemainder0) {
                var18 = 0;
                while (true) {
                  stackIn_60_0Lifetime1 = ~var18;
                  stackIn_60_1Lifetime1 = ~param6.field_M;
                  if (stackIn_60_0Lifetime1 <= stackIn_60_1Lifetime1) {
                    break;
                  }
                  stackIn_69_0 = oi.field_L.length;
                  stackIn_69_1 = var18;
                  if (var30 != 0) {
                    break L1;
                  }
                  if (stackIn_69_0 <= stackIn_69_1) {
                    break;
                  }
                  var19 = param6.field_N[var18];
                  var20 = param6.field_q[var18];
                  var21Lifetime2 = param6.field_w[var18];
                  oi.field_L[var18] = var19 * var9 - (-(var20 * var12) - var15 * var21Lifetime2) >> 16;
                  df.field_f[var18] = var19 * var10 + var13 * var20 + var21Lifetime2 * var16 >> 16;
                  oe.field_xb[var18] = var11 * var19 + (var14 * var20 + var21Lifetime2 * var17) >> 16;
                  var18++;
                }
              }
            }
            vh.a(param6, var7_int, var8, param4, 4198);
            stackIn_69_0 = param5 ? 1 : 0;
            stackIn_69_1 = 1;
            break;
          }
          if (stackIn_69_0 != stackIn_69_1) {
            cf.a(23);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_76_0 = var7;
          stackIn_76_1 = new StringBuilder().append("cf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_84_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        try {
          field_b = null;
          field_c = null;
          field_a = null;
          if (param0 != 3) {
            cf.a(true, -127, (CharSequence) null);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "cf.A(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ci var8 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          jb.field_l = new ci[32];
          if (param0 != -76) {
            field_a = (String) null;
          }
          for (var1_int = 0; var1_int < 32; var1_int++) {
            var2 = var1_int;
            var3 = dh.a(var1_int, (byte) 33) ? 1 : 0;
            var4 = ug.a(var1_int, 0) ? 1 : 0;
            var5 = jb.field_q[var1_int];
            var6 = jb.field_s[var1_int];
            var7 = jb.field_t[var1_int];
            var8 = new ci(var2, var3 != 0, var4 != 0, var5, var6, var7);
            jb.field_l[var1_int] = var8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "cf.B(" + param0 + ')');
        }
    }

    final static void a(ed param0, boolean param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = EscapeVector.field_A;
        try {
          var3_int = param0.field_A;
          if (!param1) {
            cf.a(false, 114, (CharSequence) null);
          }
          var4 = 1;
          while (true) {
            stackIn_6_0 = param0.field_z - 1;
            if (stackIn_6_0 > var4) {
              var5 = 1 + param0.field_A * var4;
              var6 = 0;
              stackIn_24_0 = 1;
              if (var8 == 0) {
                var7 = stackIn_24_0;
                while (var3_int - 1 > var7) {
                  stackIn_6_0 = var6;
                  if (stackIn_6_0 != 0 &&
                    param0.field_B[var5] == 0) {
                    param0.field_B[var5] = param2;
                    var6 = 0;
                  }
                  if (var6 == 0 &&
                    param0.field_B[1 + var5] != 0) {
                    param0.field_B[var5] = param2;
                    var6 = 1;
                  }
                  var5++;
                  var7++;
                }
                var4++;
                continue;
              }
            } else {
              stackIn_24_0 = 1;
            }
            var4 = stackIn_24_0;
            L9: while (true) {
              stackIn_26_0 = -1 + var3_int;
              if (stackIn_26_0 > var4) {
                var5Lifetime1 = var4 + param0.field_A;
                var6Lifetime1 = 0;
                if (var8 != 0) {
                  return;
                }
                var7Lifetime1 = 1;
                while (var7Lifetime1 < (param0.field_z - 1)) {
                  stackIn_26_0 = var6Lifetime1;
                  if (stackIn_26_0 != 0 &&
                    param0.field_B[var5Lifetime1] == 0) {
                    param0.field_B[var5Lifetime1] = param2;
                    var6Lifetime1 = 0;
                  }
                  if (var6Lifetime1 == 0 &&
                    param0.field_B[var5Lifetime1 + var3_int] != 0) {
                    var6Lifetime1 = 1;
                    param0.field_B[var5Lifetime1] = param2;
                  }
                  var5Lifetime1 = var5Lifetime1 + var3_int;
                  var7Lifetime1++;
                }
                var4++;
                continue L9;
              }
              break;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_47_0 = var3;
          stackIn_47_1 = new StringBuilder().append("cf.C(");
          if (param0 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String stackIn_5_0 = null;
        String stackIn_13_0 = null;
        String stackIn_19_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        boolean stackIn_32_0 = false;
        String stackIn_45_0 = null;
        int stackIn_48_0 = 0;
        String stackIn_50_0 = null;
        Object stackIn_52_0 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_31_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        try {
          if (null == param2) {
            stackIn_5_0 = kl.field_p;
            return stackIn_5_0;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = sf.a(-96, param2);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!fd.a(true, var4.charAt(0)) &&
                !fd.a(true, var4.charAt(-1 + var4.length()))) {
                var5 = 0;
                if (param1 <= 9) {
                  stackIn_28_0 = (String) null;
                  return stackIn_28_0;
                }
                var6 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(var6 < param2.length())))) {
                  var7 = param2.charAt(var6);
                  stackOut_31_0 = fd.a(true, (char) var7);
                  stackIn_48_0 = stackOut_31_0 ? 1 : 0;
                  stackIn_32_0 = stackOut_31_0;
                  if (var8 == 0) {
                    if (!stackIn_32_0) {
                      var5 = 0;
                    } else {
                      var5++;
                    }
                    if (var5 >= 2 &&
                      !param0) {
                      stackIn_45_0 = rg.field_c;
                      return stackIn_45_0;
                    }
                    var6++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  stackIn_48_0 = -1;
                }
                if (stackIn_48_0 <= ~var5) {
                  stackIn_52_0 = null;
                  return (String) (stackIn_52_0);
                }
                stackIn_50_0 = kn.field_c;
                return stackIn_50_0;
              }
              stackIn_25_0 = kn.field_c;
              return stackIn_25_0;
            }
            stackIn_19_0 = kl.field_p;
            return stackIn_19_0;
          }
          stackIn_13_0 = kl.field_p;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_56_0 = var3;
          stackIn_56_1 = new StringBuilder().append("cf.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(')').toString());
        }
    }

    final static boolean a(int param0, mf param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11) {
            field_b = (String) null;
          }
          stackIn_4_0 = param1.a((byte) -119);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("cf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_b = "Cancel";
        field_a = "You have 1 unread message!";
        field_c = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
