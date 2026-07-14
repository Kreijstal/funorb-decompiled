/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go {
    int field_b;
    int[] field_a;

    final void a() {
        int var1 = 0;
        for (var1 = 0; var1 < ((go) this).field_a.length; var1++) {
            ((go) this).field_a[var1] = 0;
        }
    }

    go(int param0) {
        ((go) this).field_a = new int[param0];
    }
}
