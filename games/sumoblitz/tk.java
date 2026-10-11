/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    int field_d;
    static ri[] field_c;
    int field_a;
    int[] field_b;

    final int a(int param0) {
        if (param0 != 1) {
          this.field_d = -39;
          if (null != this.field_b) {
            return this.field_b.length == 0 ? 0 : this.field_b[this.field_b.length - 1];
          }
          return 0;
        }
        if (null == this.field_b) {
          return 0;
        }
        if (this.field_b.length != 0) {
          return this.field_b[this.field_b.length - 1];
        }
        return 0;
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 < 68) {
          field_c = (ri[]) null;
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4;
        int var5;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (null == this.field_b) {
          return 0;
        }
        if (this.field_b.length == 0) {
          return 0;
        }
        var4 = 82 % ((param1 + 9) / 57);
        for (var3 = 1; this.field_b.length > var3; var3++) {
          if (param0 < (this.field_b[var3] + this.field_b[-1 + var3] >> 1)) {
            return -1 + var3;
          }
        }
        return -1 + this.field_b.length;
    }

    tk(int param0, int param1, int param2) {
        this.field_d = param0;
        this.field_b = new int[1 + param2];
        this.field_a = param1;
    }

    static {
    }
}
