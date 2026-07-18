/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    int field_d;
    static String field_c;
    static String field_b;
    static vi field_f;
    static String[] field_e;
    static ec field_a;
    static int field_h;
    static int[] field_g;

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            qj.a(-53, (java.awt.Component) (Object) param0);
            if (param1 >= 50) {
              dg.a((byte) 50, (java.awt.Component) (Object) param0);
              if (null != sc.field_e) {
                sc.field_e.a((byte) -91, (java.awt.Component) (Object) param0);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("ej.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    public static void a() {
        field_c = null;
        field_e = null;
        field_b = null;
        field_f = null;
        field_a = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Go Back";
        field_b = "Members' Benefits";
        field_f = new vi();
        field_e = new String[]{"Loads more enemies", "Six more levels", "Two new environments", "Three more bosses", "Extra Achievements", "Fullscreen mode", "No adverts", "And more besides!"};
        field_g = new int[]{11, -1, 14, -1, 19, 24, -1, -1, -1, -1, 35, 14, 41, 44, 48, 52, 57, 63, 65, 1, 2, 3, 4, 6, 1, 1, 27, -1, 73, -1};
    }
}
