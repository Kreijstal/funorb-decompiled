/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends qb {
    static oi field_u;
    static boolean field_w;
    static String field_v;
    static String[] field_t;

    ke(int param0) {
        this(gh.field_b, param0);
    }

    private ke(vd param0, int param1) {
        super(param0, param1);
    }

    public static void b(byte param0) {
        field_u = null;
        field_t = null;
        if (param0 >= -63) {
            return;
        }
        field_v = null;
    }

    final String b(ub param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -57) {
                break L1;
              } else {
                field_u = (oi) null;
                break L1;
              }
            }
            stackIn_3_0 = oa.a((byte) -95, '*', param0.field_k.length());
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ke.O(");

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
          throw bd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_v = "Checking";
        field_u = new oi();
    }
}
