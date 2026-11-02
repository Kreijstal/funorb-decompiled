/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    int field_c;
    int[] field_b;
    int[] field_d;
    int field_a;

    ig() {
        int var1 = 0;
        VorbisSample.d(16);
        this.field_c = VorbisSample.a() != 0 ? VorbisSample.d(4) + 1 : 1;
        if (VorbisSample.a() != 0) {
          VorbisSample.d(8);
        }
        VorbisSample.d(2);
        if (this.field_c > 1) {
          this.field_a = VorbisSample.d(4);
        }
        this.field_d = new int[this.field_c];
        this.field_b = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
          VorbisSample.d(8);
          this.field_d[var1] = VorbisSample.d(8);
          this.field_b[var1] = VorbisSample.d(8);
        }
    }
}
