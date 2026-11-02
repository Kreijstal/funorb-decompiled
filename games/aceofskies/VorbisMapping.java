/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisMapping {
    int field_d;
    int[] field_c;
    int[] field_b;
    int field_a;

    VorbisMapping() {
        VorbisSample.d(16);
        this.field_a = VorbisSample.b() != 0 ? VorbisSample.d(4) + 1 : 1;
        if (VorbisSample.b() != 0) {
          VorbisSample.d(8);
        }
        VorbisSample.d(2);
        if (this.field_a > 1) {
          this.field_d = VorbisSample.d(4);
        }
        this.field_c = new int[this.field_a];
        this.field_b = new int[this.field_a];
        for (int var1 = 0; var1 < this.field_a; var1++) {
          VorbisSample.d(8);
          this.field_c[var1] = VorbisSample.d(8);
          this.field_b[var1] = VorbisSample.d(8);
        }
    }
}
