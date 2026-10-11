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
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -57) {
            field_u = (oi) null;
          }
          stackIn_3_0 = oa.a((byte) -95, '*', param0.field_k.length());
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ke.O(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_v = "Checking";
        field_u = new oi();
    }
}
