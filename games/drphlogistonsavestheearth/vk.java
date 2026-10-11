/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends me {
    int field_j;
    byte[] field_i;
    int field_l;
    int field_k;
    boolean field_m;

    final vk a(ng param0) {
        this.field_i = param0.a(this.field_i, (byte) -128);
        this.field_j = param0.a((byte) -128, this.field_j);
        if (this.field_k != this.field_l) {
          this.field_k = param0.a(this.field_k, (byte) 101);
          this.field_l = param0.a(this.field_l, (byte) 101);
          if (this.field_k == this.field_l) {
            this.field_k = this.field_k - 1;
          }
          return this;
        }
        int dupTemp$0 = param0.a(this.field_k, (byte) 101);
        this.field_l = dupTemp$0;
        this.field_k = dupTemp$0;
        return this;
    }

    vk(int param0, int param1) {
        this.field_j = param0;
        this.field_i = new byte[param1];
        this.field_k = 0;
        this.field_l = param1;
    }

    vk(int param0, byte[] param1, int param2, int param3) {
        this.field_j = param0;
        this.field_i = param1;
        this.field_k = param2;
        this.field_l = param3;
    }

    vk(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_j = param0;
        this.field_i = param1;
        this.field_k = param2;
        this.field_l = param3;
        this.field_m = param4 ? true : false;
    }
}
