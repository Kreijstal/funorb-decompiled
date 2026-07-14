/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    int field_a;
    int[] field_d;
    int[] field_b;
    int field_c;

    kg() {
        int var1 = 0;
        int discarded$7 = qd.f(16);
        ((kg) this).field_a = qd.c() != 0 ? qd.f(4) + 1 : 1;
        if (qd.c() != 0) {
            int discarded$8 = qd.f(8);
        }
        int discarded$12 = qd.f(2);
        if (((kg) this).field_a > 1) {
            ((kg) this).field_c = qd.f(4);
        }
        ((kg) this).field_d = new int[((kg) this).field_a];
        ((kg) this).field_b = new int[((kg) this).field_a];
        for (var1 = 0; var1 < ((kg) this).field_a; var1++) {
            int discarded$13 = qd.f(8);
            ((kg) this).field_d[var1] = qd.f(8);
            ((kg) this).field_b[var1] = qd.f(8);
        }
    }
}
