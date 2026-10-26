/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static byte[][] field_c;
    static ej field_d;
    static eg field_a;
    static String field_b;

    final static void a(java.awt.Canvas param0, int param1) {
        String stackIn_6_2 = null;
        try {
          wl.a((java.awt.Component) ((Object) param0), (byte) -3);
          int var2_int = 59 / ((9 - param1) / 59);
          g.a((java.awt.Component) ((Object) param0), 0);
          if (null == SteeringMode.field_c) {
            return;
          }
          SteeringMode.field_c.a((java.awt.Component) ((Object) param0), false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_5_0 = var2;
          StringBuilder stackIn_5_1 = new StringBuilder().append("pg.C(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (param0) {
          field_b = null;
          field_c = (byte[][]) null;
          return;
        }
        field_a = (eg) null;
        field_b = null;
        field_c = (byte[][]) null;
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        field_c = new byte[1000][];
        field_d = new ej(4, 1, 1, 1);
        field_b = "Creating your account";
        field_a = new eg();
    }
}
