/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends RuntimeException {
    static kc field_d;
    static h field_b;
    static int field_c;
    Throwable field_g;
    static String field_j;
    String field_i;
    static int field_a;
    static String field_f;
    static String field_h;
    static int field_e;

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            if (fn.field_f == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L2: {
                if (param1.toLowerCase().indexOf(fn.field_f.toLowerCase()) < 0) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("p.A(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        Object var10 = null;
        if (param2 != 11) {
          var10 = null;
          boolean discarded$1 = p.a(2, (String) null);
          he.field_e.b((byte) -124, 58);
          he.field_e.f(param0, (byte) -82);
          he.field_e.c(param6, (byte) -68);
          he.field_e.c(param8, (byte) -68);
          he.field_e.c(param7, (byte) -95);
          he.field_e.c(param1, (byte) -59);
          he.field_e.c(param4, (byte) -66);
          he.field_e.f(param3, (byte) -35);
          he.field_e.f(param5, (byte) -128);
          return;
        } else {
          he.field_e.b((byte) -124, 58);
          he.field_e.f(param0, (byte) -82);
          he.field_e.c(param6, (byte) -68);
          he.field_e.c(param8, (byte) -68);
          he.field_e.c(param7, (byte) -95);
          he.field_e.c(param1, (byte) -59);
          he.field_e.c(param4, (byte) -66);
          he.field_e.f(param3, (byte) -35);
          he.field_e.f(param5, (byte) -128);
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_h = null;
        field_j = null;
        field_d = null;
        field_f = null;
    }

    p(Throwable param0, String param1) {
        ((p) this).field_g = param0;
        ((p) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 48;
        field_f = "If you do nothing the game will revert to normal view once the timer reaches 0.";
        field_h = "Bombs:";
    }
}
