/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends kf {
    byte[] field_k;
    boolean field_j;
    int field_m;
    int field_n;
    int field_l;

    final je a(i param0) {
        int dupTemp$2 = 0;
        this.field_k = param0.a((byte) 47, this.field_k);
        this.field_m = param0.a(true, this.field_m);
        if (this.field_n == this.field_l) {
          dupTemp$2 = param0.a((byte) 127, this.field_n);
          this.field_l = dupTemp$2;
          this.field_n = dupTemp$2;
          return (je) (this);
        } else {
          L0: {
            this.field_n = param0.a((byte) 127, this.field_n);
            this.field_l = param0.a((byte) 127, this.field_l);
            if (this.field_n != this.field_l) {
              break L0;
            } else {
              this.field_n = this.field_n - 1;
              break L0;
            }
          }
          return (je) (this);
        }
    }

    je(int param0, byte[] param1, int param2, int param3) {
        this.field_m = param0;
        this.field_k = param1;
        this.field_n = param2;
        this.field_l = param3;
    }

    je(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_m = param0;
        this.field_k = param1;
        this.field_n = param2;
        this.field_l = param3;
        this.field_j = param4 ? true : false;
    }
}
