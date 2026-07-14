/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_g;
    static int field_e;
    java.awt.Frame field_i;
    static bd field_h;
    static int[] field_k;
    static bd field_j;
    static bd field_f;
    static ql field_a;
    static int field_d;
    static String field_b;
    static bd field_c;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((ue) this).field_g = true;
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        if (!(!param1.equals((Object) (Object) "B"))) {
            return Byte.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "I"))) {
            return Integer.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "S"))) {
            return Short.TYPE;
        }
        if (param1.equals((Object) (Object) "J")) {
            return Long.TYPE;
        }
        if (param1.equals((Object) (Object) "Z")) {
            return Boolean.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "F"))) {
            return Float.TYPE;
        }
        if (param0 != 0) {
            field_c = null;
            if (param1.equals((Object) (Object) "D")) {
                return Double.TYPE;
            }
            if (!(!param1.equals((Object) (Object) "C"))) {
                return Character.TYPE;
            }
            return Class.forName(param1);
        }
        if (param1.equals((Object) (Object) "D")) {
            return Double.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param1);
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(int param0, boolean param1) {
        L0: {
          if (wb.field_R <= 0) {
            break L0;
          } else {
            break L0;
          }
        }
        if (param1) {
          L1: {
            ue.a((byte) -119);
            w.field_r = w.field_r + param0;
            qb.field_k = qb.field_k - param0;
            if (0 < rf.field_f) {
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            w.field_r = w.field_r + param0;
            qb.field_k = qb.field_k - param0;
            if (0 < rf.field_f) {
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    ue() {
    }

    final void a(boolean param0, fd param1) {
        sd.a(param1, -106, ((ue) this).field_i);
        if (!param0) {
            field_h = null;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(byte param0) {
        field_h = null;
        field_c = null;
        field_a = null;
        field_j = null;
        if (param0 != -27) {
          ue.a((byte) 62);
          field_f = null;
          field_k = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_k = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_a = new ql();
        field_b = "FROM ONLY";
    }
}
