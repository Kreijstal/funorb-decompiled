/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_a;
    volatile boolean field_b;

    final static void a(java.awt.Canvas param0, int param1) {
        if (!(param1 != (ob.field_d ^ -1))) {
            st.a((byte) 87);
        }
        hr.a(ct.field_I, 0, w.field_a, dq.field_b);
        ps.a(0, false, param0, 0);
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((hj) this).field_b = true;
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(byte param0, rk param1) {
        ke.a(973, param1, ((hj) this).field_a);
        if (param0 != 87) {
            java.awt.Canvas var4 = (java.awt.Canvas) null;
            hj.a((java.awt.Canvas) null, 95);
        }
    }

    final static ll a(boolean param0, int param1, int param2, gk param3) {
        if (param0) {
            return (ll) null;
        }
        if (!tn.a(param3, (byte) -127, param1, param2)) {
            return null;
        }
        return fu.b(30346);
    }

    hj() {
    }

    static {
    }
}
