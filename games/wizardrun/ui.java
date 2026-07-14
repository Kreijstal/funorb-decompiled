/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends java.awt.Canvas implements java.awt.event.FocusListener {
    static o[] field_a;
    java.awt.Frame field_c;
    volatile boolean field_b;

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((ui) this).field_b = true;
    }

    final void a(vh param0, byte param1) {
        int var3 = -58 % ((-46 - param1) / 36);
        q.a(-119, ((ui) this).field_c, param0);
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_a = null;
    }

    ui() {
    }

    final static void a(boolean param0, o[] param1) {
        f.field_d = param1;
        if (param0) {
          if (null != f.field_d) {
            if (-4 <= param1.length) {
              return;
            } else {
              throw new IllegalArgumentException("");
            }
          } else {
            return;
          }
        } else {
          field_a = null;
          if (null != f.field_d) {
            if (-4 >= param1.length) {
              return;
            } else {
              throw new IllegalArgumentException("");
            }
          } else {
            return;
          }
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
    }
}
