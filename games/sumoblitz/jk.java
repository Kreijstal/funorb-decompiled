/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static int field_a;
    static int field_c;
    static gd field_b;

    final static ne a(int[] param0, ne param1, int param2) {
        ne var3 = null;
        RuntimeException var3_ref = null;
        ne stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < -53) {
                break L1;
              } else {
                jk.a((byte) 43);
                break L1;
              }
            }
            var3 = new ne(0, 0, 0);
            var3.field_g = param1.field_g;
            var3.field_d = param1.field_d;
            var3.field_a = param1.field_a;
            var3.field_c = param1.field_c;
            var3.field_i = param0;
            var3.field_h = param1.field_h;
            var3.field_e = param1.field_e;
            var3.field_f = param1.field_f;
            stackIn_3_0 = (ne) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("jk.B(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        if (param0 != -104) {
            ne var2 = (ne) null;
            jk.a((int[]) null, (ne) null, -102);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
    }
}
