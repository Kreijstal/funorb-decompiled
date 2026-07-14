/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uha {
    int[] field_c;
    int[] field_d;
    int field_a;
    int field_b;

    uha() {
        int var1 = 0;
        int discarded$7 = fca.c(16);
        ((uha) this).field_a = fca.c() != 0 ? fca.c(4) + 1 : 1;
        if (fca.c() != 0) {
            int discarded$8 = fca.c(8);
        }
        int discarded$12 = fca.c(2);
        if (((uha) this).field_a > 1) {
            ((uha) this).field_b = fca.c(4);
        }
        ((uha) this).field_c = new int[((uha) this).field_a];
        ((uha) this).field_d = new int[((uha) this).field_a];
        for (var1 = 0; var1 < ((uha) this).field_a; var1++) {
            int discarded$13 = fca.c(8);
            ((uha) this).field_c[var1] = fca.c(8);
            ((uha) this).field_d[var1] = fca.c(8);
        }
    }
}
