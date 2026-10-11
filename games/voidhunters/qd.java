/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static String field_c;
    static int field_b;
    static int field_d;
    static boolean[] field_a;

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param1.getParameter("username");
          if (param0 != 0) {
            field_b = -84;
          }
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (agb.a(var3, -49) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("qd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        int var1 = 82 / ((-47 - param0) / 60);
    }

    static {
        field_c = "Repairing...";
        field_a = new boolean[11];
    }
}
