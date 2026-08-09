/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dt {
    static int field_a;
    static boolean[] field_d;
    static String field_c;
    static java.security.SecureRandom field_b;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != -1) {
            dt.a(5);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (-1 >= (param2 ^ -1)) {
          if (-12 <= (param2 ^ -1)) {
            if (param1 == -24375) {
              L0: {
                if (1 > param3) {
                  break L0;
                } else {
                  if (param3 > bn.a((byte) -84, param2, param0)) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 23678) {
                break L1;
              } else {
                dt.a(4);
                break L1;
              }
            }
            fj.a((java.awt.Component) ((Object) param0), (byte) 35);
            dc.a((java.awt.Component) ((Object) param0), -37);
            if (om.field_I == null) {
              break L0;
            } else {
              om.field_I.a((java.awt.Component) ((Object) param0), true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("dt.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    static {
        field_c = "Quit to website";
    }
}
