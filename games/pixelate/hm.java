/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_a;
    static String[] field_f;
    static String field_c;
    static String field_e;
    static String field_d;
    static int field_b;

    final static og a(int param0, byte[] param1, int param2) {
        og var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        og stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        og stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new og(param1);
            wk.field_g.a(22125, (fa) (Object) var3);
            dq.a(6, -18989, var3);
            var4 = 55 / ((param0 - 68) / 46);
            stackOut_0_0 = (og) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("hm.E(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 6 + 41);
        }
        return stackIn_1_0;
    }

    final static el a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        el var5 = null;
        el stackIn_4_0 = null;
        el stackIn_7_0 = null;
        el stackIn_10_0 = null;
        el stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        el stackOut_11_0 = null;
        el stackOut_9_0 = null;
        el stackOut_6_0 = null;
        el stackOut_3_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (0 == param1.length()) {
                  break L1;
                } else {
                  var2_int = param1.indexOf('@');
                  if (var2_int != -1) {
                    var3 = param1.substring(param0, var2_int);
                    var4 = param1.substring(var2_int - -1);
                    var5 = wf.a(false, var3);
                    if (var5 == null) {
                      stackOut_11_0 = jf.a(var4, param0 ^ -4384);
                      stackIn_12_0 = stackOut_11_0;
                      break L0;
                    } else {
                      stackOut_9_0 = (el) var5;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    }
                  } else {
                    stackOut_6_0 = pd.field_Kb;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                }
              }
            }
            stackOut_3_0 = ge.field_i;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("hm.C(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    public static void b(byte param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        field_e = null;
        field_d = null;
    }

    final static void a(byte param0) {
        oo.field_f = -1;
        qg.field_b = null;
        re.field_h = false;
        no.field_h = 0;
        tm.field_V = -1;
        int var1 = -30;
    }

    final synchronized static long a(int param0) {
        long var1 = 0L;
        var1 = System.currentTimeMillis();
        if (var1 < wa.field_h) {
          qj.field_d = qj.field_d + (wa.field_h + -var1);
          wa.field_h = var1;
          return var1 - -qj.field_d;
        } else {
          wa.field_h = var1;
          return var1 - -qj.field_d;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"The aim of the game is construct the picture on the left.", "Use the <col=ffff00>arrow keys</col> to move.<br>Hit '<col=ffff00>CTRL</col>' to rotate.", "Press '<col=ffff00>ENTER</col>' to skip the tutorial."};
        field_e = "Creating your account";
        field_c = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_d = "Create";
    }
}
