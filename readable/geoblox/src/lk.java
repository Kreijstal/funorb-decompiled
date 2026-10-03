/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static int[] meshModelTransform;
    static int field_e;
    int field_d;
    static float field_b;
    int field_a;
    int[] field_c;

    final int a(int param0) {
        if (param0 != 0) {
            meshModelTransform = (int[]) null;
            if (this.field_c == null) {
                return 0;
            }
            if (0 != this.field_c.length) {
                return this.field_c[-1 + this.field_c.length];
            }
            return 0;
        }
        if (this.field_c == null) {
            return 0;
        }
        if (0 != this.field_c.length) {
            return this.field_c[-1 + this.field_c.length];
        }
        return 0;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        var4 = Geoblox.field_C;
        if (null == this.field_c) {
          return 0;
        }
        if (this.field_c.length == 0) {
          return 0;
        }
        for (var3 = 1; this.field_c.length > var3; var3++) {
          if (this.field_c[var3] + this.field_c[-1 + var3] >> 1 > param1) {
            return var3 - 1;
          }
        }
        var3 = 35 / ((param0 + 9) / 51);
        return this.field_c.length - 1;
    }

    public static void a(byte param0) {
        if (param0 != 0) {
            lk.a((byte) 43);
            meshModelTransform = null;
            return;
        }
        meshModelTransform = null;
    }

    lk(int param0, int param1, int param2) {
        this.field_d = param0;
        this.field_c = new int[1 + param2];
        this.field_a = param1;
    }

    static {
    }
}
