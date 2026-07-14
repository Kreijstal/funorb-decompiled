/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    int[] field_a;
    int[] field_c;
    int field_b;
    int field_d;

    bl() {
        int var1 = 0;
        int discarded$7 = mb.d(16);
        ((bl) this).field_d = mb.c() != 0 ? mb.d(4) + 1 : 1;
        if (mb.c() != 0) {
            int discarded$8 = mb.d(8);
        }
        int discarded$12 = mb.d(2);
        if (((bl) this).field_d > 1) {
            ((bl) this).field_b = mb.d(4);
        }
        ((bl) this).field_c = new int[((bl) this).field_d];
        ((bl) this).field_a = new int[((bl) this).field_d];
        for (var1 = 0; var1 < ((bl) this).field_d; var1++) {
            int discarded$13 = mb.d(8);
            ((bl) this).field_c[var1] = mb.d(8);
            ((bl) this).field_a[var1] = mb.d(8);
        }
    }
}
