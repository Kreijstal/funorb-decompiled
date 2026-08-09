/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends ef {
    int field_j;
    int field_l;
    byte[] field_k;
    int field_i;
    boolean field_m;

    final jb a(nm param0) {
        int dupTemp$1 = 0;
        this.field_k = param0.a(this.field_k, 0);
        this.field_j = param0.a(this.field_j, true);
        if (this.field_l == this.field_i) {
          dupTemp$1 = param0.a(this.field_l, (byte) -59);
          this.field_i = dupTemp$1;
          this.field_l = dupTemp$1;
          return (jb) (this);
        } else {
          L0: {
            this.field_l = param0.a(this.field_l, (byte) -59);
            this.field_i = param0.a(this.field_i, (byte) -59);
            if (this.field_l != this.field_i) {
              break L0;
            } else {
              this.field_l = this.field_l - 1;
              break L0;
            }
          }
          return (jb) (this);
        }
    }

    jb(int param0, byte[] param1, int param2, int param3) {
        this.field_j = param0;
        this.field_k = param1;
        this.field_l = param2;
        this.field_i = param3;
    }

    jb(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_j = param0;
        this.field_k = param1;
        this.field_l = param2;
        this.field_i = param3;
        this.field_m = param4 ? true : false;
    }
}
