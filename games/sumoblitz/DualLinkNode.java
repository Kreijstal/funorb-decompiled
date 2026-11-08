/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    static ts field_n;
    DualLinkNode secondaryNext;
    DualLinkNode secondaryPrevious;
    static int[] field_k;
    static int[] field_q;
    static long field_p;
    long secondaryKey;

    final void unlinkSecondary(int param0) {
        if (this.secondaryPrevious == null) {
          return;
        }
        if (param0 == -5106) {
          this.secondaryPrevious.secondaryNext = this.secondaryNext;
          this.secondaryNext.secondaryPrevious = this.secondaryPrevious;
          this.secondaryNext = null;
          this.secondaryPrevious = null;
          return;
        }
        field_q = (int[]) null;
        this.secondaryPrevious.secondaryNext = this.secondaryNext;
        this.secondaryNext.secondaryPrevious = this.secondaryPrevious;
        this.secondaryNext = null;
        this.secondaryPrevious = null;
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        field_k = null;
        if (param0 <= 27) {
          return;
        }
        field_q = null;
    }

    protected DualLinkNode() {
    }

    static {
        field_q = new int[1];
        field_p = 20000000L;
        field_k = new int[13];
        field_n = new ts(9, 0, 4, 1);
    }
}
