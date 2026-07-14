/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    int field_d;
    int[] field_c;
    int[] field_a;
    int field_b;

    km() {
        int var1 = 0;
        int discarded$7 = gm.a(16);
        ((km) this).field_d = gm.c() != 0 ? gm.a(4) + 1 : 1;
        if (gm.c() != 0) {
            int discarded$8 = gm.a(8);
        }
        int discarded$12 = gm.a(2);
        if (((km) this).field_d > 1) {
            ((km) this).field_b = gm.a(4);
        }
        ((km) this).field_a = new int[((km) this).field_d];
        ((km) this).field_c = new int[((km) this).field_d];
        for (var1 = 0; var1 < ((km) this).field_d; var1++) {
            int discarded$13 = gm.a(8);
            ((km) this).field_a[var1] = gm.a(8);
            ((km) this).field_c[var1] = gm.a(8);
        }
    }
}
