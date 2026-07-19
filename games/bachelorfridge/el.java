/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends aba {
    static int field_h;
    static String field_g;

    el(lka param0) {
        super(param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int[] param7, int param8, int param9) {
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var14 = BachelorFridge.field_y;
        try {
          L0: {
            var10_int = -(param0 >> 975867714);
            param0 = -(3 & param0);
            var11 = 90 % ((37 - param4) / 50);
            var12 = -param9;
            L1: while (true) {
              if ((var12 ^ -1) <= -1) {
                break L0;
              } else {
                var13 = var10_int;
                L2: while (true) {
                  if (0 <= var13) {
                    var13 = param0;
                    L3: while (true) {
                      if (-1 >= (var13 ^ -1)) {
                        param1 = param1 + param8;
                        param3 = param3 + param2;
                        var12++;
                        continue L1;
                      } else {
                        L4: {
                          incrementValue$10 = param1;
                          param1++;
                          if ((-16777216 & param7[incrementValue$10]) != -16777216) {
                            param3++;
                            break L4;
                          } else {
                            incrementValue$11 = param3;
                            param3++;
                            param6[incrementValue$11] = param5;
                            break L4;
                          }
                        }
                        var13++;
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      incrementValue$12 = param1;
                      param1++;
                      if ((-16777216 & param7[incrementValue$12] ^ -1) == 16777215) {
                        incrementValue$13 = param3;
                        param3++;
                        param6[incrementValue$13] = param5;
                        break L5;
                      } else {
                        param3++;
                        break L5;
                      }
                    }
                    L6: {
                      incrementValue$14 = param1;
                      param1++;
                      if ((-16777216 & param7[incrementValue$14]) != -16777216) {
                        param3++;
                        break L6;
                      } else {
                        incrementValue$15 = param3;
                        param3++;
                        param6[incrementValue$15] = param5;
                        break L6;
                      }
                    }
                    L7: {
                      incrementValue$16 = param1;
                      param1++;
                      if ((-16777216 & param7[incrementValue$16] ^ -1) == 16777215) {
                        incrementValue$17 = param3;
                        param3++;
                        param6[incrementValue$17] = param5;
                        break L7;
                      } else {
                        param3++;
                        break L7;
                      }
                    }
                    L8: {
                      incrementValue$18 = param1;
                      param1++;
                      if ((param7[incrementValue$18] & -16777216) != -16777216) {
                        param3++;
                        break L8;
                      } else {
                        incrementValue$19 = param3;
                        param3++;
                        param6[incrementValue$19] = param5;
                        break L8;
                      }
                    }
                    var13++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var10 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var10);
            stackOut_26_1 = new StringBuilder().append("el.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param6 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param7 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
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
            if (this.a(param1, false) != jt.field_f) {
              var3_int = 87 % ((param0 - -8) / 45);
              stackOut_3_0 = bv.field_j;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = bu.field_g;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("el.D(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          if (param2 > param4) {
            if (param7 <= param2) {
              if (param7 <= param4) {
                lca.a(param2, param6, (byte) -79, dg.field_e, param7, param4, param3, param5, param1);
                break L0;
              } else {
                lca.a(param2, param5, (byte) -99, dg.field_e, param4, param7, param3, param6, param1);
                break L0;
              }
            } else {
              lca.a(param7, param5, (byte) -73, dg.field_e, param4, param2, param3, param1, param6);
              break L0;
            }
          } else {
            if (param7 > param4) {
              lca.a(param7, param1, (byte) -115, dg.field_e, param2, param4, param3, param5, param6);
              break L0;
            } else {
              if (param7 > param2) {
                lca.a(param4, param1, (byte) -93, dg.field_e, param2, param7, param3, param6, param5);
                break L0;
              } else {
                lca.a(param4, param6, (byte) -105, dg.field_e, param7, param2, param3, param1, param5);
                break L0;
              }
            }
          }
        }
        L1: {
          if (param0 == 29322) {
            break L1;
          } else {
            field_h = -114;
            break L1;
          }
        }
    }

    public static void f(byte param0) {
        field_g = null;
        if (param0 != -24) {
            el.e((byte) -102);
        }
    }

    final static void e(byte param0) {
        if (param0 < 20) {
            field_g = (String) null;
        }
        int var1 = te.d((byte) 89);
        int var2 = nka.a((byte) -74);
        raa.field_I.a((ge.field_I << -9956095) + var2, 9, -wo.field_j + rs.field_a, vka.field_q - ge.field_I, (wo.field_j << -990382015) + var1);
        w.a(true);
    }

    final jg a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        jg stackIn_5_0 = null;
        jg stackIn_8_0 = null;
        jg stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        jg stackOut_9_0 = null;
        jg stackOut_7_0 = null;
        jg stackOut_4_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (null != qq.a(107, param0)) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var3_int = stackIn_3_0;
            if (!param1) {
              if (var3_int != 0) {
                stackOut_9_0 = cm.field_u;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_7_0 = jt.field_f;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_4_0 = (jg) null;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("el.C(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    static {
        field_g = "Select your team by clicking on the creatures, note the team limit at the bottom left. For this match, you are allowed two creatures. Examine creatures with right click. Click START when you are ready.";
    }
}
