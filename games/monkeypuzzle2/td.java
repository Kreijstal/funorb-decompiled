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
        this.field_j = param0.a(false, this.field_j);
        this.field_f = param0.a(this.field_f, -98);
        if (this.field_i != this.field_g) {
          this.field_i = param0.a(this.field_i, (byte) 80);
          this.field_g = param0.a(this.field_g, (byte) 94);
          if (this.field_i == this.field_g) {
            this.field_i = this.field_i - 1;
          }
          return this;
        }
        int dupTemp$0 = param0.a(this.field_i, (byte) 44);
        this.field_g = dupTemp$0;
        this.field_i = dupTemp$0;
        return this;
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
