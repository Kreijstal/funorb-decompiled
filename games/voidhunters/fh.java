/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fh extends ksa {
    static String field_h;
    fh field_d;
    static llb field_f;
    fh field_e;
    long field_i;
    static String field_j;
    static llb field_g;

    final boolean c(byte param0) {
        if (param0 < 26) {
            return true;
        }
        if (this.field_d == null) {
            return false;
        }
        return true;
    }

    final void a(long param0, byte param1) {
        if (this.field_d != null) {
          throw new RuntimeException();
        } else {
          this.field_i = param0;
          if (param1 != 83) {
            field_g = (llb) null;
            return;
          } else {
            return;
          }
        }
    }

    final long c(int param0) {
        if (param0 != 26390) {
            this.field_i = 5L;
            return this.field_i;
        }
        return this.field_i;
    }

    final void d(byte param0) {
        if (this.field_d == null) {
          return;
        } else {
          if (param0 != -35) {
            this.field_d = (fh) null;
            this.field_d.field_e = this.field_e;
            this.field_e.field_d = this.field_d;
            this.field_e = null;
            this.field_d = null;
            return;
          } else {
            this.field_d.field_e = this.field_e;
            this.field_e.field_d = this.field_d;
            this.field_e = null;
            this.field_d = null;
            return;
          }
        }
    }

    public static void d(int param0) {
        field_f = null;
        field_g = null;
        field_j = null;
        if (param0 != -31049) {
            field_j = (String) null;
            field_h = null;
            return;
        }
        field_h = null;
    }

    protected fh() {
    }

    static {
        field_j = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_h = "Free";
    }
}
