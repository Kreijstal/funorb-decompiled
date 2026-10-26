/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    long key;
    static hd field_d;
    IntrusiveNode previous;
    IntrusiveNode next;

    final void unlink(int obfuscationGuard) {
        if (this.previous == null) {
          return;
        }
        this.previous.next = this.next;
        this.next.previous = this.previous;
        this.next = null;
        if (obfuscationGuard < -122) {
          this.previous = null;
          return;
        }
        this.next = (IntrusiveNode) null;
        this.previous = null;
    }

    final boolean isLinked(byte obfuscationGuard) {
        if (obfuscationGuard < 80) {
          this.next = (IntrusiveNode) null;
          if (this.previous != null) {
            return true;
          }
          return false;
        }
        if (this.previous != null) {
          return true;
        }
        return false;
    }

    public static void b(int param0) {
        field_d = null;
        int var1 = -7 % ((param0 - 12) / 47);
    }

    final static void a(long param0, boolean param1) {
        if (0L >= param0) {
          return;
        }
        if (param0 % 10L != 0L) {
          ci.a(param0, (byte) 105);
          if (param1) {
            field_d = (hd) null;
            return;
          }
          return;
        }
        ci.a(param0 - 1L, (byte) 127);
        ci.a(1L, (byte) 104);
        if (param1) {
          field_d = (hd) null;
          return;
        }
    }

    static {
        field_d = new hd(1);
    }
}
