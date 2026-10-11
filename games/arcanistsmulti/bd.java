/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bd {
    static java.applet.Applet field_c;
    static int field_a;
    static String field_d;
    static String field_b;

    public static void b(int param0) {
        field_d = null;
        if (param0 != 0) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    abstract void a(wk param0, int param1);

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() >= bm.field_f) {
            if (param1.length() > dd.field_d) {
              return true;
            }
            if (param0 >= -50) {
              bd.b(117);
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("bd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    abstract ch a(int param0);

    static {
        field_a = 0;
        field_d = "The following settings need to be changed:  ";
        field_b = "To server list";
    }
}
