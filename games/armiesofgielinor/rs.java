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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= var2_int) {
              return var3;
            } else {
              var3 = (var3 << 5) + -var3 - -kw.a(param1.charAt(var4), 100);
              var4++;
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("rs.D(").append(-116).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
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
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    public static void a() {
        field_v = null;
        field_x = null;
        field_p = null;
        field_o = null;
        int var1 = 0;
        field_n = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        wk var5 = null;
        if (!cu.field_a) {
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
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        if (param0 < 75) {
            field_o = null;
        }
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        return param1 - -1;
    }

    private rs() throws Throwable {
        throw new Error();
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
