/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static int field_b;
    static long field_c;
    IntrusiveNode next;
    IntrusiveNode previous;
    static long field_f;
    long key;

    final static void a(byte param0) {
        wf.a((byte) -96, mk.g(param0 ^ -102));
        if (param0 != 18) {
          field_f = 121L;
        }
    }

    final void unlink(int obfuscationGuard) {
        if (null == this.previous) {
          return;
        }
        this.previous.next = this.next;
        this.next.previous = this.previous;
        if (obfuscationGuard > 81) {
          this.next = null;
          this.previous = null;
          return;
        }
    }

    final boolean isLinked(int obfuscationGuard) {
        if (this.previous == null) {
          return false;
        }
        int var2 = 22 / ((obfuscationGuard + 36) / 56);
        return true;
    }

    static {
        field_f = 20000000L;
    }
}
