/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    int[] field_d;
    int[] field_b;
    int field_a;
    int field_c;

    bf() {
        int var1 = 0;
        tl.d(16);
        this.field_c = tl.c() != 0 ? tl.d(4) + 1 : 1;
        if (tl.c() != 0) {
            tl.d(8);
        }
        tl.d(2);
        if (this.field_c > 1) {
            this.field_a = tl.d(4);
        }
        this.field_b = new int[this.field_c];
        this.field_d = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
            tl.d(8);
            this.field_b[var1] = tl.d(8);
            this.field_d[var1] = tl.d(8);
        }
    }
}
