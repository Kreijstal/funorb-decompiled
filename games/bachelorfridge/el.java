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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
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
                          incrementValue$0 = param1;
                          param1++;
                          if ((-16777216 & param7[incrementValue$0]) != -16777216) {
                            param3++;
                            break L4;
                          } else {
                            incrementValue$1 = param3;
                            param3++;
                            param6[incrementValue$1] = param5;
                            break L4;
                          }
                        }
                        var13++;
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      incrementValue$2 = param1;
                      param1++;
                      if ((-16777216 & param7[incrementValue$2] ^ -1) == 16777215) {
                        incrementValue$3 = param3;
                        param3++;
                        param6[incrementValue$3] = param5;
                        break L5;
                      } else {
                        param3++;
                        break L5;
                      }
                    }
                    L6: {
                      incrementValue$4 = param1;
                      param1++;
                      if ((-16777216 & param7[incrementValue$4]) != -16777216) {
                        param3++;
                        break L6;
                      } else {
                        incrementValue$5 = param3;
                        param3++;
                        param6[incrementValue$5] = param5;
                        break L6;
                      }
                    }
                    L7: {
                      incrementValue$6 = param1;
                      param1++;
                      if ((-16777216 & param7[incrementValue$6] ^ -1) == 16777215) {
                        incrementValue$7 = param3;
                        param3++;
                        param6[incrementValue$7] = param5;
                        break L7;
                      } else {
                        param3++;
                        break L7;
                      }
                    }
                    L8: {
                      incrementValue$8 = param1;
                      param1++;
                      if ((param7[incrementValue$8] & -16777216) != -16777216) {
                        param3++;
                        break L8;
                      } else {
                        incrementValue$9 = param3;
                        param3++;
                        param6[incrementValue$9] = param5;
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
            stackIn_30_0 = (RuntimeException) (var10);

            stackIn_30_1 = new StringBuilder().append("el.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param7 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L10;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param1, false) != jt.field_f) {
              var3_int = 87 % ((param0 - -8) / 45);
              stackIn_4_0 = bv.field_j;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = bu.field_g;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("el.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        int var9;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != qq.a(107, param0)) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            var3_int = stackIn_3_0;
            if (!param1) {
              if (var3_int != 0) {
                stackIn_10_0 = cm.field_u;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = jt.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_5_0 = (jg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("el.C(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
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
