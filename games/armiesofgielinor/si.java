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
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -3404) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              if (null == db.a(param0, -87)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("si.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
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
