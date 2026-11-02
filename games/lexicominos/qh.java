/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    int field_b;
    int field_c;
    int[] field_d;
    int[] field_a;

    qh() {
        int var1 = 0;
        VorbisSample.a(16);
        this.field_b = VorbisSample.a() != 0 ? VorbisSample.a(4) + 1 : 1;
        if (VorbisSample.a() != 0) {
          VorbisSample.a(8);
        }
        VorbisSample.a(2);
        if (this.field_b > 1) {
          this.field_c = VorbisSample.a(4);
        }
        this.field_d = new int[this.field_b];
        this.field_a = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
          VorbisSample.a(8);
          this.field_d[var1] = VorbisSample.a(8);
          this.field_a[var1] = VorbisSample.a(8);
        }
    }
}
