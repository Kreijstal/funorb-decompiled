/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends gn {
    static int field_j;
    int field_f;
    static java.awt.Frame field_k;
    int field_i;
    static String field_h;
    static String field_e;
    static String[] field_g;

    final static void b(int param0) {
        kd.field_s = false;
        if (dr.field_g != null) {
          dr.field_g.a(5075);
        }
        int var1 = -60 % ((-56 - param0) / 56);
        if (0 != ov.field_b) {
          td.a(29);
        }
        fb.field_I = 0;
    }

    private fa() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_g = null;
        field_k = null;
        field_h = null;
        field_e = null;
        int var1 = 81 % ((param0 + 6) / 41);
    }

    final static ut[] a(int param0, byte param1, int param2, sj param3) {
        RuntimeException var4 = null;
        ut[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ut[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -67) {
            stackIn_2_0 = (ut[]) null;
            return stackIn_2_0;
          }
          if (cu.a(param2, param3, param0, 122)) {
            stackIn_7_0 = ub.i((byte) 78);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (ut[]) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("fa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_j = 0;
        field_h = "Confirm Password: ";
        field_e = "Open in popup window";
    }
}
