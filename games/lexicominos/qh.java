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
        sd.a(16);
        this.field_b = sd.a() != 0 ? sd.a(4) + 1 : 1;
        if (sd.a() != 0) {
            sd.a(8);
        }
        sd.a(2);
        if (this.field_b > 1) {
            this.field_c = sd.a(4);
        }
        this.field_d = new int[this.field_b];
        this.field_a = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            sd.a(8);
            this.field_d[var1] = sd.a(8);
            this.field_a[var1] = sd.a(8);
        }
    }
}
