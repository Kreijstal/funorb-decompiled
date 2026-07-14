/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a extends ca implements java.awt.event.MouseWheelListener {
    private int field_e;

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((a) this).field_e = ((a) this).field_e + param0.getWheelRotation();
        param0.consume();
    }

    final void a(int param0, java.awt.Component param1) {
        if (param0 != -5070) {
            ((a) this).field_e = -54;
            param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
            return;
        }
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    a() {
        ((a) this).field_e = 0;
    }

    final void a(java.awt.Component param0, boolean param1) {
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (!param1) {
            Object var4 = null;
            ((a) this).a(-63, (java.awt.Component) null);
        }
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        Object var3 = null;
        var2 = ((a) this).field_e;
        if (param0 > -3) {
          var3 = null;
          ((a) this).a((java.awt.Component) null, true);
          ((a) this).field_e = 0;
          return var2;
        } else {
          ((a) this).field_e = 0;
          return var2;
        }
    }
}
