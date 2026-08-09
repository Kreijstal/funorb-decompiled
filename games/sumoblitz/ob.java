/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    int field_a;
    int[] field_d;
    int field_b;
    int[] field_c;

    ob() {
        int var1 = 0;
        q.a(16);
        this.field_b = q.b() != 0 ? q.a(4) + 1 : 1;
        if (q.b() != 0) {
            q.a(8);
        }
        q.a(2);
        if (this.field_b > 1) {
            this.field_a = q.a(4);
        }
        this.field_d = new int[this.field_b];
        this.field_c = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            q.a(8);
            this.field_d[var1] = q.a(8);
            this.field_c[var1] = q.a(8);
        }
    }
}
