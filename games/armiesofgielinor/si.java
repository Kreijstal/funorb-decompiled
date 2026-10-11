/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class si {
    int field_h;
    int field_g;
    int field_i;
    int field_f;
    int field_e;
    int field_d;
    static String field_a;
    static long field_c;
    static java.awt.Canvas field_b;

    final static void b(int param0) {
        if (param0 != 13829) {
          field_c = 27L;
          ro.field_lb = null;
          return;
        }
        ro.field_lb = null;
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -3404) {
            field_a = (String) null;
          }
          stackIn_5_0 = (null != db.a(param0, -87));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("si.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void a(int param0, int param1);

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 18347) {
          si.b(-3);
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_a = "This is not your unit";
    }
}
