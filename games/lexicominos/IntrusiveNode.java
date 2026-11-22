/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static java.security.SecureRandom field_e;
    static int[] field_b;
    IntrusiveNode next;
    long key;
    static int field_a;
    static int[] field_g;
    IntrusiveNode previous;

    final boolean isLinked(boolean param0) {
        if (null == this.previous) {
          return false;
        }
        if (param0) {
          return true;
        }
        return true;
    }

    final void unlink(byte param0) {
        if (this.previous == null) {
          return;
        }
        this.previous.next = this.next;
        this.next.previous = this.previous;
        this.previous = null;
        if (param0 < -115) {
          this.next = null;
          return;
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          field_g = null;
          field_b = null;
          field_e = null;
          return;
        }
        IntrusiveNode.b(false);
        field_g = null;
        field_b = null;
        field_e = null;
    }

    static {
        field_b = new int[8192];
        field_g = new int[8192];
    }
}
