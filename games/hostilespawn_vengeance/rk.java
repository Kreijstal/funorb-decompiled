/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    int[] field_c;
    int[] field_b;
    int field_a;
    int field_d;

    rk() {
        int var1 = 0;
        int discarded$7 = qf.e(16);
        ((rk) this).field_a = qf.b() != 0 ? qf.e(4) + 1 : 1;
        if (qf.b() != 0) {
            int discarded$8 = qf.e(8);
        }
        int discarded$12 = qf.e(2);
        if (((rk) this).field_a > 1) {
            ((rk) this).field_d = qf.e(4);
        }
        ((rk) this).field_b = new int[((rk) this).field_a];
        ((rk) this).field_c = new int[((rk) this).field_a];
        for (var1 = 0; var1 < ((rk) this).field_a; var1++) {
            int discarded$13 = qf.e(8);
            ((rk) this).field_b[var1] = qf.e(8);
            ((rk) this).field_c[var1] = qf.e(8);
        }
    }
}
