/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    int field_b;
    int field_a;
    int[] field_c;

    final void a() {
        int var1 = 0;
        ((oi) this).field_a = 0;
        for (var1 = 0; var1 < ((oi) this).field_c.length; var1++) {
            ((oi) this).field_c[var1] = 0;
        }
    }

    oi(int param0) {
        ((oi) this).field_c = new int[param0];
    }
}
