/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends gb {
    int field_m;
    boolean field_o;
    int field_l;
    byte[] field_n;
    int field_p;

    final ud a(qh param0) {
        int dupTemp$2 = 0;
        this.field_n = param0.a(85, this.field_n);
        this.field_m = param0.a(this.field_m, 15);
        if (this.field_l == this.field_p) {
          dupTemp$2 = param0.b(this.field_l, -10689);
          this.field_p = dupTemp$2;
          this.field_l = dupTemp$2;
          return (ud) (this);
        } else {
          L0: {
            this.field_l = param0.b(this.field_l, -10689);
            this.field_p = param0.b(this.field_p, -10689);
            if (this.field_l != this.field_p) {
              break L0;
            } else {
              this.field_l = this.field_l - 1;
              break L0;
            }
          }
          return (ud) (this);
        }
    }

    ud(int param0, byte[] param1, int param2, int param3) {
        this.field_m = param0;
        this.field_n = param1;
        this.field_l = param2;
        this.field_p = param3;
    }

    ud(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_m = param0;
        this.field_n = param1;
        this.field_l = param2;
        this.field_p = param3;
        this.field_o = param4 ? true : false;
    }
}
