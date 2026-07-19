/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    int field_c;
    int[] field_a;
    int field_b;

    final void a() {
        int var1 = 0;
        this.field_c = 0;
        for (var1 = 0; var1 < this.field_a.length; var1++) {
            this.field_a[var1] = 0;
        }
    }

    in(int param0) {
        this.field_a = new int[param0];
    }
}
