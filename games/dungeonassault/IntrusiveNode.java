/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    IntrusiveNode next;
    static hh field_b;
    IntrusiveNode previous;
    static long field_g;
    static gp field_c;
    long key;
    static String[] field_f;
    static cn field_d;

    final void unlink(boolean obfuscationGuard) {
        if (this.next != null) {
          this.next.previous = this.previous;
          this.previous.next = this.next;
          this.previous = null;
          this.next = null;
          if (obfuscationGuard) {
            field_d = (cn) null;
          }
          return;
        }
    }

    final boolean isLinked(int obfuscationGuard) {
        if (null == this.next) {
          return false;
        }
        if (obfuscationGuard >= -15) {
          field_f = (String[]) null;
          return true;
        }
        return true;
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 == -18880) {
          field_d = null;
          field_c = null;
          field_f = null;
          return;
        }
        field_c = (gp) null;
        field_d = null;
        field_c = null;
        field_f = null;
    }

    static {
        field_f = new String[]{"Pit Immunity", "Success against all pit traps."};
    }
}
