/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_b;
    java.awt.Frame field_a;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(uf param0, int param1) {
        sg.a(((ih) this).field_a, (byte) -105, param0);
        if (param1 != 5474) {
            Object var4 = null;
            ((ih) this).a((uf) null, -112);
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    ih() {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((ih) this).field_b = true;
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
    }
}
