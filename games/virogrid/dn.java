/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static lc field_d;
    static mg field_c;
    static String field_b;
    static int[] field_a;

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener(w.field_L);
            if (param0 != 2) {
                java.awt.Component var3 = (java.awt.Component) null;
                dn.a(-122, (java.awt.Component) null);
            }
            param1.removeFocusListener(w.field_L);
            ch.field_f = -1;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "dn.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 < 34) {
            field_a = (int[]) null;
        }
    }

    final static void a(int param0) {
        if (!oi.field_d) {
          throw new IllegalStateException();
        } else {
          pg.field_h = true;
          j.a(true, param0 ^ -8319);
          j.field_l = 0;
          if (param0 != 8192) {
            dn.a((byte) 73);
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_d = new lc(1, 2, 2, 0);
        field_b = "Hide chat";
        field_a = new int[8192];
    }
}
