/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static bi field_e;
    static ni field_i;
    static dd field_c;
    static int field_a;
    static int field_f;
    static String field_b;
    static java.applet.Applet field_j;
    static volatile boolean field_g;
    static long field_h;
    static vc field_d;

    public static void a(int param0) {
        field_i = null;
        field_e = null;
        field_d = null;
        field_c = null;
        field_b = null;
        field_j = null;
        if (param0 != 9330) {
          sd.a((byte) -123);
        }
    }

    final static void a(byte param0) {
        if (param0 != -63) {
          field_i = (ni) null;
        }
    }

    final static boolean a(ni param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.e(false);
          if (param1 != 16448) {
            return false;
          }
          stackIn_6_0 = (var2_int == 1) ? 1 : 0;
          var3 = stackIn_6_0;
          stackIn_7_0 = var3;
          return stackIn_7_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("sd.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = 0;
        field_i = new ni(256);
        field_g = true;
        field_b = "Names can only contain letters, numbers, spaces and underscores";
        field_d = new vc();
    }
}
