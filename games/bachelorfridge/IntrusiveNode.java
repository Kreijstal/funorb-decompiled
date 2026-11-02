/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    IntrusiveNode next;
    static sna field_a;
    long key;
    IntrusiveNode previous;
    static String field_d;

    public static void b(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 != 127) {
          IntrusiveNode.b((byte) 117);
        }
    }

    final void unlink(boolean param0) {
        if (this.previous == null) {
          return;
        }
        if (!param0) {
          this.previous.next = this.next;
          this.next.previous = this.previous;
          this.previous = null;
          this.next = null;
          return;
        }
    }

    final boolean isLinked(byte param0) {
        if (null == this.previous) {
          return false;
        }
        if (param0 != -106) {
          field_a = (sna) null;
          return true;
        }
        return true;
    }

    static {
        field_d = "<%0> would need a rating of <%1> to play with the current options.";
    }
}
