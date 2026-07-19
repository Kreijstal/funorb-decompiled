/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends ti {
    int field_p;
    byte[] field_o;
    int field_q;
    boolean field_r;
    int field_s;

    final ud a(je param0) {
        int dupTemp$2 = 0;
        this.field_o = param0.a(14, this.field_o);
        this.field_p = param0.a(false, this.field_p);
        if (this.field_q == this.field_s) {
          dupTemp$2 = param0.b(this.field_q, 114);
          this.field_s = dupTemp$2;
          this.field_q = dupTemp$2;
          return (ud) (this);
        } else {
          L0: {
            this.field_q = param0.b(this.field_q, 86);
            this.field_s = param0.b(this.field_s, 36);
            if (this.field_q != this.field_s) {
              break L0;
            } else {
              this.field_q = this.field_q - 1;
              break L0;
            }
          }
          return (ud) (this);
        }
    }

    ud(int param0, byte[] param1, int param2, int param3) {
        this.field_p = param0;
        this.field_o = param1;
        this.field_q = param2;
        this.field_s = param3;
    }

    ud(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_p = param0;
        this.field_o = param1;
        this.field_q = param2;
        this.field_s = param3;
        this.field_r = param4 ? true : false;
    }
}
