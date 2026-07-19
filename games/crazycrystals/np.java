/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np {
    int field_b;
    int field_a;
    int[] field_d;
    int[] field_c;

    np() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = bl.a(16);
        this.field_b = bl.b() != 0 ? bl.a(4) + 1 : 1;
        if (bl.b() != 0) {
            discarded$8 = bl.a(8);
        }
        int discarded$12 = bl.a(2);
        if (this.field_b > 1) {
            this.field_a = bl.a(4);
        }
        this.field_c = new int[this.field_b];
        this.field_d = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            discarded$13 = bl.a(8);
            this.field_c[var1] = bl.a(8);
            this.field_d[var1] = bl.a(8);
        }
    }
}
