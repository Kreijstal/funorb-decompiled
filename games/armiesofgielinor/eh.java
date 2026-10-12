/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    int[] field_a;
    int field_b;
    int field_d;
    int[] field_c;

    eh() {
        int var1 = 0;
        VorbisSample.a(16);
        this.field_b = VorbisSample.a() != 0 ? VorbisSample.a(4) + 1 : 1;
        if (VorbisSample.a() != 0) {
          VorbisSample.a(8);
        }
        VorbisSample.a(2);
        if (this.field_b > 1) {
          this.field_d = VorbisSample.a(4);
        }
        this.field_c = new int[this.field_b];
        this.field_a = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
          VorbisSample.a(8);
          this.field_c[var1] = VorbisSample.a(8);
          this.field_a[var1] = VorbisSample.a(8);
        }
    }
}
