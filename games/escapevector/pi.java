/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends hg {
    boolean field_h;
    oc field_i;
    static ed field_j;
    int field_q;
    hl field_o;
    int field_n;
    int field_m;
    int field_l;
    int field_p;
    int field_g;
    int field_k;
    int field_r;

    public static void a(byte param0) {
        field_j = null;
        int var1 = -26 / ((param0 - 26) / 58);
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = ca.a(-1, '_', param2, "");
          var3 = na.a(param2, false);
          if (param0 >= -77) {
            field_j = (ed) null;
          }
          stackIn_7_0 = (param1.indexOf(param2) != -1) || (param1.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("pi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    pi() {
    }

    static {
    }
}
