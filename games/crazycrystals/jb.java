/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jb {
    static String field_c;
    long field_e;
    jb field_d;
    jb field_b;
    static String field_a;

    final void a(boolean param0) {
        if (!param0) {
          if (null == ((jb) this).field_d) {
            return;
          } else {
            ((jb) this).field_d.field_b = ((jb) this).field_b;
            ((jb) this).field_b.field_d = ((jb) this).field_d;
            ((jb) this).field_b = null;
            ((jb) this).field_d = null;
            return;
          }
        } else {
          boolean discarded$7 = ((jb) this).b(-25);
          if (null == ((jb) this).field_d) {
            return;
          } else {
            ((jb) this).field_d.field_b = ((jb) this).field_b;
            ((jb) this).field_b.field_d = ((jb) this).field_d;
            ((jb) this).field_b = null;
            ((jb) this).field_d = null;
            return;
          }
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public static void c(int param0) {
        field_c = null;
        field_a = null;
    }

    final boolean b(int param0) {
        if (!(((jb) this).field_d != null)) {
            return false;
        }
        int var2 = -44 % ((param0 - 53) / 57);
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "members-only content";
        field_a = "Cancel";
    }
}
