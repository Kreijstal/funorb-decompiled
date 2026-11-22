/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    int field_d;
    int[] field_a;
    int field_b;
    int[] field_c;

    oa() {
        int var1 = 0;
        ho.readBits(16);
        this.field_d = ho.readBit() != 0 ? ho.readBits(4) + 1 : 1;
        if (ho.readBit() != 0) {
          ho.readBits(8);
        }
        ho.readBits(2);
        if (this.field_d > 1) {
          this.field_b = ho.readBits(4);
        }
        this.field_c = new int[this.field_d];
        this.field_a = new int[this.field_d];
        for (var1 = 0; var1 < this.field_d; var1++) {
          ho.readBits(8);
          this.field_c[var1] = ho.readBits(8);
          this.field_a[var1] = ho.readBits(8);
        }
    }
}
