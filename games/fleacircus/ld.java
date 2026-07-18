/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends java.awt.Canvas {
    static String field_b;
    private java.awt.Component field_a;
    static String field_c;

    public static void a() {
        field_b = null;
        field_c = null;
    }

    final static int a(int param0) {
        gf.field_e.a(-23608);
        if (td.field_k.b((byte) 66)) {
            return 0;
        }
        int discarded$0 = 125;
        return ij.a();
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        Exception var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          try {
            var2_int = 0;
            if (!ce.field_d.startsWith("win")) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L0: {
                if (param1.startsWith("http://")) {
                  break L0;
                } else {
                  if (!param1.startsWith("https://")) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    break L0;
                  }
                }
              }
              var3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var4 = 0;
              L1: while (true) {
                if (var4 >= param1.length()) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0 != 0;
                } else {
                  if (var3.indexOf((int) param1.charAt(var4)) != -1) {
                    var4++;
                    continue L1;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  }
                }
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_19_0 = 0;
            stackIn_20_0 = stackOut_19_0;
            return stackIn_20_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("ld.A(").append(122).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    final static mk a(boolean param0) {
        mk var2 = new mk(true);
        var2.field_g = param0 ? true : false;
        return var2;
    }

    ld(java.awt.Component param0) {
        try {
            ((ld) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ld.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((ld) this).field_a.update(param0);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ld.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            ((ld) this).field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ld.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0>Spikes:<%1> Skewers fleas, so avoid them.";
        field_c = "Reload game";
    }
}
