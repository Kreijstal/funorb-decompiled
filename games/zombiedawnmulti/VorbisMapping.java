/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisMapping {
    int[] field_b;
    int field_d;
    int field_c;
    int[] field_a;

    VorbisMapping() {
        int var1 = 0;
        VorbisSample.a(16);
        this.field_c = VorbisSample.b() != 0 ? VorbisSample.a(4) + 1 : 1;
        if (VorbisSample.b() != 0) {
          VorbisSample.a(8);
        }
        VorbisSample.a(2);
        if (this.field_c > 1) {
          this.field_d = VorbisSample.a(4);
        }
        this.field_b = new int[this.field_c];
        this.field_a = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
          VorbisSample.a(8);
          this.field_b[var1] = VorbisSample.a(8);
          this.field_a[var1] = VorbisSample.a(8);
        }
    }
}
