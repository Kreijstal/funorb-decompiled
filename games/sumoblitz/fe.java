/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends ah {
    static String[] field_S;
    static int field_T;

    fe(int param0, int param1) {
        super(0, 0, param0, param1);
    }

    final static dj a(int param0, qp param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        dj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -12 % ((-31 - param0) / 63);
            stackIn_1_0 = qq.a(18416, mf.a(param1, 100, 96));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("fe.OA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void n(byte param0) {
        if (param0 > -63) {
            qp var2 = (qp) null;
            fe.a(44, (qp) null);
            field_S = null;
            return;
        }
        field_S = null;
    }

    static {
        field_S = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_T = 10;
    }
}
