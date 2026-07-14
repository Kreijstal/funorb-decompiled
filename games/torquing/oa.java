/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    int field_d;
    int[] field_a;
    int field_b;
    int[] field_c;

    oa() {
        int var1 = 0;
        int discarded$7 = ho.c(16);
        ((oa) this).field_d = ho.a() != 0 ? ho.c(4) + 1 : 1;
        if (ho.a() != 0) {
            int discarded$8 = ho.c(8);
        }
        int discarded$12 = ho.c(2);
        if (((oa) this).field_d > 1) {
            ((oa) this).field_b = ho.c(4);
        }
        ((oa) this).field_c = new int[((oa) this).field_d];
        ((oa) this).field_a = new int[((oa) this).field_d];
        for (var1 = 0; var1 < ((oa) this).field_d; var1++) {
            int discarded$13 = ho.c(8);
            ((oa) this).field_c[var1] = ho.c(8);
            ((oa) this).field_a[var1] = ho.c(8);
        }
    }
}
