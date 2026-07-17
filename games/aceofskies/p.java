/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends wf implements e {
    int field_g;
    private static boolean field_e;
    long field_nativeid;
    private static long field_f;
    int field_h;
    java.awt.Canvas field_i;

    public final native void w(boolean param0);

    private final native void sa(oa param0, java.awt.Canvas param1, int param2, int param3);

    final void a(java.awt.Canvas param0, int param1, int param2) {
        ((p) this).field_h = param1;
        ((p) this).field_g = param2;
        this.oa(param0, param1, param2);
    }

    private final void a(Exception param0) {
        if (field_e) {
          if (kh.a(-65) - field_f < 30000L) {
            ((p) this).field_i.repaint();
            return;
          } else {
            throw new RuntimeException(param0.getMessage());
          }
        } else {
          field_f = kh.a(-115);
          field_e = true;
          return;
        }
    }

    final void a(int param0, int param1) {
        java.awt.Dimension var4 = null;
        synchronized (((p) this).field_i.getTreeLock()) {
            var4 = ((p) this).field_i.getSize();
            this.H(param0, param1, var4.width, var4.height);
            field_e = false;
        }
    }

    protected final void finalize() {
        if (((p) this).field_nativeid != 0L) {
            vk.a((e) this, -112);
            return;
        }
    }

    private final native void H(int param0, int param1, int param2, int param3);

    private final native void oa(java.awt.Canvas param0, int param1, int param2);

    p(oa param0, java.awt.Canvas param1, int param2, int param3) {
        ((p) this).field_i = param1;
        ((p) this).field_h = param2;
        ((p) this).field_g = param3;
        this.sa(param0, ((p) this).field_i, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
    }
}
