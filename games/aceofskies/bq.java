/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq extends qg implements java.awt.event.MouseWheelListener {
    private int field_f;

    final synchronized int b(int param0) {
        int var2 = 0;
        Object var3 = null;
        var2 = ((bq) this).field_f;
        if (param0 != 12) {
          var3 = null;
          ((bq) this).mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
          ((bq) this).field_f = 0;
          return var2;
        } else {
          ((bq) this).field_f = 0;
          return var2;
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((bq) this).field_f = ((bq) this).field_f + param0.getWheelRotation();
        param0.consume();
    }

    final void a(java.awt.Component param0, boolean param1) {
        if (param1) {
            int discarded$0 = ((bq) this).b(-92);
            param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
            return;
        }
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    bq() {
        ((bq) this).field_f = 0;
    }

    final void a(java.awt.Component param0, int param1) {
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param1 > -44) {
            ((bq) this).field_f = 100;
        }
    }
}
