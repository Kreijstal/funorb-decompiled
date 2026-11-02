/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    long field_n;
    DualLinkNode field_i;
    static cg field_l;
    static volatile int field_j;
    DualLinkNode field_h;
    static String field_o;
    static Sprite[] field_k;
    static int field_m;

    final void c(byte param0) {
        if (null == this.field_h) {
          return;
        }
        this.field_h.field_i = this.field_i;
        this.field_i.field_h = this.field_h;
        this.field_i = null;
        this.field_h = null;
        if (param0 >= -6) {
          this.field_i = (DualLinkNode) null;
        }
    }

    public static void a(int param0) {
        if (param0 <= -22) {
          field_o = null;
          field_k = null;
          field_l = null;
          return;
        }
        field_k = (Sprite[]) null;
        field_o = null;
        field_k = null;
        field_l = null;
    }

    final static boolean c(int param0) {
        if (param0 != 0) {
          return false;
        }
        return vh.field_c == tk.field_a ? true : false;
    }

    protected DualLinkNode() {
    }

    static {
        field_j = 0;
        field_o = "Waiting for graphics";
        field_l = new cg(12, 0, 1, 0);
    }
}
