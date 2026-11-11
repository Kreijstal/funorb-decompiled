/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    IntrusiveNode previous;
    static String field_b;
    IntrusiveNode next;
    long key;
    static String[] field_c;

    final void unlink(int obfuscationGuard) {
        if (this.previous == null) {
          return;
        }
        if (obfuscationGuard >= 0) {
          this.previous.next = this.next;
          this.next.previous = this.previous;
          this.next = null;
          this.previous = null;
          return;
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 < 67) {
          return;
        }
        field_c = null;
        field_b = null;
    }

    final static void reopenLoginForm(int param0) {
        pr.showLoginForm(param0 - 30497, BridgeTile.field_g, (String) null);
        if (param0 != 30497) {
          field_c = (String[]) null;
        }
    }

    final boolean isLinked(byte obfuscationGuard) {
        if (this.previous == null) {
          return false;
        }
        int var2 = -24 / ((-27 - obfuscationGuard) / 56);
        return true;
    }

    static {
        field_b = "Feng";
        field_c = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
