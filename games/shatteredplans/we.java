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
        field_a = null;
        field_f = null;
        field_b = null;
    }

    final static void a(java.applet.Applet param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (oq.a(5722, var3) != 0L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("we.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 4289 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a() {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1 = (Object) (Object) im.field_c;
          synchronized (var1) {
            L0: {
              L1: {
                of.field_e = of.field_e + 1;
                tc.field_B = fe.field_J;
                if (qn.field_c >= 0) {
                  L2: while (true) {
                    if (hb.field_e == qn.field_c) {
                      break L1;
                    } else {
                      var2 = m.field_x[hb.field_e];
                      hb.field_e = 127 & 1 + hb.field_e;
                      if (var2 < 0) {
                        di.field_p[~var2] = false;
                        continue L2;
                      } else {
                        di.field_p[var2] = true;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var2 = 0;
                  L3: while (true) {
                    if (var2 >= 112) {
                      qn.field_c = hb.field_e;
                      break L1;
                    } else {
                      di.field_p[var2] = false;
                      var2++;
                      continue L3;
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
          throw r.a((Throwable) (Object) var1_ref, "we.A(" + -59 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
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
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_29_4 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        int stackIn_31_5 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        int stackOut_30_5 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        int stackOut_29_5 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        var23 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var9_int = 0;
              var10 = 0;
              var11 = 0;
              var12 = gf.field_i << 4;
              var13 = gf.field_l << 4;
              if (param3 <= param1) {
                break L1;
              } else {
                var14_int = param3;
                param3 = param1;
                param1 = var14_int;
                var14_int = param2;
                param2 = param6;
                param6 = var14_int;
                param5 = -param5 + 80;
                break L1;
              }
            }
            L2: {
              if (param3 >= var13) {
                break L2;
              } else {
                if (var13 >= param1) {
                  break L2;
                } else {
                  var11 = (int)(65536L * (long)(param1 - var13) / (long)(-param3 + param1));
                  break L2;
                }
              }
            }
            L3: {
              if (var12 <= param3) {
                break L3;
              } else {
                if (param1 > var12) {
                  var10 = (int)(65536L * (long)(-param3 + var12) / (long)(-param3 + param1));
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              var14 = (long)(param1 - param3);
              var16 = (long)(param6 - param2);
              param3 = param3 + (int)((long)var10 * var14 >> 16);
              param2 = param2 + (int)((long)var10 * var16 >> 16);
              param1 = param1 - (int)((long)var11 * var14 >> 16);
              param6 = param6 - (int)((long)var11 * var16 >> 16);
              var13 = gf.field_f << 4;
              var12 = gf.field_a << 4;
              var11 = 0;
              var10 = 0;
              if (param2 <= param6) {
                break L4;
              } else {
                var18 = param3;
                param3 = param1;
                param1 = var18;
                var18 = param2;
                param2 = param6;
                param6 = var18;
                param5 = 80 - param5;
                break L4;
              }
            }
            L5: {
              var14 = (long)(-param3 + param1);
              var16 = (long)(param6 + -param2);
              if (param2 >= var12) {
                break L5;
              } else {
                if (param6 > var12) {
                  var10 = (int)((long)(var12 + -param2) * 65536L / (long)(param6 - param2));
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (param2 >= var13) {
                break L6;
              } else {
                if (var13 < param6) {
                  var11 = (int)((long)(param6 - var13) * 65536L / (long)(-param2 + param6));
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              param6 = param6 - (int)(var16 * (long)var11 >> 16);
              param2 = param2 + (int)((long)var10 * var16 >> 16);
              param3 = param3 + (int)(var14 * (long)var10 >> 16);
              var9_int = var9_int + param5 / 80;
              param1 = param1 - (int)(var14 * (long)var11 >> 16);
              param5 = param5 % 80;
              if (0 <= param5) {
                break L7;
              } else {
                var9_int--;
                param5 = param5 + 80;
                break L7;
              }
            }
            var18 = 1 + (int)Math.sqrt((double)((param6 - param2) * (param6 + -param2) + (-param3 + param1) * (param1 + -param3)));
            var19 = param3;
            var20 = param2;
            L8: while (true) {
              if (param5 >= var18) {
                L9: {
                  stackOut_28_0 = param1;
                  stackOut_28_1 = var19;
                  stackOut_28_2 = param6;
                  stackOut_28_3 = -128;
                  stackOut_28_4 = var20;
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  stackIn_30_3 = stackOut_28_3;
                  stackIn_30_4 = stackOut_28_4;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  stackIn_29_2 = stackOut_28_2;
                  stackIn_29_3 = stackOut_28_3;
                  stackIn_29_4 = stackOut_28_4;
                  if (0 == (1 & var9_int)) {
                    stackOut_30_0 = stackIn_30_0;
                    stackOut_30_1 = stackIn_30_1;
                    stackOut_30_2 = stackIn_30_2;
                    stackOut_30_3 = stackIn_30_3;
                    stackOut_30_4 = stackIn_30_4;
                    stackOut_30_5 = param4;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    stackIn_31_2 = stackOut_30_2;
                    stackIn_31_3 = stackOut_30_3;
                    stackIn_31_4 = stackOut_30_4;
                    stackIn_31_5 = stackOut_30_5;
                    break L9;
                  } else {
                    stackOut_29_0 = stackIn_29_0;
                    stackOut_29_1 = stackIn_29_1;
                    stackOut_29_2 = stackIn_29_2;
                    stackOut_29_3 = stackIn_29_3;
                    stackOut_29_4 = stackIn_29_4;
                    stackOut_29_5 = param7;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_31_1 = stackOut_29_1;
                    stackIn_31_2 = stackOut_29_2;
                    stackIn_31_3 = stackOut_29_3;
                    stackIn_31_4 = stackOut_29_4;
                    stackIn_31_5 = stackOut_29_5;
                    break L9;
                  }
                }
                ar.a(stackIn_31_0, stackIn_31_1, stackIn_31_2, (byte) stackIn_31_3, stackIn_31_4, stackIn_31_5);
                break L0;
              } else {
                L10: {
                  var21 = param5 * (-param3 + param1) / var18 + param3;
                  var22 = param2 - -(param5 * (-param2 + param6) / var18);
                  stackOut_24_0 = var21;
                  stackOut_24_1 = var19;
                  stackOut_24_2 = var22;
                  stackOut_24_3 = -86;
                  stackOut_24_4 = var20;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  stackIn_26_3 = stackOut_24_3;
                  stackIn_26_4 = stackOut_24_4;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  stackIn_25_3 = stackOut_24_3;
                  stackIn_25_4 = stackOut_24_4;
                  if ((1 & var9_int) != 0) {
                    stackOut_26_0 = stackIn_26_0;
                    stackOut_26_1 = stackIn_26_1;
                    stackOut_26_2 = stackIn_26_2;
                    stackOut_26_3 = stackIn_26_3;
                    stackOut_26_4 = stackIn_26_4;
                    stackOut_26_5 = param7;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    stackIn_27_3 = stackOut_26_3;
                    stackIn_27_4 = stackOut_26_4;
                    stackIn_27_5 = stackOut_26_5;
                    break L10;
                  } else {
                    stackOut_25_0 = stackIn_25_0;
                    stackOut_25_1 = stackIn_25_1;
                    stackOut_25_2 = stackIn_25_2;
                    stackOut_25_3 = stackIn_25_3;
                    stackOut_25_4 = stackIn_25_4;
                    stackOut_25_5 = param4;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackIn_27_2 = stackOut_25_2;
                    stackIn_27_3 = stackOut_25_3;
                    stackIn_27_4 = stackOut_25_4;
                    stackIn_27_5 = stackOut_25_5;
                    break L10;
                  }
                }
                ar.a(stackIn_27_0, stackIn_27_1, stackIn_27_2, (byte) stackIn_27_3, stackIn_27_4, stackIn_27_5);
                var19 = var21;
                var20 = var22;
                var9_int++;
                param5 = param5 + 80;
                continue L8;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var9, "we.C(" + 9 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + 80 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "No options available";
        field_d = "You can spectate this game";
        field_b = "Connection lost - attempting to reconnect";
        field_e = 9;
    }
}
