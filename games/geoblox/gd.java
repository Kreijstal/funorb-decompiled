/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends e {
    int field_g;
    int field_h;
    int field_j;
    boolean field_i;
    byte[] field_k;

    final gd a(ue param0) {
        this.field_k = param0.a(99, this.field_k);
        this.field_h = param0.a(-128, this.field_h);
        if (this.field_g != this.field_j) {
            this.field_g = param0.b(this.field_g, 6);
            this.field_j = param0.b(this.field_j, 6);
            if (this.field_g == this.field_j) {
                this.field_g = this.field_g - 1;
            }
            return this;
        }
        int dupTemp$0 = param0.b(this.field_g, 6);
        this.field_j = dupTemp$0;
        this.field_g = dupTemp$0;
        return this;
    }

    gd(int param0, byte[] param1, int param2, int param3) {
        this.field_h = param0;
        this.field_k = param1;
        this.field_g = param2;
        this.field_j = param3;
    }

    gd(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_h = param0;
        this.field_k = param1;
        this.field_g = param2;
        this.field_j = param3;
        this.field_i = param4 ? true : false;
    }
}
