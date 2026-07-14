/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    int field_b;
    int[] field_a;
    int field_c;
    int[] field_d;

    pe() {
        int var1 = 0;
        int discarded$7 = ml.f(16);
        ((pe) this).field_c = ml.b() != 0 ? ml.f(4) + 1 : 1;
        if (ml.b() != 0) {
            int discarded$8 = ml.f(8);
        }
        int discarded$12 = ml.f(2);
        if (((pe) this).field_c > 1) {
            ((pe) this).field_b = ml.f(4);
        }
        ((pe) this).field_a = new int[((pe) this).field_c];
        ((pe) this).field_d = new int[((pe) this).field_c];
        for (var1 = 0; var1 < ((pe) this).field_c; var1++) {
            int discarded$13 = ml.f(8);
            ((pe) this).field_a[var1] = ml.f(8);
            ((pe) this).field_d[var1] = ml.f(8);
        }
    }
}
