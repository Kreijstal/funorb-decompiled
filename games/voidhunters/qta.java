/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qta extends rqa {
    static int[] field_o;

    final static boolean a(int param0, int param1) {
        if (param1 == 9) {
          if (4 <= param0) {
            if (13 == param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          qta.b(false);
          if (4 <= param0) {
            if (13 == param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    qta(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                qta.b(true);
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(9, 111));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("qta.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(boolean param0) {
        field_o = null;
        if (param0) {
            qta.a(-80, 94);
        }
    }

    static {
    }
}
