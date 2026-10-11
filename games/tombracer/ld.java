/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ld extends ota {
    static String field_d;
    static int field_e;
    static String field_f;

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var3 = (String) null;
            ld.a(true, (String) null);
          }
          if (param1 != null &&
            param1.length() >= ik.field_f) {
            if (param1.length() > im.field_n) {
              return true;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ld.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    abstract na b(int param0);

    private ld() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        int var1 = 35 / ((param0 + 62) / 50);
        field_d = null;
        field_f = null;
    }

    static {
        field_d = "White light beams are safe for you, but deadly for skeletons. Maybe you can persuade the skeletons to step into the light.";
        field_f = "(<%0> players want to join)";
    }
}
