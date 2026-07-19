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
        boolean discarded$7 = false;
        if (!param0) {
          if (null == this.field_d) {
            return;
          } else {
            this.field_d.field_b = this.field_b;
            this.field_b.field_d = this.field_d;
            this.field_b = null;
            this.field_d = null;
            return;
          }
        } else {
          discarded$7 = this.b(-25);
          if (null == this.field_d) {
            return;
          } else {
            this.field_d.field_b = this.field_b;
            this.field_b.field_d = this.field_d;
            this.field_b = null;
            this.field_d = null;
            return;
          }
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public static void c(int param0) {
        field_c = null;
        if (param0 != -24894) {
            field_a = (String) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final boolean b(int param0) {
        if (!(this.field_d != null)) {
            return false;
        }
        int var2 = -44 % ((param0 - 53) / 57);
        return true;
    }

    static {
        field_c = "members-only content";
        field_a = "Cancel";
    }
}
