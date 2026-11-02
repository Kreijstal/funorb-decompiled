/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    IntrusiveNode previous;
    long key;
    IntrusiveNode next;
    static o field_e;
    static int field_c;

    final static String c(int param0) {
        if (param0 != 1) {
          IntrusiveNode.b(false);
          return se.field_p.a(param0 ^ -14);
        }
        return se.field_p.a(param0 ^ -14);
    }

    final boolean isLinked(byte obfuscationGuard) {
        int var2 = -51 / ((-50 - obfuscationGuard) / 46);
        if (this.previous == null) {
          return false;
        }
        return true;
    }

    final void unlink(int obfuscationGuard) {
        if (null == this.previous) {
          return;
        }
        this.previous.next = this.next;
        if (obfuscationGuard == 4) {
          this.next.previous = this.previous;
          this.next = null;
          this.previous = null;
          return;
        }
        field_c = 114;
        this.next.previous = this.previous;
        this.next = null;
        this.previous = null;
    }

    public static void b(boolean param0) {
        if (param0) {
          IntrusiveNode.b(false);
          field_e = null;
          return;
        }
        field_e = null;
    }

    static {
        field_e = new o(4, 1, 1, 1);
    }
}
