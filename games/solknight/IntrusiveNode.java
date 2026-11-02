/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static nc field_b;
    long key;
    IntrusiveNode next;
    IntrusiveNode previous;
    static Sprite field_e;
    static boolean[] field_f;
    static String field_c;

    final static void a(int param0, int param1) {
        td.field_l = param0;
        if (param1 != 10) {
          IntrusiveNode.b((byte) -29);
          ed.a((byte) -120);
          return;
        }
        ed.a((byte) -120);
    }

    public static void b(int param0) {
        if (param0 == 12516) {
          field_e = null;
          field_b = null;
          field_c = null;
          field_f = null;
          return;
        }
        field_f = (boolean[]) null;
        field_e = null;
        field_b = null;
        field_c = null;
        field_f = null;
    }

    final void unlink(int obfuscationGuard) {
        if (null == this.next) {
          return;
        }
        this.next.previous = this.previous;
        this.previous.next = this.next;
        this.next = null;
        this.previous = null;
        if (obfuscationGuard != 10) {
          IntrusiveNode.b(32);
        }
    }

    final boolean isLinked(boolean obfuscationGuard) {
        if (null == this.next) {
          return false;
        }
        if (obfuscationGuard) {
          field_e = (Sprite) null;
          return true;
        }
        return true;
    }

    final static boolean b(byte param0) {
        if (param0 != 89) {
          field_f = (boolean[]) null;
          return lb.g((byte) -94);
        }
        return lb.g((byte) -94);
    }

    static {
        field_f = new boolean[10];
        field_c = "Retry";
        field_b = new nc();
    }
}
