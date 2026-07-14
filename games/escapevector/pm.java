/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm {
    int[] field_d;
    int[] field_c;
    int field_a;
    int field_b;

    pm() {
        int var1 = 0;
        int discarded$7 = in.e(16);
        ((pm) this).field_a = in.c() != 0 ? in.e(4) + 1 : 1;
        if (in.c() != 0) {
            int discarded$8 = in.e(8);
        }
        int discarded$12 = in.e(2);
        if (((pm) this).field_a > 1) {
            ((pm) this).field_b = in.e(4);
        }
        ((pm) this).field_d = new int[((pm) this).field_a];
        ((pm) this).field_c = new int[((pm) this).field_a];
        for (var1 = 0; var1 < ((pm) this).field_a; var1++) {
            int discarded$13 = in.e(8);
            ((pm) this).field_d[var1] = in.e(8);
            ((pm) this).field_c[var1] = in.e(8);
        }
    }
}
