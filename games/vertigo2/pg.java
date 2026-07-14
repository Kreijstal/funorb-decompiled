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
        int discarded$7 = vh.a(16);
        ((pg) this).field_c = vh.a() != 0 ? vh.a(4) + 1 : 1;
        if (vh.a() != 0) {
            int discarded$8 = vh.a(8);
        }
        int discarded$12 = vh.a(2);
        if (((pg) this).field_c > 1) {
            ((pg) this).field_b = vh.a(4);
        }
        ((pg) this).field_d = new int[((pg) this).field_c];
        ((pg) this).field_a = new int[((pg) this).field_c];
        for (var1 = 0; var1 < ((pg) this).field_c; var1++) {
            int discarded$13 = vh.a(8);
            ((pg) this).field_d[var1] = vh.a(8);
            ((pg) this).field_a[var1] = vh.a(8);
        }
    }
}
