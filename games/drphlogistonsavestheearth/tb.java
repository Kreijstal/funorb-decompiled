/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static he field_d;
    static int field_c;
    static he[] field_b;
    static int field_a;

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.removeKeyListener(ji.field_c);
          param1.removeFocusListener(ji.field_c);
          gm.field_O = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "tb.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String b(byte param0) {
        if (hj.field_f < 2) {
          return a.field_c;
        }
        if (bi.field_I != null) {
          if (!bi.field_I.a(0)) {
            return mi.field_d;
          }
          return dh.field_J;
        }
        if (!qd.field_Jb.a(0)) {
          return td.field_o;
        }
        if (!qd.field_Jb.a(255, "commonui")) {
          return sa.field_b + " - " + qd.field_Jb.b(10461, "commonui") + "%";
        }
        if (!sb.field_i.a(0)) {
          return bh.field_d;
        }
        if (param0 != -81) {
          return (String) null;
        }
        if (!sb.field_i.a(255, "commonui")) {
          return ij.field_a + " - " + sb.field_i.b(param0 + 10542, "commonui") + "%";
        }
        if (!ig.field_t.a(0)) {
          return ia.field_b;
        }
        if (!ig.field_t.c((byte) 68)) {
          return fb.field_a + " - " + ig.field_t.d((byte) 95) + "%";
        }
        return tl.field_J;
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        int var1 = 78 / ((param0 + 6) / 36);
    }

    static {
    }
}
