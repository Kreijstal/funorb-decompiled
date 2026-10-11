/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String field_b;
    static int[] field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -20441) {
          ua.a(-73);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static tj a(byte param0, byte[] param1) {
        tj var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        tj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (tj) (stackIn_2_0);
          }
          var2 = new tj(param1, sl.field_d, bo.field_o, bn.field_c, uf.field_n, j.field_a, vj.field_m);
          no.f((byte) -54);
          if (param0 >= -126) {
            ua.a(18);
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("ua.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_b = "Menu";
        field_a = new int[]{19, 7};
    }
}
