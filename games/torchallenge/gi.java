/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static boolean field_c;
    static java.awt.Frame field_b;
    static int field_e;
    static rb field_a;
    static ka[] field_f;
    static ad field_d;

    final static java.applet.Applet b(int param0) {
        if (null != aj.field_g) {
            return aj.field_g;
        }
        if (param0 != 12476) {
            field_d = (ad) null;
            return (java.applet.Applet) ((Object) mj.field_c);
        }
        return (java.applet.Applet) ((Object) mj.field_c);
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_a = null;
        if (param0 != 10) {
            return;
        }
        field_d = null;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() < nh.field_bb) {
                  break L1;
                } else {
                  if (param1.length() > gb.field_b) {
                    break L1;
                  } else {
                    if (param0 > 40) {
                      stackIn_9_0 = 0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      gi.b(-79);
                      return false;
                    }
                  }
                }
              }
            }
            stackIn_5_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("gi.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    static {
        field_c = false;
        field_e = 10;
    }
}
