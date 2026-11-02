/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static Sprite[] field_a;
    static String field_e;
    static int field_g;
    IntrusiveNode next;
    IntrusiveNode previous;
    static volatile int field_c;
    long key;

    public static void b(byte param0) {
        field_e = null;
        if (param0 != 61) {
          field_c = -123;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final void unlink(int param0) {
        if (this.next == null) {
          return;
        }
        this.next.previous = this.previous;
        this.previous.next = this.next;
        if (param0 == -27598) {
          this.previous = null;
          this.next = null;
          return;
        }
    }

    final boolean a(byte param0) {
        if (param0 == 73) {
          return this.next != null ? true : false;
        }
        field_c = 68;
        if (this.next == null) {
          return false;
        }
        return true;
    }

    static {
        field_e = "Visit the Account Management section on the main site to view.";
        field_c = 0;
    }
}
