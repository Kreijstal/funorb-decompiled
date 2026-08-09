/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    int[] field_a;
    int[] field_c;
    int field_b;
    int field_d;

    bl() {
        int var1 = 0;
        mb.d(16);
        this.field_d = mb.c() != 0 ? mb.d(4) + 1 : 1;
        if (mb.c() != 0) {
            mb.d(8);
        }
        mb.d(2);
        if (this.field_d > 1) {
            this.field_b = mb.d(4);
        }
        this.field_c = new int[this.field_d];
        this.field_a = new int[this.field_d];
        for (var1 = 0; var1 < this.field_d; var1++) {
            mb.d(8);
            this.field_c[var1] = mb.d(8);
            this.field_a[var1] = mb.d(8);
        }
    }
}
