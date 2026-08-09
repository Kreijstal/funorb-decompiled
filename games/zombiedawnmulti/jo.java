/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo {
    static ma field_e;
    static String field_c;
    static int field_f;
    static ja field_d;
    static String field_a;
    static int field_b;

    final static void a(byte param0) {
        pb.field_d = 0;
        if (param0 <= 29) {
            jo.a((byte) -128);
        }
    }

    final static boolean a(ul param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_f = -48;
                break L1;
              }
            }
            stackIn_3_0 = param0.a(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("jo.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
            return;
        }
        field_a = null;
        field_c = null;
        field_d = null;
    }

    static {
        field_e = new ma();
        field_a = "";
        field_c = "Join <%0>'s game";
    }
}
