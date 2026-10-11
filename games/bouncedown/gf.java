/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf extends ai {
    static String field_h;
    static jf field_g;
    int field_i;

    final static int a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 10) {
            stackIn_4_0 = kf.a(10, param1, true, 48);
            return stackIn_4_0;
          }
          stackIn_2_0 = 107;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("gf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_h = null;
        if (param0) {
          field_h = (String) null;
        }
    }

    private gf() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "Please wait...";
    }
}
