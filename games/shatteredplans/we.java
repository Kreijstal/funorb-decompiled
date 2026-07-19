/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static String field_d;
    static String field_a;
    static int field_c;
    static int field_e;
    static String field_b;
    static bi field_f;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 >= -62) {
          field_d = (String) null;
          field_a = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var2 = param0.getParameter("username");
              if (param1 == 4289) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                var3 = (CharSequence) ((Object) var2);
                if ((oq.a(5722, var3) ^ -1L) != -1L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2_ref);
            stackOut_6_1 = new StringBuilder().append("we.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1 = im.field_c;
          synchronized (var1) {
            L0: {
              L1: {
                of.field_e = of.field_e + 1;
                tc.field_B = fe.field_J;
                if (param0 == -59) {
                  break L1;
                } else {
                  we.a(49, -95, -50, 61, 66, -88, -81, -110, -20);
                  break L1;
                }
              }
              L2: {
                if ((qn.field_c ^ -1) <= -1) {
                  L3: while (true) {
                    if (hb.field_e == qn.field_c) {
                      break L2;
                    } else {
                      var2 = m.field_x[hb.field_e];
                      hb.field_e = 127 & 1 + hb.field_e;
                      if (-1 < (var2 ^ -1)) {
                        di.field_p[var2 ^ -1] = false;
                        continue L3;
                      } else {
                        di.field_p[var2] = true;
                        continue L3;
                      }
                    }
                  }
                } else {
                  var2 = 0;
                  L4: while (true) {
                    if (-113 >= (var2 ^ -1)) {
                      qn.field_c = hb.field_e;
                      break L2;
                    } else {
                      di.field_p[var2] = false;
                      var2++;
                      continue L4;
                    }
                  }
                }
              }
              fe.field_J = cg.field_I;
              break L0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "we.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        long var14 = 0L;
        long var16 = 0L;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        int stackIn_33_5 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        int stackOut_32_5 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int stackOut_31_5 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int stackOut_28_5 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        var23 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var9_int = 0;
              if (param0 == 9) {
                break L1;
              } else {
                field_e = -59;
                break L1;
              }
            }
            L2: {
              var10 = 0;
              var11 = 0;
              var12 = gf.field_i << -1625449020;
              var13 = gf.field_l << -2008290620;
              if (param3 <= param1) {
                break L2;
              } else {
                var14_int = param3;
                param3 = param1;
                param1 = var14_int;
                var14_int = param2;
                param2 = param6;
                param6 = var14_int;
                param5 = -param5 + param8;
                break L2;
              }
            }
            L3: {
              if (param3 >= var13) {
                break L3;
              } else {
                if (var13 >= param1) {
                  break L3;
                } else {
                  var11 = (int)(65536L * (long)(param1 - var13) / (long)(-param3 + param1));
                  break L3;
                }
              }
            }
            L4: {
              if (var12 <= param3) {
                break L4;
              } else {
                if (param1 > var12) {
                  var10 = (int)(65536L * (long)(-param3 + var12) / (long)(-param3 + param1));
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              var14 = (long)(param1 - param3);
              var16 = (long)(param6 - param2);
              param3 = param3 + (int)((long)var10 * var14 >> -875109296);
              param2 = param2 + (int)((long)var10 * var16 >> 49590224);
              param1 = param1 - (int)((long)var11 * var14 >> -912742256);
              param6 = param6 - (int)((long)var11 * var16 >> -1092948656);
              var13 = gf.field_f << -1625444604;
              var12 = gf.field_a << -380459548;
              var11 = 0;
              var10 = 0;
              if (param2 <= param6) {
                break L5;
              } else {
                var18 = param3;
                param3 = param1;
                param1 = var18;
                var18 = param2;
                param2 = param6;
                param6 = var18;
                param5 = param8 - param5;
                break L5;
              }
            }
            L6: {
              var14 = (long)(-param3 + param1);
              var16 = (long)(param6 + -param2);
              if (param2 >= var12) {
                break L6;
              } else {
                if (param6 > var12) {
                  var10 = (int)((long)(var12 + -param2) * 65536L / (long)(param6 - param2));
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (param2 >= var13) {
                break L7;
              } else {
                if (var13 < param6) {
                  var11 = (int)((long)(param6 - var13) * 65536L / (long)(-param2 + param6));
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              param6 = param6 - (int)(var16 * (long)var11 >> -984726512);
              param2 = param2 + (int)((long)var10 * var16 >> -993540784);
              param3 = param3 + (int)(var14 * (long)var10 >> -909106928);
              var9_int = var9_int + param5 / param8;
              param1 = param1 - (int)(var14 * (long)var11 >> 2133495696);
              param5 = param5 % param8;
              if (0 <= param5) {
                break L8;
              } else {
                var9_int--;
                param5 = param5 + param8;
                break L8;
              }
            }
            var18 = 1 + (int)Math.sqrt((double)((param6 - param2) * (param6 + -param2) + (-param3 + param1) * (param1 + -param3)));
            var19 = param3;
            var20 = param2;
            L9: while (true) {
              if (param5 >= var18) {
                L10: {
                  stackOut_30_0 = param1;
                  stackOut_30_1 = var19;
                  stackOut_30_2 = param6;
                  stackOut_30_3 = -128;
                  stackOut_30_4 = var20;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_32_1 = stackOut_30_1;
                  stackIn_32_2 = stackOut_30_2;
                  stackIn_32_3 = stackOut_30_3;
                  stackIn_32_4 = stackOut_30_4;
                  stackIn_31_0 = stackOut_30_0;
                  stackIn_31_1 = stackOut_30_1;
                  stackIn_31_2 = stackOut_30_2;
                  stackIn_31_3 = stackOut_30_3;
                  stackIn_31_4 = stackOut_30_4;
                  if (0 == (1 & var9_int)) {
                    stackOut_32_0 = stackIn_32_0;
                    stackOut_32_1 = stackIn_32_1;
                    stackOut_32_2 = stackIn_32_2;
                    stackOut_32_3 = stackIn_32_3;
                    stackOut_32_4 = stackIn_32_4;
                    stackOut_32_5 = param4;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    stackIn_33_2 = stackOut_32_2;
                    stackIn_33_3 = stackOut_32_3;
                    stackIn_33_4 = stackOut_32_4;
                    stackIn_33_5 = stackOut_32_5;
                    break L10;
                  } else {
                    stackOut_31_0 = stackIn_31_0;
                    stackOut_31_1 = stackIn_31_1;
                    stackOut_31_2 = stackIn_31_2;
                    stackOut_31_3 = stackIn_31_3;
                    stackOut_31_4 = stackIn_31_4;
                    stackOut_31_5 = param7;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    stackIn_33_2 = stackOut_31_2;
                    stackIn_33_3 = stackOut_31_3;
                    stackIn_33_4 = stackOut_31_4;
                    stackIn_33_5 = stackOut_31_5;
                    break L10;
                  }
                }
                ar.a(stackIn_33_0, stackIn_33_1, stackIn_33_2, (byte) stackIn_33_3, stackIn_33_4, stackIn_33_5);
                break L0;
              } else {
                L11: {
                  var21 = param5 * (-param3 + param1) / var18 + param3;
                  var22 = param2 - -(param5 * (-param2 + param6) / var18);
                  stackOut_26_0 = var21;
                  stackOut_26_1 = var19;
                  stackOut_26_2 = var22;
                  stackOut_26_3 = -86;
                  stackOut_26_4 = var20;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_28_2 = stackOut_26_2;
                  stackIn_28_3 = stackOut_26_3;
                  stackIn_28_4 = stackOut_26_4;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  stackIn_27_3 = stackOut_26_3;
                  stackIn_27_4 = stackOut_26_4;
                  if ((1 & var9_int) != 0) {
                    stackOut_28_0 = stackIn_28_0;
                    stackOut_28_1 = stackIn_28_1;
                    stackOut_28_2 = stackIn_28_2;
                    stackOut_28_3 = stackIn_28_3;
                    stackOut_28_4 = stackIn_28_4;
                    stackOut_28_5 = param7;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    stackIn_29_2 = stackOut_28_2;
                    stackIn_29_3 = stackOut_28_3;
                    stackIn_29_4 = stackOut_28_4;
                    stackIn_29_5 = stackOut_28_5;
                    break L11;
                  } else {
                    stackOut_27_0 = stackIn_27_0;
                    stackOut_27_1 = stackIn_27_1;
                    stackOut_27_2 = stackIn_27_2;
                    stackOut_27_3 = stackIn_27_3;
                    stackOut_27_4 = stackIn_27_4;
                    stackOut_27_5 = param4;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    stackIn_29_2 = stackOut_27_2;
                    stackIn_29_3 = stackOut_27_3;
                    stackIn_29_4 = stackOut_27_4;
                    stackIn_29_5 = stackOut_27_5;
                    break L11;
                  }
                }
                ar.a(stackIn_29_0, stackIn_29_1, stackIn_29_2, (byte) stackIn_29_3, stackIn_29_4, stackIn_29_5);
                var19 = var21;
                var20 = var22;
                var9_int++;
                param5 = param5 + param8;
                continue L9;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var9), "we.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_a = "No options available";
        field_d = "You can spectate this game";
        field_b = "Connection lost - attempting to reconnect";
        field_e = 9;
    }
}
