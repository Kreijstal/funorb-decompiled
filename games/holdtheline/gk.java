/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static String field_c;
    static String field_a;
    static go field_b;
    static float[] field_d;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 != 115) {
          gk.a((byte) 54);
          field_b = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) ic.field_d);
        if (param1 <= 26) {
          field_d = null;
          param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ic.field_d);
          param0.addFocusListener((java.awt.event.FocusListener) (Object) ic.field_d);
          return;
        } else {
          param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ic.field_d);
          param0.addFocusListener((java.awt.event.FocusListener) (Object) ic.field_d);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "AI racers: ";
        field_a = "(Including <%0>)";
        field_d = new float[3];
    }
}
