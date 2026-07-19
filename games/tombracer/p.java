/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends vg implements e {
    java.awt.Canvas field_f;
    private static boolean field_g;
    int field_i;
    long field_nativeid;
    int field_h;
    private static long field_j;

    private final native void oa(java.awt.Canvas param0, int param1, int param2);

    public final native void w(boolean param0);

    private final void a(Exception param0) {
        if (field_g) {
          if (bva.b((byte) -107) - field_j < 30000L) {
            this.field_f.repaint();
            return;
          } else {
            throw new RuntimeException(param0.getMessage());
          }
        } else {
          field_j = bva.b((byte) -107);
          field_g = true;
          return;
        }
    }

    final void a(java.awt.Canvas param0, int param1, int param2) {
        this.field_i = param1;
        this.field_h = param2;
        this.oa(param0, param1, param2);
    }

    private final native void H(int param0, int param1, int param2, int param3);

    final void a(int param0, int param1) {
        java.awt.Dimension var4 = null;
        synchronized (this.field_f.getTreeLock()) {
            var4 = this.field_f.getSize();
            this.H(param0, param1, var4.width, var4.height);
            field_g = false;
        }
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
            ho.a(-1, (e) (this));
            return;
        }
    }

    private final native void sa(oa param0, java.awt.Canvas param1, int param2, int param3);

    p(oa param0, java.awt.Canvas param1, int param2, int param3) {
        this.field_f = param1;
        this.field_i = param2;
        this.field_h = param3;
        this.sa(param0, this.field_f, param2, param3);
    }

    static {
        field_g = false;
    }
}
