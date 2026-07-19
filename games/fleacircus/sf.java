/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends jf {
    int field_j;
    boolean field_n;
    int field_k;
    byte[] field_l;
    int field_m;

    final sf a(ci param0) {
        int dupTemp$2 = 0;
        this.field_l = param0.a(this.field_l, -108);
        this.field_k = param0.b(this.field_k, 14698);
        if (this.field_m == this.field_j) {
          dupTemp$2 = param0.a(this.field_m, 18308);
          this.field_j = dupTemp$2;
          this.field_m = dupTemp$2;
          return (sf) (this);
        } else {
          L0: {
            this.field_m = param0.a(this.field_m, 18308);
            this.field_j = param0.a(this.field_j, 18308);
            if (this.field_m != this.field_j) {
              break L0;
            } else {
              this.field_m = this.field_m - 1;
              break L0;
            }
          }
          return (sf) (this);
        }
    }

    sf(int param0, int param1) {
        this.field_k = param0;
        this.field_l = new byte[param1];
        this.field_m = 0;
        this.field_j = param1;
    }

    sf(int param0, byte[] param1, int param2, int param3) {
        this.field_k = param0;
        this.field_l = param1;
        this.field_m = param2;
        this.field_j = param3;
    }

    sf(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_k = param0;
        this.field_l = param1;
        this.field_m = param2;
        this.field_j = param3;
        this.field_n = param4 ? true : false;
    }
}
