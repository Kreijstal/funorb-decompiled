/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eqb {
    static char[] field_a;

    final static void a(ml param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ml var3 = null;
        ml var4 = null;
        int var5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 4) {
                L2: {
                  if (param1 == 14670) {
                    break L2;
                  } else {
                    field_a = (char[]) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var3 = new ml(29);
                var4 = new ml(32);
                var4.a(param1 ^ 14671, 2, new ml(25));
                var4.a(1, 3, new ml(25));
                var4.a(1, 4, new ml(25));
                var3.a(1, 0, var4);
                param0.a(param1 ^ 14671, var2_int, var3);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("eqb.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 65) {
            field_a = (char[]) null;
        }
        field_a = null;
    }

    static {
        int var0 = 0;
        field_a = new char[64];
        for (var0 = 0; -27 < (var0 ^ -1); var0++) {
            field_a[var0] = (char)(65 + var0);
        }
        for (var0 = 26; -53 < (var0 ^ -1); var0++) {
            field_a[var0] = (char)(var0 + 97 - 26);
        }
        for (var0 = 52; 62 > var0; var0++) {
            field_a[var0] = (char)(-52 + (var0 + 48));
        }
        field_a[63] = (char)45;
        field_a[62] = (char)42;
    }
}
