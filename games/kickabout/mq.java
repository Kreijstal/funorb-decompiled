/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq {
    int field_b;
    int[] field_a;

    final void a() {
        int var1 = 0;
        for (var1 = 0; var1 < ((mq) this).field_a.length; var1++) {
            ((mq) this).field_a[var1] = 0;
        }
    }

    mq(int param0) {
        ((mq) this).field_a = new int[param0];
    }
}
