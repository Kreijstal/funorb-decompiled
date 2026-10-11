/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static String field_e;
    static hd field_a;
    static int field_b;
    static r field_d;
    static String field_c;

    public static void a(int param0) {
        if (param0 == -1) {
          field_e = null;
          field_d = null;
          field_a = null;
          field_c = null;
          return;
        }
        field_e = (String) null;
        field_e = null;
        field_d = null;
        field_a = null;
        field_c = null;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(ut param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Kickabout.field_G;
        try {
          for (var2_int = 0; param0.field_y.length > var2_int; var2_int++) {
            if (param0.field_y[var2_int] == 0) {
              param0.field_y[var2_int] = 65793;
            }
          }
          param0.field_y[0] = 0;
          if (param1 != -51) {
            return;
          }
          param0.field_y[-1 + param0.field_o] = 0;
          param0.field_y[(-1 + param0.field_v) * param0.field_o] = 0;
          param0.field_y[-1 + param0.field_y.length] = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("sd.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = "buyout can't go below starting price";
        field_c = "Only show lobby chat from my friends";
        field_b = 370;
        field_d = new r();
    }
}
