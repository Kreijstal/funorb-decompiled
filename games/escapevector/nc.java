/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    int[] field_a;
    int field_b;
    int field_c;

    final void a() {
        int var1 = 0;
        this.field_c = 0;
        for (var1 = 0; var1 < this.field_a.length; var1++) {
            this.field_a[var1] = 0;
        }
    }

    nc(int param0) {
        this.field_a = new int[param0];
    }
}
