/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    int[] field_b;
    int field_c;
    int[] field_d;
    int field_a;

    ia() {
        int var1 = 0;
        ph.b(16);
        this.field_a = ph.a() != 0 ? ph.b(4) + 1 : 1;
        if (ph.a() != 0) {
            ph.b(8);
        }
        ph.b(2);
        if (this.field_a > 1) {
            this.field_c = ph.b(4);
        }
        this.field_b = new int[this.field_a];
        this.field_d = new int[this.field_a];
        for (var1 = 0; var1 < this.field_a; var1++) {
            ph.b(8);
            this.field_b[var1] = ph.b(8);
            this.field_d[var1] = ph.b(8);
        }
    }
}
