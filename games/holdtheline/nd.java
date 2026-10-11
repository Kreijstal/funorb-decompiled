/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static boolean field_h;
    String[] field_j;
    static uf field_c;
    static int field_l;
    static String field_a;
    boolean field_i;
    boolean field_f;
    String field_d;
    static boolean field_e;
    int field_b;
    static int field_g;
    static String field_k;

    public static void a(int param0) {
        field_c = null;
        field_k = null;
        if (param0 != -4496) {
          field_a = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean a(byte[] param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            return true;
          }
          if (param0.length == param2.length) {
            stackIn_7_0 = kd.a(1643, param2, 0, param0, 0, param2.length);
            return stackIn_7_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("nd.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    nd(boolean param0) {
        this.field_f = param0 ? true : false;
    }

    static {
        field_h = false;
        field_a = "Please check if address is correct";
        field_g = 0;
        field_k = "Player";
    }
}
