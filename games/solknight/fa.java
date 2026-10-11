/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static o field_b;
    String field_a;
    static int field_f;
    boolean field_c;
    String field_d;
    static int[] field_g;
    static int[] field_e;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
          field_f = 70;
          field_e = null;
          field_g = null;
          return;
        }
        field_e = null;
        field_g = null;
    }

    final static int a(String param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 99) {
            stackIn_2_0 = 9;
            return stackIn_2_0;
          }
          if (!param1) {
            stackIn_7_0 = ke.field_H.b(param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = kb.field_f.b(param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fa.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_g = new int[8192];
        field_e = new int[8192];
    }
}
