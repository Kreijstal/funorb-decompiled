/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisMapping {
    int field_a;
    int[] field_d;
    int[] field_b;
    int field_c;

    VorbisMapping() {
        int var1 = 0;
        VorbisSample.f(16);
        this.field_a = VorbisSample.c() != 0 ? VorbisSample.f(4) + 1 : 1;
        if (VorbisSample.c() != 0) {
          VorbisSample.f(8);
        }
        VorbisSample.f(2);
        if (this.field_a > 1) {
          this.field_c = VorbisSample.f(4);
        }
        this.field_d = new int[this.field_a];
        this.field_b = new int[this.field_a];
        for (var1 = 0; var1 < this.field_a; var1++) {
          VorbisSample.f(8);
          this.field_d[var1] = VorbisSample.f(8);
          this.field_b[var1] = VorbisSample.f(8);
        }
    }
}
