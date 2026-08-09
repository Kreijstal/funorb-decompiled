/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static int[] field_d;
    static String[] field_a;
    static long field_c;
    static String field_b;

    final static void a(tg param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        int var4 = 0;
        th var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = ed.field_q;
              var5.h(param1, 0);
              if (param2 == 24) {
                break L1;
              } else {
                field_a = (String[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var5.field_h = var5.field_h + 1;
                var4 = var5.field_h;
                var5.c(1, -1);
                if (null != param0.field_h) {
                  break L3;
                } else {
                  var5.c(0, -1);
                  if (!Lexicominos.field_L) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var5.c(param0.field_h.length, -1);
              var5.a(0, param0.field_h, 255, param0.field_h.length);
              break L2;
            }
            var5.a(var4, (byte) 85);
            var5.field_h = var5.field_h - 4;
            param0.field_k = var5.d((byte) 19);
            var5.d(-var4 + var5.field_h, (byte) -125);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("p.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 >= -124) {
          field_b = (String) null;
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    static {
        field_a = new String[]{"Showing by rating", "Showing by win percentage"};
        field_b = "Password: ";
    }
}
