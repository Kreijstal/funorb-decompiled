/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static boolean field_a;
    static wl field_b;

    final static void a(byte param0) {
        mi var1 = (mi) (Object) re.field_q.b(-8980);
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        em.a(var1.field_p, var1.field_q, var1.field_i);
        em.f(var1.field_o, var1.field_n, var1.field_r, var1.field_h);
        var1.field_p = null;
        k.field_d.a(-12328, (hg) (Object) var1);
        int var2 = 108 % ((param0 - 69) / 38);
    }

    final static void a(boolean param0) {
        un.field_u = param0 ? true : false;
        ei.field_j = 0;
        ni.field_O = -1;
        on.field_b = null;
        ci.field_g = -1;
    }

    final static boolean a(byte param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_11_0 = 0;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            if (!lk.field_e.startsWith("win")) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param1.startsWith("http://")) {
                  break L1;
                } else {
                  if (!param1.startsWith("https://")) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              if (param0 > 26) {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= param1.length()) {
                    Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                    stackOut_20_0 = 1;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    if (0 == (var2.indexOf((int) param1.charAt(var3)) ^ -1)) {
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0 != 0;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              } else {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (Exception) (Object) decompiledCaughtException;
          return false;
        }
        return stackIn_21_0 != 0;
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 != -96) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
    }
}
