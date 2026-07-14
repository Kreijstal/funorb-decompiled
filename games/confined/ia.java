/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    int[] field_b;
    int field_c;
    int[] field_d;
    int field_a;

    ia() {
        int var1 = 0;
        int discarded$7 = ph.b(16);
        ((ia) this).field_a = ph.a() != 0 ? ph.b(4) + 1 : 1;
        if (ph.a() != 0) {
            int discarded$8 = ph.b(8);
        }
        int discarded$12 = ph.b(2);
        if (((ia) this).field_a > 1) {
            ((ia) this).field_c = ph.b(4);
        }
        ((ia) this).field_b = new int[((ia) this).field_a];
        ((ia) this).field_d = new int[((ia) this).field_a];
        for (var1 = 0; var1 < ((ia) this).field_a; var1++) {
            int discarded$13 = ph.b(8);
            ((ia) this).field_b[var1] = ph.b(8);
            ((ia) this).field_d[var1] = ph.b(8);
        }
    }
}
