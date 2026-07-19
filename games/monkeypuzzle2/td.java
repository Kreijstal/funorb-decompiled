/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends jl {
    int field_f;
    boolean field_h;
    int field_g;
    int field_i;
    byte[] field_j;

    final td a(o param0) {
        int dupTemp$2 = 0;
        this.field_j = param0.a(false, this.field_j);
        this.field_f = param0.a(this.field_f, -98);
        if (this.field_i == this.field_g) {
          dupTemp$2 = param0.a(this.field_i, (byte) 44);
          this.field_g = dupTemp$2;
          this.field_i = dupTemp$2;
          return (td) (this);
        } else {
          L0: {
            this.field_i = param0.a(this.field_i, (byte) 80);
            this.field_g = param0.a(this.field_g, (byte) 94);
            if (this.field_i != this.field_g) {
              break L0;
            } else {
              this.field_i = this.field_i - 1;
              break L0;
            }
          }
          return (td) (this);
        }
    }

    td(int param0, byte[] param1, int param2, int param3) {
        this.field_f = param0;
        this.field_j = param1;
        this.field_i = param2;
        this.field_g = param3;
    }

    td(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_f = param0;
        this.field_j = param1;
        this.field_i = param2;
        this.field_g = param3;
        this.field_h = param4 ? true : false;
    }
}
