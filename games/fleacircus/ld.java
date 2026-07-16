/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends java.awt.Canvas {
    static String field_b;
    private java.awt.Component field_a;
    static String field_c;

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -85) {
            int discarded$0 = ld.a(40);
        }
        field_c = null;
    }

    final static int a(int param0) {
        gf.field_e.a(-23608);
        if (!(td.field_k.b((byte) 66))) {
            return ij.a(125);
        }
        if (param0 <= 37) {
            return 24;
        }
        return 0;
    }

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        String var3 = null;
        Exception var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        var2 = -89 % ((73 - param0) / 41);
        try {
          L0: {
            if (!ce.field_d.startsWith("win")) {
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
              var3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var4 = 0;
              L2: while (true) {
                if (var4 >= param1.length()) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  if (0 != (var3.indexOf((int) param1.charAt(var4)) ^ -1)) {
                    var4++;
                    continue L2;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (Exception) (Object) decompiledCaughtException;
          return false;
        }
        return stackIn_17_0 != 0;
    }

    final static mk a(boolean param0, byte param1) {
        mk var2 = new mk(true);
        var2.field_g = param0 ? true : false;
        if (param1 != 42) {
            field_c = null;
        }
        return var2;
    }

    ld(java.awt.Component param0) {
        ((ld) this).field_a = param0;
    }

    public final void update(java.awt.Graphics param0) {
        ((ld) this).field_a.update(param0);
    }

    public final void paint(java.awt.Graphics param0) {
        ((ld) this).field_a.paint(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0>Spikes:<%1> Skewers fleas, so avoid them.";
        field_c = "Reload game";
    }
}
