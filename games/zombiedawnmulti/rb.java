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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 103) {
                break L1;
              } else {
                var3 = (byte[]) null;
                rb.a(-39, (byte[]) null);
                break L1;
              }
            }
            if (param1 != null) {
              var2 = new ef(param1, k.field_i, qj.field_o, oq.field_w, vj.field_p, qp.field_t);
              fd.h((byte) 126);
              stackIn_6_0 = (ef) (var2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("rb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_e = null;
        field_d = null;
        if (param0 > -106) {
          field_c = (int[]) null;
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    static {
        field_a = null;
        field_c = new int[]{};
        field_b = "Accept";
    }
}
