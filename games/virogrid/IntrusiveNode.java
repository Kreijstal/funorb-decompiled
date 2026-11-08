/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    IntrusiveNode next;
    long key;
    static IntrusiveDeque field_c;
    static SpriteWidget field_b;
    static String field_e;
    IntrusiveNode previous;

    final boolean isLinked(boolean param0) {
        if (null == this.next) {
          return false;
        }
        if (param0) {
          field_b = (SpriteWidget) null;
          return true;
        }
        return true;
    }

    final void unlink(boolean param0) {
        if (param0) {
          return;
        }
        if (this.next == null) {
          return;
        }
        this.next.previous = this.previous;
        this.previous.next = this.next;
        this.next = null;
        this.previous = null;
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != -6325) {
          return;
        }
        field_e = null;
        field_c = null;
    }

    static {
        field_c = new IntrusiveDeque();
        field_e = "(<%0> players want to join)";
    }
}
