/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static ja[] field_e;
    static String field_a;
    static int[] field_c;
    static String field_b;
    static cj field_d;

    final static ef a(int param0, byte[] param1) {
        ef var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        ef stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 103) {
            var3 = (byte[]) null;
            rb.a(-39, (byte[]) null);
          }
          if (param1 == null) {
            return null;
          }
          var2 = new ef(param1, k.field_i, qj.field_o, oq.field_w, vj.field_p, qp.field_t);
          fd.h((byte) 126);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("rb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_e = null;
        field_d = null;
        if (param0 <= -106) {
          field_b = null;
          return;
        }
        field_c = (int[]) null;
        field_b = null;
    }

    static {
        field_a = null;
        field_c = new int[]{};
        field_b = "Accept";
    }
}
