/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    int field_b;
    int[] field_d;
    int[] field_c;
    int field_a;

    ph() {
        int var1 = 0;
        int discarded$7 = hk.e(16);
        ((ph) this).field_b = hk.c() != 0 ? hk.e(4) + 1 : 1;
        if (hk.c() != 0) {
            int discarded$8 = hk.e(8);
        }
        int discarded$12 = hk.e(2);
        if (((ph) this).field_b > 1) {
            ((ph) this).field_a = hk.e(4);
        }
        ((ph) this).field_d = new int[((ph) this).field_b];
        ((ph) this).field_c = new int[((ph) this).field_b];
        for (var1 = 0; var1 < ((ph) this).field_b; var1++) {
            int discarded$13 = hk.e(8);
            ((ph) this).field_d[var1] = hk.e(8);
            ((ph) this).field_c[var1] = hk.e(8);
        }
    }
}
