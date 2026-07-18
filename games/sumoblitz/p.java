/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends ms implements e {
    private static long field_n;
    int field_m;
    private static boolean field_k;
    java.awt.Canvas field_o;
    int field_l;
    long field_nativeid;

    private final void a(Exception param0) {
        if (field_k) {
          if (wq.a(-120) - field_n < 30000L) {
            ((p) this).field_o.repaint();
            return;
          } else {
            throw new RuntimeException(param0.getMessage());
          }
        } else {
          field_n = wq.a(-119);
          field_k = true;
          return;
        }
    }

    final void a(int param0, int param1) {
        java.awt.Dimension var4 = null;
        synchronized (((p) this).field_o.getTreeLock()) {
            var4 = ((p) this).field_o.getSize();
            this.H(param0, param1, var4.width, var4.height);
            field_k = false;
        }
    }

    private final native void oa(java.awt.Canvas param0, int param1, int param2);

    private final native void sa(oa param0, java.awt.Canvas param1, int param2, int param3);

    final void a(java.awt.Canvas param0, int param1, int param2) {
        ((p) this).field_m = param1;
        ((p) this).field_l = param2;
        this.oa(param0, param1, param2);
    }

    private final native void H(int param0, int param1, int param2, int param3);

    public final native void w(boolean param0);

    protected final void finalize() {
        if (((p) this).field_nativeid != 0L) {
            pa.a((e) this, (byte) -37);
            return;
        }
    }

    p(oa param0, java.awt.Canvas param1, int param2, int param3) {
        ((p) this).field_o = param1;
        ((p) this).field_m = param2;
        ((p) this).field_l = param3;
        this.sa(param0, ((p) this).field_o, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
    }
}
