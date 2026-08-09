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
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                if (param0 == -116) {
                  stackIn_8_0 = var3;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_6_0 = 20;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var3 = (var3 << 210728325) + -var3 - -kw.a(param1.charAt(var4), 100);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("rs.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_9_0 = 0;
        if (param1 <= -11) {
          L0: {
            L1: {
              if (param0 == 160) {
                break L1;
              } else {
                if (param0 == 32) {
                  break L1;
                } else {
                  if (param0 == 95) {
                    break L1;
                  } else {
                    if (param0 != 45) {
                      stackIn_9_0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_9_0 = 1;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        field_v = null;
        field_x = null;
        field_p = null;
        field_o = null;
        int var1 = 39 % ((param0 - -61) / 51);
        field_n = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        wk var5 = null;
        if (!cu.field_a) {
            return;
        }
        if (param0 != 26449) {
            return;
        }
        int var4 = cq.field_u[param2];
        if (7 == var4) {
            if (!(5 != (og.field_p[param2] - -param2 & 5))) {
                var5 = tn.field_eb[6 + og.field_p[param2] % 8];
                fe.a(var5, -10 + param1, -30 + param3);
            }
        }
    }

    final static int a(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1259643265;
        param1 = param1 | param1 >>> -524817758;
        param1 = param1 | param1 >>> -1566705244;
        if (param0 < 75) {
            field_o = (wk) null;
        }
        param1 = param1 | param1 >>> 329217704;
        param1 = param1 | param1 >>> -1766524656;
        return param1 - -1;
    }

    private rs() throws Throwable {
        throw new Error();
    }

    static {
        field_v = new me(14, 0, 4, 1);
        field_k = 640;
        field_x = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_t = 0;
    }
}
