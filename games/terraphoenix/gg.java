/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends id {
    int field_j;
    int field_m;
    int field_l;
    byte[] field_k;
    boolean field_i;

    final gg a(m param0) {
        int dupTemp$2 = 0;
        this.field_k = param0.a((byte) 109, this.field_k);
        this.field_l = param0.a(this.field_l, true);
        if (this.field_j == this.field_m) {
          dupTemp$2 = param0.a((byte) 46, this.field_j);
          this.field_m = dupTemp$2;
          this.field_j = dupTemp$2;
          return (gg) (this);
        } else {
          L0: {
            this.field_j = param0.a((byte) 46, this.field_j);
            this.field_m = param0.a((byte) 46, this.field_m);
            if (this.field_j != this.field_m) {
              break L0;
            } else {
              this.field_j = this.field_j - 1;
              break L0;
            }
          }
          return (gg) (this);
        }
    }

    gg(int param0, byte[] param1, int param2, int param3) {
        this.field_l = param0;
        this.field_k = param1;
        this.field_j = param2;
        this.field_m = param3;
    }

    gg(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_l = param0;
        this.field_k = param1;
        this.field_j = param2;
        this.field_m = param3;
        this.field_i = param4 ? true : false;
    }
}
