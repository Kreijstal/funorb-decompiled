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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          qj.a(-53, (java.awt.Component) ((Object) param0));
          if (param1 < 50) {
            return;
          }
          dg.a((byte) 50, (java.awt.Component) ((Object) param0));
          if (null == sc.field_e) {
            return;
          }
          sc.field_e.a((byte) -91, (java.awt.Component) ((Object) param0));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ej.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 12018) {
          return;
        }
        field_c = null;
        field_e = null;
        field_b = null;
        field_f = null;
        field_a = null;
        field_g = null;
    }

    static {
        field_c = "Go Back";
        field_b = "Members' Benefits";
        field_f = new vi();
        field_e = new String[]{"Loads more enemies", "Six more levels", "Two new environments", "Three more bosses", "Extra Achievements", "Fullscreen mode", "No adverts", "And more besides!"};
        field_g = new int[]{11, -1, 14, -1, 19, 24, -1, -1, -1, -1, 35, 14, 41, 44, 48, 52, 57, 63, 65, 1, 2, 3, 4, 6, 1, 1, 27, -1, 73, -1};
    }
}
