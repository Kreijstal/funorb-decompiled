/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends rqa {
    static String field_o;

    final static int a(int param0, byte param1) {
        param0 = param0 & 8191;
        int var2 = 34 / ((param1 + 19) / 38);
        if (param0 >= 4096) {
          return param0 >= 6144 ? kra.field_a[param0 - 6144] : -kra.field_a[6144 - param0];
        }
        return param0 >= 2048 ? -kra.field_a[-2048 + param0] : kra.field_a[-param0 + 2048];
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            field_o = (String) null;
          }
          stackIn_3_0 = new nc(hbb.field_z);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fc.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    fc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        int var1 = 95 % ((param0 + 41) / 63);
        field_o = null;
    }

    static {
        field_o = "No options available";
    }
}
