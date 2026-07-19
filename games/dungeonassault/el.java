/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el {
    int field_b;
    int[] field_a;

    final void a() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_a.length; var1++) {
            this.field_a[var1] = 0;
        }
    }

    el(int param0) {
        this.field_a = new int[param0];
    }
}
