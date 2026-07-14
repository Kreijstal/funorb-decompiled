/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    int field_b;
    int[] field_d;
    int[] field_c;
    int field_a;

    tm() {
        int var1 = 0;
        int discarded$7 = fg.a(16);
        ((tm) this).field_b = fg.c() != 0 ? fg.a(4) + 1 : 1;
        if (fg.c() != 0) {
            int discarded$8 = fg.a(8);
        }
        int discarded$12 = fg.a(2);
        if (((tm) this).field_b > 1) {
            ((tm) this).field_a = fg.a(4);
        }
        ((tm) this).field_d = new int[((tm) this).field_b];
        ((tm) this).field_c = new int[((tm) this).field_b];
        for (var1 = 0; var1 < ((tm) this).field_b; var1++) {
            int discarded$13 = fg.a(8);
            ((tm) this).field_d[var1] = fg.a(8);
            ((tm) this).field_c[var1] = fg.a(8);
        }
    }
}
