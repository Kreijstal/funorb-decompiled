/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uab {
    static String field_a;
    static int field_b;

    public static void a(int param0) {
        if (param0 != 0) {
            field_b = 112;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(byte param0) {
        if (param0 != 44) {
            uab.a(54);
            return knb.field_o;
        }
        return knb.field_o;
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) wj.field_q);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) wj.field_q);
        if (param0 != 1) {
          boolean discarded$2 = uab.a((byte) 73);
          param1.removeFocusListener((java.awt.event.FocusListener) (Object) wj.field_q);
          am.field_q = 0;
          return;
        } else {
          param1.removeFocusListener((java.awt.event.FocusListener) (Object) wj.field_q);
          am.field_q = 0;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Create unrated game";
        field_b = 1;
    }
}
