/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    int field_c;
    int field_b;
    int[] field_d;
    int[] field_a;

    pg() {
        int var1 = 0;
        vh.a(16);
        this.field_c = vh.a() != 0 ? vh.a(4) + 1 : 1;
        if (vh.a() != 0) {
            vh.a(8);
        }
        vh.a(2);
        if (this.field_c > 1) {
            this.field_b = vh.a(4);
        }
        this.field_d = new int[this.field_c];
        this.field_a = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
            vh.a(8);
            this.field_d[var1] = vh.a(8);
            this.field_a[var1] = vh.a(8);
        }
    }
}
