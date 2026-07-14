/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    int[] field_c;
    int field_d;
    int field_b;
    int[] field_a;

    ld() {
        int var1 = 0;
        int discarded$7 = ig.e(16);
        ((ld) this).field_b = ig.a() != 0 ? ig.e(4) + 1 : 1;
        if (ig.a() != 0) {
            int discarded$8 = ig.e(8);
        }
        int discarded$12 = ig.e(2);
        if (((ld) this).field_b > 1) {
            ((ld) this).field_d = ig.e(4);
        }
        ((ld) this).field_c = new int[((ld) this).field_b];
        ((ld) this).field_a = new int[((ld) this).field_b];
        for (var1 = 0; var1 < ((ld) this).field_b; var1++) {
            int discarded$13 = ig.e(8);
            ((ld) this).field_c[var1] = ig.e(8);
            ((ld) this).field_a[var1] = ig.e(8);
        }
    }
}
