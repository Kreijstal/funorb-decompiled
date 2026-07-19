/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    int[] field_b;
    int field_d;
    int field_c;
    int[] field_a;

    im() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = ac.a(16);
        this.field_c = ac.b() != 0 ? ac.a(4) + 1 : 1;
        if (ac.b() != 0) {
            discarded$8 = ac.a(8);
        }
        int discarded$12 = ac.a(2);
        if (this.field_c > 1) {
            this.field_d = ac.a(4);
        }
        this.field_b = new int[this.field_c];
        this.field_a = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
            discarded$13 = ac.a(8);
            this.field_b[var1] = ac.a(8);
            this.field_a[var1] = ac.a(8);
        }
    }
}
