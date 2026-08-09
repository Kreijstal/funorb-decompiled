/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    int[] field_a;
    int[] field_d;
    int field_c;
    int field_b;

    sj() {
        int var1 = 0;
        ai.d(16);
        this.field_b = ai.a() != 0 ? ai.d(4) + 1 : 1;
        if (ai.a() != 0) {
            ai.d(8);
        }
        ai.d(2);
        if (this.field_b > 1) {
            this.field_c = ai.d(4);
        }
        this.field_a = new int[this.field_b];
        this.field_d = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            ai.d(8);
            this.field_a[var1] = ai.d(8);
            this.field_d[var1] = ai.d(8);
        }
    }
}
