/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    int[] field_a;
    int field_b;
    int field_d;
    int[] field_c;

    eh() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = qs.a(16);
        this.field_b = qs.a() != 0 ? qs.a(4) + 1 : 1;
        if (qs.a() != 0) {
            discarded$8 = qs.a(8);
        }
        int discarded$12 = qs.a(2);
        if (this.field_b > 1) {
            this.field_d = qs.a(4);
        }
        this.field_c = new int[this.field_b];
        this.field_a = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            discarded$13 = qs.a(8);
            this.field_c[var1] = qs.a(8);
            this.field_a[var1] = qs.a(8);
        }
    }
}
