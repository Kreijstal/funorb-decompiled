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
              throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
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
              L2: {
                if (var9 >= 128) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (null == param2) {
                        break L4;
                      } else {
                        if (param2[var9] != 0) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var10 = ((ch) this).field_p[var9];
                    if (var10 == 0) {
                      break L3;
                    } else {
                      L5: {
                        if (~var10 == ~var6) {
                          break L5;
                        } else {
                          L6: {
                            L7: {
                              var6 = var10;
                              var10--;
                              if (0 == (var10 & 1)) {
                                break L7;
                              } else {
                                var7 = (Object) (Object) param3.a(param1, var10 >> 2, (byte) 115);
                                if (var11 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var7 = (Object) (Object) param3.a(var10 >> 2, (byte) 127, param1);
                            break L6;
                          }
                          if (null != var7) {
                            break L5;
                          } else {
                            var5_int = 0;
                            break L5;
                          }
                        }
                      }
                      if (var7 == null) {
                        break L3;
                      } else {
                        ((ch) this).field_s[var9] = (el) var7;
                        ((ch) this).field_p[var9] = 0;
                        break L3;
                      }
                    }
                  }
                  var9++;
                  if (var11 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_22_0 = var5_int;
              stackIn_23_0 = stackOut_22_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("ch.B(").append(param0).append(',');
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
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
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
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L9;
            }
          }
          L10: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
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
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L10;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');
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
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
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
          throw kk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
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
            throw kk.a((Throwable) (Object) runtimeException, "ch.G(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        try {
            le.field_s = new float[8];
            if (param0 != 9) {
                field_t = null;
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ch.F(" + param0 + ')');
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
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_72_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_65_0 = 0;
        short stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_71_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
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
              L3: {
                L4: {
                  L5: {
                    L6: {
                      if (param4.field_u <= var23) {
                        break L6;
                      } else {
                        var24 = param4.field_m[var23];
                        var25 = param4.field_G[var23];
                        var26 = param4.field_k[var23];
                        var27 = (var18 * var26 + var12 * var24 - -(var15 * var25) >> -il.field_c + 16) + var9;
                        var28 = (var16 * var25 + var13 * var24 - -(var26 * var19) >> 16 + -il.field_c) + var10;
                        var29 = (var26 * var20 + var14 * var24 + var17 * var25 >> 16) + var11;
                        stackOut_6_0 = var29;
                        stackOut_6_1 = 50;
                        stackIn_63_0 = stackOut_6_0;
                        stackIn_63_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (var30 != 0) {
                          L7: while (true) {
                            if (stackIn_63_0 <= stackIn_63_1) {
                              break L5;
                            } else {
                              stackOut_64_0 = kf.field_T.length;
                              stackIn_72_0 = stackOut_64_0;
                              stackIn_65_0 = stackOut_64_0;
                              if (var30 != 0) {
                                break L4;
                              } else {
                                stackOut_65_0 = stackIn_65_0;
                                stackIn_67_0 = stackOut_65_0;
                                if (stackIn_67_0 <= var18) {
                                  break L5;
                                } else {
                                  var19 = param4.field_c[var18];
                                  var20 = param4.field_s[var18];
                                  var21 = param4.field_A[var18];
                                  kf.field_T[var18] = var12 * var20 + var9 * var19 + var15 * var21 >> 16;
                                  gb.field_q[var18] = var16 * var21 + (var13 * var20 + var19 * var10) >> 16;
                                  u.field_S[var18] = var21 * var17 + var11 * var19 - -(var14 * var20) >> 16;
                                  var18++;
                                  if (var30 == 0) {
                                    stackOut_62_0 = param4.field_o;
                                    stackOut_62_1 = var18;
                                    stackIn_63_0 = stackOut_62_0;
                                    stackIn_63_1 = stackOut_62_1;
                                    continue L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          L8: {
                            L9: {
                              if (stackIn_7_0 >= stackIn_7_1) {
                                break L9;
                              } else {
                                ff.field_c[var23] = -2147483648;
                                if (var30 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              gd.field_d[var23] = var21 - -(var27 / var29);
                              om.field_p[var23] = var22 - -(var28 / var29);
                              if (~var8 > ~var29) {
                                var8 = var29;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            L11: {
                              if (~var29 <= ~var7_int) {
                                break L11;
                              } else {
                                var7_int = var29;
                                break L11;
                              }
                            }
                            ff.field_c[var23] = var29;
                            break L8;
                          }
                          L12: {
                            if (param6) {
                              uf.field_c[var23] = var27 >> il.field_c;
                              tl.field_z[var23] = var28 >> il.field_c;
                              sd.field_b[var23] = var29;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          var23++;
                          if (var30 == 0) {
                            continue L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L13: {
                      if (null == param4.field_a) {
                        break L13;
                      } else {
                        if (param4.field_g == null) {
                          break L13;
                        } else {
                          if (null == param4.field_b) {
                            break L13;
                          } else {
                            if (null == param4.field_M) {
                              break L13;
                            } else {
                              if (null == param4.field_R) {
                                break L13;
                              } else {
                                if (param4.field_v == null) {
                                  break L13;
                                } else {
                                  if (param4.field_D == null) {
                                    break L13;
                                  } else {
                                    if (null == param4.field_C) {
                                      break L13;
                                    } else {
                                      if (param4.field_h != null) {
                                        var23 = 0;
                                        L14: while (true) {
                                          if (~param4.field_J >= ~var23) {
                                            break L13;
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
                                            if (var30 != 0) {
                                              break L3;
                                            } else {
                                              if (var30 == 0) {
                                                continue L14;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L13;
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
                      L15: while (true) {
                        stackOut_62_0 = param4.field_o;
                        stackOut_62_1 = var18;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        if (stackIn_63_0 <= stackIn_63_1) {
                          break L5;
                        } else {
                          stackOut_64_0 = kf.field_T.length;
                          stackIn_72_0 = stackOut_64_0;
                          stackIn_65_0 = stackOut_64_0;
                          if (var30 != 0) {
                            break L4;
                          } else {
                            stackOut_65_0 = stackIn_65_0;
                            stackIn_67_0 = stackOut_65_0;
                            if (stackIn_67_0 <= var18) {
                              break L5;
                            } else {
                              var19 = param4.field_c[var18];
                              var20 = param4.field_s[var18];
                              var21 = param4.field_A[var18];
                              kf.field_T[var18] = var12 * var20 + var9 * var19 + var15 * var21 >> 16;
                              gb.field_q[var18] = var16 * var21 + (var13 * var20 + var19 * var10) >> 16;
                              u.field_S[var18] = var21 * var17 + var11 * var19 - -(var14 * var20) >> 16;
                              var18++;
                              if (var30 == 0) {
                                continue L15;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_71_0 = var8;
                  stackIn_72_0 = stackOut_71_0;
                  break L4;
                }
                pg.a(stackIn_72_0, param4, param1, 3, var7_int);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var7;
            stackOut_74_1 = new StringBuilder().append("ch.A(");
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param0 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L16;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L16;
            }
          }
          L17: {
            stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param1).append(',');
            stackIn_81_0 = stackOut_78_0;
            stackIn_81_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L17;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_82_0 = stackOut_79_0;
              stackIn_82_1 = stackOut_79_1;
              stackIn_82_2 = stackOut_79_2;
              break L17;
            }
          }
          L18: {
            stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
            stackOut_82_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',').append(param3).append(',');
            stackIn_85_0 = stackOut_82_0;
            stackIn_85_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param4 == null) {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L18;
            } else {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "{...}";
              stackIn_86_0 = stackOut_83_0;
              stackIn_86_1 = stackOut_83_1;
              stackIn_86_2 = stackOut_83_2;
              break L18;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_86_0, stackIn_86_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    ch(byte[] param0) {
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
        int stackIn_35_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        byte[] stackIn_67_0 = null;
        byte[] stackIn_71_0 = null;
        int stackIn_98_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_176_0 = 0;
        Object stackIn_179_0 = null;
        byte[] stackIn_179_1 = null;
        Object stackIn_199_0 = null;
        byte[] stackIn_199_1 = null;
        Object stackIn_217_0 = null;
        byte[] stackIn_217_1 = null;
        Object stackIn_233_0 = null;
        byte[] stackIn_233_1 = null;
        int stackIn_259_0 = 0;
        int stackIn_268_0 = 0;
        int stackIn_288_0 = 0;
        int stackIn_288_1 = 0;
        int stackIn_299_0 = 0;
        int stackIn_299_1 = 0;
        int stackIn_301_0 = 0;
        int stackIn_304_0 = 0;
        int stackIn_304_1 = 0;
        int stackIn_323_0 = 0;
        ik stackIn_332_0 = null;
        int stackIn_354_0 = 0;
        int stackIn_354_1 = 0;
        int stackIn_362_0 = 0;
        int stackIn_362_1 = 0;
        ik stackIn_365_0 = null;
        RuntimeException stackIn_374_0 = null;
        StringBuilder stackIn_374_1 = null;
        RuntimeException stackIn_376_0 = null;
        StringBuilder stackIn_376_1 = null;
        RuntimeException stackIn_377_0 = null;
        StringBuilder stackIn_377_1 = null;
        String stackIn_377_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        Object stackOut_66_0 = null;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        byte[] stackOut_65_0 = null;
        Object stackOut_70_0 = null;
        byte[] stackOut_68_0 = null;
        int stackOut_97_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_175_0 = 0;
        Object stackOut_178_0 = null;
        byte[] stackOut_178_1 = null;
        Object stackOut_198_0 = null;
        byte[] stackOut_198_1 = null;
        Object stackOut_216_0 = null;
        byte[] stackOut_216_1 = null;
        Object stackOut_231_0 = null;
        byte[] stackOut_231_1 = null;
        int stackOut_258_0 = 0;
        int stackOut_267_0 = 0;
        int stackOut_287_0 = 0;
        int stackOut_287_1 = 0;
        int stackOut_300_0 = 0;
        int stackOut_303_0 = 0;
        int stackOut_303_1 = 0;
        int stackOut_298_0 = 0;
        int stackOut_298_1 = 0;
        int stackOut_322_0 = 0;
        ik stackOut_331_0 = null;
        int stackOut_361_0 = 0;
        int stackOut_361_1 = 0;
        ik stackOut_363_0 = null;
        int stackOut_353_0 = 0;
        int stackOut_353_1 = 0;
        RuntimeException stackOut_373_0 = null;
        StringBuilder stackOut_373_1 = null;
        RuntimeException stackOut_376_0 = null;
        StringBuilder stackOut_376_1 = null;
        String stackOut_376_2 = null;
        RuntimeException stackOut_374_0 = null;
        StringBuilder stackOut_374_1 = null;
        String stackOut_374_2 = null;
        var36 = HoldTheLine.field_D;
        try {
          L0: {
            ((ch) this).field_l = new byte[128];
            ((ch) this).field_p = new int[128];
            ((ch) this).field_q = new short[128];
            ((ch) this).field_v = new byte[128];
            ((ch) this).field_s = new el[128];
            ((ch) this).field_o = new ik[128];
            ((ch) this).field_k = new byte[128];
            var2_ref = new th(param0);
            var3 = 0;
            L1: while (true) {
              L2: {
                if (0 == var2_ref.field_i[var2_ref.field_l + var3]) {
                  break L2;
                } else {
                  var3++;
                  if (var36 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4 = new byte[var3];
              var5 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (~var3 >= ~var5) {
                      break L5;
                    } else {
                      var4[var5] = var2_ref.f(0);
                      var5++;
                      if (var36 != 0) {
                        break L4;
                      } else {
                        if (var36 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var3++;
                  var2_ref.field_l = var2_ref.field_l + 1;
                  var5 = var2_ref.field_l;
                  var2_ref.field_l = var2_ref.field_l + var3;
                  break L4;
                }
                var6 = 0;
                L6: while (true) {
                  L7: {
                    if (var2_ref.field_i[var6 + var2_ref.field_l] == 0) {
                      break L7;
                    } else {
                      var6++;
                      if (var36 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var7 = new byte[var6];
                  var8 = 0;
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (~var8 <= ~var6) {
                          break L10;
                        } else {
                          var7[var8] = var2_ref.f(0);
                          var8++;
                          if (var36 != 0) {
                            break L9;
                          } else {
                            if (var36 == 0) {
                              continue L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      var6++;
                      var2_ref.field_l = var2_ref.field_l + 1;
                      var8 = var2_ref.field_l;
                      var2_ref.field_l = var2_ref.field_l + var6;
                      break L9;
                    }
                    var9 = 0;
                    L11: while (true) {
                      L12: {
                        if (var2_ref.field_i[var9 + var2_ref.field_l] == 0) {
                          break L12;
                        } else {
                          var9++;
                          if (var36 == 0) {
                            continue L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var10 = new byte[var9];
                      var11_int = 0;
                      L13: while (true) {
                        L14: {
                          L15: {
                            if (~var9 >= ~var11_int) {
                              break L15;
                            } else {
                              var10[var11_int] = var2_ref.f(0);
                              var11_int++;
                              if (var36 != 0) {
                                break L14;
                              } else {
                                if (var36 == 0) {
                                  continue L13;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          var9++;
                          var2_ref.field_l = var2_ref.field_l + 1;
                          break L14;
                        }
                        L16: {
                          L17: {
                            L18: {
                              var11 = new byte[var9];
                              if (var9 <= 1) {
                                break L18;
                              } else {
                                var11[1] = (byte) 1;
                                var12 = 2;
                                var13_int = 1;
                                var14 = 2;
                                L19: while (true) {
                                  L20: {
                                    if (~var9 >= ~var14) {
                                      break L20;
                                    } else {
                                      var15_int = var2_ref.f((byte) -89);
                                      stackOut_34_0 = var15_int;
                                      stackIn_49_0 = stackOut_34_0;
                                      stackIn_35_0 = stackOut_34_0;
                                      if (var36 != 0) {
                                        break L16;
                                      } else {
                                        L21: {
                                          L22: {
                                            if (stackIn_35_0 != 0) {
                                              break L22;
                                            } else {
                                              int incrementValue$9 = var12;
                                              var12++;
                                              var13_int = incrementValue$9;
                                              if (var36 == 0) {
                                                break L21;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          L23: {
                                            if (var15_int > var13_int) {
                                              break L23;
                                            } else {
                                              var15_int--;
                                              break L23;
                                            }
                                          }
                                          var13_int = var15_int;
                                          break L21;
                                        }
                                        var11[var14] = (byte)var13_int;
                                        var14++;
                                        if (var36 == 0) {
                                          continue L19;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                  }
                                  if (var36 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            var12 = var9;
                            break L17;
                          }
                          stackOut_48_0 = var12;
                          stackIn_49_0 = stackOut_48_0;
                          break L16;
                        }
                        var13 = new ik[stackIn_49_0];
                        var14 = 0;
                        L24: while (true) {
                          L25: {
                            L26: {
                              L27: {
                                if (var14 >= var13.length) {
                                  break L27;
                                } else {
                                  ik dupTemp$10 = new ik();
                                  var13[var14] = dupTemp$10;
                                  var15 = dupTemp$10;
                                  var16_int = var2_ref.f((byte) -60);
                                  stackOut_51_0 = 0;
                                  stackOut_51_1 = var16_int;
                                  stackIn_65_0 = stackOut_51_0;
                                  stackIn_65_1 = stackOut_51_1;
                                  stackIn_52_0 = stackOut_51_0;
                                  stackIn_52_1 = stackOut_51_1;
                                  if (var36 != 0) {
                                    break L26;
                                  } else {
                                    L28: {
                                      if (stackIn_52_0 < stackIn_52_1) {
                                        var15.field_l = new byte[2 * var16_int];
                                        break L28;
                                      } else {
                                        break L28;
                                      }
                                    }
                                    L29: {
                                      var16_int = var2_ref.f((byte) -44);
                                      if (var16_int > 0) {
                                        var15.field_g = new byte[2 + 2 * var16_int];
                                        var15.field_g[1] = (byte) 64;
                                        break L29;
                                      } else {
                                        break L29;
                                      }
                                    }
                                    var14++;
                                    if (var36 == 0) {
                                      continue L24;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                              }
                              var14 = var2_ref.f((byte) -93);
                              if (var14 <= 0) {
                                stackOut_66_0 = null;
                                stackIn_67_0 = (byte[]) (Object) stackOut_66_0;
                                break L25;
                              } else {
                                stackOut_63_0 = var14;
                                stackOut_63_1 = 2;
                                stackIn_65_0 = stackOut_63_0;
                                stackIn_65_1 = stackOut_63_1;
                                break L26;
                              }
                            }
                            stackOut_65_0 = new byte[stackIn_65_0 * stackIn_65_1];
                            stackIn_67_0 = stackOut_65_0;
                            break L25;
                          }
                          L30: {
                            var15_array = stackIn_67_0;
                            var14 = var2_ref.f((byte) -29);
                            if (0 >= var14) {
                              stackOut_70_0 = null;
                              stackIn_71_0 = (byte[]) (Object) stackOut_70_0;
                              break L30;
                            } else {
                              stackOut_68_0 = new byte[var14 * 2];
                              stackIn_71_0 = stackOut_68_0;
                              break L30;
                            }
                          }
                          var16 = stackIn_71_0;
                          var17 = 0;
                          L31: while (true) {
                            L32: {
                              if (0 == var2_ref.field_i[var17 + var2_ref.field_l]) {
                                break L32;
                              } else {
                                var17++;
                                if (var36 == 0) {
                                  continue L31;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            var18 = new byte[var17];
                            var19 = 0;
                            L33: while (true) {
                              L34: {
                                L35: {
                                  if (~var17 >= ~var19) {
                                    break L35;
                                  } else {
                                    var18[var19] = var2_ref.f(0);
                                    var19++;
                                    if (var36 != 0) {
                                      break L34;
                                    } else {
                                      if (var36 == 0) {
                                        continue L33;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                                var17++;
                                var2_ref.field_l = var2_ref.field_l + 1;
                                var19 = 0;
                                break L34;
                              }
                              var20 = 0;
                              L36: while (true) {
                                L37: {
                                  L38: {
                                    if (var20 >= 128) {
                                      break L38;
                                    } else {
                                      var19 = var19 + var2_ref.f((byte) -93);
                                      ((ch) this).field_q[var20] = (short)var19;
                                      var20++;
                                      if (var36 != 0) {
                                        break L37;
                                      } else {
                                        if (var36 == 0) {
                                          continue L36;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                  }
                                  var19 = 0;
                                  break L37;
                                }
                                var20 = 0;
                                L39: while (true) {
                                  L40: {
                                    L41: {
                                      if (var20 >= 128) {
                                        break L41;
                                      } else {
                                        var19 = var19 + var2_ref.f((byte) -86);
                                        ((ch) this).field_q[var20] = (short)(((ch) this).field_q[var20] + (var19 << 8));
                                        var20++;
                                        if (var36 != 0) {
                                          break L40;
                                        } else {
                                          if (var36 == 0) {
                                            continue L39;
                                          } else {
                                            break L41;
                                          }
                                        }
                                      }
                                    }
                                    var20 = 0;
                                    break L40;
                                  }
                                  var21 = 0;
                                  var22 = 0;
                                  var23 = 0;
                                  L42: while (true) {
                                    L43: {
                                      L44: {
                                        if (128 <= var23) {
                                          break L44;
                                        } else {
                                          stackOut_97_0 = ~var20;
                                          stackIn_109_0 = stackOut_97_0;
                                          stackIn_98_0 = stackOut_97_0;
                                          if (var36 != 0) {
                                            break L43;
                                          } else {
                                            L45: {
                                              if (stackIn_98_0 == -1) {
                                                L46: {
                                                  L47: {
                                                    if (var21 < var18.length) {
                                                      break L47;
                                                    } else {
                                                      var20 = -1;
                                                      if (var36 == 0) {
                                                        break L46;
                                                      } else {
                                                        break L47;
                                                      }
                                                    }
                                                  }
                                                  int incrementValue$11 = var21;
                                                  var21++;
                                                  var20 = var18[incrementValue$11];
                                                  break L46;
                                                }
                                                var22 = var2_ref.d((byte) -17);
                                                break L45;
                                              } else {
                                                break L45;
                                              }
                                            }
                                            ((ch) this).field_q[var23] = (short)(((ch) this).field_q[var23] + pk.a(-1 + var22 << 14, 32768));
                                            var20--;
                                            ((ch) this).field_p[var23] = var22;
                                            var23++;
                                            if (var36 == 0) {
                                              continue L42;
                                            } else {
                                              break L44;
                                            }
                                          }
                                        }
                                      }
                                      var21 = 0;
                                      var20 = 0;
                                      var23 = 0;
                                      stackOut_108_0 = 0;
                                      stackIn_109_0 = stackOut_108_0;
                                      break L43;
                                    }
                                    var24 = stackIn_109_0;
                                    L48: while (true) {
                                      L49: {
                                        L50: {
                                          if (var24 >= 128) {
                                            break L50;
                                          } else {
                                            stackOut_111_0 = ~((ch) this).field_p[var24];
                                            stackIn_129_0 = stackOut_111_0;
                                            stackIn_112_0 = stackOut_111_0;
                                            if (var36 != 0) {
                                              break L49;
                                            } else {
                                              L51: {
                                                L52: {
                                                  if (stackIn_112_0 != -1) {
                                                    break L52;
                                                  } else {
                                                    if (var36 == 0) {
                                                      break L51;
                                                    } else {
                                                      break L52;
                                                    }
                                                  }
                                                }
                                                L53: {
                                                  if (var20 == 0) {
                                                    L54: {
                                                      int incrementValue$12 = var5;
                                                      var5++;
                                                      var23 = var2_ref.field_i[incrementValue$12] - 1;
                                                      if (~var4.length >= ~var21) {
                                                        break L54;
                                                      } else {
                                                        int incrementValue$13 = var21;
                                                        var21++;
                                                        var20 = var4[incrementValue$13];
                                                        if (var36 == 0) {
                                                          break L53;
                                                        } else {
                                                          break L54;
                                                        }
                                                      }
                                                    }
                                                    var20 = -1;
                                                    break L53;
                                                  } else {
                                                    break L53;
                                                  }
                                                }
                                                var20--;
                                                ((ch) this).field_v[var24] = (byte)var23;
                                                break L51;
                                              }
                                              var24++;
                                              if (var36 == 0) {
                                                continue L48;
                                              } else {
                                                break L50;
                                              }
                                            }
                                          }
                                        }
                                        var20 = 0;
                                        var21 = 0;
                                        var24 = 0;
                                        stackOut_128_0 = 0;
                                        stackIn_129_0 = stackOut_128_0;
                                        break L49;
                                      }
                                      var25_int = stackIn_129_0;
                                      L55: while (true) {
                                        L56: {
                                          L57: {
                                            if (var25_int >= 128) {
                                              break L57;
                                            } else {
                                              stackOut_131_0 = ~((ch) this).field_p[var25_int];
                                              stackIn_144_0 = stackOut_131_0;
                                              stackIn_132_0 = stackOut_131_0;
                                              if (var36 != 0) {
                                                break L56;
                                              } else {
                                                L58: {
                                                  if (stackIn_132_0 == -1) {
                                                    break L58;
                                                  } else {
                                                    L59: {
                                                      if (0 != var20) {
                                                        break L59;
                                                      } else {
                                                        L60: {
                                                          int incrementValue$14 = var8;
                                                          var8++;
                                                          var24 = var2_ref.field_i[incrementValue$14] + 16 << 2;
                                                          if (var21 < var7.length) {
                                                            break L60;
                                                          } else {
                                                            var20 = -1;
                                                            if (var36 == 0) {
                                                              break L59;
                                                            } else {
                                                              break L60;
                                                            }
                                                          }
                                                        }
                                                        int incrementValue$15 = var21;
                                                        var21++;
                                                        var20 = var7[incrementValue$15];
                                                        break L59;
                                                      }
                                                    }
                                                    var20--;
                                                    ((ch) this).field_l[var25_int] = (byte)var24;
                                                    break L58;
                                                  }
                                                }
                                                var25_int++;
                                                if (var36 == 0) {
                                                  continue L55;
                                                } else {
                                                  break L57;
                                                }
                                              }
                                            }
                                          }
                                          var20 = 0;
                                          stackOut_143_0 = 0;
                                          stackIn_144_0 = stackOut_143_0;
                                          break L56;
                                        }
                                        var21 = stackIn_144_0;
                                        var25 = null;
                                        var26 = 0;
                                        L61: while (true) {
                                          L62: {
                                            L63: {
                                              if (var26 >= 128) {
                                                break L63;
                                              } else {
                                                stackOut_146_0 = ((ch) this).field_p[var26];
                                                stackIn_161_0 = stackOut_146_0;
                                                stackIn_147_0 = stackOut_146_0;
                                                if (var36 != 0) {
                                                  break L62;
                                                } else {
                                                  L64: {
                                                    if (stackIn_147_0 == 0) {
                                                      break L64;
                                                    } else {
                                                      L65: {
                                                        if (var20 == 0) {
                                                          L66: {
                                                            var25 = (Object) (Object) var13[var11[var21]];
                                                            if (var10.length <= var21) {
                                                              break L66;
                                                            } else {
                                                              int incrementValue$16 = var21;
                                                              var21++;
                                                              var20 = var10[incrementValue$16];
                                                              if (var36 == 0) {
                                                                break L65;
                                                              } else {
                                                                break L66;
                                                              }
                                                            }
                                                          }
                                                          var20 = -1;
                                                          break L65;
                                                        } else {
                                                          break L65;
                                                        }
                                                      }
                                                      ((ch) this).field_o[var26] = (ik) var25;
                                                      var20--;
                                                      break L64;
                                                    }
                                                  }
                                                  var26++;
                                                  if (var36 == 0) {
                                                    continue L61;
                                                  } else {
                                                    break L63;
                                                  }
                                                }
                                              }
                                            }
                                            var21 = 0;
                                            var20 = 0;
                                            var26 = 0;
                                            stackOut_160_0 = 0;
                                            stackIn_161_0 = stackOut_160_0;
                                            break L62;
                                          }
                                          var27 = stackIn_161_0;
                                          L67: while (true) {
                                            L68: {
                                              L69: {
                                                if (128 <= var27) {
                                                  break L69;
                                                } else {
                                                  stackOut_163_0 = var20;
                                                  stackIn_176_0 = stackOut_163_0;
                                                  stackIn_164_0 = stackOut_163_0;
                                                  if (var36 != 0) {
                                                    break L68;
                                                  } else {
                                                    L70: {
                                                      if (stackIn_164_0 != 0) {
                                                        break L70;
                                                      } else {
                                                        L71: {
                                                          L72: {
                                                            if (var21 < var18.length) {
                                                              break L72;
                                                            } else {
                                                              var20 = -1;
                                                              if (var36 == 0) {
                                                                break L71;
                                                              } else {
                                                                break L72;
                                                              }
                                                            }
                                                          }
                                                          int incrementValue$17 = var21;
                                                          var21++;
                                                          var20 = var18[incrementValue$17];
                                                          break L71;
                                                        }
                                                        if (((ch) this).field_p[var27] <= 0) {
                                                          break L70;
                                                        } else {
                                                          var26 = 1 + var2_ref.f((byte) -112);
                                                          break L70;
                                                        }
                                                      }
                                                    }
                                                    ((ch) this).field_k[var27] = (byte)var26;
                                                    var20--;
                                                    var27++;
                                                    if (var36 == 0) {
                                                      continue L67;
                                                    } else {
                                                      break L69;
                                                    }
                                                  }
                                                }
                                              }
                                              ((ch) this).field_j = 1 + var2_ref.f((byte) -54);
                                              stackOut_175_0 = 0;
                                              stackIn_176_0 = stackOut_175_0;
                                              break L68;
                                            }
                                            var27 = stackIn_176_0;
                                            L73: while (true) {
                                              L74: {
                                                L75: {
                                                  if (var27 >= var12) {
                                                    break L75;
                                                  } else {
                                                    var28 = var13[var27];
                                                    stackOut_178_0 = null;
                                                    stackOut_178_1 = var28.field_l;
                                                    stackIn_199_0 = stackOut_178_0;
                                                    stackIn_199_1 = stackOut_178_1;
                                                    stackIn_179_0 = stackOut_178_0;
                                                    stackIn_179_1 = stackOut_178_1;
                                                    if (var36 != 0) {
                                                      break L74;
                                                    } else {
                                                      L76: {
                                                        L77: {
                                                          if (stackIn_179_0 != (Object) (Object) stackIn_179_1) {
                                                            var29 = 1;
                                                            L78: while (true) {
                                                              if (var28.field_l.length <= var29) {
                                                                break L77;
                                                              } else {
                                                                var28.field_l[var29] = var2_ref.f(0);
                                                                var29 += 2;
                                                                if (var36 != 0) {
                                                                  break L76;
                                                                } else {
                                                                  if (var36 == 0) {
                                                                    continue L78;
                                                                  } else {
                                                                    break L77;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            break L77;
                                                          }
                                                        }
                                                        L79: {
                                                          if (null == var28.field_g) {
                                                            break L79;
                                                          } else {
                                                            var29 = 3;
                                                            L80: while (true) {
                                                              if (~(-2 + var28.field_g.length) >= ~var29) {
                                                                break L79;
                                                              } else {
                                                                var28.field_g[var29] = var2_ref.f(0);
                                                                var29 += 2;
                                                                if (var36 != 0) {
                                                                  break L76;
                                                                } else {
                                                                  if (var36 == 0) {
                                                                    continue L80;
                                                                  } else {
                                                                    break L79;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var27++;
                                                        break L76;
                                                      }
                                                      if (var36 == 0) {
                                                        continue L73;
                                                      } else {
                                                        break L75;
                                                      }
                                                    }
                                                  }
                                                }
                                                stackOut_198_0 = null;
                                                stackOut_198_1 = (byte[]) var15_array;
                                                stackIn_199_0 = stackOut_198_0;
                                                stackIn_199_1 = stackOut_198_1;
                                                break L74;
                                              }
                                              L81: {
                                                L82: {
                                                  L83: {
                                                    if (stackIn_199_0 != (Object) (Object) stackIn_199_1) {
                                                      var27 = 1;
                                                      L84: while (true) {
                                                        if (~var27 <= ~var15_array.length) {
                                                          break L83;
                                                        } else {
                                                          var15_array[var27] = var2_ref.f(0);
                                                          var27 += 2;
                                                          if (var36 != 0) {
                                                            break L82;
                                                          } else {
                                                            if (var36 == 0) {
                                                              continue L84;
                                                            } else {
                                                              break L83;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L83;
                                                    }
                                                  }
                                                  if (var16 == null) {
                                                    break L82;
                                                  } else {
                                                    var27 = 1;
                                                    L85: while (true) {
                                                      if (~var16.length >= ~var27) {
                                                        break L82;
                                                      } else {
                                                        var16[var27] = var2_ref.f(0);
                                                        var27 += 2;
                                                        if (var36 != 0) {
                                                          break L81;
                                                        } else {
                                                          if (var36 == 0) {
                                                            continue L85;
                                                          } else {
                                                            break L82;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var27 = 0;
                                                break L81;
                                              }
                                              L86: while (true) {
                                                L87: {
                                                  L88: {
                                                    L89: {
                                                      if (~var12 >= ~var27) {
                                                        break L89;
                                                      } else {
                                                        var28 = var13[var27];
                                                        stackOut_216_0 = null;
                                                        stackOut_216_1 = var28.field_g;
                                                        stackIn_233_0 = stackOut_216_0;
                                                        stackIn_233_1 = stackOut_216_1;
                                                        stackIn_217_0 = stackOut_216_0;
                                                        stackIn_217_1 = stackOut_216_1;
                                                        if (var36 != 0) {
                                                          L90: while (true) {
                                                            L91: {
                                                              L92: {
                                                                if (stackIn_233_0 == (Object) (Object) stackIn_233_1) {
                                                                  break L92;
                                                                } else {
                                                                  var19 = 0;
                                                                  var29 = 2;
                                                                  L93: while (true) {
                                                                    if (var28.field_l.length <= var29) {
                                                                      break L92;
                                                                    } else {
                                                                      var19 = 1 + var19 - -var2_ref.f((byte) -34);
                                                                      var28.field_l[var29] = (byte)var19;
                                                                      var29 += 2;
                                                                      if (var36 != 0) {
                                                                        break L91;
                                                                      } else {
                                                                        if (var36 == 0) {
                                                                          continue L93;
                                                                        } else {
                                                                          break L92;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var27++;
                                                              break L91;
                                                            }
                                                            if (var36 == 0) {
                                                              if (~var27 <= ~var12) {
                                                                break L88;
                                                              } else {
                                                                var28 = var13[var27];
                                                                if (var36 != 0) {
                                                                  break L87;
                                                                } else {
                                                                  stackOut_231_0 = null;
                                                                  stackOut_231_1 = var28.field_l;
                                                                  stackIn_233_0 = stackOut_231_0;
                                                                  stackIn_233_1 = stackOut_231_1;
                                                                  continue L90;
                                                                }
                                                              }
                                                            } else {
                                                              break L88;
                                                            }
                                                          }
                                                        } else {
                                                          L94: {
                                                            L95: {
                                                              if (stackIn_217_0 == (Object) (Object) stackIn_217_1) {
                                                                break L95;
                                                              } else {
                                                                var19 = 0;
                                                                var29 = 2;
                                                                L96: while (true) {
                                                                  if (var28.field_g.length <= var29) {
                                                                    break L95;
                                                                  } else {
                                                                    var19 = 1 + (var19 + var2_ref.f((byte) -36));
                                                                    var28.field_g[var29] = (byte)var19;
                                                                    var29 += 2;
                                                                    if (var36 != 0) {
                                                                      break L94;
                                                                    } else {
                                                                      if (var36 == 0) {
                                                                        continue L96;
                                                                      } else {
                                                                        break L95;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var27++;
                                                            break L94;
                                                          }
                                                          if (var36 == 0) {
                                                            continue L86;
                                                          } else {
                                                            break L89;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var27 = 0;
                                                    L97: while (true) {
                                                      if (~var27 <= ~var12) {
                                                        break L88;
                                                      } else {
                                                        var28 = var13[var27];
                                                        if (var36 != 0) {
                                                          break L87;
                                                        } else {
                                                          stackOut_231_0 = null;
                                                          stackOut_231_1 = var28.field_l;
                                                          stackIn_233_0 = stackOut_231_0;
                                                          stackIn_233_1 = stackOut_231_1;
                                                          L98: {
                                                            L99: {
                                                              if (stackIn_233_0 == (Object) (Object) stackIn_233_1) {
                                                                break L99;
                                                              } else {
                                                                var19 = 0;
                                                                var29 = 2;
                                                                L100: while (true) {
                                                                  if (var28.field_l.length <= var29) {
                                                                    break L99;
                                                                  } else {
                                                                    var19 = 1 + var19 - -var2_ref.f((byte) -34);
                                                                    var28.field_l[var29] = (byte)var19;
                                                                    var29 += 2;
                                                                    if (var36 != 0) {
                                                                      break L98;
                                                                    } else {
                                                                      if (var36 == 0) {
                                                                        continue L100;
                                                                      } else {
                                                                        break L99;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var27++;
                                                            break L98;
                                                          }
                                                          if (var36 == 0) {
                                                            continue L97;
                                                          } else {
                                                            break L88;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (var15_array == null) {
                                                    break L87;
                                                  } else {
                                                    var19 = var2_ref.f((byte) -25);
                                                    var15_array[0] = (byte)var19;
                                                    var27 = 2;
                                                    L101: while (true) {
                                                      L102: {
                                                        L103: {
                                                          if (var27 >= var15_array.length) {
                                                            break L103;
                                                          } else {
                                                            var19 = var2_ref.f((byte) -30) + 1 + var19;
                                                            var15_array[var27] = (byte)var19;
                                                            var27 += 2;
                                                            if (var36 != 0) {
                                                              break L102;
                                                            } else {
                                                              if (var36 == 0) {
                                                                continue L101;
                                                              } else {
                                                                break L103;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var27 = var15_array[0];
                                                        break L102;
                                                      }
                                                      var28_int = var15_array[1];
                                                      var29 = 0;
                                                      L104: while (true) {
                                                        L105: {
                                                          L106: {
                                                            if (var29 >= var27) {
                                                              break L106;
                                                            } else {
                                                              ((ch) this).field_k[var29] = (byte)(32 + var28_int * ((ch) this).field_k[var29] >> 6);
                                                              var29++;
                                                              if (var36 != 0) {
                                                                break L105;
                                                              } else {
                                                                if (var36 == 0) {
                                                                  continue L104;
                                                                } else {
                                                                  break L106;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var29 = 2;
                                                          break L105;
                                                        }
                                                        L107: while (true) {
                                                          L108: {
                                                            L109: {
                                                              if (var15_array.length <= var29) {
                                                                break L109;
                                                              } else {
                                                                var30 = var15_array[var29];
                                                                var31 = var15_array[var29 - -1];
                                                                var32 = var28_int * (var30 - var27) - -((var30 + -var27) / 2);
                                                                stackOut_258_0 = var27;
                                                                stackIn_268_0 = stackOut_258_0;
                                                                stackIn_259_0 = stackOut_258_0;
                                                                if (var36 != 0) {
                                                                  break L108;
                                                                } else {
                                                                  var33 = stackIn_259_0;
                                                                  L110: while (true) {
                                                                    L111: {
                                                                      L112: {
                                                                        if (var33 >= var30) {
                                                                          break L112;
                                                                        } else {
                                                                          var34 = sf.a(var32, -var27 + var30, (byte) -76);
                                                                          var32 = var32 + (var31 + -var28_int);
                                                                          ((ch) this).field_k[var33] = (byte)(var34 * ((ch) this).field_k[var33] + 32 >> 6);
                                                                          var33++;
                                                                          if (var36 != 0) {
                                                                            break L111;
                                                                          } else {
                                                                            if (var36 == 0) {
                                                                              continue L110;
                                                                            } else {
                                                                              break L112;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      var27 = var30;
                                                                      var28_int = var31;
                                                                      var29 += 2;
                                                                      break L111;
                                                                    }
                                                                    if (var36 == 0) {
                                                                      continue L107;
                                                                    } else {
                                                                      break L109;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            stackOut_267_0 = var27;
                                                            stackIn_268_0 = stackOut_267_0;
                                                            break L108;
                                                          }
                                                          var30 = stackIn_268_0;
                                                          L113: while (true) {
                                                            L114: {
                                                              if (var30 >= 128) {
                                                                break L114;
                                                              } else {
                                                                ((ch) this).field_k[var30] = (byte)(var28_int * ((ch) this).field_k[var30] - -32 >> 6);
                                                                var30++;
                                                                if (var36 != 0) {
                                                                  break L87;
                                                                } else {
                                                                  if (var36 == 0) {
                                                                    continue L113;
                                                                  } else {
                                                                    break L114;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var15_array = null;
                                                            break L87;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                L115: {
                                                  L116: {
                                                    if (var16 != null) {
                                                      var19 = var2_ref.f((byte) -27);
                                                      var16[0] = (byte)var19;
                                                      var27 = 2;
                                                      L117: while (true) {
                                                        L118: {
                                                          L119: {
                                                            if (var27 >= var16.length) {
                                                              break L119;
                                                            } else {
                                                              var19 = var2_ref.f((byte) -110) + (1 + var19);
                                                              var16[var27] = (byte)var19;
                                                              var27 += 2;
                                                              if (var36 != 0) {
                                                                break L118;
                                                              } else {
                                                                if (var36 == 0) {
                                                                  continue L117;
                                                                } else {
                                                                  break L119;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var27 = var16[0];
                                                          break L118;
                                                        }
                                                        var28_int = var16[1] << 1;
                                                        var29 = 0;
                                                        L120: while (true) {
                                                          L121: {
                                                            L122: {
                                                              if (var29 >= var27) {
                                                                break L122;
                                                              } else {
                                                                var30 = var28_int + (((ch) this).field_l[var29] & 255);
                                                                stackOut_287_0 = ~var30;
                                                                stackOut_287_1 = -1;
                                                                stackIn_299_0 = stackOut_287_0;
                                                                stackIn_299_1 = stackOut_287_1;
                                                                stackIn_288_0 = stackOut_287_0;
                                                                stackIn_288_1 = stackOut_287_1;
                                                                if (var36 != 0) {
                                                                  L123: while (true) {
                                                                    if (stackIn_299_0 >= stackIn_299_1) {
                                                                      break L121;
                                                                    } else {
                                                                      var30 = var16[var29];
                                                                      var31 = var16[var29 + 1] << 1;
                                                                      var32 = (var30 + -var27) * var28_int - -((var30 + -var27) / 2);
                                                                      stackOut_300_0 = var27;
                                                                      stackIn_323_0 = stackOut_300_0;
                                                                      stackIn_301_0 = stackOut_300_0;
                                                                      if (var36 != 0) {
                                                                        break L115;
                                                                      } else {
                                                                        var33 = stackIn_301_0;
                                                                        L124: while (true) {
                                                                          L125: {
                                                                            if (~var33 <= ~var30) {
                                                                              break L125;
                                                                            } else {
                                                                              var34 = sf.a(var32, -var27 + var30, (byte) -86);
                                                                              var35 = var34 + (((ch) this).field_l[var33] & 255);
                                                                              stackOut_303_0 = 0;
                                                                              stackOut_303_1 = var35;
                                                                              stackIn_299_0 = stackOut_303_0;
                                                                              stackIn_299_1 = stackOut_303_1;
                                                                              stackIn_304_0 = stackOut_303_0;
                                                                              stackIn_304_1 = stackOut_303_1;
                                                                              if (var36 != 0) {
                                                                                continue L123;
                                                                              } else {
                                                                                L126: {
                                                                                  if (stackIn_304_0 > stackIn_304_1) {
                                                                                    var35 = 0;
                                                                                    break L126;
                                                                                  } else {
                                                                                    break L126;
                                                                                  }
                                                                                }
                                                                                L127: {
                                                                                  if (var35 > 128) {
                                                                                    var35 = 128;
                                                                                    break L127;
                                                                                  } else {
                                                                                    break L127;
                                                                                  }
                                                                                }
                                                                                var32 = var32 + (-var28_int + var31);
                                                                                ((ch) this).field_l[var33] = (byte)var35;
                                                                                var33++;
                                                                                if (var36 == 0) {
                                                                                  continue L124;
                                                                                } else {
                                                                                  break L125;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                          var29 += 2;
                                                                          var28_int = var31;
                                                                          var27 = var30;
                                                                          if (var36 == 0) {
                                                                            stackOut_298_0 = ~var16.length;
                                                                            stackOut_298_1 = ~var29;
                                                                            stackIn_299_0 = stackOut_298_0;
                                                                            stackIn_299_1 = stackOut_298_1;
                                                                            continue L123;
                                                                          } else {
                                                                            break L121;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  L128: {
                                                                    if (stackIn_288_0 <= stackIn_288_1) {
                                                                      break L128;
                                                                    } else {
                                                                      var30 = 0;
                                                                      break L128;
                                                                    }
                                                                  }
                                                                  L129: {
                                                                    if (128 < var30) {
                                                                      var30 = 128;
                                                                      break L129;
                                                                    } else {
                                                                      break L129;
                                                                    }
                                                                  }
                                                                  ((ch) this).field_l[var29] = (byte)var30;
                                                                  var29++;
                                                                  if (var36 == 0) {
                                                                    continue L120;
                                                                  } else {
                                                                    break L122;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var29 = 2;
                                                            L130: while (true) {
                                                              stackOut_298_0 = ~var16.length;
                                                              stackOut_298_1 = ~var29;
                                                              stackIn_299_0 = stackOut_298_0;
                                                              stackIn_299_1 = stackOut_298_1;
                                                              L131: while (true) {
                                                                if (stackIn_299_0 >= stackIn_299_1) {
                                                                  break L121;
                                                                } else {
                                                                  var30 = var16[var29];
                                                                  var31 = var16[var29 + 1] << 1;
                                                                  var32 = (var30 + -var27) * var28_int - -((var30 + -var27) / 2);
                                                                  stackOut_300_0 = var27;
                                                                  stackIn_323_0 = stackOut_300_0;
                                                                  stackIn_301_0 = stackOut_300_0;
                                                                  if (var36 != 0) {
                                                                    break L115;
                                                                  } else {
                                                                    var33 = stackIn_301_0;
                                                                    L132: while (true) {
                                                                      L133: {
                                                                        if (~var33 <= ~var30) {
                                                                          break L133;
                                                                        } else {
                                                                          var34 = sf.a(var32, -var27 + var30, (byte) -86);
                                                                          var35 = var34 + (((ch) this).field_l[var33] & 255);
                                                                          stackOut_303_0 = 0;
                                                                          stackOut_303_1 = var35;
                                                                          stackIn_299_0 = stackOut_303_0;
                                                                          stackIn_299_1 = stackOut_303_1;
                                                                          stackIn_304_0 = stackOut_303_0;
                                                                          stackIn_304_1 = stackOut_303_1;
                                                                          if (var36 != 0) {
                                                                            continue L131;
                                                                          } else {
                                                                            L134: {
                                                                              if (stackIn_304_0 > stackIn_304_1) {
                                                                                var35 = 0;
                                                                                break L134;
                                                                              } else {
                                                                                break L134;
                                                                              }
                                                                            }
                                                                            L135: {
                                                                              if (var35 > 128) {
                                                                                var35 = 128;
                                                                                break L135;
                                                                              } else {
                                                                                break L135;
                                                                              }
                                                                            }
                                                                            var32 = var32 + (-var28_int + var31);
                                                                            ((ch) this).field_l[var33] = (byte)var35;
                                                                            var33++;
                                                                            if (var36 == 0) {
                                                                              continue L132;
                                                                            } else {
                                                                              break L133;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      var29 += 2;
                                                                      var28_int = var31;
                                                                      var27 = var30;
                                                                      if (var36 == 0) {
                                                                        continue L130;
                                                                      } else {
                                                                        break L121;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var16 = null;
                                                          var30 = var27;
                                                          L136: while (true) {
                                                            if (var30 >= 128) {
                                                              break L116;
                                                            } else {
                                                              L137: {
                                                                var31 = var28_int + (((ch) this).field_l[var30] & 255);
                                                                if (var31 >= 0) {
                                                                  break L137;
                                                                } else {
                                                                  var31 = 0;
                                                                  break L137;
                                                                }
                                                              }
                                                              L138: {
                                                                if (var31 > 128) {
                                                                  var31 = 128;
                                                                  break L138;
                                                                } else {
                                                                  break L138;
                                                                }
                                                              }
                                                              ((ch) this).field_l[var30] = (byte)var31;
                                                              var30++;
                                                              continue L136;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L116;
                                                    }
                                                  }
                                                  stackOut_322_0 = 0;
                                                  stackIn_323_0 = stackOut_322_0;
                                                  break L115;
                                                }
                                                var27 = stackIn_323_0;
                                                L139: while (true) {
                                                  L140: {
                                                    L141: {
                                                      if (var12 <= var27) {
                                                        break L141;
                                                      } else {
                                                        var13[var27].field_b = var2_ref.f((byte) -28);
                                                        var27++;
                                                        if (var36 != 0) {
                                                          break L140;
                                                        } else {
                                                          if (var36 == 0) {
                                                            continue L139;
                                                          } else {
                                                            break L141;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var27 = 0;
                                                    break L140;
                                                  }
                                                  L142: while (true) {
                                                    L143: {
                                                      L144: {
                                                        L145: {
                                                          if (~var12 >= ~var27) {
                                                            break L145;
                                                          } else {
                                                            var28 = var13[var27];
                                                            stackOut_331_0 = (ik) var28;
                                                            stackIn_365_0 = stackOut_331_0;
                                                            stackIn_332_0 = stackOut_331_0;
                                                            if (var36 != 0) {
                                                              L146: while (true) {
                                                                var28 = stackIn_365_0;
                                                                if (var36 != 0) {
                                                                  break L143;
                                                                } else {
                                                                  L147: {
                                                                    if (var28.field_h <= 0) {
                                                                      break L147;
                                                                    } else {
                                                                      var28.field_j = var2_ref.f((byte) -81);
                                                                      break L147;
                                                                    }
                                                                  }
                                                                  var27++;
                                                                  if (var36 == 0) {
                                                                    stackOut_361_0 = ~var12;
                                                                    stackOut_361_1 = ~var27;
                                                                    stackIn_362_0 = stackOut_361_0;
                                                                    stackIn_362_1 = stackOut_361_1;
                                                                    if (stackIn_362_0 >= stackIn_362_1) {
                                                                      break L144;
                                                                    } else {
                                                                      stackOut_363_0 = var13[var27];
                                                                      stackIn_365_0 = stackOut_363_0;
                                                                      continue L146;
                                                                    }
                                                                  } else {
                                                                    break L144;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              L148: {
                                                                if (stackIn_332_0.field_l == null) {
                                                                  break L148;
                                                                } else {
                                                                  var28.field_d = var2_ref.f((byte) -16);
                                                                  break L148;
                                                                }
                                                              }
                                                              L149: {
                                                                if (var28.field_g == null) {
                                                                  break L149;
                                                                } else {
                                                                  var28.field_n = var2_ref.f((byte) -120);
                                                                  break L149;
                                                                }
                                                              }
                                                              L150: {
                                                                if (var28.field_b > 0) {
                                                                  var28.field_c = var2_ref.f((byte) -81);
                                                                  break L150;
                                                                } else {
                                                                  break L150;
                                                                }
                                                              }
                                                              var27++;
                                                              if (var36 == 0) {
                                                                continue L142;
                                                              } else {
                                                                break L145;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var27 = 0;
                                                        L151: while (true) {
                                                          L152: {
                                                            L153: {
                                                              if (~var12 >= ~var27) {
                                                                break L153;
                                                              } else {
                                                                var13[var27].field_m = var2_ref.f((byte) -50);
                                                                var27++;
                                                                if (var36 != 0) {
                                                                  break L152;
                                                                } else {
                                                                  if (var36 == 0) {
                                                                    continue L151;
                                                                  } else {
                                                                    break L153;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var27 = 0;
                                                            break L152;
                                                          }
                                                          L154: while (true) {
                                                            L155: {
                                                              if (~var27 <= ~var12) {
                                                                break L155;
                                                              } else {
                                                                var28 = var13[var27];
                                                                stackOut_353_0 = 0;
                                                                stackOut_353_1 = var28.field_m;
                                                                stackIn_362_0 = stackOut_353_0;
                                                                stackIn_362_1 = stackOut_353_1;
                                                                stackIn_354_0 = stackOut_353_0;
                                                                stackIn_354_1 = stackOut_353_1;
                                                                if (var36 != 0) {
                                                                  L156: while (true) {
                                                                    if (stackIn_362_0 >= stackIn_362_1) {
                                                                      break L144;
                                                                    } else {
                                                                      stackOut_363_0 = var13[var27];
                                                                      stackIn_365_0 = stackOut_363_0;
                                                                      var28 = stackIn_365_0;
                                                                      if (var36 != 0) {
                                                                        break L143;
                                                                      } else {
                                                                        L157: {
                                                                          if (var28.field_h <= 0) {
                                                                            break L157;
                                                                          } else {
                                                                            var28.field_j = var2_ref.f((byte) -81);
                                                                            break L157;
                                                                          }
                                                                        }
                                                                        var27++;
                                                                        if (var36 == 0) {
                                                                          stackOut_361_0 = ~var12;
                                                                          stackOut_361_1 = ~var27;
                                                                          stackIn_362_0 = stackOut_361_0;
                                                                          stackIn_362_1 = stackOut_361_1;
                                                                          continue L156;
                                                                        } else {
                                                                          break L144;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  L158: {
                                                                    if (stackIn_354_0 >= stackIn_354_1) {
                                                                      break L158;
                                                                    } else {
                                                                      var28.field_h = var2_ref.f((byte) -50);
                                                                      break L158;
                                                                    }
                                                                  }
                                                                  var27++;
                                                                  if (var36 == 0) {
                                                                    continue L154;
                                                                  } else {
                                                                    break L155;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var27 = 0;
                                                            L159: while (true) {
                                                              stackOut_361_0 = ~var12;
                                                              stackOut_361_1 = ~var27;
                                                              stackIn_362_0 = stackOut_361_0;
                                                              stackIn_362_1 = stackOut_361_1;
                                                              if (stackIn_362_0 >= stackIn_362_1) {
                                                                break L144;
                                                              } else {
                                                                stackOut_363_0 = var13[var27];
                                                                stackIn_365_0 = stackOut_363_0;
                                                                var28 = stackIn_365_0;
                                                                if (var36 != 0) {
                                                                  break L143;
                                                                } else {
                                                                  L160: {
                                                                    if (var28.field_h <= 0) {
                                                                      break L160;
                                                                    } else {
                                                                      var28.field_j = var2_ref.f((byte) -81);
                                                                      break L160;
                                                                    }
                                                                  }
                                                                  var27++;
                                                                  if (var36 == 0) {
                                                                    continue L159;
                                                                  } else {
                                                                    break L144;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      break L143;
                                                    }
                                                    break L0;
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L161: {
            var2 = decompiledCaughtException;
            stackOut_373_0 = (RuntimeException) var2;
            stackOut_373_1 = new StringBuilder().append("ch.<init>(");
            stackIn_376_0 = stackOut_373_0;
            stackIn_376_1 = stackOut_373_1;
            stackIn_374_0 = stackOut_373_0;
            stackIn_374_1 = stackOut_373_1;
            if (param0 == null) {
              stackOut_376_0 = (RuntimeException) (Object) stackIn_376_0;
              stackOut_376_1 = (StringBuilder) (Object) stackIn_376_1;
              stackOut_376_2 = "null";
              stackIn_377_0 = stackOut_376_0;
              stackIn_377_1 = stackOut_376_1;
              stackIn_377_2 = stackOut_376_2;
              break L161;
            } else {
              stackOut_374_0 = (RuntimeException) (Object) stackIn_374_0;
              stackOut_374_1 = (StringBuilder) (Object) stackIn_374_1;
              stackOut_374_2 = "{...}";
              stackIn_377_0 = stackOut_374_0;
              stackIn_377_1 = stackOut_374_1;
              stackIn_377_2 = stackOut_374_2;
              break L161;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_377_0, stackIn_377_2 + ')');
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
          throw kk.a((Throwable) (Object) var2, "ch.H(" + param0 + ')');
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
            stackOut_3_1 = new StringBuilder().append("ch.I(").append(param0).append(',').append(param1).append(',');
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
          throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param3 + ',' + param4 + ')');
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
          throw kk.a((Throwable) (Object) var1_ref, "ch.C(" + param0 + ')');
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
