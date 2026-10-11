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
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -53) {
            jk.a((byte) 43);
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
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("jk.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
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
