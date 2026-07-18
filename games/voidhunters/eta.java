/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eta implements dja {
    static java.awt.Dimension field_a;
    static int field_b;

    public static void a() {
        field_a = null;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = null;
            return (tv[]) (Object) new ara[param1];
        }
        return (tv[]) (Object) new ara[param1];
    }

    final static void a(byte param0, mm param1) {
        mm var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var3 = VoidHunters.field_G;
        try {
          param1.b(-3846);
          var2 = (mm) (Object) kja.field_E.d(0);
          if (param0 >= 99) {
            L0: while (true) {
              L1: {
                if (var2 == null) {
                  break L1;
                } else {
                  if (!var2.a(param1, -128)) {
                    break L1;
                  } else {
                    var2 = (mm) (Object) kja.field_E.a((byte) 28);
                    continue L0;
                  }
                }
              }
              if (var2 == null) {
                kja.field_E.b(-10258, (ksa) (Object) param1);
                return;
              } else {
                al.a((ksa) (Object) param1, (ksa) (Object) var2, 2);
                return;
              }
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2_ref;
            stackOut_10_1 = new StringBuilder().append("eta.E(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        return (param2 & 2048) != 0;
    }

    public final tv a(byte param0) {
        int var2 = 31 % ((param0 - -64) / 50);
        return (tv) (Object) new ara();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new java.awt.Dimension(640, 480);
        field_b = 4;
    }
}
