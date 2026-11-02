/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    long secondaryKey;
    DualLinkNode secondaryNext;
    static cg field_l;
    static volatile int field_j;
    DualLinkNode secondaryPrevious;
    static String field_o;
    static Sprite[] field_k;
    static int field_m;

    final void unlinkSecondary(byte param0) {
        if (null == this.secondaryPrevious) {
          return;
        }
        this.secondaryPrevious.secondaryNext = this.secondaryNext;
        this.secondaryNext.secondaryPrevious = this.secondaryPrevious;
        this.secondaryNext = null;
        this.secondaryPrevious = null;
        if (param0 >= -6) {
          this.secondaryNext = (DualLinkNode) null;
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
