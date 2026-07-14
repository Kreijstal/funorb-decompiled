/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn {
    int[] field_a;
    int field_c;
    int field_b;
    int[] field_d;

    fn() {
        int var1 = 0;
        int discarded$7 = bk.c(16);
        ((fn) this).field_b = bk.b() != 0 ? bk.c(4) + 1 : 1;
        if (bk.b() != 0) {
            int discarded$8 = bk.c(8);
        }
        int discarded$12 = bk.c(2);
        if (((fn) this).field_b > 1) {
            ((fn) this).field_c = bk.c(4);
        }
        ((fn) this).field_d = new int[((fn) this).field_b];
        ((fn) this).field_a = new int[((fn) this).field_b];
        for (var1 = 0; var1 < ((fn) this).field_b; var1++) {
            int discarded$13 = bk.c(8);
            ((fn) this).field_d[var1] = bk.c(8);
            ((fn) this).field_a[var1] = bk.c(8);
        }
    }
}
