/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch extends hl {
    byte[] field_l;
    int field_j;
    static String[] field_t;
    el[] field_s;
    short[] field_q;
    static tk field_n;
    ik[] field_o;
    static float[] field_r;
    private int[] field_p;
    byte[] field_k;
    static ee field_i;
    static int field_m;
    byte[] field_v;
    static go field_u;

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                      if (param1 >= 8) {
                        break L2;
                      } else {
                        ch.a((byte) 36);
                        break L2;
                      }
                    }
                    param0.getAppletContext().showDocument(ah.a(var2, param0, (byte) 69), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) (var2_ref2);
                stackOut_7_1 = new StringBuilder().append("ch.E(");
                stackIn_10_0 = stackOut_7_0;
                stackIn_10_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "{...}";
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = stackOut_8_2;
                  break L4;
                }
              }
              throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int[] param1, byte[] param2, ld param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            var5_int = 1;
            var6 = 0;
            var8 = 57 / ((param0 - -27) / 58);
            var7 = null;
            var9 = 0;
            L1: while (true) {
              if ((var9 ^ -1) <= -129) {
                stackOut_22_0 = var5_int;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    if (null == param2) {
                      break L3;
                    } else {
                      if (-1 != (param2[var9] ^ -1)) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var10 = this.field_p[var9];
                  if ((var10 ^ -1) == -1) {
                    break L2;
                  } else {
                    L4: {
                      if ((var10 ^ -1) == (var6 ^ -1)) {
                        break L4;
                      } else {
                        L5: {
                          var6 = var10;
                          var10--;
                          if (0 == (var10 & 1)) {
                            var7 = param3.a(var10 >> -1551093598, (byte) 127, param1);
                            break L5;
                          } else {
                            var7 = param3.a(param1, var10 >> 121006466, (byte) 115);
                            break L5;
                          }
                        }
                        if (null != var7) {
                          break L4;
                        } else {
                          var5_int = 0;
                          break L4;
                        }
                      }
                    }
                    if (var7 == null) {
                      break L2;
                    } else {
                      this.field_s[var9] = (el) (var7);
                      this.field_p[var9] = 0;
                      break L2;
                    }
                  }
                }
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("ch.B(").append(param0).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L6;
            }
          }
          L7: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L7;
            }
          }
          L8: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L8;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L8;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    final static fn a(String param0, gn param1, int param2, gn param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        fn stackIn_2_0 = null;
        fn stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fn stackOut_3_0 = null;
        fn stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            var5_int = param3.c(param0, 3);
            var6 = param3.a(var5_int, param4, false);
            if (param2 == 14819) {
              stackOut_3_0 = fi.a(-17072, param1, param3, var6, var5_int);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (fn) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("ch.D(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        if (param0 != -6) {
            return;
        }
        try {
            field_n = null;
            field_r = null;
            field_u = null;
            field_t = null;
            field_i = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ch.G(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        try {
            le.field_s = new float[8];
            if (param0 != 9) {
                field_t = (String[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ch.F(" + param0 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, int[] param2, byte param3, qk param4, boolean param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int stackIn_63_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var30 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              if (param3 >= 77) {
                break L1;
              } else {
                field_u = (go) null;
                break L1;
              }
            }
            var21 = param0[3] >> -1632735646;
            var22 = param0[4] >> 218996546;
            var23 = param0[5] >> -2138195710;
            var24 = param0[6] >> 1944848130;
            var25 = param0[7] >> -916852766;
            var26 = param0[8] >> -1771446718;
            var27 = param0[9] >> 464381058;
            var28 = param0[10] >> 35834914;
            var13 = param2[5] * var26 + (var24 * param2[3] - -(param2[4] * var25)) >> -1210903634;
            var12 = param2[4] * var22 + (var21 * param2[3] - -(var23 * param2[5])) >> -1374562674;
            var29 = param0[11] >> -1069299262;
            var20 = param2[11] * var29 + (param2[9] * var27 + var28 * param2[10]) >> 728934766;
            var16 = var24 * param2[6] + (param2[7] * var25 + param2[8] * var26) >> -138926258;
            var17 = param2[7] * var28 + param2[6] * var27 - -(param2[8] * var29) >> -396774610;
            var19 = var26 * param2[11] + (param2[9] * var24 - -(param2[10] * var25)) >> 1178041166;
            var18 = var23 * param2[11] + var21 * param2[9] + var22 * param2[10] >> -1443322994;
            var14 = var28 * param2[4] + var27 * param2[3] + param2[5] * var29 >> 856306638;
            var15 = var22 * param2[7] + (var21 * param2[6] + var23 * param2[8]) >> -1331739026;
            var21 = param2[0] + -param0[0];
            var22 = param2[1] - param0[1];
            var23 = param2[2] + -param0[2];
            var9 = var23 * param0[5] + var22 * param0[4] + var21 * param0[3] >> -il.field_c + 16;
            var10 = param0[8] * var23 + (var21 * param0[6] - -(param0[7] * var22)) >> -il.field_c + 16;
            var11 = param0[11] * var23 + var21 * param0[9] - -(param0[10] * var22) >> -1865160368;
            var21 = li.field_b;
            var22 = li.field_c;
            var23 = 0;
            L2: while (true) {
              if (param4.field_u <= var23) {
                L3: {
                  if (null == param4.field_a) {
                    break L3;
                  } else {
                    if (param4.field_g == null) {
                      break L3;
                    } else {
                      if (null == param4.field_b) {
                        break L3;
                      } else {
                        if (null == param4.field_M) {
                          break L3;
                        } else {
                          if (null == param4.field_R) {
                            break L3;
                          } else {
                            if (param4.field_v == null) {
                              break L3;
                            } else {
                              if (param4.field_D == null) {
                                break L3;
                              } else {
                                if (null == param4.field_C) {
                                  break L3;
                                } else {
                                  if (param4.field_h != null) {
                                    var23 = 0;
                                    L4: while (true) {
                                      if ((param4.field_J ^ -1) >= (var23 ^ -1)) {
                                        break L3;
                                      } else {
                                        var24 = param4.field_a[var23];
                                        var25 = param4.field_g[var23];
                                        var26 = param4.field_b[var23];
                                        ae.field_d[var23] = var9 + (var15 * var25 + var24 * var12 + var18 * var26 >> -2053476912);
                                        wb.field_e[var23] = (var26 * var19 + (var13 * var24 + var16 * var25) >> -635486256) + var10;
                                        ba.field_a[var23] = var11 + (var26 * var20 + (var25 * var17 + var14 * var24) >> 520618032);
                                        var24 = param4.field_M[var23];
                                        var25 = param4.field_R[var23];
                                        var26 = param4.field_v[var23];
                                        jb.field_Y[var23] = var9 - -(var15 * var25 + var12 * var24 + var18 * var26 >> 715560048);
                                        oe.field_h[var23] = (var24 * var13 + var25 * var16 - -(var19 * var26) >> 431454832) + var10;
                                        u.field_U[var23] = var11 - -(var26 * var20 + (var14 * var24 - -(var17 * var25)) >> -1849469136);
                                        var24 = param4.field_D[var23];
                                        var25 = param4.field_C[var23];
                                        var26 = param4.field_h[var23];
                                        si.field_ob[var23] = (var26 * var18 + (var25 * var15 + var24 * var12) >> 498617168) + var9;
                                        pe.field_a[var23] = (var19 * var26 + var25 * var16 + var24 * var13 >> -842452368) + var10;
                                        cg.field_j[var23] = (var14 * var24 + (var17 * var25 + var20 * var26) >> 1138700496) + var11;
                                        var23++;
                                        continue L4;
                                      }
                                    }
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (!param5) {
                    break L5;
                  } else {
                    var9 = param2[3];
                    var10 = param2[4];
                    var11 = param2[5];
                    var12 = param2[6];
                    var13 = param2[7];
                    var14 = param2[8];
                    var15 = param2[9];
                    var16 = param2[10];
                    var17 = param2[11];
                    var18 = 0;
                    L6: while (true) {
                      if (param4.field_o <= var18) {
                        break L5;
                      } else {
                        stackOut_61_0 = kf.field_T.length;
                        stackIn_63_0 = stackOut_61_0;
                        if (stackIn_63_0 <= var18) {
                          break L5;
                        } else {
                          var19 = param4.field_c[var18];
                          var20 = param4.field_s[var18];
                          var21 = param4.field_A[var18];
                          kf.field_T[var18] = var12 * var20 + var9 * var19 + var15 * var21 >> 1860694480;
                          gb.field_q[var18] = var16 * var21 + (var13 * var20 + var19 * var10) >> -66495184;
                          u.field_S[var18] = var21 * var17 + var11 * var19 - -(var14 * var20) >> 1023792336;
                          var18++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
                pg.a(var8, param4, param1, 3, var7_int);
                break L0;
              } else {
                L7: {
                  var24 = param4.field_m[var23];
                  var25 = param4.field_G[var23];
                  var26 = param4.field_k[var23];
                  var27 = (var18 * var26 + var12 * var24 - -(var15 * var25) >> -il.field_c + 16) + var9;
                  var28 = (var16 * var25 + var13 * var24 - -(var26 * var19) >> 16 + -il.field_c) + var10;
                  var29 = (var26 * var20 + var14 * var24 + var17 * var25 >> -363710928) + var11;
                  if (var29 >= 50) {
                    L8: {
                      gd.field_d[var23] = var21 - -(var27 / var29);
                      om.field_p[var23] = var22 - -(var28 / var29);
                      if ((var8 ^ -1) > (var29 ^ -1)) {
                        var8 = var29;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if ((var29 ^ -1) <= (var7_int ^ -1)) {
                        break L9;
                      } else {
                        var7_int = var29;
                        break L9;
                      }
                    }
                    ff.field_c[var23] = var29;
                    break L7;
                  } else {
                    ff.field_c[var23] = -2147483648;
                    break L7;
                  }
                }
                L10: {
                  if (param6) {
                    uf.field_c[var23] = var27 >> il.field_c;
                    tl.field_z[var23] = var28 >> il.field_c;
                    sd.field_b[var23] = var29;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var23++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) (var7);
            stackOut_69_1 = new StringBuilder().append("ch.A(");
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L11;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L11;
            }
          }
          L12: {
            stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param1).append(',');
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param2 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L12;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L12;
            }
          }
          L13: {
            stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',').append(param3).append(',');
            stackIn_80_0 = stackOut_77_0;
            stackIn_80_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param4 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L13;
            } else {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "{...}";
              stackIn_81_0 = stackOut_78_0;
              stackIn_81_1 = stackOut_78_1;
              stackIn_81_2 = stackOut_78_2;
              break L13;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    ch(byte[] param0) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        ik dupTemp$17 = null;
        RuntimeException var2 = null;
        th var2_ref = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        ik[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        ik var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        ik var28 = null;
        int var28_int = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        byte[] stackIn_58_0 = null;
        byte[] stackIn_62_0 = null;
        Object stackIn_197_0 = null;
        byte[] stackIn_197_1 = null;
        ik stackIn_307_0 = null;
        RuntimeException stackIn_315_0 = null;
        StringBuilder stackIn_315_1 = null;
        RuntimeException stackIn_317_0 = null;
        StringBuilder stackIn_317_1 = null;
        RuntimeException stackIn_318_0 = null;
        StringBuilder stackIn_318_1 = null;
        String stackIn_318_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_57_0 = null;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        byte[] stackOut_56_0 = null;
        Object stackOut_61_0 = null;
        byte[] stackOut_59_0 = null;
        ik stackOut_305_0 = null;
        Object stackOut_195_0 = null;
        byte[] stackOut_195_1 = null;
        RuntimeException stackOut_314_0 = null;
        StringBuilder stackOut_314_1 = null;
        RuntimeException stackOut_317_0 = null;
        StringBuilder stackOut_317_1 = null;
        String stackOut_317_2 = null;
        RuntimeException stackOut_315_0 = null;
        StringBuilder stackOut_315_1 = null;
        String stackOut_315_2 = null;
        var36 = HoldTheLine.field_D;
        try {
          L0: {
            this.field_l = new byte[128];
            this.field_p = new int[128];
            this.field_q = new short[128];
            this.field_v = new byte[128];
            this.field_s = new el[128];
            this.field_o = new ik[128];
            this.field_k = new byte[128];
            var2_ref = new th(param0);
            var3 = 0;
            L1: while (true) {
              if (0 == var2_ref.field_i[var2_ref.field_l + var3]) {
                var4 = new byte[var3];
                var5 = 0;
                L2: while (true) {
                  if ((var3 ^ -1) >= (var5 ^ -1)) {
                    var3++;
                    var2_ref.field_l = var2_ref.field_l + 1;
                    var5 = var2_ref.field_l;
                    var2_ref.field_l = var2_ref.field_l + var3;
                    var6 = 0;
                    L3: while (true) {
                      if ((var2_ref.field_i[var6 + var2_ref.field_l] ^ -1) == -1) {
                        var7 = new byte[var6];
                        var8 = 0;
                        L4: while (true) {
                          if ((var8 ^ -1) <= (var6 ^ -1)) {
                            var6++;
                            var2_ref.field_l = var2_ref.field_l + 1;
                            var8 = var2_ref.field_l;
                            var2_ref.field_l = var2_ref.field_l + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (var2_ref.field_i[var9 + var2_ref.field_l] == 0) {
                                var10 = new byte[var9];
                                var11_int = 0;
                                L6: while (true) {
                                  if ((var9 ^ -1) >= (var11_int ^ -1)) {
                                    L7: {
                                      var9++;
                                      var2_ref.field_l = var2_ref.field_l + 1;
                                      var11 = new byte[var9];
                                      if ((var9 ^ -1) >= -2) {
                                        var12 = var9;
                                        break L7;
                                      } else {
                                        var11[1] = (byte) 1;
                                        var12 = 2;
                                        var13_int = 1;
                                        var14 = 2;
                                        L8: while (true) {
                                          if ((var9 ^ -1) >= (var14 ^ -1)) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var2_ref.f((byte) -89);
                                              if (var15_int != 0) {
                                                L10: {
                                                  if (var15_int > var13_int) {
                                                    break L10;
                                                  } else {
                                                    var15_int--;
                                                    break L10;
                                                  }
                                                }
                                                var13_int = var15_int;
                                                break L9;
                                              } else {
                                                incrementValue$9 = var12;
                                                var12++;
                                                var13_int = incrementValue$9;
                                                break L9;
                                              }
                                            }
                                            var11[var14] = (byte)var13_int;
                                            var14++;
                                            continue L8;
                                          }
                                        }
                                      }
                                    }
                                    var13 = new ik[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var14 >= var13.length) {
                                        L12: {
                                          var14 = var2_ref.f((byte) -93);
                                          if (var14 <= 0) {
                                            stackOut_57_0 = null;
                                            stackIn_58_0 = (byte[]) ((Object) stackOut_57_0);
                                            break L12;
                                          } else {
                                            stackOut_54_0 = var14;
                                            stackOut_54_1 = 2;
                                            stackIn_56_0 = stackOut_54_0;
                                            stackIn_56_1 = stackOut_54_1;
                                            stackOut_56_0 = new byte[stackIn_56_0 * stackIn_56_1];
                                            stackIn_58_0 = stackOut_56_0;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var15_array = stackIn_58_0;
                                          var14 = var2_ref.f((byte) -29);
                                          if (0 >= var14) {
                                            stackOut_61_0 = null;
                                            stackIn_62_0 = (byte[]) ((Object) stackOut_61_0);
                                            break L13;
                                          } else {
                                            stackOut_59_0 = new byte[var14 * 2];
                                            stackIn_62_0 = stackOut_59_0;
                                            break L13;
                                          }
                                        }
                                        var16 = stackIn_62_0;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (0 == var2_ref.field_i[var17 + var2_ref.field_l]) {
                                            var18 = new byte[var17];
                                            var19 = 0;
                                            L15: while (true) {
                                              if ((var17 ^ -1) >= (var19 ^ -1)) {
                                                var17++;
                                                var2_ref.field_l = var2_ref.field_l + 1;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (var20 >= 128) {
                                                    var19 = 0;
                                                    var20 = 0;
                                                    L17: while (true) {
                                                      if (-129 >= (var20 ^ -1)) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var22 = 0;
                                                        var23 = 0;
                                                        L18: while (true) {
                                                          if (128 <= var23) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var23 = 0;
                                                            var24 = 0;
                                                            L19: while (true) {
                                                              if (-129 >= (var24 ^ -1)) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if (var25_int >= 128) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if (-129 >= (var26 ^ -1)) {
                                                                        var21 = 0;
                                                                        var20 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (128 <= var27) {
                                                                            this.field_j = 1 + var2_ref.f((byte) -54);
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var27 >= var12) {
                                                                                L24: {
                                                                                  if (null != var15_array) {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if ((var27 ^ -1) <= (var15_array.length ^ -1)) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15_array[var27] = var2_ref.f(0);
                                                                                        var27 += 2;
                                                                                        continue L25;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    break L24;
                                                                                  }
                                                                                }
                                                                                L26: {
                                                                                  if (var16 == null) {
                                                                                    break L26;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L27: while (true) {
                                                                                      if ((var16.length ^ -1) >= (var27 ^ -1)) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var2_ref.f(0);
                                                                                        var27 += 2;
                                                                                        continue L27;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                                                    var27 = 0;
                                                                                    L29: while (true) {
                                                                                      if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                                                        L30: {
                                                                                          if (var15_array == null) {
                                                                                            break L30;
                                                                                          } else {
                                                                                            var19 = var2_ref.f((byte) -25);
                                                                                            var15_array[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L31: while (true) {
                                                                                              if (var27 >= var15_array.length) {
                                                                                                var27 = var15_array[0];
                                                                                                var28_int = var15_array[1];
                                                                                                var29 = 0;
                                                                                                L32: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L33: while (true) {
                                                                                                      if (var15_array.length <= var29) {
                                                                                                        var30 = var27;
                                                                                                        L34: while (true) {
                                                                                                          if (var30 >= 128) {
                                                                                                            var15_array = null;
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_k[var30] = (byte)(var28_int * this.field_k[var30] - -32 >> 350603846);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var15_array[var29];
                                                                                                        var31 = var15_array[var29 - -1];
                                                                                                        var32 = var28_int * (var30 - var27) - -((var30 + -var27) / 2);
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var33 >= var30) {
                                                                                                            var27 = var30;
                                                                                                            var28_int = var31;
                                                                                                            var29 += 2;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = sf.a(var32, -var27 + var30, (byte) -76);
                                                                                                            var32 = var32 + (var31 + -var28_int);
                                                                                                            this.field_k[var33] = (byte)(var34 * this.field_k[var33] + 32 >> 2048904166);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_k[var29] = (byte)(32 + var28_int * this.field_k[var29] >> 1524593734);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var2_ref.f((byte) -30) + 1 + var19;
                                                                                                var15_array[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L36: {
                                                                                          if (var16 != null) {
                                                                                            var19 = var2_ref.f((byte) -27);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var27 >= var16.length) {
                                                                                                var27 = var16[0];
                                                                                                var28_int = var16[1] << -1693911583;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L39: while (true) {
                                                                                                      if ((var16.length ^ -1) >= (var29 ^ -1)) {
                                                                                                        var16 = null;
                                                                                                        var30 = var27;
                                                                                                        L40: while (true) {
                                                                                                          if ((var30 ^ -1) <= -129) {
                                                                                                            break L36;
                                                                                                          } else {
                                                                                                            L41: {
                                                                                                              var31 = var28_int + (this.field_l[var30] & 255);
                                                                                                              if (var31 >= 0) {
                                                                                                                break L41;
                                                                                                              } else {
                                                                                                                var31 = 0;
                                                                                                                break L41;
                                                                                                              }
                                                                                                            }
                                                                                                            L42: {
                                                                                                              if ((var31 ^ -1) < -129) {
                                                                                                                var31 = 128;
                                                                                                                break L42;
                                                                                                              } else {
                                                                                                                break L42;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_l[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var16[var29];
                                                                                                        var31 = var16[var29 + 1] << -600490847;
                                                                                                        var32 = (var30 + -var27) * var28_int - -((var30 + -var27) / 2);
                                                                                                        var33 = var27;
                                                                                                        L43: while (true) {
                                                                                                          if ((var33 ^ -1) <= (var30 ^ -1)) {
                                                                                                            var29 += 2;
                                                                                                            var28_int = var31;
                                                                                                            var27 = var30;
                                                                                                            continue L39;
                                                                                                          } else {
                                                                                                            L44: {
                                                                                                              var34 = sf.a(var32, -var27 + var30, (byte) -86);
                                                                                                              var35 = var34 + (this.field_l[var33] & 255);
                                                                                                              if (0 > var35) {
                                                                                                                var35 = 0;
                                                                                                                break L44;
                                                                                                              } else {
                                                                                                                break L44;
                                                                                                              }
                                                                                                            }
                                                                                                            L45: {
                                                                                                              if (var35 > 128) {
                                                                                                                var35 = 128;
                                                                                                                break L45;
                                                                                                              } else {
                                                                                                                break L45;
                                                                                                              }
                                                                                                            }
                                                                                                            var32 = var32 + (-var28_int + var31);
                                                                                                            this.field_l[var33] = (byte)var35;
                                                                                                            var33++;
                                                                                                            continue L43;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L46: {
                                                                                                      var30 = var28_int + (this.field_l[var29] & 255);
                                                                                                      if ((var30 ^ -1) <= -1) {
                                                                                                        break L46;
                                                                                                      } else {
                                                                                                        var30 = 0;
                                                                                                        break L46;
                                                                                                      }
                                                                                                    }
                                                                                                    L47: {
                                                                                                      if (128 < var30) {
                                                                                                        var30 = 128;
                                                                                                        break L47;
                                                                                                      } else {
                                                                                                        break L47;
                                                                                                      }
                                                                                                    }
                                                                                                    this.field_l[var29] = (byte)var30;
                                                                                                    var29++;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var2_ref.f((byte) -110) + (1 + var19);
                                                                                                var16[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            break L36;
                                                                                          }
                                                                                        }
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var12 <= var27) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                                                                        var27 = 0;
                                                                                                        L52: while (true) {
                                                                                                          if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            stackOut_305_0 = var13[var27];
                                                                                                            stackIn_307_0 = stackOut_305_0;
                                                                                                            L53: {
                                                                                                              var28 = stackIn_307_0;
                                                                                                              if (-1 <= (var28.field_h ^ -1)) {
                                                                                                                break L53;
                                                                                                              } else {
                                                                                                                var28.field_j = var2_ref.f((byte) -81);
                                                                                                                break L53;
                                                                                                              }
                                                                                                            }
                                                                                                            var27++;
                                                                                                            continue L52;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        L54: {
                                                                                                          var28 = var13[var27];
                                                                                                          if (0 >= var28.field_m) {
                                                                                                            break L54;
                                                                                                          } else {
                                                                                                            var28.field_h = var2_ref.f((byte) -50);
                                                                                                            break L54;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var13[var27].field_m = var2_ref.f((byte) -50);
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L55: {
                                                                                                  var28 = var13[var27];
                                                                                                  if (var28.field_l == null) {
                                                                                                    break L55;
                                                                                                  } else {
                                                                                                    var28.field_d = var2_ref.f((byte) -16);
                                                                                                    break L55;
                                                                                                  }
                                                                                                }
                                                                                                L56: {
                                                                                                  if (var28.field_g == null) {
                                                                                                    break L56;
                                                                                                  } else {
                                                                                                    var28.field_n = var2_ref.f((byte) -120);
                                                                                                    break L56;
                                                                                                  }
                                                                                                }
                                                                                                L57: {
                                                                                                  if (var28.field_b > 0) {
                                                                                                    var28.field_c = var2_ref.f((byte) -81);
                                                                                                    break L57;
                                                                                                  } else {
                                                                                                    break L57;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_b = var2_ref.f((byte) -28);
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var28 = var13[var27];
                                                                                        stackOut_195_0 = null;
                                                                                        stackOut_195_1 = var28.field_l;
                                                                                        stackIn_197_0 = stackOut_195_0;
                                                                                        stackIn_197_1 = stackOut_195_1;
                                                                                        L58: {
                                                                                          if (stackIn_197_0 == stackIn_197_1) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L59: while (true) {
                                                                                              if (var28.field_l.length <= var29) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var19 = 1 + var19 - -var2_ref.f((byte) -34);
                                                                                                var28.field_l[var29] = (byte)var19;
                                                                                                var29 += 2;
                                                                                                continue L59;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27++;
                                                                                        continue L29;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L60: {
                                                                                      var28 = var13[var27];
                                                                                      if (null == var28.field_g) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L61: while (true) {
                                                                                          if (var28.field_g.length <= var29) {
                                                                                            break L60;
                                                                                          } else {
                                                                                            var19 = 1 + (var19 + var2_ref.f((byte) -36));
                                                                                            var28.field_g[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L61;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L62: {
                                                                                  var28 = var13[var27];
                                                                                  if (null != var28.field_l) {
                                                                                    var29 = 1;
                                                                                    L63: while (true) {
                                                                                      if (var28.field_l.length <= var29) {
                                                                                        break L62;
                                                                                      } else {
                                                                                        var28.field_l[var29] = var2_ref.f(0);
                                                                                        var29 += 2;
                                                                                        continue L63;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    break L62;
                                                                                  }
                                                                                }
                                                                                L64: {
                                                                                  if (null == var28.field_g) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L65: while (true) {
                                                                                      if ((-2 + var28.field_g.length ^ -1) >= (var29 ^ -1)) {
                                                                                        break L64;
                                                                                      } else {
                                                                                        var28.field_g[var29] = var2_ref.f(0);
                                                                                        var29 += 2;
                                                                                        continue L65;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L23;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L66: {
                                                                              if (var20 != 0) {
                                                                                break L66;
                                                                              } else {
                                                                                L67: {
                                                                                  if (var21 < var18.length) {
                                                                                    incrementValue$10 = var21;
                                                                                    var21++;
                                                                                    var20 = var18[incrementValue$10];
                                                                                    break L67;
                                                                                  } else {
                                                                                    var20 = -1;
                                                                                    break L67;
                                                                                  }
                                                                                }
                                                                                if (-1 <= (this.field_p[var27] ^ -1)) {
                                                                                  break L66;
                                                                                } else {
                                                                                  var26 = 1 + var2_ref.f((byte) -112);
                                                                                  break L66;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_k[var27] = (byte)var26;
                                                                            var20--;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L68: {
                                                                          if (this.field_p[var26] == 0) {
                                                                            break L68;
                                                                          } else {
                                                                            L69: {
                                                                              if (var20 == 0) {
                                                                                var25 = var13[var11[var21]];
                                                                                if (var10.length <= var21) {
                                                                                  var20 = -1;
                                                                                  break L69;
                                                                                } else {
                                                                                  incrementValue$11 = var21;
                                                                                  var21++;
                                                                                  var20 = var10[incrementValue$11];
                                                                                  break L69;
                                                                                }
                                                                              } else {
                                                                                break L69;
                                                                              }
                                                                            }
                                                                            this.field_o[var26] = (ik) (var25);
                                                                            var20--;
                                                                            break L68;
                                                                          }
                                                                        }
                                                                        var26++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L70: {
                                                                      if ((this.field_p[var25_int] ^ -1) == -1) {
                                                                        break L70;
                                                                      } else {
                                                                        L71: {
                                                                          if (0 != var20) {
                                                                            break L71;
                                                                          } else {
                                                                            incrementValue$12 = var8;
                                                                            var8++;
                                                                            var24 = var2_ref.field_i[incrementValue$12] + 16 << -208918974;
                                                                            if (var21 < var7.length) {
                                                                              incrementValue$13 = var21;
                                                                              var21++;
                                                                              var20 = var7[incrementValue$13];
                                                                              break L71;
                                                                            } else {
                                                                              var20 = -1;
                                                                              break L71;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        this.field_l[var25_int] = (byte)var24;
                                                                        break L70;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L72: {
                                                                  if ((this.field_p[var24] ^ -1) != -1) {
                                                                    L73: {
                                                                      if ((var20 ^ -1) == -1) {
                                                                        incrementValue$14 = var5;
                                                                        var5++;
                                                                        var23 = var2_ref.field_i[incrementValue$14] - 1;
                                                                        if ((var4.length ^ -1) >= (var21 ^ -1)) {
                                                                          var20 = -1;
                                                                          break L73;
                                                                        } else {
                                                                          incrementValue$15 = var21;
                                                                          var21++;
                                                                          var20 = var4[incrementValue$15];
                                                                          break L73;
                                                                        }
                                                                      } else {
                                                                        break L73;
                                                                      }
                                                                    }
                                                                    var20--;
                                                                    this.field_v[var24] = (byte)var23;
                                                                    break L72;
                                                                  } else {
                                                                    break L72;
                                                                  }
                                                                }
                                                                var24++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L74: {
                                                              if ((var20 ^ -1) == -1) {
                                                                L75: {
                                                                  if (var21 < var18.length) {
                                                                    incrementValue$16 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$16];
                                                                    break L75;
                                                                  } else {
                                                                    var20 = -1;
                                                                    break L75;
                                                                  }
                                                                }
                                                                var22 = var2_ref.d((byte) -17);
                                                                break L74;
                                                              } else {
                                                                break L74;
                                                              }
                                                            }
                                                            this.field_q[var23] = (short)(this.field_q[var23] + pk.a(-1 + var22 << -1685483730, 32768));
                                                            var20--;
                                                            this.field_p[var23] = var22;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var2_ref.f((byte) -86);
                                                        this.field_q[var20] = (short)(this.field_q[var20] + (var19 << -730105048));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var2_ref.f((byte) -93);
                                                    this.field_q[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var2_ref.f(0);
                                                var19++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var17++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        L76: {
                                          dupTemp$17 = new ik();
                                          var13[var14] = dupTemp$17;
                                          var15 = dupTemp$17;
                                          var16_int = var2_ref.f((byte) -60);
                                          if (0 < var16_int) {
                                            var15.field_l = new byte[2 * var16_int];
                                            break L76;
                                          } else {
                                            break L76;
                                          }
                                        }
                                        L77: {
                                          var16_int = var2_ref.f((byte) -44);
                                          if (-1 > (var16_int ^ -1)) {
                                            var15.field_g = new byte[2 + 2 * var16_int];
                                            var15.field_g[1] = (byte) 64;
                                            break L77;
                                          } else {
                                            break L77;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var2_ref.f(0);
                                    var11_int++;
                                    continue L6;
                                  }
                                }
                              } else {
                                var9++;
                                continue L5;
                              }
                            }
                          } else {
                            var7[var8] = var2_ref.f(0);
                            var8++;
                            continue L4;
                          }
                        }
                      } else {
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    var4[var5] = var2_ref.f(0);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L78: {
            var2 = decompiledCaughtException;
            stackOut_314_0 = (RuntimeException) (var2);
            stackOut_314_1 = new StringBuilder().append("ch.<init>(");
            stackIn_317_0 = stackOut_314_0;
            stackIn_317_1 = stackOut_314_1;
            stackIn_315_0 = stackOut_314_0;
            stackIn_315_1 = stackOut_314_1;
            if (param0 == null) {
              stackOut_317_0 = (RuntimeException) ((Object) stackIn_317_0);
              stackOut_317_1 = (StringBuilder) ((Object) stackIn_317_1);
              stackOut_317_2 = "null";
              stackIn_318_0 = stackOut_317_0;
              stackIn_318_1 = stackOut_317_1;
              stackIn_318_2 = stackOut_317_2;
              break L78;
            } else {
              stackOut_315_0 = (RuntimeException) ((Object) stackIn_315_0);
              stackOut_315_1 = (StringBuilder) ((Object) stackIn_315_1);
              stackOut_315_2 = "{...}";
              stackIn_318_0 = stackOut_315_0;
              stackIn_318_1 = stackOut_315_1;
              stackIn_318_2 = stackOut_315_2;
              break L78;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_318_0), stackIn_318_2 + ')');
        }
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -8346) {
                break L1;
              } else {
                ch.a(-62, 14, (hj) null, 98, (byte) 42);
                break L1;
              }
            }
            this.field_p = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "ch.H(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, hj param2, int param3, byte param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param2.e(-(param2.field_o / 2) + param3, param1 + -(param2.field_v / 2), param0);
              if (param4 == 98) {
                break L1;
              } else {
                field_t = (String[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ch.I(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(boolean param0) {
        String var1 = null;
        RuntimeException var1_ref = null;
        String stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        try {
          L0: {
            L1: {
              var1 = "";
              if (null != lh.field_a) {
                var1 = lh.field_a.a(false);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (0 != var1.length()) {
                break L2;
              } else {
                var1 = u.j(21);
                break L2;
              }
            }
            L3: {
              if (0 != var1.length()) {
                break L3;
              } else {
                var1 = nd.field_k;
                break L3;
              }
            }
            L4: {
              if (!param0) {
                break L4;
              } else {
                ch.a(100);
                break L4;
              }
            }
            stackOut_11_0 = (String) (var1);
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1_ref), "ch.C(" + param0 + ')');
        }
        return stackIn_12_0;
    }

    static {
        field_r = new float[]{3.0f, 2.75f, 2.5f, 2.25f, 2.0f};
        field_t = new String[]{"By rating", "By win percentage"};
    }
}
