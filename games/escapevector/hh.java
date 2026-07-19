/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends nh {
    int field_l;
    boolean field_i;
    int field_k;
    int field_j;
    byte[] field_h;

    final hh a(dd param0) {
        int dupTemp$2 = 0;
        this.field_h = param0.a(-128, this.field_h);
        this.field_j = param0.a(this.field_j, (byte) -87);
        if (this.field_k == this.field_l) {
          dupTemp$2 = param0.a(false, this.field_k);
          this.field_l = dupTemp$2;
          this.field_k = dupTemp$2;
          return (hh) (this);
        } else {
          L0: {
            this.field_k = param0.a(false, this.field_k);
            this.field_l = param0.a(false, this.field_l);
            if (this.field_k != this.field_l) {
              break L0;
            } else {
              this.field_k = this.field_k - 1;
              break L0;
            }
          }
          return (hh) (this);
        }
    }

    hh(int param0, byte[] param1, int param2, int param3) {
        this.field_j = param0;
        this.field_h = param1;
        this.field_k = param2;
        this.field_l = param3;
    }

    hh(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_j = param0;
        this.field_h = param1;
        this.field_k = param2;
        this.field_l = param3;
        this.field_i = param4 ? true : false;
    }
}
