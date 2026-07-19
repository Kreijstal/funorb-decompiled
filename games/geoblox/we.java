/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    int[] field_c;
    int field_a;
    int[] field_d;
    int field_b;

    we() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = ua.b(16);
        this.field_b = ua.b() != 0 ? ua.b(4) + 1 : 1;
        if (ua.b() != 0) {
            discarded$8 = ua.b(8);
        }
        int discarded$12 = ua.b(2);
        if (this.field_b > 1) {
            this.field_a = ua.b(4);
        }
        this.field_c = new int[this.field_b];
        this.field_d = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            discarded$13 = ua.b(8);
            this.field_c[var1] = ua.b(8);
            this.field_d[var1] = ua.b(8);
        }
    }
}
