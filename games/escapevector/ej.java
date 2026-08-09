/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static ed field_a;
    static boolean field_d;
    static String field_c;
    static int field_b;
    static ed field_e;
    static String[] field_g;
    static te[] field_f;

    final static void a(byte param0, String param1) {
        RuntimeException runtimeException = null;
        String var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              lb.b(-10002, param1);
              uf.a((byte) 125, mm.field_a, false);
              if (param0 <= -113) {
                break L1;
              } else {
                var3 = (String) null;
                ej.a((byte) -29, (String) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ej.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        param1 = ((param1 & -1431655765) >>> -1516128639) + (param1 & 1431655765);
        param1 = (param1 & param0) + ((-858993460 & param1) >>> 1378065122);
        param1 = (param1 >>> -1166604636) + param1 & 252645135;
        param1 = param1 + (param1 >>> 320507944);
        param1 = param1 + (param1 >>> -2087009456);
        return param1 & 255;
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_f = null;
        field_g = null;
        if (param0 < 13) {
          field_c = (String) null;
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    static {
        field_c = "To Customer Support";
        field_g = new String[]{"", "", "", ""};
    }
}
