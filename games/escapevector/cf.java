/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static String field_b;
    static java.math.BigInteger field_c;
    static String field_a;

    final static void a(boolean param0, int[] param1, boolean param2, int[] param3, boolean param4, boolean param5, ia param6) {
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        String stackIn_77_2 = null;
        String stackIn_81_2 = null;
        String stackIn_85_2 = null;
        int var30 = EscapeVector.obfuscationControl;
        try {
          int var7_int = 2147483647;
          int var8 = -2147483648;
          int var21 = param3[3] >> 2;
          int var22 = param3[4] >> 2;
          int var23 = param3[5] >> 2;
          int var24 = param3[6] >> 2;
          int var25 = param3[7] >> 2;
          int var26 = param3[8] >> 2;
          int var27 = param3[9] >> 2;
          int var28 = param3[10] >> 2;
          int var12 = param1[5] * var23 + var21 * param1[3] + param1[4] * var22 >> 14;
          int var13 = var25 * param1[4] + (param1[3] * var24 + var26 * param1[5]) >> 14;
          int var29 = param3[11] >> 2;
          int var18 = var21 * param1[9] + (param1[10] * var22 + var23 * param1[11]) >> 14;
          int var19 = var26 * param1[11] + param1[9] * var24 + var25 * param1[10] >> 14;
          int var17 = param1[8] * var29 + (var28 * param1[7] + param1[6] * var27) >> 14;
          int var16 = var25 * param1[7] + var24 * param1[6] + param1[8] * var26 >> 14;
          int var20 = var29 * param1[11] + (param1[9] * var27 + var28 * param1[10]) >> 14;
          int var15 = var22 * param1[7] + param1[6] * var21 + param1[8] * var23 >> 14;
          int var14 = param1[4] * var28 + param1[3] * var27 + param1[5] * var29 >> 14;
          int var21Lifetime1 = param1[0] - param3[0];
          int var22Lifetime1 = -param3[1] + param1[1];
          int var23Lifetime1 = param1[2] - param3[2];
          int var9 = var23Lifetime1 * param3[5] + (var22Lifetime1 * param3[4] + param3[3] * var21Lifetime1) >> -ij.field_i + 16;
          int var11 = param3[10] * var22Lifetime1 + (param3[9] * var21Lifetime1 + var23Lifetime1 * param3[11]) >> 16;
          int var10 = param3[7] * var22Lifetime1 + (param3[6] * var21Lifetime1 + var23Lifetime1 * param3[8]) >> 16 - ij.field_i;
          int var21Lifetime2 = bi.field_b;
          int var22Lifetime2 = bi.field_i;
          int var23Lifetime2 = 0;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var23Lifetime2 < param6.field_K) {
              int var24Lifetime1 = param6.field_L[var23Lifetime2];
              int var25Lifetime1 = param6.field_r[var23Lifetime2];
              int var26Lifetime1 = param6.field_J[var23Lifetime2];
              int var27Lifetime1 = (var18 * var26Lifetime1 + (var24Lifetime1 * var12 + var15 * var25Lifetime1) >> 16 - ij.field_i) + var9;
              int var28Lifetime1 = var10 + (var16 * var25Lifetime1 + var13 * var24Lifetime1 + var19 * var26Lifetime1 >> -ij.field_i + 16);
              int var29Lifetime1 = (var24Lifetime1 * var14 - (-(var17 * var25Lifetime1) - var26Lifetime1 * var20) >> 16) + var11;
              int stackIn_60_0 = 50;
              int stackIn_60_1 = var29Lifetime1;
              if (var30 != 0) {
                if (stackIn_60_0 > stackIn_60_1) {
                  stackIn_69_0 = oi.field_L.length;
                  stackIn_69_1 = var18;
                  break scanLoop1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_60_0 <= stackIn_60_1) {
                  on.field_g[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
                  DraggableWidget.field_D[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
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
                  int var24Lifetime1Lifetime1 = param6.field_k[var23Lifetime2];
                  int var25Lifetime1Lifetime1 = param6.field_d[var23Lifetime2];
                  int var26Lifetime1Lifetime1 = param6.field_E[var23Lifetime2];
                  UiComponent.field_w[var23Lifetime2] = var9 + (var18 * var26Lifetime1Lifetime1 + var15 * var25Lifetime1Lifetime1 + var12 * var24Lifetime1Lifetime1 >> 16);
                  hd.field_d[var23Lifetime2] = var10 + (var13 * var24Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var16 + var26Lifetime1Lifetime1 * var19 >> 16);
                  UiComponent.field_h[var23Lifetime2] = (var24Lifetime1Lifetime1 * var14 + var25Lifetime1Lifetime1 * var17 + var26Lifetime1Lifetime1 * var20 >> 16) + var11;
                  var24Lifetime1Lifetime1 = param6.field_C[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param6.field_P[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param6.field_s[var23Lifetime2];
                  Minimap.field_u[var23Lifetime2] = (var12 * var24Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var15 + var26Lifetime1Lifetime1 * var18 >> 16) + var9;
                  SpriteState.field_t[var23Lifetime2] = var10 + (var24Lifetime1Lifetime1 * var13 + (var16 * var25Lifetime1Lifetime1 + var19 * var26Lifetime1Lifetime1) >> 16);
                  ClientException.field_d[var23Lifetime2] = var11 + (var14 * var24Lifetime1Lifetime1 - (-(var25Lifetime1Lifetime1 * var17) - var26Lifetime1Lifetime1 * var20) >> 16);
                  var24Lifetime1Lifetime1 = param6.field_H[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param6.field_l[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param6.field_t[var23Lifetime2];
                  EmailSyntaxValidator.field_p[var23Lifetime2] = var9 + (var24Lifetime1Lifetime1 * var12 - (-(var15 * var25Lifetime1Lifetime1) - var18 * var26Lifetime1Lifetime1) >> 16);
                  Bzip2State.field_y[var23Lifetime2] = (var26Lifetime1Lifetime1 * var19 + (var25Lifetime1Lifetime1 * var16 + var13 * var24Lifetime1Lifetime1) >> 16) + var10;
                  gm.field_c[var23Lifetime2] = var11 + (var14 * var24Lifetime1Lifetime1 + var17 * var25Lifetime1Lifetime1 + var20 * var26Lifetime1Lifetime1 >> 16);
                  var23Lifetime2++;
                  if (var30 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if (decompiledFrameCompleted0 &&
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
                  int stackIn_60_0Lifetime1 = ~var18;
                  int stackIn_60_1Lifetime1 = ~param6.field_M;
                  if (stackIn_60_0Lifetime1 <= stackIn_60_1Lifetime1) {
                    break;
                  }
                  stackIn_69_0 = oi.field_L.length;
                  stackIn_69_1 = var18;
                  if (var30 != 0) {
                    break scanLoop1;
                  }
                  if (stackIn_69_0 <= stackIn_69_1) {
                    break;
                  }
                  var19 = param6.field_N[var18];
                  var20 = param6.field_q[var18];
                  var21Lifetime2 = param6.field_w[var18];
                  oi.field_L[var18] = var19 * var9 - (-(var20 * var12) - var15 * var21Lifetime2) >> 16;
                  IsaacRandom.field_f[var18] = var19 * var10 + var13 * var20 + var21Lifetime2 * var16 >> 16;
                  GameplaySession.field_xb[var18] = var11 * var19 + (var14 * var20 + var21Lifetime2 * var17) >> 16;
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
            cf.releaseStatics(23);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_76_0 = var7;
          StringBuilder stackIn_76_1 = new StringBuilder().append("cf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          StringBuilder stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          StringBuilder stackIn_84_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        try {
          field_b = null;
          field_c = null;
          field_a = null;
          if (guard != 3) {
            cf.a(true, -127, (CharSequence) null);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "cf.A(" + guard + ')');
        }
    }

    final static void a(byte param0) {
        try {
          jb.field_l = new ci[32];
          if (param0 != -76) {
            field_a = (String) null;
          }
          for (int var1_int = 0; var1_int < 32; var1_int++) {
            int var2 = var1_int;
            boolean var3 = (dh.a(var1_int, (byte) 33));
            boolean var4 = (ug.a(var1_int, 0));
            int var5 = jb.field_q[var1_int];
            int var6 = jb.field_s[var1_int];
            int var7 = jb.field_t[var1_int];
            ci var8 = new ci(var2, (var3), (var4), var5, var6, var7);
            jb.field_l[var1_int] = var8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "cf.B(" + param0 + ')');
        }
    }

    final static void a(Sprite param0, boolean param1, int param2) {
        int stackIn_24_0 = 0;
        String stackIn_48_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var3_int = param0.fullWidth;
          if (!param1) {
            cf.a(false, 114, (CharSequence) null);
          }
          int var4 = 1;
          while (true) {
            int stackIn_6_0 = param0.fullHeight - 1;
            if (stackIn_6_0 > var4) {
              int var5 = 1 + param0.fullWidth * var4;
              int var6 = 0;
              stackIn_24_0 = 1;
              if (var8 == 0) {
                int var7 = stackIn_24_0;
                while (var3_int - 1 > var7) {
                  stackIn_6_0 = var6;
                  if (stackIn_6_0 != 0 &&
                    param0.pixels[var5] == 0) {
                    param0.pixels[var5] = param2;
                    var6 = 0;
                  }
                  if (var6 == 0 &&
                    param0.pixels[1 + var5] != 0) {
                    param0.pixels[var5] = param2;
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
            scanLoop1: while (true) {
              int stackIn_26_0 = -1 + var3_int;
              if (stackIn_26_0 > var4) {
                int var5Lifetime1 = var4 + param0.fullWidth;
                int var6Lifetime1 = 0;
                if (var8 != 0) {
                  return;
                }
                int var7Lifetime1 = 1;
                while (var7Lifetime1 < (param0.fullHeight - 1)) {
                  stackIn_26_0 = var6Lifetime1;
                  if (stackIn_26_0 != 0 &&
                    param0.pixels[var5Lifetime1] == 0) {
                    param0.pixels[var5Lifetime1] = param2;
                    var6Lifetime1 = 0;
                  }
                  if (var6Lifetime1 == 0 &&
                    param0.pixels[var5Lifetime1 + var3_int] != 0) {
                    var6Lifetime1 = 1;
                    param0.pixels[var5Lifetime1] = param2;
                  }
                  var5Lifetime1 = var5Lifetime1 + var3_int;
                  var7Lifetime1++;
                }
                var4++;
                continue scanLoop1;
              }
              break;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_47_0 = var3;
          StringBuilder stackIn_47_1 = new StringBuilder().append("cf.C(");
          if (param0 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        int stackIn_48_0 = 0;
        String stackIn_57_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (null == param2) {
            String stackIn_5_0 = AgeValidator.field_p;
            return stackIn_5_0;
          }
          int var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            String var4 = sf.a(-96, param2);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!fd.a(true, var4.charAt(0)) &&
                !fd.a(true, var4.charAt(-1 + var4.length()))) {
                int var5 = 0;
                if (param1 <= 9) {
                  String stackIn_28_0 = (String) null;
                  return stackIn_28_0;
                }
                int var6 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(var6 < param2.length())))) {
                  int var7 = param2.charAt(var6);
                  boolean stackOut_31_0 = fd.a(true, (char) var7);
                  stackIn_48_0 = stackOut_31_0 ? 1 : 0;
                  boolean stackIn_32_0 = stackOut_31_0;
                  if (var8 == 0) {
                    if (!stackIn_32_0) {
                      var5 = 0;
                    } else {
                      var5++;
                    }
                    if (var5 >= 2 &&
                      !param0) {
                      String stackIn_45_0 = BufferedRandomAccessFile.field_c;
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
                  Object stackIn_52_0 = null;
                  return (String) (stackIn_52_0);
                }
                String stackIn_50_0 = kn.field_c;
                return stackIn_50_0;
              }
              String stackIn_25_0 = kn.field_c;
              return stackIn_25_0;
            }
            String stackIn_19_0 = AgeValidator.field_p;
            return stackIn_19_0;
          }
          String stackIn_13_0 = AgeValidator.field_p;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_56_0 = var3;
          StringBuilder stackIn_56_1 = new StringBuilder().append("cf.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(')').toString());
        }
    }

    final static boolean a(int param0, ResourceArchive param1) {
        String stackIn_9_2 = null;
        try {
          if (param0 != 11) {
            field_b = (String) null;
          }
          boolean stackIn_4_0 = param1.a((byte) -119);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var2;
          StringBuilder stackIn_8_1 = new StringBuilder().append("cf.D(").append(param0).append(',');
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
