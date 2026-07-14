/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_d;
    static String field_e;
    static ea field_c;
    static String field_a;
    volatile boolean field_b;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != 79) {
            return;
        }
        field_e = null;
    }

    final void a(boolean param0, vf param1) {
        Object var4 = null;
        if (param0) {
          var4 = null;
          ((l) this).paint((java.awt.Graphics) null);
          tf.a((byte) 105, param1, ((l) this).field_d);
          return;
        } else {
          tf.a((byte) 105, param1, ((l) this).field_d);
          return;
        }
    }

    final static jf a(String param0, byte param1) {
        Object var3 = null;
        if (param1 < -126) {
          if (wm.field_f.a(0)) {
            if (param0.equals((Object) (Object) wm.field_f.a(false))) {
              return wm.field_f;
            } else {
              wm.field_f = al.a(-10218, param0);
              return wm.field_f;
            }
          } else {
            return wm.field_f;
          }
        } else {
          var3 = null;
          jf discarded$5 = l.a((String) null, (byte) 111);
          if (wm.field_f.a(0)) {
            if (param0.equals((Object) (Object) wm.field_f.a(false))) {
              return wm.field_f;
            } else {
              wm.field_f = al.a(-10218, param0);
              return wm.field_f;
            }
          } else {
            return wm.field_f;
          }
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((l) this).field_b = true;
    }

    l() {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Waiting for extra data";
        field_a = "Error connecting to server. Please try using a different server.";
    }
}
