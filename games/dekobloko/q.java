/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    int field_c;
    int[] field_a;
    int field_b;
    int[] field_d;

    q() {
        int var1 = 0;
        int discarded$7 = va.c(16);
        ((q) this).field_b = va.b() != 0 ? va.c(4) + 1 : 1;
        if (va.b() != 0) {
            int discarded$8 = va.c(8);
        }
        int discarded$12 = va.c(2);
        if (((q) this).field_b > 1) {
            ((q) this).field_c = va.c(4);
        }
        ((q) this).field_a = new int[((q) this).field_b];
        ((q) this).field_d = new int[((q) this).field_b];
        for (var1 = 0; var1 < ((q) this).field_b; var1++) {
            int discarded$13 = va.c(8);
            ((q) this).field_a[var1] = va.c(8);
            ((q) this).field_d[var1] = va.c(8);
        }
    }
}
