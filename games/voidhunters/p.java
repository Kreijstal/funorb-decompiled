/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends ksa implements e {
    int field_g;
    private static boolean field_d;
    java.awt.Canvas field_f;
    int field_e;
    long field_nativeid;
    private static long field_h;

    private final native void sa(oa param0, java.awt.Canvas param1, int param2, int param3);

    final void a(int param0, int param1) {
        java.awt.Dimension var4 = null;
        synchronized (((p) this).field_f.getTreeLock()) {
            var4 = ((p) this).field_f.getSize();
            this.H(param0, param1, var4.width, var4.height);
            field_d = false;
        }
    }

    public final native void w(boolean param0);

    private final native void oa(java.awt.Canvas param0, int param1, int param2);

    private final native void H(int param0, int param1, int param2, int param3);

    private final void a(Exception param0) {
        if (field_d) {
          if (wt.a(false) - field_h < 30000L) {
            ((p) this).field_f.repaint();
            return;
          } else {
            throw new RuntimeException(param0.getMessage());
          }
        } else {
          field_h = wt.a(false);
          field_d = true;
          return;
        }
    }

    p(oa param0, java.awt.Canvas param1, int param2, int param3) {
        ((p) this).field_f = param1;
        ((p) this).field_e = param2;
        ((p) this).field_g = param3;
        this.sa(param0, ((p) this).field_f, param2, param3);
    }

    final void a(java.awt.Canvas param0, int param1, int param2) {
        ((p) this).field_e = param1;
        ((p) this).field_g = param2;
        this.oa(param0, param1, param2);
    }

    protected final void finalize() {
        if (((p) this).field_nativeid != 0L) {
            pq.a(0, (e) this);
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
    }
}
