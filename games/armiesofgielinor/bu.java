/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bu {
    static dn field_a;
    static wk[] field_c;
    static sl field_b;

    final static void a(int param0, jd param1, int param2, vh param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          var4_int = param1.h((byte) 117);
          param3.b(param2 - 1, param1.field_A & 31 | param1.field_O << 5);
          param3.b(true, var4_int);
          param3.b(1, param0 + param1.field_t);
          param3.b(1, param1.field_Y + param0);
          param3.b(1, param1.field_o << 4 | param1.field_P);
          param3.b(1, param1.field_ab);
          param3.b(1, param1.field_r);
          param3.b(param2 - 1, param1.field_cb);
          param3.b(1, param1.field_V);
          if ((4 & param1.field_V) != 0) {
            param3.a(param1.field_K, 413740432);
          }
          var5 = 0;
          if (0 != param1.field_E) {
            var5 = var5 | 2;
          }
          if (param1.field_H != 0) {
            var5 = var5 | 1;
          }
          param3.b(1, var5);
          if (0 != (var5 & param2)) {
            param3.b(1, param1.field_E);
          }
          if ((var5 & 1) == 0) {
            return;
          }
          param3.b(1, param1.field_H);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("bu.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 >= -76) {
          field_a = (dn) null;
        }
    }

    static {
    }
}
