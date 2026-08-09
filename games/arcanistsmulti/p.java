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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_b = (h) null;
                break L1;
              }
            }
            if (fn.field_f == null) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (-1 < (param1.toLowerCase().indexOf(fn.field_f.toLowerCase()) ^ -1)) {
                  stackIn_9_0 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("p.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        String var10;
        if (param2 != 11) {
          var10 = (String) null;
          p.a(2, (String) null);
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
        if (param0 != -46) {
            return;
        }
        field_h = null;
        field_j = null;
        field_d = null;
        field_f = null;
    }

    p(Throwable param0, String param1) {
        this.field_g = param0;
        this.field_i = param1;
    }

    static {
        field_a = 48;
        field_f = "If you do nothing the game will revert to normal view once the timer reaches 0.";
        field_h = "Bombs:";
    }
}
