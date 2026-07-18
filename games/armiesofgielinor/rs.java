/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs extends tc {
    int field_l;
    static me field_v;
    int field_s;
    int field_m;
    int field_w;
    int field_r;
    static String field_x;
    static tu field_n;
    static wk field_o;
    int field_u;
    static int field_q;
    static int field_k;
    static wk[] field_p;
    static int field_t;

    final static int a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 >= var2_int) {
                    break L3;
                  } else {
                    var3 = (var3 << 210728325) + -var3 - -kw.a(param1.charAt(var4), 100);
                    var4++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == -116) {
                  break L2;
                } else {
                  stackOut_8_0 = 20;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
              stackOut_10_0 = var3;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("rs.D(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_11_0;
    }

    final static boolean a(char param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 <= -11) {
              L1: {
                L2: {
                  if (param0 == 160) {
                    break L2;
                  } else {
                    if (param0 == 32) {
                      break L2;
                    } else {
                      if (param0 == 95) {
                        break L2;
                      } else {
                        if (param0 != 45) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackOut_13_0 = 1;
                stackIn_16_0 = stackOut_13_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rs.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0 != 0;
    }

    public static void a(byte param0) {
        try {
            field_v = null;
            field_x = null;
            field_p = null;
            field_o = null;
            int var1_int = 39 % ((param0 - -61) / 51);
            field_n = null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "rs.C(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        wk var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (cu.field_a) {
              if (param0 == 26449) {
                L1: {
                  var4_int = cq.field_u[param2];
                  if (7 != var4_int) {
                    break L1;
                  } else {
                    if (5 == (og.field_p[param2] - -param2 & 5)) {
                      var5 = tn.field_eb[6 + og.field_p[param2] % 8];
                      fe.a(var5, -10 + param1, -30 + param3);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "rs.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              param1--;
              param1 = param1 | param1 >>> 1259643265;
              param1 = param1 | param1 >>> -524817758;
              param1 = param1 | param1 >>> -1566705244;
              if (param0 >= 75) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            param1 = param1 | param1 >>> 329217704;
            param1 = param1 | param1 >>> -1766524656;
            stackOut_3_0 = param1 - -1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rs.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private rs() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "rs.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new me(14, 0, 4, 1);
        field_k = 640;
        field_x = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_t = 0;
    }
}
