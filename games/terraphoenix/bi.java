/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static fa field_b;
    static String field_c;
    static String field_a;
    static fa field_d;

    final static oa a(int param0, String param1) {
        String var3 = null;
        String var4 = null;
        oa var5 = null;
        if (param1 == null) {
            return rf.field_w;
        }
        if (param1.length() == 0) {
            return rf.field_w;
        }
        int var2 = param1.indexOf('@');
        if (!(-1 != var2)) {
            return b.field_f;
        }
        if (param0 != -29456) {
            Object var6 = null;
            te discarded$0 = bi.a(-98, -86, 70, (java.awt.Component) null);
            var3 = param1.substring(0, var2);
            var4 = param1.substring(1 + var2);
            var5 = jh.a((byte) 42, var3);
            if (!(var5 == null)) {
                return var5;
            }
            return ma.a(var4, 46);
        }
        var3 = param1.substring(0, var2);
        var4 = param1.substring(1 + var2);
        var5 = jh.a((byte) 42, var3);
        if (!(var5 == null)) {
            return var5;
        }
        return ma.a(var4, 46);
    }

    final static void a(int param0, String param1, String[] param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var5 = Terraphoenix.field_V;
        if (param3 == -14) {
          qe.field_f = k.field_b;
          if ((param0 ^ -1) != -256) {
            if (-101 <= param0) {
              if (-106 <= (param0 ^ -1)) {
                wl.field_Q = ib.a(true, param2);
                return;
              } else {
                wl.field_Q = aj.a(param0, (byte) 113, param1);
                return;
              }
            } else {
              wl.field_Q = aj.a(param0, (byte) 113, param1);
              return;
            }
          } else {
            L0: {
              stackOut_13_0 = param3 ^ -10;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (wf.field_q <= -14) {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L0;
              } else {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L0;
              }
            }
            wl.field_Q = ia.a(stackIn_16_0, stackIn_16_1 != 0);
            return;
          }
        } else {
          var6 = null;
          te discarded$1 = bi.a(-13, 13, 17, (java.awt.Component) null);
          qe.field_f = k.field_b;
          if ((param0 ^ -1) != -256) {
            if (-101 <= param0) {
              if (-106 <= (param0 ^ -1)) {
                wl.field_Q = ib.a(true, param2);
                return;
              } else {
                wl.field_Q = aj.a(param0, (byte) 113, param1);
                return;
              }
            } else {
              wl.field_Q = aj.a(param0, (byte) 113, param1);
              return;
            }
          } else {
            L1: {
              stackOut_2_0 = param3 ^ -10;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (wf.field_q <= -14) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            wl.field_Q = ia.a(stackIn_5_0, stackIn_5_1 != 0);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -1) {
          field_d = null;
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    final static te a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            te var5 = null;
            of var5_ref = null;
            Object stackIn_2_0 = null;
            te stackIn_4_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            te stackOut_3_0 = null;
            try {
              var4 = Class.forName("ri");
              if (param1 < -70) {
                return (te) (Object) stackIn_2_0;
              } else {
                stackOut_1_0 = null;
                stackIn_2_0 = stackOut_1_0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var5 = (te) var4.newInstance();
              var5.a(param0, param2, (byte) -36, param3);
              stackOut_3_0 = (te) var5;
              stackIn_4_0 = stackOut_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_a = "Difficulty: Hard";
    }
}
