/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qb {
    static int field_b;
    static long field_c;
    qb field_d;
    qb field_a;
    static long field_f;
    long field_e;

    final static void a(byte param0) {
        wf.a((byte) -96, mk.g(param0 ^ -102));
        if (param0 != 18) {
            field_f = 121L;
        }
    }

    final void c(int param0) {
        if (null != this.field_a) {
          this.field_a.field_d = this.field_d;
          this.field_d.field_a = this.field_a;
          if (param0 <= 81) {
            return;
          } else {
            this.field_d = null;
            this.field_a = null;
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(int param0) {
        if (!(this.field_a != null)) {
            return false;
        }
        int var2 = 22 / ((param0 - -36) / 56);
        return true;
    }

    static {
        field_f = 20000000L;
    }
}
