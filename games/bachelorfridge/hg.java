/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    int field_a;
    int field_c;
    int[] field_b;
    int[] field_d;

    hg() {
        int var1 = 0;
        int discarded$7 = dv.a(16);
        ((hg) this).field_c = dv.a() != 0 ? dv.a(4) + 1 : 1;
        if (dv.a() != 0) {
            int discarded$8 = dv.a(8);
        }
        int discarded$12 = dv.a(2);
        if (((hg) this).field_c > 1) {
            ((hg) this).field_a = dv.a(4);
        }
        ((hg) this).field_d = new int[((hg) this).field_c];
        ((hg) this).field_b = new int[((hg) this).field_c];
        for (var1 = 0; var1 < ((hg) this).field_c; var1++) {
            int discarded$13 = dv.a(8);
            ((hg) this).field_d[var1] = dv.a(8);
            ((hg) this).field_b[var1] = dv.a(8);
        }
    }
}
