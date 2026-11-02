/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    IntrusiveNode previous;
    long key;
    static String field_b;
    IntrusiveNode next;

    public static void b(int param0) {
        field_b = null;
        if (param0 != -1733) {
          field_b = (String) null;
        }
    }

    final boolean isLinked(int obfuscationGuard) {
        if (obfuscationGuard == -3548) {
          return this.next != null ? true : false;
        }
        this.previous = (IntrusiveNode) null;
        if (this.next == null) {
          return false;
        }
        return true;
    }

    final void unlink(int obfuscationGuard) {
        if (null == this.next) {
          return;
        }
        this.next.previous = this.previous;
        if (obfuscationGuard == -19822) {
          this.previous.next = this.next;
          this.previous = null;
          this.next = null;
          return;
        }
        this.key = -48L;
        this.previous.next = this.next;
        this.previous = null;
        this.next = null;
    }

    static {
    }
}
