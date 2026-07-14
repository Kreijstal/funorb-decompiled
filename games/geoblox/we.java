/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    int[] field_c;
    int field_a;
    int[] field_d;
    int field_b;

    we() {
        int var1 = 0;
        int discarded$7 = ua.b(16);
        ((we) this).field_b = ua.b() != 0 ? ua.b(4) + 1 : 1;
        if (ua.b() != 0) {
            int discarded$8 = ua.b(8);
        }
        int discarded$12 = ua.b(2);
        if (((we) this).field_b > 1) {
            ((we) this).field_a = ua.b(4);
        }
        ((we) this).field_c = new int[((we) this).field_b];
        ((we) this).field_d = new int[((we) this).field_b];
        for (var1 = 0; var1 < ((we) this).field_b; var1++) {
            int discarded$13 = ua.b(8);
            ((we) this).field_c[var1] = ua.b(8);
            ((we) this).field_d[var1] = ua.b(8);
        }
    }
}
