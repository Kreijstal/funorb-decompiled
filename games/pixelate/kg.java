/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    int field_a;
    int[] field_d;
    int[] field_b;
    int field_c;

    kg() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = qd.f(16);
        this.field_a = qd.c() != 0 ? qd.f(4) + 1 : 1;
        if (qd.c() != 0) {
            discarded$8 = qd.f(8);
        }
        int discarded$12 = qd.f(2);
        if (this.field_a > 1) {
            this.field_c = qd.f(4);
        }
        this.field_d = new int[this.field_a];
        this.field_b = new int[this.field_a];
        for (var1 = 0; var1 < this.field_a; var1++) {
            discarded$13 = qd.f(8);
            this.field_d[var1] = qd.f(8);
            this.field_b[var1] = qd.f(8);
        }
    }
}
