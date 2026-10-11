/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends kj {
    static double field_j;
    static int field_h;
    static kv field_g;
    static sna field_i;
    private int field_f;

    final void a(int param0, int param1, int param2) {
        int var6 = BachelorFridge.field_y;
        int var4 = 0;
        int var5 = param1;
        int var4Lifetime1;
        int var4Lifetime2;
        if (this.field_f < 10) {
          var5 = 6 * this.field_f << 1;
          var4 = this.field_f * 12 << 1;
          uu.field_vb.a((127 - var4 >> 1) + param2, (-var5 + 64 - 1 >> 1) + (param0 - 64), var4 + 1, 1 + var5);
          return;
        }
        if (this.field_f < 50) {
          var4Lifetime1 = 256;
          var5 = 128;
          uu.field_vb.a((127 - var4Lifetime1 >> 1) + param2, (-var5 + 64 - 1 >> 1) + (param0 - 64), var4Lifetime1 + 1, 1 + var5);
          return;
        }
        var4Lifetime2 = 128 - this.field_f * 12 + 588 << 1;
        var5 = 64 - 6 * (this.field_f - 49) << 1;
        uu.field_vb.a((127 - var4Lifetime2 >> 1) + param2, (-var5 + 64 - 1 >> 1) + (param0 - 64), var4Lifetime2 + 1, 1 + var5);
    }

    final void a(int param0, boolean param1, int param2) {
        int var6 = BachelorFridge.field_y;
        int var4 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        if (!param1) {
          this.a(-79, -76, -16);
        }
        int var5 = 0;
        if (this.field_f < 10) {
          var5 = this.field_f * 6 << 1;
          var4 = this.field_f * 12 << 1;
          uu.field_vb.a((128 - var4 - 1 >> 1) + param2, param0 + (-var5 + 63 >> 1) - 64, 1 + var4, 1 + var5);
          return;
        }
        if (50 <= this.field_f) {
          var5Lifetime1 = 64 - (this.field_f * 6 - 294) << 1;
          var4Lifetime1 = -((this.field_f - 49) * 12) + 128 << 1;
          uu.field_vb.a((128 - var4Lifetime1 - 1 >> 1) + param2, param0 + (-var5Lifetime1 + 63 >> 1) - 64, 1 + var4Lifetime1, 1 + var5Lifetime1);
          return;
        }
        var4Lifetime2 = 256;
        var5Lifetime2 = 128;
        uu.field_vb.a((128 - var4Lifetime2 - 1 >> 1) + param2, param0 + (-var5Lifetime2 + 63 >> 1) - 64, 1 + var4Lifetime2, 1 + var5Lifetime2);
    }

    final boolean b(int param0) {
        int fieldTemp$0 = 0;
        if (param0 >= 21) {
          fieldTemp$0 = this.field_f + 1;
          this.field_f = this.field_f + 1;
          return 60 > fieldTemp$0 ? false : true;
        }
        this.b(69);
        int fieldTemp$1 = this.field_f + 1;
        this.field_f = this.field_f + 1;
        if (60 <= fieldTemp$1) {
          return true;
        }
        return false;
    }

    nd(gj param0, int param1, int param2) {
        super(param0, param1, param2);
    }

    public static void a(boolean param0) {
        field_g = null;
        field_i = null;
        if (param0) {
          field_j = -0.9287268583469704;
        }
    }

    static {
        field_j = Math.atan2(1.0, 0.0);
        field_h = 0;
    }
}
