/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ne {
    static String field_b;
    static String field_g;
    static String field_f;
    static int[] field_e;
    static char field_a;
    static um field_c;
    static String field_d;

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_g = null;
              if (!param0) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            field_c = null;
            field_e = null;
            field_f = null;
            field_d = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "ne.D(" + param0 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        Object var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2 = (Object) (Object) (fa) (Object) oi.field_a.a((byte) -115);
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    bf.a((fa) var2, 4, param1);
                    var2 = (Object) (Object) (fa) (Object) oi.field_a.a(16213);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2 = (Object) (Object) di.field_v.a((byte) -67);
                break L2;
              }
              L4: {
                if (param0 == 19) {
                  break L4;
                } else {
                  field_f = null;
                  break L4;
                }
              }
              L5: while (true) {
                L6: {
                  L7: {
                    if (null == var2) {
                      break L7;
                    } else {
                      wb.a(param1, param0 + -19);
                      var2 = (Object) (Object) di.field_v.a(16213);
                      if (var3 != 0) {
                        break L6;
                      } else {
                        if (var3 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  break L6;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw kg.a((Throwable) var2, "ne.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          try {
            if (pd.field_x.startsWith("win")) {
              L0: {
                if (param1.startsWith("http://")) {
                  break L0;
                } else {
                  if (param1.startsWith("https://")) {
                    break L0;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  }
                }
              }
              L1: {
                var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                var3 = 0;
                if (param0 == 10448) {
                  break L1;
                } else {
                  ne.a(true);
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  L4: {
                    if (~var3 <= ~param1.length()) {
                      break L4;
                    } else {
                      stackOut_14_0 = ~var2.indexOf((int) param1.charAt(var3));
                      stackIn_22_0 = stackOut_14_0;
                      stackIn_15_0 = stackOut_14_0;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        if (stackIn_15_0 != 0) {
                          var3++;
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        } else {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0 != 0;
                        }
                      }
                    }
                  }
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_21_0 = 1;
                  stackIn_22_0 = stackOut_21_0;
                  break L3;
                }
                return stackIn_22_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_23_0 = 0;
            stackIn_24_0 = stackOut_23_0;
            return stackIn_24_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2_ref2;
            stackOut_25_1 = new StringBuilder().append("ne.F(").append(param0).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
    }

    final static String a(byte param0) {
        RuntimeException var1 = null;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_14_0 = null;
        String stackOut_16_0 = null;
        String stackOut_9_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            if (ao.field_Kb == pa.field_l) {
              stackOut_3_0 = rh.field_b;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 == -52) {
                if (ao.field_Kb != cb.field_c) {
                  if (!w.field_I.b(-88)) {
                    stackOut_14_0 = ve.field_u;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    stackOut_16_0 = pm.field_g;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  }
                } else {
                  stackOut_9_0 = ve.field_u;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (String) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "ne.A(" + param0 + ')');
        }
        return stackIn_17_0;
    }

    final static mg[] a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        mg var9 = null;
        mg var10 = null;
        mg var11 = null;
        mg var12 = null;
        mg var13 = null;
        Object var14 = null;
        mg[] stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        mg[] stackOut_7_0 = null;
        try {
          L0: {
            L1: {
              var6 = df.field_d;
              var7 = df.field_e;
              var8 = df.field_f;
              var9 = new mg(param1, -(param1 * 2) + param0);
              var9.b();
              df.a(0, 0, param1, param0 + -(2 * param1), param5, param4);
              var10 = new mg(param1, param1);
              var10.b();
              df.b(0, 0, param1, param1, param5);
              var11 = new mg(16, param1);
              var11.b();
              df.b(0, 0, 16, param1, param5);
              var12 = new mg(param1, param1);
              var12.b();
              df.b(0, 0, param1, param1, param4);
              var13 = new mg(16, param1);
              var13.b();
              if (param3 == 106) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            L2: {
              df.b(0, 0, 16, param1, param4);
              var14 = null;
              if (param2 > 0) {
                var14 = (Object) (Object) new mg(16, 16);
                ((mg) var14).b();
                df.b(0, 0, 16, 16, param2);
                break L2;
              } else {
                break L2;
              }
            }
            df.a(var6, var7, var8);
            stackOut_7_0 = new mg[]{var10, var11, var10, var9, (mg) var14, var9, var12, var13, var12};
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var6_ref, "ne.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_8_0;
    }

    final static void a(int param0) {
        try {
            kf.a(param0, param0 + -18);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ne.E(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Game drawn";
        field_a = '/';
        field_f = "Password is valid";
        field_d = "Mute this player for 48 hours";
    }
}
