/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    int field_d;
    int[] field_a;
    int[] field_c;
    int field_b;

    nk() {
        int var1 = 0;
        int discarded$7 = sl.d(16);
        ((nk) this).field_b = sl.a() != 0 ? sl.d(4) + 1 : 1;
        if (sl.a() != 0) {
            int discarded$8 = sl.d(8);
        }
        int discarded$12 = sl.d(2);
        if (((nk) this).field_b > 1) {
            ((nk) this).field_d = sl.d(4);
        }
        ((nk) this).field_a = new int[((nk) this).field_b];
        ((nk) this).field_c = new int[((nk) this).field_b];
        for (var1 = 0; var1 < ((nk) this).field_b; var1++) {
            int discarded$13 = sl.d(8);
            ((nk) this).field_a[var1] = sl.d(8);
            ((nk) this).field_c[var1] = sl.d(8);
        }
    }
}
