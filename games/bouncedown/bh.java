/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    int field_b;
    static ld field_d;
    int field_f;
    int[] field_a;
    static eh field_e;
    static int field_c;

    final int a(byte param0) {
        int var2;
        int stackIn_4_0 = 0;
        var2 = -44 % ((param0 - 9) / 63);
        if (this.field_a != null &&
          this.field_a.length != 0) {
          stackIn_4_0 = this.field_a[this.field_a.length - 1];
        } else {
          stackIn_4_0 = 0;
        }
        return stackIn_4_0;
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4;
        var4 = Bounce.field_N;
        if (this.field_a != null &&
          this.field_a.length != 0) {
          for (var3 = 1; var3 < this.field_a.length; var3++) {
            if ((this.field_a[-1 + var3] + this.field_a[var3] >> 1) > param0) {
              return var3 - 1;
            }
          }
          if (param1 >= 9) {
            return this.field_a.length - 1;
          }
          return -26;
        }
        return 0;
    }

    public static void b(byte param0) {
        if (param0 < 95) {
          return;
        }
        field_d = null;
        field_e = null;
    }

    bh(int param0, int param1, int param2) {
        this.field_b = param1;
        this.field_a = new int[param2 + 1];
        this.field_f = param0;
    }

    static {
        field_e = new eh(6, 0, 4, 2);
        field_c = -1;
    }
}
