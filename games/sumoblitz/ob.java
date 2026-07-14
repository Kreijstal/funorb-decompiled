/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    int field_a;
    int[] field_d;
    int field_b;
    int[] field_c;

    ob() {
        int var1 = 0;
        int discarded$7 = q.a(16);
        ((ob) this).field_b = q.b() != 0 ? q.a(4) + 1 : 1;
        if (q.b() != 0) {
            int discarded$8 = q.a(8);
        }
        int discarded$12 = q.a(2);
        if (((ob) this).field_b > 1) {
            ((ob) this).field_a = q.a(4);
        }
        ((ob) this).field_d = new int[((ob) this).field_b];
        ((ob) this).field_c = new int[((ob) this).field_b];
        for (var1 = 0; var1 < ((ob) this).field_b; var1++) {
            int discarded$13 = q.a(8);
            ((ob) this).field_d[var1] = q.a(8);
            ((ob) this).field_c[var1] = q.a(8);
        }
    }
}
