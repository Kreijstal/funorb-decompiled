/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    static String field_h;
    DualLinkNode secondaryPrevious;
    static llb field_f;
    DualLinkNode secondaryNext;
    long secondaryKey;
    static String field_j;
    static llb field_g;

    final boolean isSecondaryLinked(byte param0) {
        if (param0 < 26) {
          return true;
        }
        if (this.secondaryPrevious == null) {
          return false;
        }
        return true;
    }

    final void setSecondaryKey(long param0, byte param1) {
        if (this.secondaryPrevious != null) {
          throw new RuntimeException();
        }
        this.secondaryKey = param0;
        if (param1 == 83) {
          return;
        }
        field_g = (llb) null;
    }

    final long getSecondaryKey(int param0) {
        if (param0 != 26390) {
          this.secondaryKey = 5L;
          return this.secondaryKey;
        }
        return this.secondaryKey;
    }

    final void unlinkSecondary(byte param0) {
        if (this.secondaryPrevious == null) {
          return;
        }
        if (param0 == -35) {
          this.secondaryPrevious.secondaryNext = this.secondaryNext;
          this.secondaryNext.secondaryPrevious = this.secondaryPrevious;
          this.secondaryNext = null;
          this.secondaryPrevious = null;
          return;
        }
        this.secondaryPrevious = (DualLinkNode) null;
        this.secondaryPrevious.secondaryNext = this.secondaryNext;
        this.secondaryNext.secondaryPrevious = this.secondaryPrevious;
        this.secondaryNext = null;
        this.secondaryPrevious = null;
    }

    public static void clearSharedReferences(int param0) {
        field_f = null;
        field_g = null;
        field_j = null;
        if (param0 != -31049) {
          field_j = (String) null;
          field_h = null;
          return;
        }
        field_h = null;
    }

    protected DualLinkNode() {
    }

    static {
        field_j = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_h = "Free";
    }
}
