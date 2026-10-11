/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    int field_d;
    static nh field_e;
    static String field_g;
    static nh field_c;
    static int field_f;
    static String field_b;
    int field_a;

    final static og a(byte param0, String[] param1) {
        og var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        og stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3) {
            var3 = (String[]) null;
            sa.a((byte) -13, (String[]) null);
          }
          var2 = new og(false);
          var2.field_h = param1;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("sa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (vb.field_n == param0 - wk.field_i) {
          vb.field_n = vb.field_n + 1;
          return;
        }
        if (vb.field_n != -wk.field_i + 250) {
          vb.field_n = vb.field_n + 1;
          return;
        }
        vb.field_n = vb.field_n + 1;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 == 250) {
          field_b = null;
          field_e = null;
          field_g = null;
          return;
        }
        field_g = (String) null;
        field_b = null;
        field_e = null;
        field_g = null;
    }

    sa(int param0, int param1, int param2, int param3) {
        this.field_d = param0;
        this.field_a = param3;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_g = "Total score: ";
        field_b = "Loading graphics";
    }
}
