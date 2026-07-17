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
                stackOut_7_0 = (RuntimeException) var2_ref2;
                stackOut_7_1 = new StringBuilder().append("ch.E(");
                stackIn_10_0 = stackOut_7_0;
                stackIn_10_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = stackOut_8_2;
                  break L4;
                }
              }
              throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
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
              if (var9 >= 128) {
                stackOut_22_0 = var5_int;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    if (null == param2) {
                      break L3;
                    } else {
                      if (param2[var9] != 0) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var10 = ((ch) this).field_p[var9];
                  if (var10 == 0) {
                    break L2;
                  } else {
                    L4: {
                      if (~var10 == ~var6) {
                        break L4;
                      } else {
                        L5: {
                          var6 = var10;
                          var10--;
                          if (0 == (var10 & 1)) {
                            var7 = (Object) (Object) param3.a(var10 >> 2, (byte) 127, param1);
                            break L5;
                          } else {
                            var7 = (Object) (Object) param3.a(param1, var10 >> 2, (byte) 115);
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
                      ((ch) this).field_s[var9] = (el) var7;
                      ((ch) this).field_p[var9] = 0;
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
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("ch.B(").append(param0).append(44);
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L6;
            }
          }
          L7: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L7;
            }
          }
          L8: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44);
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L8;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L8;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
        }
        return stackIn_23_0 != 0;
    }

    final static fn a(String param0, gn param1, int param2, gn param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        fn stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (fn) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("ch.D(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_4_0;
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
            throw kk.a((Throwable) (Object) runtimeException, "ch.G(" + param0 + 41);
        }
    }

    final static void a(int param0) {
        try {
            le.field_s = new float[8];
            if (param0 != 9) {
                field_t = null;
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ch.F(" + param0 + 41);
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
                field_u = null;
                break L1;
              }
            }
            var21 = param0[3] >> 2;
            var22 = param0[4] >> 2;
            var23 = param0[5] >> 2;
            var24 = param0[6] >> 2;
            var25 = param0[7] >> 2;
            var26 = param0[8] >> 2;
            var27 = param0[9] >> 2;
            var28 = param0[10] >> 2;
            var13 = param2[5] * var26 + (var24 * param2[3] - -(param2[4] * var25)) >> 14;
            var12 = param2[4] * var22 + (var21 * param2[3] - -(var23 * param2[5])) >> 14;
            var29 = param0[11] >> 2;
            var20 = param2[11] * var29 + (param2[9] * var27 + var28 * param2[10]) >> 14;
            var16 = var24 * param2[6] + (param2[7] * var25 + param2[8] * var26) >> 14;
            var17 = param2[7] * var28 + param2[6] * var27 - -(param2[8] * var29) >> 14;
            var19 = var26 * param2[11] + (param2[9] * var24 - -(param2[10] * var25)) >> 14;
            var18 = var23 * param2[11] + var21 * param2[9] + var22 * param2[10] >> 14;
            var14 = var28 * param2[4] + var27 * param2[3] + param2[5] * var29 >> 14;
            var15 = var22 * param2[7] + (var21 * param2[6] + var23 * param2[8]) >> 14;
            var21 = param2[0] + -param0[0];
            var22 = param2[1] - param0[1];
            var23 = param2[2] + -param0[2];
            var9 = var23 * param0[5] + var22 * param0[4] + var21 * param0[3] >> -il.field_c + 16;
            var10 = param0[8] * var23 + (var21 * param0[6] - -(param0[7] * var22)) >> -il.field_c + 16;
            var11 = param0[11] * var23 + var21 * param0[9] - -(param0[10] * var22) >> 16;
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
                                      if (~param4.field_J >= ~var23) {
                                        break L3;
                                      } else {
                                        var24 = param4.field_a[var23];
                                        var25 = param4.field_g[var23];
                                        var26 = param4.field_b[var23];
                                        ae.field_d[var23] = var9 + (var15 * var25 + var24 * var12 + var18 * var26 >> 16);
                                        wb.field_e[var23] = (var26 * var19 + (var13 * var24 + var16 * var25) >> 16) + var10;
                                        ba.field_a[var23] = var11 + (var26 * var20 + (var25 * var17 + var14 * var24) >> 16);
                                        var24 = param4.field_M[var23];
                                        var25 = param4.field_R[var23];
                                        var26 = param4.field_v[var23];
                                        jb.field_Y[var23] = var9 - -(var15 * var25 + var12 * var24 + var18 * var26 >> 16);
                                        oe.field_h[var23] = (var24 * var13 + var25 * var16 - -(var19 * var26) >> 16) + var10;
                                        u.field_U[var23] = var11 - -(var26 * var20 + (var14 * var24 - -(var17 * var25)) >> 16);
                                        var24 = param4.field_D[var23];
                                        var25 = param4.field_C[var23];
                                        var26 = param4.field_h[var23];
                                        si.field_ob[var23] = (var26 * var18 + (var25 * var15 + var24 * var12) >> 16) + var9;
                                        pe.field_a[var23] = (var19 * var26 + var25 * var16 + var24 * var13 >> 16) + var10;
                                        cg.field_j[var23] = (var14 * var24 + (var17 * var25 + var20 * var26) >> 16) + var11;
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
                          kf.field_T[var18] = var12 * var20 + var9 * var19 + var15 * var21 >> 16;
                          gb.field_q[var18] = var16 * var21 + (var13 * var20 + var19 * var10) >> 16;
                          u.field_S[var18] = var21 * var17 + var11 * var19 - -(var14 * var20) >> 16;
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
                  var29 = (var26 * var20 + var14 * var24 + var17 * var25 >> 16) + var11;
                  if (var29 >= 50) {
                    L8: {
                      gd.field_d[var23] = var21 - -(var27 / var29);
                      om.field_p[var23] = var22 - -(var28 / var29);
                      if (~var8 > ~var29) {
                        var8 = var29;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (~var29 <= ~var7_int) {
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
            stackOut_69_0 = (RuntimeException) var7;
            stackOut_69_1 = new StringBuilder().append("ch.A(");
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L11;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L11;
            }
          }
          L12: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(44).append(param1).append(44);
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param2 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L12;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L12;
            }
          }
          L13: {
            stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(44).append(param3).append(44);
            stackIn_80_0 = stackOut_77_0;
            stackIn_80_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param4 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L13;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_81_0 = stackOut_78_0;
              stackIn_81_1 = stackOut_78_1;
              stackIn_81_2 = stackOut_78_2;
              break L13;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 44 + param5 + 44 + param6 + 41);
        }
    }

    ch(byte[] param0) {
        th var2 = null;
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
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        byte[] stackIn_45_0 = null;
        byte[] stackIn_48_0 = null;
        Object stackIn_150_0 = null;
        byte[] stackIn_150_1 = null;
        ik stackIn_232_0 = null;
        Object stackOut_44_0 = null;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        byte[] stackOut_43_0 = null;
        Object stackOut_47_0 = null;
        byte[] stackOut_46_0 = null;
        ik stackOut_231_0 = null;
        Object stackOut_149_0 = null;
        byte[] stackOut_149_1 = null;
        var36 = HoldTheLine.field_D;
        ((ch) this).field_l = new byte[128];
        ((ch) this).field_p = new int[128];
        ((ch) this).field_q = new short[128];
        ((ch) this).field_v = new byte[128];
        ((ch) this).field_s = new el[128];
        ((ch) this).field_o = new ik[128];
        ((ch) this).field_k = new byte[128];
        var2 = new th(param0);
        var3 = 0;
        L0: while (true) {
          if (0 == var2.field_i[var2.field_l + var3]) {
            var4 = new byte[var3];
            var5 = 0;
            L1: while (true) {
              if (~var3 >= ~var5) {
                var3++;
                var2.field_l = var2.field_l + 1;
                var5 = var2.field_l;
                var2.field_l = var2.field_l + var3;
                var6 = 0;
                L2: while (true) {
                  if (var2.field_i[var6 + var2.field_l] == 0) {
                    var7 = new byte[var6];
                    var8 = 0;
                    L3: while (true) {
                      if (~var8 <= ~var6) {
                        var6++;
                        var2.field_l = var2.field_l + 1;
                        var8 = var2.field_l;
                        var2.field_l = var2.field_l + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var2.field_i[var9 + var2.field_l] == 0) {
                            var10 = new byte[var9];
                            var11_int = 0;
                            L5: while (true) {
                              if (~var9 >= ~var11_int) {
                                L6: {
                                  var9++;
                                  var2.field_l = var2.field_l + 1;
                                  var11 = new byte[var9];
                                  if (var9 <= 1) {
                                    var12 = var9;
                                    break L6;
                                  } else {
                                    var11[1] = (byte) 1;
                                    var12 = 2;
                                    var13_int = 1;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (~var9 >= ~var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var2.f((byte) -89);
                                          if (var15_int != 0) {
                                            L9: {
                                              if (var15_int > var13_int) {
                                                break L9;
                                              } else {
                                                var15_int--;
                                                break L9;
                                              }
                                            }
                                            var13_int = var15_int;
                                            break L8;
                                          } else {
                                            int incrementValue$9 = var12;
                                            var12++;
                                            var13_int = incrementValue$9;
                                            break L8;
                                          }
                                        }
                                        var11[var14] = (byte)var13_int;
                                        var14++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                var13 = new ik[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var2.f((byte) -93);
                                      if (var14 <= 0) {
                                        stackOut_44_0 = null;
                                        stackIn_45_0 = (byte[]) (Object) stackOut_44_0;
                                        break L11;
                                      } else {
                                        stackOut_42_0 = var14;
                                        stackOut_42_1 = 2;
                                        stackIn_43_0 = stackOut_42_0;
                                        stackIn_43_1 = stackOut_42_1;
                                        stackOut_43_0 = new byte[stackIn_43_0 * stackIn_43_1];
                                        stackIn_45_0 = stackOut_43_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      var15_array = stackIn_45_0;
                                      var14 = var2.f((byte) -29);
                                      if (0 >= var14) {
                                        stackOut_47_0 = null;
                                        stackIn_48_0 = (byte[]) (Object) stackOut_47_0;
                                        break L12;
                                      } else {
                                        stackOut_46_0 = new byte[var14 * 2];
                                        stackIn_48_0 = stackOut_46_0;
                                        break L12;
                                      }
                                    }
                                    var16 = stackIn_48_0;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (0 == var2.field_i[var17 + var2.field_l]) {
                                        var18 = new byte[var17];
                                        var19 = 0;
                                        L14: while (true) {
                                          if (~var17 >= ~var19) {
                                            var17++;
                                            var2.field_l = var2.field_l + 1;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (var20 >= 128) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (var20 >= 128) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if (128 <= var23) {
                                                        var21 = 0;
                                                        var20 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (var24 >= 128) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (var25_int >= 128) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (var26 >= 128) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (128 <= var27) {
                                                                        ((ch) this).field_j = 1 + var2.f((byte) -54);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= var12) {
                                                                            L23: {
                                                                              if (null != var15_array) {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (~var27 <= ~var15_array.length) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var2.f(0);
                                                                                    var27 += 2;
                                                                                    continue L24;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                break L23;
                                                                              }
                                                                            }
                                                                            L25: {
                                                                              if (var16 == null) {
                                                                                break L25;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L26: while (true) {
                                                                                  if (~var16.length >= ~var27) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var2.f(0);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if (~var12 >= ~var27) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (~var27 <= ~var12) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var2.f((byte) -25);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var27 >= var15_array.length) {
                                                                                            var27 = var15_array[0];
                                                                                            var28_int = var15_array[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var15_array.length <= var29) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((ch) this).field_k[var30] = (byte)(var28_int * ((ch) this).field_k[var30] - -32 >> 6);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var15_array[var29];
                                                                                                    var31 = var15_array[var29 - -1];
                                                                                                    var32 = var28_int * (var30 - var27) - -((var30 + -var27) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var33 >= var30) {
                                                                                                        var27 = var30;
                                                                                                        var28_int = var31;
                                                                                                        var29 += 2;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = sf.a(var32, -var27 + var30, (byte) -76);
                                                                                                        var32 = var32 + (var31 + -var28_int);
                                                                                                        ((ch) this).field_k[var33] = (byte)(var34 * ((ch) this).field_k[var33] + 32 >> 6);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((ch) this).field_k[var29] = (byte)(32 + var28_int * ((ch) this).field_k[var29] >> 6);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var2.f((byte) -30) + 1 + var19;
                                                                                            var15_array[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L30;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (var16 != null) {
                                                                                        var19 = var2.f((byte) -27);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var16.length) {
                                                                                            var27 = var16[0];
                                                                                            var28_int = var16[1] << 1;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (~var16.length >= ~var29) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = var28_int + (((ch) this).field_l[var30] & 255);
                                                                                                          if (var31 >= 0) {
                                                                                                            break L40;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L40;
                                                                                                          }
                                                                                                        }
                                                                                                        L41: {
                                                                                                          if (var31 > 128) {
                                                                                                            var31 = 128;
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        ((ch) this).field_l[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var16[var29];
                                                                                                    var31 = var16[var29 + 1] << 1;
                                                                                                    var32 = (var30 + -var27) * var28_int - -((var30 + -var27) / 2);
                                                                                                    var33 = var27;
                                                                                                    L42: while (true) {
                                                                                                      if (~var33 <= ~var30) {
                                                                                                        var29 += 2;
                                                                                                        var28_int = var31;
                                                                                                        var27 = var30;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = sf.a(var32, -var27 + var30, (byte) -86);
                                                                                                          var35 = var34 + (((ch) this).field_l[var33] & 255);
                                                                                                          if (0 > var35) {
                                                                                                            var35 = 0;
                                                                                                            break L43;
                                                                                                          } else {
                                                                                                            break L43;
                                                                                                          }
                                                                                                        }
                                                                                                        L44: {
                                                                                                          if (var35 > 128) {
                                                                                                            var35 = 128;
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                        var32 = var32 + (-var28_int + var31);
                                                                                                        ((ch) this).field_l[var33] = (byte)var35;
                                                                                                        var33++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = var28_int + (((ch) this).field_l[var29] & 255);
                                                                                                  if (var30 >= 0) {
                                                                                                    break L45;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L45;
                                                                                                  }
                                                                                                }
                                                                                                L46: {
                                                                                                  if (128 < var30) {
                                                                                                    var30 = 128;
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                ((ch) this).field_l[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var2.f((byte) -110) + (1 + var19);
                                                                                            var16[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L36;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        break L35;
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L47: while (true) {
                                                                                      if (var12 <= var27) {
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (~var12 >= ~var27) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (~var12 >= ~var27) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (~var27 <= ~var12) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (~var12 >= ~var27) {
                                                                                                        return;
                                                                                                      } else {
                                                                                                        stackOut_231_0 = var13[var27];
                                                                                                        stackIn_232_0 = stackOut_231_0;
                                                                                                        L52: {
                                                                                                          var28 = stackIn_232_0;
                                                                                                          if (var28.field_h <= 0) {
                                                                                                            break L52;
                                                                                                          } else {
                                                                                                            var28.field_j = var2.f((byte) -81);
                                                                                                            break L52;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L53: {
                                                                                                      var28 = var13[var27];
                                                                                                      if (0 >= var28.field_m) {
                                                                                                        break L53;
                                                                                                      } else {
                                                                                                        var28.field_h = var2.f((byte) -50);
                                                                                                        break L53;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_m = var2.f((byte) -50);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L54: {
                                                                                              var28 = var13[var27];
                                                                                              if (var28.field_l == null) {
                                                                                                break L54;
                                                                                              } else {
                                                                                                var28.field_d = var2.f((byte) -16);
                                                                                                break L54;
                                                                                              }
                                                                                            }
                                                                                            L55: {
                                                                                              if (var28.field_g == null) {
                                                                                                break L55;
                                                                                              } else {
                                                                                                var28.field_n = var2.f((byte) -120);
                                                                                                break L55;
                                                                                              }
                                                                                            }
                                                                                            L56: {
                                                                                              if (var28.field_b > 0) {
                                                                                                var28.field_c = var2.f((byte) -81);
                                                                                                break L56;
                                                                                              } else {
                                                                                                break L56;
                                                                                              }
                                                                                            }
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_b = var2.f((byte) -28);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var28 = var13[var27];
                                                                                    stackOut_149_0 = null;
                                                                                    stackOut_149_1 = var28.field_l;
                                                                                    stackIn_150_0 = stackOut_149_0;
                                                                                    stackIn_150_1 = stackOut_149_1;
                                                                                    L57: {
                                                                                      if (stackIn_150_0 == (Object) (Object) stackIn_150_1) {
                                                                                        break L57;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L58: while (true) {
                                                                                          if (var28.field_l.length <= var29) {
                                                                                            break L57;
                                                                                          } else {
                                                                                            var19 = 1 + var19 - -var2.f((byte) -34);
                                                                                            var28.field_l[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L58;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L59: {
                                                                                  var28 = var13[var27];
                                                                                  if (null == var28.field_g) {
                                                                                    break L59;
                                                                                  } else {
                                                                                    var19 = 0;
                                                                                    var29 = 2;
                                                                                    L60: while (true) {
                                                                                      if (var28.field_g.length <= var29) {
                                                                                        break L59;
                                                                                      } else {
                                                                                        var19 = 1 + (var19 + var2.f((byte) -36));
                                                                                        var28.field_g[var29] = (byte)var19;
                                                                                        var29 += 2;
                                                                                        continue L60;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L27;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L61: {
                                                                              var28 = var13[var27];
                                                                              if (null != var28.field_l) {
                                                                                var29 = 1;
                                                                                L62: while (true) {
                                                                                  if (var28.field_l.length <= var29) {
                                                                                    break L61;
                                                                                  } else {
                                                                                    var28.field_l[var29] = var2.f(0);
                                                                                    var29 += 2;
                                                                                    continue L62;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                break L61;
                                                                              }
                                                                            }
                                                                            L63: {
                                                                              if (null == var28.field_g) {
                                                                                break L63;
                                                                              } else {
                                                                                var29 = 3;
                                                                                L64: while (true) {
                                                                                  if (~(-2 + var28.field_g.length) >= ~var29) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var28.field_g[var29] = var2.f(0);
                                                                                    var29 += 2;
                                                                                    continue L64;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L65: {
                                                                          if (var20 != 0) {
                                                                            break L65;
                                                                          } else {
                                                                            L66: {
                                                                              if (var21 < var18.length) {
                                                                                int incrementValue$10 = var21;
                                                                                var21++;
                                                                                var20 = var18[incrementValue$10];
                                                                                break L66;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L66;
                                                                              }
                                                                            }
                                                                            if (((ch) this).field_p[var27] <= 0) {
                                                                              break L65;
                                                                            } else {
                                                                              var26 = 1 + var2.f((byte) -112);
                                                                              break L65;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((ch) this).field_k[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L67: {
                                                                      if (((ch) this).field_p[var26] == 0) {
                                                                        break L67;
                                                                      } else {
                                                                        L68: {
                                                                          if (var20 == 0) {
                                                                            var25 = (Object) (Object) var13[var11[var21]];
                                                                            if (var10.length <= var21) {
                                                                              var20 = -1;
                                                                              break L68;
                                                                            } else {
                                                                              int incrementValue$11 = var21;
                                                                              var21++;
                                                                              var20 = var10[incrementValue$11];
                                                                              break L68;
                                                                            }
                                                                          } else {
                                                                            break L68;
                                                                          }
                                                                        }
                                                                        ((ch) this).field_o[var26] = (ik) var25;
                                                                        var20--;
                                                                        break L67;
                                                                      }
                                                                    }
                                                                    var26++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L69: {
                                                                  if (((ch) this).field_p[var25_int] == 0) {
                                                                    break L69;
                                                                  } else {
                                                                    L70: {
                                                                      if (0 != var20) {
                                                                        break L70;
                                                                      } else {
                                                                        int incrementValue$12 = var8;
                                                                        var8++;
                                                                        var24 = var2.field_i[incrementValue$12] + 16 << 2;
                                                                        if (var21 < var7.length) {
                                                                          int incrementValue$13 = var21;
                                                                          var21++;
                                                                          var20 = var7[incrementValue$13];
                                                                          break L70;
                                                                        } else {
                                                                          var20 = -1;
                                                                          break L70;
                                                                        }
                                                                      }
                                                                    }
                                                                    var20--;
                                                                    ((ch) this).field_l[var25_int] = (byte)var24;
                                                                    break L69;
                                                                  }
                                                                }
                                                                var25_int++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L71: {
                                                              if (((ch) this).field_p[var24] != 0) {
                                                                L72: {
                                                                  if (var20 == 0) {
                                                                    int incrementValue$14 = var5;
                                                                    var5++;
                                                                    var23 = var2.field_i[incrementValue$14] - 1;
                                                                    if (~var4.length >= ~var21) {
                                                                      var20 = -1;
                                                                      break L72;
                                                                    } else {
                                                                      int incrementValue$15 = var21;
                                                                      var21++;
                                                                      var20 = var4[incrementValue$15];
                                                                      break L72;
                                                                    }
                                                                  } else {
                                                                    break L72;
                                                                  }
                                                                }
                                                                var20--;
                                                                ((ch) this).field_v[var24] = (byte)var23;
                                                                break L71;
                                                              } else {
                                                                break L71;
                                                              }
                                                            }
                                                            var24++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        L73: {
                                                          if (var20 == 0) {
                                                            L74: {
                                                              if (var21 < var18.length) {
                                                                int incrementValue$16 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$16];
                                                                break L74;
                                                              } else {
                                                                var20 = -1;
                                                                break L74;
                                                              }
                                                            }
                                                            var22 = var2.d((byte) -17);
                                                            break L73;
                                                          } else {
                                                            break L73;
                                                          }
                                                        }
                                                        ((ch) this).field_q[var23] = (short)(((ch) this).field_q[var23] + pk.a(-1 + var22 << 14, 32768));
                                                        var20--;
                                                        ((ch) this).field_p[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var2.f((byte) -86);
                                                    ((ch) this).field_q[var20] = (short)(((ch) this).field_q[var20] + (var19 << 8));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var2.f((byte) -93);
                                                ((ch) this).field_q[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var2.f(0);
                                            var19++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        var17++;
                                        continue L13;
                                      }
                                    }
                                  } else {
                                    L75: {
                                      ik dupTemp$17 = new ik();
                                      var13[var14] = dupTemp$17;
                                      var15 = dupTemp$17;
                                      var16_int = var2.f((byte) -60);
                                      if (0 < var16_int) {
                                        var15.field_l = new byte[2 * var16_int];
                                        break L75;
                                      } else {
                                        break L75;
                                      }
                                    }
                                    L76: {
                                      var16_int = var2.f((byte) -44);
                                      if (var16_int > 0) {
                                        var15.field_g = new byte[2 + 2 * var16_int];
                                        var15.field_g[1] = (byte) 64;
                                        break L76;
                                      } else {
                                        break L76;
                                      }
                                    }
                                    var14++;
                                    continue L10;
                                  }
                                }
                              } else {
                                var10[var11_int] = var2.f(0);
                                var11_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var9++;
                            continue L4;
                          }
                        }
                      } else {
                        var7[var8] = var2.f(0);
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var4[var5] = var2.f(0);
                var5++;
                continue L1;
              }
            }
          } else {
            var3++;
            continue L0;
          }
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
            ((ch) this).field_p = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "ch.H(" + param0 + 41);
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
                field_t = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ch.I(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 44 + param4 + 41);
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
            stackOut_11_0 = (String) var1;
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1_ref, "ch.C(" + param0 + 41);
        }
        return stackIn_12_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new float[]{3.0f, 2.75f, 2.5f, 2.25f, 2.0f};
        field_t = new String[]{"By rating", "By win percentage"};
    }
}
